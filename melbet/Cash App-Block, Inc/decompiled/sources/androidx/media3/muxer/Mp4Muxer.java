package androidx.media3.muxer;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Log;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4OrientationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import com.fillr.n;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class Mp4Muxer implements AutoCloseable {
    public final ArrayList auxiliaryTracks;
    public final n metadataCollector;
    public final Mp4Writer mp4Writer;
    public final FileOutputStreamSeekableMuxerOutput muxerOutput;
    public int nextTrackId;
    public final ArrayList trackIdToTrack;

    static {
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        Object[] objArr = {"video/av01", "video/3gpp", "video/avc", "video/hevc", "video/mp4v-es", "video/x-vnd.on2.vp9", "video/apv", "video/dolby-vision"};
        PlatformKt.checkElementsNotNull(8, objArr);
        ImmutableList.asImmutableList(8, objArr);
        Object[] objArr2 = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb", "audio/opus", "audio/vorbis", "audio/raw"};
        PlatformKt.checkElementsNotNull(6, objArr2);
        ImmutableList.asImmutableList(6, objArr2);
    }

    public Mp4Muxer(FileOutputStreamSeekableMuxerOutput fileOutputStreamSeekableMuxerOutput) {
        this.muxerOutput = fileOutputStreamSeekableMuxerOutput;
        n nVar = new n(7);
        this.metadataCollector = nVar;
        this.mp4Writer = new Mp4Writer(fileOutputStreamSeekableMuxerOutput, nVar, false);
        this.trackIdToTrack = new ArrayList();
        this.auxiliaryTracks = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r0.modificationTimestampSeconds <= org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addMetadataEntry(Metadata.Entry entry) {
        int i;
        boolean z = true;
        if (!(entry instanceof Mp4OrientationData) && !(entry instanceof Mp4LocationData)) {
            if (entry instanceof Mp4TimestampData) {
                Mp4TimestampData mp4TimestampData = (Mp4TimestampData) entry;
                if (mp4TimestampData.creationTimestampSeconds <= BodyPartID.bodyIdMax) {
                }
            }
            if (!(entry instanceof MdtaMetadataEntry) || ((i = ((MdtaMetadataEntry) entry).typeIndicator) != 1 && i != 23)) {
                z = false;
            }
        }
        Trace.checkArgument("Unsupported metadata", z);
        this.metadataCollector.addMetadata(entry);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        MuxerException muxerException;
        try {
            Mp4Writer mp4Writer = this.mp4Writer;
            MuxerUtil.getAuxiliaryTracksOffsetMetadata(0L);
            mp4Writer.finishWritingSamplesAndFinalizeMoovBox();
            muxerException = null;
        } catch (IOException e) {
            muxerException = new MuxerException("Failed to finish writing data", e);
        }
        try {
            this.muxerOutput.close();
        } catch (IOException e2) {
            if (muxerException == null) {
                muxerException = new MuxerException("Failed to close output stream", e2);
            } else {
                Log.e("Mp4Muxer", "Failed to close output stream", e2);
            }
        }
        if (muxerException != null) {
            throw muxerException;
        }
    }

    public final void writeSampleData(int i, ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        ArrayList arrayList = this.trackIdToTrack;
        Trace.checkArgument("Track id is invalid", i < arrayList.size());
        byteBuffer.getClass();
        int i2 = bufferInfo.size;
        Trace.checkArgument(byteBuffer.remaining() == i2);
        Track track = (Track) arrayList.get(i);
        try {
            if (this.auxiliaryTracks.contains(track)) {
                throw null;
            }
            this.mp4Writer.writeSampleData(track, byteBuffer, bufferInfo);
        } catch (IOException e) {
            throw new MuxerException("Failed to write sample for presentationTimeUs=" + bufferInfo.presentationTimeUs + ", size=" + i2, e);
        }
    }
}
