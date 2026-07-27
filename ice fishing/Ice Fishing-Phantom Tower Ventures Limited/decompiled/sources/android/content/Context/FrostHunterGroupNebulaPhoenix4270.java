package android.content.Context;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterGroupNebulaPhoenix4270 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterTextInputLayoutOlympianShadowPixel5885 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterBundlePulseFusionHero2475 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterGroupNebulaPhoenix4270.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater FrostHunterServiceEliteCelestialThunder1757 = AtomicLongFieldUpdater.newUpdater(FrostHunterGroupNebulaPhoenix4270.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterLifecycleBlazeGammaElite2889 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterGroupNebulaPhoenix4270.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater FrostHunterLevelListDrawableFusionDragonHero2232 = AtomicLongFieldUpdater.newUpdater(FrostHunterGroupNebulaPhoenix4270.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater FrostHunterRemoteConfigSpeedSpeed8566 = AtomicIntegerFieldUpdater.newUpdater(FrostHunterGroupNebulaPhoenix4270.class, "_availablePermits$volatile");

    public FrostHunterGroupNebulaPhoenix4270(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        if (i <= 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Semaphore should have at least 1 permit, but had ", i));
            throw null;
        }
        if (i < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("The number of acquired permits should be in 0..", i));
            throw null;
        }
        FrostHunterInterpolatorNovaXMega4202 frostHunterInterpolatorNovaXMega4202 = new FrostHunterInterpolatorNovaXMega4202(0L, null, 2);
        this.head$volatile = frostHunterInterpolatorNovaXMega4202;
        this.tail$volatile = frostHunterInterpolatorNovaXMega4202;
        this._availablePermits$volatile = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterTextInputLayoutOlympianShadowPixel5885(2, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        r5.FrostHunterLooperHyperionForce4133(r3, r4.FrostHunterConstraintSetCloneMasterUltraRogue2633);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = FrostHunterRemoteConfigSpeedSpeed8566;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        } while (andDecrement > i);
        FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        if (andDecrement <= 0) {
            FrostHunterSQLiteUltraElite7894 FrostHunterViewPhantomNeo1634 = FrostHunterCardViewHyperionAurora3829.FrostHunterViewPhantomNeo1634(FrostHunterPaintCyberPulse5979.FrostHunterMeteringPointMegaCyber7955(frostHunterViewBindingCelestialVortex7351));
            try {
                if (!FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterViewPhantomNeo1634)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                break;
                            }
                            if (FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterViewPhantomNeo1634)) {
                                break;
                            }
                        }
                    }
                }
                Object FrostHunterLintTitanVortexQuantum9911 = FrostHunterViewPhantomNeo1634.FrostHunterLintTitanVortexQuantum9911();
                FrostHunterAuthMasterNovaXMax8430 frostHunterAuthMasterNovaXMax8430 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
                if (FrostHunterLintTitanVortexQuantum9911 != frostHunterAuthMasterNovaXMax8430) {
                    FrostHunterLintTitanVortexQuantum9911 = frostHunterLinearLayoutSolarHero7990;
                }
                if (FrostHunterLintTitanVortexQuantum9911 == frostHunterAuthMasterNovaXMax8430) {
                    return FrostHunterLintTitanVortexQuantum9911;
                }
            } catch (Throwable th) {
                FrostHunterViewPhantomNeo1634.FrostHunterEditTextPulseHyperion1262();
                throw th;
            }
        }
        return frostHunterLinearLayoutSolarHero7990;
    }

    public final void FrostHunterBundlePulseFusionHero2475() {
        int i;
        Object FrostHunterDialogFragmentTurboPhoenixDragon7627;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = FrostHunterRemoteConfigSpeedSpeed8566;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterBundlePulseFusionHero2475;
            FrostHunterInterpolatorNovaXMega4202 frostHunterInterpolatorNovaXMega4202 = (FrostHunterInterpolatorNovaXMega4202) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = FrostHunterServiceEliteCelestialThunder1757.getAndIncrement(this);
            long j = andIncrement2 / FrostHunterContentObserverFusionEpicOmega5626.FrostHunterLevelListDrawableFusionDragonHero2232;
            FrostHunterLayerDrawableTitaniumNova2540 frostHunterLayerDrawableTitaniumNova2540 = FrostHunterLayerDrawableTitaniumNova2540.FrostHunterScaleAnimationStrikeSpark5059;
            while (true) {
                FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterDialogFragmentTurboPhoenixDragon7627(frostHunterInterpolatorNovaXMega4202, j, frostHunterLayerDrawableTitaniumNova2540);
                if (FrostHunterCardViewHyperionAurora3829.FrostHunterPagingDataTurboTitanium7332(FrostHunterDialogFragmentTurboPhoenixDragon7627)) {
                    break;
                }
                FrostHunterAdapterSpectraVisionThunder5171 FrostHunterBillingClientFusionVortex9008 = FrostHunterCardViewHyperionAurora3829.FrostHunterBillingClientFusionVortex9008(FrostHunterDialogFragmentTurboPhoenixDragon7627);
                while (true) {
                    FrostHunterAdapterSpectraVisionThunder5171 frostHunterAdapterSpectraVisionThunder5171 = (FrostHunterAdapterSpectraVisionThunder5171) atomicReferenceFieldUpdater.get(this);
                    if (frostHunterAdapterSpectraVisionThunder5171.FrostHunterBundlePulseFusionHero2475 >= FrostHunterBillingClientFusionVortex9008.FrostHunterBundlePulseFusionHero2475) {
                        break;
                    }
                    if (!FrostHunterBillingClientFusionVortex9008.FrostHunterFlowMaxDragonHero5809()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, frostHunterAdapterSpectraVisionThunder5171, FrostHunterBillingClientFusionVortex9008)) {
                        if (atomicReferenceFieldUpdater.get(this) != frostHunterAdapterSpectraVisionThunder5171) {
                            if (FrostHunterBillingClientFusionVortex9008.FrostHunterLifecycleBlazeGammaElite2889()) {
                                FrostHunterBillingClientFusionVortex9008.FrostHunterServiceEliteCelestialThunder1757();
                            }
                        }
                    }
                    if (frostHunterAdapterSpectraVisionThunder5171.FrostHunterLifecycleBlazeGammaElite2889()) {
                        frostHunterAdapterSpectraVisionThunder5171.FrostHunterServiceEliteCelestialThunder1757();
                    }
                }
            }
            FrostHunterInterpolatorNovaXMega4202 frostHunterInterpolatorNovaXMega42022 = (FrostHunterInterpolatorNovaXMega4202) FrostHunterCardViewHyperionAurora3829.FrostHunterBillingClientFusionVortex9008(FrostHunterDialogFragmentTurboPhoenixDragon7627);
            AtomicReferenceArray atomicReferenceArray = frostHunterInterpolatorNovaXMega42022.FrostHunterLifecycleBlazeGammaElite2889;
            frostHunterInterpolatorNovaXMega42022.FrostHunterAlphaAnimationNeoCosmos5761();
            z = false;
            if (frostHunterInterpolatorNovaXMega42022.FrostHunterBundlePulseFusionHero2475 <= j) {
                int i3 = (int) (andIncrement2 % FrostHunterContentObserverFusionEpicOmega5626.FrostHunterLevelListDrawableFusionDragonHero2232);
                Object andSet = atomicReferenceArray.getAndSet(i3, FrostHunterContentObserverFusionEpicOmega5626.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                if (andSet == null) {
                    int i4 = FrostHunterContentObserverFusionEpicOmega5626.FrostHunterAlphaAnimationNeoCosmos5761;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == FrostHunterContentObserverFusionEpicOmega5626.FrostHunterBundlePulseFusionHero2475) {
                            z = true;
                            break;
                        }
                    }
                    FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858 = FrostHunterContentObserverFusionEpicOmega5626.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo18582 = FrostHunterContentObserverFusionEpicOmega5626.FrostHunterServiceEliteCelestialThunder1757;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, frostHunterWorkManagerMaxTurbo1858, frostHunterWorkManagerMaxTurbo18582)) {
                            if (atomicReferenceArray.get(i3) != frostHunterWorkManagerMaxTurbo1858) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != FrostHunterContentObserverFusionEpicOmega5626.FrostHunterLifecycleBlazeGammaElite2889) {
                    if (!(andSet instanceof FrostHunterViewPagerTitanSolar4986)) {
                        FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterServiceEliteCelestialThunder1757(andSet, "unexpected: ");
                        return;
                    }
                    FrostHunterViewPagerTitanSolar4986 frostHunterViewPagerTitanSolar4986 = (FrostHunterViewPagerTitanSolar4986) andSet;
                    FrostHunterWorkManagerMaxTurbo1858 FrostHunterMotionSceneAuroraMega2271 = frostHunterViewPagerTitanSolar4986.FrostHunterMotionSceneAuroraMega2271(FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    if (FrostHunterMotionSceneAuroraMega2271 != null) {
                        frostHunterViewPagerTitanSolar4986.FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterMotionSceneAuroraMega2271);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }

    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterCoordinatorLayoutSolarVortexMaster1896 frostHunterCoordinatorLayoutSolarVortexMaster1896) {
        Object FrostHunterDialogFragmentTurboPhoenixDragon7627;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterInterpolatorNovaXMega4202 frostHunterInterpolatorNovaXMega4202 = (FrostHunterInterpolatorNovaXMega4202) atomicReferenceFieldUpdater.get(this);
        long andIncrement = FrostHunterLevelListDrawableFusionDragonHero2232.getAndIncrement(this);
        FrostHunterBroadcastTitaniumSpeed8379 frostHunterBroadcastTitaniumSpeed8379 = FrostHunterBroadcastTitaniumSpeed8379.FrostHunterScaleAnimationStrikeSpark5059;
        long j = andIncrement / FrostHunterContentObserverFusionEpicOmega5626.FrostHunterLevelListDrawableFusionDragonHero2232;
        loop0: while (true) {
            FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterDialogFragmentTurboPhoenixDragon7627(frostHunterInterpolatorNovaXMega4202, j, frostHunterBroadcastTitaniumSpeed8379);
            if (!FrostHunterCardViewHyperionAurora3829.FrostHunterPagingDataTurboTitanium7332(FrostHunterDialogFragmentTurboPhoenixDragon7627)) {
                FrostHunterAdapterSpectraVisionThunder5171 FrostHunterBillingClientFusionVortex9008 = FrostHunterCardViewHyperionAurora3829.FrostHunterBillingClientFusionVortex9008(FrostHunterDialogFragmentTurboPhoenixDragon7627);
                while (true) {
                    FrostHunterAdapterSpectraVisionThunder5171 frostHunterAdapterSpectraVisionThunder5171 = (FrostHunterAdapterSpectraVisionThunder5171) atomicReferenceFieldUpdater.get(this);
                    if (frostHunterAdapterSpectraVisionThunder5171.FrostHunterBundlePulseFusionHero2475 >= FrostHunterBillingClientFusionVortex9008.FrostHunterBundlePulseFusionHero2475) {
                        break loop0;
                    }
                    if (!FrostHunterBillingClientFusionVortex9008.FrostHunterFlowMaxDragonHero5809()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, frostHunterAdapterSpectraVisionThunder5171, FrostHunterBillingClientFusionVortex9008)) {
                        if (atomicReferenceFieldUpdater.get(this) != frostHunterAdapterSpectraVisionThunder5171) {
                            if (FrostHunterBillingClientFusionVortex9008.FrostHunterLifecycleBlazeGammaElite2889()) {
                                FrostHunterBillingClientFusionVortex9008.FrostHunterServiceEliteCelestialThunder1757();
                            }
                        }
                    }
                    if (frostHunterAdapterSpectraVisionThunder5171.FrostHunterLifecycleBlazeGammaElite2889()) {
                        frostHunterAdapterSpectraVisionThunder5171.FrostHunterServiceEliteCelestialThunder1757();
                    }
                }
            } else {
                break;
            }
        }
        FrostHunterInterpolatorNovaXMega4202 frostHunterInterpolatorNovaXMega42022 = (FrostHunterInterpolatorNovaXMega4202) FrostHunterCardViewHyperionAurora3829.FrostHunterBillingClientFusionVortex9008(FrostHunterDialogFragmentTurboPhoenixDragon7627);
        AtomicReferenceArray atomicReferenceArray = frostHunterInterpolatorNovaXMega42022.FrostHunterLifecycleBlazeGammaElite2889;
        int i = (int) (andIncrement % FrostHunterContentObserverFusionEpicOmega5626.FrostHunterLevelListDrawableFusionDragonHero2232);
        while (!atomicReferenceArray.compareAndSet(i, null, frostHunterCoordinatorLayoutSolarVortexMaster1896)) {
            if (atomicReferenceArray.get(i) != null) {
                FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858 = FrostHunterContentObserverFusionEpicOmega5626.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo18582 = FrostHunterContentObserverFusionEpicOmega5626.FrostHunterBundlePulseFusionHero2475;
                while (!atomicReferenceArray.compareAndSet(i, frostHunterWorkManagerMaxTurbo1858, frostHunterWorkManagerMaxTurbo18582)) {
                    if (atomicReferenceArray.get(i) != frostHunterWorkManagerMaxTurbo1858) {
                        return false;
                    }
                }
                ((FrostHunterViewPagerTitanSolar4986) frostHunterCoordinatorLayoutSolarVortexMaster1896).FrostHunterLooperHyperionForce4133(FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                return true;
            }
        }
        frostHunterCoordinatorLayoutSolarVortexMaster1896.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterInterpolatorNovaXMega42022, i);
        return true;
    }
}
