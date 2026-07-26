package android.content.Context;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionScenePixelMega1338 implements Iterator, FrostHunterTraceCelestialVortexSpark6705, FrostHunterContextBlazePrimeMax4967 {
    public FrostHunterTraceCelestialVortexSpark6705 FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public Object FrostHunterFlowMaxDragonHero5809;

    public final RuntimeException FrostHunterAlphaAnimationNeoCosmos5761() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.FrostHunterCameraXPixelTurboCosmos9814);
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(Object obj, FrostHunterTextInputEditTextCosmosEpicLegend8149 frostHunterTextInputEditTextCosmosEpicLegend8149) {
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterCameraXPixelTurboCosmos9814 = 3;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterTextInputEditTextCosmosEpicLegend8149;
    }

    @Override // android.content.Context.FrostHunterTraceCelestialVortexSpark6705
    public final void FrostHunterRemoteConfigSpeedSpeed8566(Object obj) {
        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
        this.FrostHunterCameraXPixelTurboCosmos9814 = 4;
    }

    @Override // android.content.Context.FrostHunterTraceCelestialVortexSpark6705
    public final FrostHunterCountDownTimerRogueTitan5615 getContext() {
        return FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i != 0) {
                break;
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = 5;
            FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705 = this.FrostHunterAlertDialogAuroraDelta3200;
            frostHunterTraceCelestialVortexSpark6705.getClass();
            this.FrostHunterAlertDialogAuroraDelta3200 = null;
            frostHunterTraceCelestialVortexSpark6705.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw FrostHunterAlphaAnimationNeoCosmos5761();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        if (i == 2) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = 1;
            throw null;
        }
        if (i != 3) {
            throw FrostHunterAlphaAnimationNeoCosmos5761();
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterFlowMaxDragonHero5809 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
