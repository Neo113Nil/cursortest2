package android.content.Context;

import java.io.IOException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterDiffUtilTurboSpark8131 extends IOException {
    public final boolean FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterDiffUtilTurboSpark8131(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.FrostHunterCameraXPixelTurboCosmos9814 = z;
        this.FrostHunterFlowMaxDragonHero5809 = i;
    }

    public static FrostHunterDiffUtilTurboSpark8131 FrostHunterAlphaAnimationNeoCosmos5761(RuntimeException runtimeException, String str) {
        return new FrostHunterDiffUtilTurboSpark8131(str, runtimeException, true, 1);
    }

    public static FrostHunterDiffUtilTurboSpark8131 FrostHunterConstraintSetCloneMasterUltraRogue2633(String str) {
        return new FrostHunterDiffUtilTurboSpark8131(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.FrostHunterCameraXPixelTurboCosmos9814);
        sb.append(", dataType=");
        sb.append(this.FrostHunterFlowMaxDragonHero5809);
        sb.append("}");
        return sb.toString();
    }
}
