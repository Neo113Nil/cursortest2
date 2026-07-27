package android.content.Context;

import android.media.MediaCodec;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterLevelListDrawableNeoTitan3480 extends FrostHunterCrashlyticsNebulaQuantumCelestial2147 {
    public final int FrostHunterCameraXPixelTurboCosmos9814;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterLevelListDrawableNeoTitan3480(IllegalStateException illegalStateException, FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(frostHunterStorageNovaXEliteAurora3066 == null ? null : frostHunterStorageNovaXEliteAurora3066.FrostHunterAlphaAnimationNeoCosmos5761);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
