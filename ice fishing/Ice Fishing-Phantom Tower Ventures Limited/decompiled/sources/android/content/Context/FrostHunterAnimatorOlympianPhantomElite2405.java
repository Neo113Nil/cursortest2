package android.content.Context;

import java.util.ListIterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnimatorOlympianPhantomElite2405 extends FrostHunterMaterialButtonShadowStrikeOlympian8282 implements ListIterator {
    public final FrostHunterAlarmManagerHeroTitaniumFusion5758 FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterAnimatorOlympianPhantomElite2405(FrostHunterAlarmManagerHeroTitaniumFusion5758 frostHunterAlarmManagerHeroTitaniumFusion5758, int i) {
        int size = frostHunterAlarmManagerHeroTitaniumFusion5758.size();
        FrostHunterCanvasInfernoVortex4700.FrostHunterEditTextPulseHyperion1262(i, size);
        this.FrostHunterCameraXPixelTurboCosmos9814 = size;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterAlarmManagerHeroTitaniumFusion5758;
    }

    public final Object FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        return this.FrostHunterAlertDialogAuroraDelta3200.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.FrostHunterFlowMaxDragonHero5809 < this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.FrostHunterFlowMaxDragonHero5809 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        int i = this.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterFlowMaxDragonHero5809 = i + 1;
        return FrostHunterAlphaAnimationNeoCosmos5761(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        int i = this.FrostHunterFlowMaxDragonHero5809 - 1;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        return FrostHunterAlphaAnimationNeoCosmos5761(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.FrostHunterFlowMaxDragonHero5809 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
