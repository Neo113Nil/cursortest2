package android.content.Context;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDataBindingAlphaStorm9399 {
    public final FrostHunterCombineLegendMegaPrime5473 FrostHunterAlphaAnimationNeoCosmos5761;
    public boolean FrostHunterBundlePulseFusionHero2475;
    public FrostHunterRippleDrawableMaxElite5227 FrostHunterCameraXPixelTurboCosmos9814;
    public FrostHunterIntentServiceTitanMegaMax6473 FrostHunterFlowMaxDragonHero5809;
    public final AtomicReference FrostHunterConstraintSetCloneMasterUltraRogue2633 = new AtomicReference(null);
    public final FrostHunterThemeOverlayNebulaDelta6405 FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterThemeOverlayNebulaDelta6405(12, this);
    public final FrostHunterDatabaseMasterPrimeSpeed8049 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterDatabaseMasterPrimeSpeed8049(21, this);
    public final FrostHunterObjectAnimatorNeoStrike7090 FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterIntentServiceTitanMegaMax6473[16]);
    public final Object FrostHunterRemoteConfigSpeedSpeed8566 = new Object();
    public long FrostHunterAlertDialogAuroraDelta3200 = -1;

    public FrostHunterDataBindingAlphaStorm9399(FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterCombineLegendMegaPrime5473;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.FrostHunterRemoteConfigSpeedSpeed8566) {
            z = this.FrostHunterBundlePulseFusionHero2475;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterServiceEliteCelestialThunder1757("Unexpected notification");
                        throw new FrostHunterLinearLayoutSolarTurboSpark3070();
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.FrostHunterRemoteConfigSpeedSpeed8566) {
                FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                Object[] objArr = frostHunterObjectAnimatorNeoStrike7090.FrostHunterCameraXPixelTurboCosmos9814;
                int i = frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((FrostHunterIntentServiceTitanMegaMax6473) objArr[i2]).FrostHunterConstraintSetCloneMasterUltraRogue2633(set) || z2;
                }
            }
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        FrostHunterThemeOverlayNebulaDelta6405 frostHunterThemeOverlayNebulaDelta6405 = this.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterProfilerUltraCyber8296.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterProfilerUltraCyber8296.FrostHunterAlphaAnimationNeoCosmos5761);
        synchronized (FrostHunterProfilerUltraCyber8296.FrostHunterBundlePulseFusionHero2475) {
            FrostHunterProfilerUltraCyber8296.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterCamera2NeoMax8666(FrostHunterProfilerUltraCyber8296.FrostHunterCameraXPixelTurboCosmos9814, frostHunterThemeOverlayNebulaDelta6405);
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterRippleDrawableMaxElite5227(20, frostHunterThemeOverlayNebulaDelta6405);
    }
}
