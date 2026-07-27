package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAdapterGammaShadowMax4171 extends FrostHunterConfigurationTitanHero4370 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public boolean FrostHunterFragmentBetaMegaVortex6025;
    public Object[] FrostHunterKeyframeGammaGamma1197;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public FrostHunterAdapterGammaShadowMax4171(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.FrostHunterAlertDialogAuroraDelta3200 = i3;
        Object[] objArr2 = new Object[i3];
        this.FrostHunterKeyframeGammaGamma1197 = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.FrostHunterFragmentBetaMegaVortex6025 = r5;
        objArr2[0] = objArr;
        FrostHunterConstraintSetCloneMasterUltraRogue2633(i - r5, 1);
    }

    public final Object FrostHunterAlphaAnimationNeoCosmos5761() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814 & 31;
        Object obj = this.FrostHunterKeyframeGammaGamma1197[this.FrostHunterAlertDialogAuroraDelta3200 - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i) {
        int i2 = 0;
        while (FrostHunterDisplayMetricsTurboMax7649.FrostHunterAlertDialogAuroraDelta3200(this.FrostHunterCameraXPixelTurboCosmos9814, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterCameraXPixelTurboCosmos9814, ((this.FrostHunterAlertDialogAuroraDelta3200 - 1) - (i2 / 5)) + 1);
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, int i2) {
        int i3 = (this.FrostHunterAlertDialogAuroraDelta3200 - i2) * 5;
        while (i2 < this.FrostHunterAlertDialogAuroraDelta3200) {
            Object[] objArr = this.FrostHunterKeyframeGammaGamma1197;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[FrostHunterDisplayMetricsTurboMax7649.FrostHunterAlertDialogAuroraDelta3200(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        Object FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
        int i = this.FrostHunterCameraXPixelTurboCosmos9814 + 1;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        if (i == this.FrostHunterFlowMaxDragonHero5809) {
            this.FrostHunterFragmentBetaMegaVortex6025 = true;
            return FrostHunterAlphaAnimationNeoCosmos5761;
        }
        FrostHunterBundlePulseFusionHero2475(0);
        return FrostHunterAlphaAnimationNeoCosmos5761;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814--;
        if (this.FrostHunterFragmentBetaMegaVortex6025) {
            this.FrostHunterFragmentBetaMegaVortex6025 = false;
            return FrostHunterAlphaAnimationNeoCosmos5761();
        }
        FrostHunterBundlePulseFusionHero2475(31);
        return FrostHunterAlphaAnimationNeoCosmos5761();
    }
}
