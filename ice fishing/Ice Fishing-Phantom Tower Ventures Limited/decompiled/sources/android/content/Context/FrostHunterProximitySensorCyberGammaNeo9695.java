package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterProximitySensorCyberGammaNeo9695 implements FrostHunterFragmentTransactionTitanHero2107 {
    public static final FrostHunterCameraFusionOlympian7678 FrostHunterKeyframeGammaGamma1197 = new FrostHunterCameraFusionOlympian7678(3);
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public final Object FrostHunterCameraXPixelTurboCosmos9814 = new Object();
    public volatile FrostHunterFragmentTransactionTitanHero2107 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterProximitySensorCyberGammaNeo9695(FrostHunterFragmentTransactionTitanHero2107 frostHunterFragmentTransactionTitanHero2107) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterFragmentTransactionTitanHero2107;
    }

    @Override // android.content.Context.FrostHunterFragmentTransactionTitanHero2107
    public final Object get() {
        FrostHunterFragmentTransactionTitanHero2107 frostHunterFragmentTransactionTitanHero2107 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterCameraFusionOlympian7678 frostHunterCameraFusionOlympian7678 = FrostHunterKeyframeGammaGamma1197;
        if (frostHunterFragmentTransactionTitanHero2107 != frostHunterCameraFusionOlympian7678) {
            synchronized (this.FrostHunterCameraXPixelTurboCosmos9814) {
                try {
                    if (this.FrostHunterFlowMaxDragonHero5809 != frostHunterCameraFusionOlympian7678) {
                        Object obj = this.FrostHunterFlowMaxDragonHero5809.get();
                        this.FrostHunterAlertDialogAuroraDelta3200 = obj;
                        this.FrostHunterFlowMaxDragonHero5809 = frostHunterCameraFusionOlympian7678;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    public final String toString() {
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == FrostHunterKeyframeGammaGamma1197) {
            obj = "<supplier that returned " + this.FrostHunterAlertDialogAuroraDelta3200 + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
