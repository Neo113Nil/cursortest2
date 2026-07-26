package android.content.Context;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterClipDrawableDragonMaster3022 extends CancellationException {
    public final transient FrostHunterDelayPhoenixRogueLegend5759 FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterClipDrawableDragonMaster3022(String str, Throwable th, FrostHunterDelayPhoenixRogueLegend5759 frostHunterDelayPhoenixRogueLegend5759) {
        super(str);
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterDelayPhoenixRogueLegend5759;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterClipDrawableDragonMaster3022)) {
            return false;
        }
        FrostHunterClipDrawableDragonMaster3022 frostHunterClipDrawableDragonMaster3022 = (FrostHunterClipDrawableDragonMaster3022) obj;
        if (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterClipDrawableDragonMaster3022.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = frostHunterClipDrawableDragonMaster3022.FrostHunterCameraXPixelTurboCosmos9814;
        if (obj2 == null) {
            obj2 = FrostHunterInterstitialAdNebulaStrike5637.FrostHunterFlowMaxDragonHero5809;
        }
        Object obj3 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (obj3 == null) {
            obj3 = FrostHunterInterstitialAdNebulaStrike5637.FrostHunterFlowMaxDragonHero5809;
        }
        return FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj2, obj3) && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterClipDrawableDragonMaster3022.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = message.hashCode() * 31;
        Object obj = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (obj == null) {
            obj = FrostHunterInterstitialAdNebulaStrike5637.FrostHunterFlowMaxDragonHero5809;
        }
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (obj == null) {
            obj = FrostHunterInterstitialAdNebulaStrike5637.FrostHunterFlowMaxDragonHero5809;
        }
        sb.append(obj);
        return sb.toString();
    }
}
