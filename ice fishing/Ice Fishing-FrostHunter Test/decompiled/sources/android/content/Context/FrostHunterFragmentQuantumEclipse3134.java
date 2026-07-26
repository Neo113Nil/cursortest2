package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFragmentQuantumEclipse3134 implements FrostHunterClipboardManagerMegaRogue2930 {
    public static final Object FrostHunterAlertDialogAuroraDelta3200 = new Object();
    public volatile FrostHunterProGuardCyberHyper2901 FrostHunterCameraXPixelTurboCosmos9814;
    public volatile Object FrostHunterFlowMaxDragonHero5809;

    public static FrostHunterClipboardManagerMegaRogue2930 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterProGuardCyberHyper2901 frostHunterProGuardCyberHyper2901) {
        if (frostHunterProGuardCyberHyper2901 instanceof FrostHunterFragmentQuantumEclipse3134) {
            return frostHunterProGuardCyberHyper2901;
        }
        FrostHunterFragmentQuantumEclipse3134 frostHunterFragmentQuantumEclipse3134 = new FrostHunterFragmentQuantumEclipse3134();
        frostHunterFragmentQuantumEclipse3134.FrostHunterFlowMaxDragonHero5809 = FrostHunterAlertDialogAuroraDelta3200;
        frostHunterFragmentQuantumEclipse3134.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterProGuardCyberHyper2901;
        return frostHunterFragmentQuantumEclipse3134;
    }

    @Override // android.content.Context.FrostHunterClipboardManagerMegaRogue2930
    public final Object get() {
        Object obj;
        Object obj2 = this.FrostHunterFlowMaxDragonHero5809;
        Object obj3 = FrostHunterAlertDialogAuroraDelta3200;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.FrostHunterFlowMaxDragonHero5809;
                if (obj == obj3) {
                    obj = this.FrostHunterCameraXPixelTurboCosmos9814.get();
                    Object obj4 = this.FrostHunterFlowMaxDragonHero5809;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.FrostHunterFlowMaxDragonHero5809 = obj;
                    this.FrostHunterCameraXPixelTurboCosmos9814 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
