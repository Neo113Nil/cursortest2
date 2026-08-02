package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.tracing.Trace;
import com.google.android.libraries.places.internal.zzcjk;
import java.util.List;

/* loaded from: classes3.dex */
public final class SeiReader {
    public final /* synthetic */ int $r8$classId;
    public final List closedCaptionFormats;
    public final TrackOutput[] outputs;
    public final AdapterHelper reorderingBufferQueue;

    public SeiReader(List list, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.closedCaptionFormats = list;
                this.outputs = new TrackOutput[list.size()];
                AdapterHelper adapterHelper = new AdapterHelper(new ExoPlayerImplInternal$$ExternalSyntheticLambda2(this, 14));
                this.reorderingBufferQueue = adapterHelper;
                adapterHelper.setMaxSize(3);
                break;
            default:
                this.closedCaptionFormats = list;
                this.outputs = new TrackOutput[list.size()];
                this.reorderingBufferQueue = new AdapterHelper(new ExoPlayerImplInternal$$ExternalSyntheticLambda2(this, 13));
                break;
        }
    }

    public void consume(long j, ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 9) {
            return;
        }
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if (readInt == 434 && readInt2 == 1195456820 && readUnsignedByte == 3) {
            this.reorderingBufferQueue.add(j, parsableByteArray);
        }
    }

    public final void createTracks(ExtractorOutput extractorOutput, zzcjk zzcjkVar) {
        int i = this.$r8$classId;
        List list = this.closedCaptionFormats;
        TrackOutput[] trackOutputArr = this.outputs;
        switch (i) {
            case 0:
                for (int i2 = 0; i2 < trackOutputArr.length; i2++) {
                    zzcjkVar.generateNewId();
                    zzcjkVar.maybeThrowUninitializedError();
                    TrackOutput track = extractorOutput.track(zzcjkVar.zze, 3);
                    Format format2 = (Format) list.get(i2);
                    String str = format2.sampleMimeType;
                    Trace.checkArgument("Invalid closed caption MIME type provided: %s", str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                    String str2 = format2.id;
                    if (str2 == null) {
                        zzcjkVar.maybeThrowUninitializedError();
                        str2 = (String) zzcjkVar.zza;
                    }
                    Format.Builder builder = new Format.Builder();
                    builder.id = str2;
                    builder.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
                    builder.sampleMimeType = MimeTypes.normalizeMimeType(str);
                    builder.selectionFlags = format2.selectionFlags;
                    builder.language = format2.language;
                    builder.accessibilityChannel = format2.accessibilityChannel;
                    builder.initializationData = format2.initializationData;
                    NavAction$$ExternalSyntheticOutline0.m(builder, track);
                    trackOutputArr[i2] = track;
                }
                break;
            default:
                for (int i3 = 0; i3 < trackOutputArr.length; i3++) {
                    zzcjkVar.generateNewId();
                    zzcjkVar.maybeThrowUninitializedError();
                    TrackOutput track2 = extractorOutput.track(zzcjkVar.zze, 3);
                    Format format3 = (Format) list.get(i3);
                    String str3 = format3.sampleMimeType;
                    Trace.checkArgument("Invalid closed caption MIME type provided: %s", str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                    Format.Builder builder2 = new Format.Builder();
                    zzcjkVar.maybeThrowUninitializedError();
                    builder2.id = (String) zzcjkVar.zza;
                    builder2.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
                    builder2.sampleMimeType = MimeTypes.normalizeMimeType(str3);
                    builder2.selectionFlags = format3.selectionFlags;
                    builder2.language = format3.language;
                    builder2.accessibilityChannel = format3.accessibilityChannel;
                    builder2.initializationData = format3.initializationData;
                    NavAction$$ExternalSyntheticOutline0.m(builder2, track2);
                    trackOutputArr[i3] = track2;
                }
                break;
        }
    }
}
