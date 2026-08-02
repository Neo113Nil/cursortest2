package androidx.media3.exoplayer.metadata;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.Format;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import androidx.media3.extractor.metadata.emsg.EventMessageDecoder;
import androidx.media3.extractor.metadata.icy.IcyDecoder;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.scte35.SpliceInfoDecoder;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class MetadataDecoderFactory$1 {
    public static final MetadataDecoderFactory$1 DEFAULT = new MetadataDecoderFactory$1();

    public final SimpleMetadataDecoder createDecoder(Format format2) {
        String str = format2.sampleMimeType;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new EventMessageDecoder(1);
                case "application/x-icy":
                    return new IcyDecoder();
                case "application/id3":
                    return new Id3Decoder(null);
                case "application/x-emsg":
                    return new EventMessageDecoder(0);
                case "application/x-scte35":
                    return new SpliceInfoDecoder();
            }
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    public final boolean supportsFormat(Format format2) {
        String str = format2.sampleMimeType;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
