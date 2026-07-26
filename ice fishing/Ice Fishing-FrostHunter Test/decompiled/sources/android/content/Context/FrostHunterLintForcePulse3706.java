package android.content.Context;

import java.io.Serializable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLintForcePulse3706 implements FrostHunterFragmentTransactionTitanHero2107, Serializable {
    public volatile transient boolean FrostHunterAlertDialogAuroraDelta3200;
    public final transient Object FrostHunterCameraXPixelTurboCosmos9814 = new Object();
    public final FrostHunterFragmentTransactionTitanHero2107 FrostHunterFlowMaxDragonHero5809;
    public transient Object FrostHunterKeyframeGammaGamma1197;

    public FrostHunterLintForcePulse3706(FrostHunterFragmentTransactionTitanHero2107 frostHunterFragmentTransactionTitanHero2107) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterFragmentTransactionTitanHero2107;
    }

    @Override // android.content.Context.FrostHunterFragmentTransactionTitanHero2107
    public final Object get() {
        if (!this.FrostHunterAlertDialogAuroraDelta3200) {
            synchronized (this.FrostHunterCameraXPixelTurboCosmos9814) {
                try {
                    if (!this.FrostHunterAlertDialogAuroraDelta3200) {
                        Object obj = this.FrostHunterFlowMaxDragonHero5809.get();
                        this.FrostHunterKeyframeGammaGamma1197 = obj;
                        this.FrostHunterAlertDialogAuroraDelta3200 = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.FrostHunterKeyframeGammaGamma1197;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.FrostHunterAlertDialogAuroraDelta3200) {
            obj = "<supplier that returned " + this.FrostHunterKeyframeGammaGamma1197 + ">";
        } else {
            obj = this.FrostHunterFlowMaxDragonHero5809;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
