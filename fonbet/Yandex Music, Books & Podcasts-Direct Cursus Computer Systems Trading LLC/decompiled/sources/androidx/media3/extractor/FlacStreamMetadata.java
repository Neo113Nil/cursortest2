package androidx.media3.extractor;

import androidx.media3.extractor.metadata.flac.PictureFrame;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import defpackage.bsc;
import defpackage.dsc;
import defpackage.dvt;
import defpackage.l5i;
import defpackage.szf;
import defpackage.u2i;
import defpackage.v94;
import defpackage.vgc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class FlacStreamMetadata {
    public static final int NOT_IN_LOOKUP_TABLE = -1;
    private static final String TAG = "FlacStreamMetadata";
    public final int bitsPerSample;
    public final int bitsPerSampleLookupKey;
    public final int channels;
    public final int maxBlockSizeSamples;
    public final int maxFrameSize;
    private final u2i metadata;
    public final int minBlockSizeSamples;
    public final int minFrameSize;
    public final int sampleRate;
    public final int sampleRateLookupKey;
    public final vgc seekTable;
    public final long totalSamples;

    public FlacStreamMetadata(byte[] bArr, int i) {
        v94 v94Var = new v94(bArr, bArr.length);
        v94Var.q(i * 8);
        this.minBlockSizeSamples = v94Var.i(16);
        this.maxBlockSizeSamples = v94Var.i(16);
        this.minFrameSize = v94Var.i(24);
        this.maxFrameSize = v94Var.i(24);
        int i2 = v94Var.i(20);
        this.sampleRate = i2;
        this.sampleRateLookupKey = getSampleRateLookupKey(i2);
        this.channels = v94Var.i(3) + 1;
        int i3 = v94Var.i(5) + 1;
        this.bitsPerSample = i3;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(i3);
        this.totalSamples = v94Var.k(36);
        this.seekTable = null;
        this.metadata = null;
    }

    private static u2i concatenateVorbisMetadata(List<String> list, List<PictureFrame> list2) {
        u2i h0 = szf.h0(list);
        if (h0 == null && list2.isEmpty()) {
            return null;
        }
        return new u2i(list2).b(h0);
    }

    private static int getBitsPerSampleLookupKey(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int getSampleRateLookupKey(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case RemoteCameraConfig.Mic.SAMPLING_RATE /* 44100 */:
                return 9;
            case ScreenMirroringConfig.Audio.SAMPLING_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public FlacStreamMetadata copyWithPictureFrames(List<PictureFrame> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(new u2i(list)));
    }

    public FlacStreamMetadata copyWithSeekTable(vgc vgcVar) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, vgcVar, this.metadata);
    }

    public FlacStreamMetadata copyWithVorbisComments(List<String> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(szf.h0(list)));
    }

    public long getApproxBytesPerFrame() {
        long j;
        long j2;
        int i = this.maxFrameSize;
        if (i > 0) {
            j = (i + this.minFrameSize) / 2;
            j2 = 1;
        } else {
            int i2 = this.minBlockSizeSamples;
            j = ((((i2 != this.maxBlockSizeSamples || i2 <= 0) ? 4096L : i2) * this.channels) * this.bitsPerSample) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public int getDecodedBitrate() {
        return this.bitsPerSample * this.sampleRate * this.channels;
    }

    public long getDurationUs() {
        long j = this.totalSamples;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.sampleRate;
    }

    public dsc getFormat(byte[] bArr, u2i u2iVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.maxFrameSize;
        if (i <= 0) {
            i = -1;
        }
        u2i metadataCopyWithAppendedEntriesFrom = getMetadataCopyWithAppendedEntriesFrom(u2iVar);
        bsc bscVar = new bsc();
        bscVar.m = l5i.p("audio/flac");
        bscVar.n = i;
        bscVar.C = this.channels;
        bscVar.D = this.sampleRate;
        bscVar.E = dvt.I(this.bitsPerSample);
        bscVar.p = Collections.singletonList(bArr);
        bscVar.k = metadataCopyWithAppendedEntriesFrom;
        return new dsc(bscVar);
    }

    public int getMaxDecodedFrameSize() {
        return (this.bitsPerSample / 8) * this.maxBlockSizeSamples * this.channels;
    }

    public u2i getMetadataCopyWithAppendedEntriesFrom(u2i u2iVar) {
        u2i u2iVar2 = this.metadata;
        return u2iVar2 == null ? u2iVar : u2iVar2.b(u2iVar);
    }

    public long getSampleNumber(long j) {
        return dvt.j((j * this.sampleRate) / 1000000, 0L, this.totalSamples - 1);
    }

    public FlacStreamMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        this(i, i2, i3, i4, i5, i6, i7, j, (vgc) null, concatenateVorbisMetadata(arrayList, arrayList2));
    }

    private FlacStreamMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, vgc vgcVar, u2i u2iVar) {
        this.minBlockSizeSamples = i;
        this.maxBlockSizeSamples = i2;
        this.minFrameSize = i3;
        this.maxFrameSize = i4;
        this.sampleRate = i5;
        this.sampleRateLookupKey = getSampleRateLookupKey(i5);
        this.channels = i6;
        this.bitsPerSample = i7;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(i7);
        this.totalSamples = j;
        this.seekTable = vgcVar;
        this.metadata = u2iVar;
    }
}
