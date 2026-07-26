package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterStateFlowMasterShadow1577 {
    public final FrostHunterObserverVisionSpeed8931 FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterStateFlowMasterShadow1577(FrostHunterObserverVisionSpeed8931 frostHunterObserverVisionSpeed8931, int i, int i2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterObserverVisionSpeed8931;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        this.FrostHunterBundlePulseFusionHero2475 = i2;
    }

    public static FrostHunterStateFlowMasterShadow1577 FrostHunterAlphaAnimationNeoCosmos5761(Class cls) {
        return new FrostHunterStateFlowMasterShadow1577(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FrostHunterStateFlowMasterShadow1577)) {
            return false;
        }
        FrostHunterStateFlowMasterShadow1577 frostHunterStateFlowMasterShadow1577 = (FrostHunterStateFlowMasterShadow1577) obj;
        return this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterStateFlowMasterShadow1577.FrostHunterAlphaAnimationNeoCosmos5761) && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterStateFlowMasterShadow1577.FrostHunterConstraintSetCloneMasterUltraRogue2633 && this.FrostHunterBundlePulseFusionHero2475 == frostHunterStateFlowMasterShadow1577.FrostHunterBundlePulseFusionHero2475;
    }

    public final int hashCode() {
        return this.FrostHunterBundlePulseFusionHero2475 ^ ((((this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() ^ 1000003) * 1000003) ^ this.FrostHunterConstraintSetCloneMasterUltraRogue2633) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.FrostHunterAlphaAnimationNeoCosmos5761);
        sb.append(", type=");
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.FrostHunterBundlePulseFusionHero2475;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Unsupported injection: ", i2));
            }
            str = "deferred";
        }
        return FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(sb, str, "}");
    }

    public FrostHunterStateFlowMasterShadow1577(int i, int i2, Class cls) {
        this(FrostHunterObserverVisionSpeed8931.FrostHunterAlphaAnimationNeoCosmos5761(cls), i, i2);
    }
}
