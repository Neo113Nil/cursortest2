package android.content.Context;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDisplayMetricsGammaPulse7052 implements Comparator {
    public final FrostHunterToastHyperTitanThunder2275 FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterToastHyperTitanThunder2275 FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterToolbarHeroNovaX1020 FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterGestureDetectorEliteEpic8317 FrostHunterKeyframeGammaGamma1197;

    public FrostHunterDisplayMetricsGammaPulse7052(FrostHunterVibratorSpectraBetaNovaX4683 frostHunterVibratorSpectraBetaNovaX4683) {
        long[] jArr = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterToastHyperTitanThunder2275();
        int i = FrostHunterViewModelSolarLegendTitan9202.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterToolbarHeroNovaX1020();
        this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterToastHyperTitanThunder2275();
        FrostHunterGestureDetectorEliteEpic8317 frostHunterGestureDetectorEliteEpic8317 = FrostHunterViewModelLegendAurora8821.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterGestureDetectorEliteEpic8317();
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(ArrayList arrayList, ViewGroup viewGroup) {
        FrostHunterGestureDetectorEliteEpic8317 frostHunterGestureDetectorEliteEpic8317;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            frostHunterGestureDetectorEliteEpic8317 = this.FrostHunterKeyframeGammaGamma1197;
            if (i >= size) {
                break;
            }
            frostHunterGestureDetectorEliteEpic8317.FrostHunterCameraXPixelTurboCosmos9814(i, (View) arrayList.get(i));
            i++;
        }
        int size2 = arrayList.size() - 1;
        FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View FrostHunterLifecycleBlazeGammaElite2889 = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterLifecycleBlazeGammaElite2889(view, viewGroup, 2);
                if (FrostHunterLifecycleBlazeGammaElite2889 != null && frostHunterGestureDetectorEliteEpic8317.FrostHunterServiceEliteCelestialThunder1757(FrostHunterLifecycleBlazeGammaElite2889) >= 0) {
                    frostHunterToastHyperTitanThunder2275.FrostHunterServiceConnectionTurboPhoenixOmega6719(view, FrostHunterLifecycleBlazeGammaElite2889);
                    frostHunterToolbarHeroNovaX1020.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLifecycleBlazeGammaElite2889);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i3 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(view2)) != null && !frostHunterToolbarHeroNovaX1020.FrostHunterBundlePulseFusionHero2475(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder22752 = this.FrostHunterAlertDialogAuroraDelta3200;
                    View view4 = (View) frostHunterToastHyperTitanThunder22752.FrostHunterRemoteConfigSpeedSpeed8566(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    frostHunterToastHyperTitanThunder22752.FrostHunterServiceConnectionTurboPhoenixOmega6719(view2, view3);
                    view2 = (View) frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(view2);
                }
            }
            if (i3 < 0) {
                return;
            } else {
                size3 = i3;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = this.FrostHunterAlertDialogAuroraDelta3200;
        View view3 = (View) frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(view);
        View view4 = (View) frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        FrostHunterGestureDetectorEliteEpic8317 frostHunterGestureDetectorEliteEpic8317 = this.FrostHunterKeyframeGammaGamma1197;
        return frostHunterGestureDetectorEliteEpic8317.FrostHunterLifecycleBlazeGammaElite2889(view) < frostHunterGestureDetectorEliteEpic8317.FrostHunterLifecycleBlazeGammaElite2889(view2) ? -1 : 1;
    }
}
