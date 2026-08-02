package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;

/* loaded from: classes3.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final int errorCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaCodecDecoderException(IllegalStateException illegalStateException, MediaCodecInfo mediaCodecInfo) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(mediaCodecInfo == null ? null : mediaCodecInfo.name);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.errorCode = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
