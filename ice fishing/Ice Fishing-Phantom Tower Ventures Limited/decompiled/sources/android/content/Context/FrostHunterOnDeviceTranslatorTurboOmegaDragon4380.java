package android.content.Context;

import java.util.ListIterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnDeviceTranslatorTurboOmegaDragon4380 extends FrostHunterRoomDaoHyperFusionCelestial1775 implements ListIterator {
    public final /* synthetic */ FrostHunterAnimationSetHyperionAurora2108 FrostHunterKeyframeGammaGamma1197;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterOnDeviceTranslatorTurboOmegaDragon4380(FrostHunterAnimationSetHyperionAurora2108 frostHunterAnimationSetHyperionAurora2108, int i) {
        super(frostHunterAnimationSetHyperionAurora2108);
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterAnimationSetHyperionAurora2108;
        int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterAnimationSetHyperionAurora2108.FrostHunterAlphaAnimationNeoCosmos5761();
        if (i < 0 || i > FrostHunterAlphaAnimationNeoCosmos5761) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, FrostHunterAlphaAnimationNeoCosmos5761, "index: ", ", size: "));
            throw null;
        }
        this.FrostHunterFlowMaxDragonHero5809 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.FrostHunterFlowMaxDragonHero5809 > 0;
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
        return this.FrostHunterKeyframeGammaGamma1197.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.FrostHunterFlowMaxDragonHero5809 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
