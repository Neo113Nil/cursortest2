package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInterpolatorOlympianStorm6120 extends FrostHunterConfigurationTitanHero4370 {
    public final Object[] FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterAdapterGammaShadowMax4171 FrostHunterKeyframeGammaGamma1197;

    public FrostHunterInterpolatorOlympianStorm6120(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.FrostHunterAlertDialogAuroraDelta3200 = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterAdapterGammaShadowMax4171(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        FrostHunterAdapterGammaShadowMax4171 frostHunterAdapterGammaShadowMax4171 = this.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterAdapterGammaShadowMax4171.hasNext()) {
            this.FrostHunterCameraXPixelTurboCosmos9814++;
            return frostHunterAdapterGammaShadowMax4171.next();
        }
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i + 1;
        return this.FrostHunterAlertDialogAuroraDelta3200[i - frostHunterAdapterGammaShadowMax4171.FrostHunterFlowMaxDragonHero5809];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterAdapterGammaShadowMax4171 frostHunterAdapterGammaShadowMax4171 = this.FrostHunterKeyframeGammaGamma1197;
        int i2 = frostHunterAdapterGammaShadowMax4171.FrostHunterFlowMaxDragonHero5809;
        if (i <= i2) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = i - 1;
            return frostHunterAdapterGammaShadowMax4171.previous();
        }
        int i3 = i - 1;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i3;
        return this.FrostHunterAlertDialogAuroraDelta3200[i3 - i2];
    }
}
