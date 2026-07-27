package android.content.Context;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterHandlerThreadHyperionCelestialEclipse6857 {
    public static final FrostHunterChipGroupPhantomNovaPixel7139 FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterChipGroupPhantomNovaPixel7139(3);
    public final Rect FrostHunterAlphaAnimationNeoCosmos5761 = new Rect();
    public final Rect FrostHunterConstraintSetCloneMasterUltraRogue2633 = new Rect();
    public final Rect FrostHunterBundlePulseFusionHero2475 = new Rect();
    public final FrostHunterDisplayMetricsGammaPulse7052 FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterDisplayMetricsGammaPulse7052(new FrostHunterVibratorSpectraBetaNovaX4683(15, this));
    public final ArrayList FrostHunterLifecycleBlazeGammaElite2889 = new ArrayList();

    public static void FrostHunterServiceEliteCelestialThunder1757(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View FrostHunterAlphaAnimationNeoCosmos5761(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        ArrayList arrayList2;
        int indexOf;
        int lastIndexOf;
        int i2;
        Rect rect2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 17 || i == 33) {
                    FrostHunterServiceEliteCelestialThunder1757(viewGroup, rect2);
                } else if (i == 66 || i == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                FrostHunterServiceEliteCelestialThunder1757(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            FrostHunterServiceEliteCelestialThunder1757(viewGroup, rect2);
        }
        View view2 = null;
        if (i != 1 && i != 2) {
            if (i == 17 || i == 33 || i == 66 || i == 130) {
                return FrostHunterBundlePulseFusionHero2475(i, rect2, view, viewGroup, arrayList);
            }
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Unknown direction: ", i));
            return null;
        }
        FrostHunterDisplayMetricsGammaPulse7052 frostHunterDisplayMetricsGammaPulse7052 = this.FrostHunterServiceEliteCelestialThunder1757;
        try {
            frostHunterDisplayMetricsGammaPulse7052.FrostHunterAlphaAnimationNeoCosmos5761(arrayList, viewGroup);
            Collections.sort(arrayList, frostHunterDisplayMetricsGammaPulse7052);
            frostHunterDisplayMetricsGammaPulse7052.FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761();
            frostHunterDisplayMetricsGammaPulse7052.FrostHunterFlowMaxDragonHero5809.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            frostHunterDisplayMetricsGammaPulse7052.FrostHunterKeyframeGammaGamma1197.FrostHunterAlphaAnimationNeoCosmos5761();
            frostHunterDisplayMetricsGammaPulse7052.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761();
            int size = arrayList.size();
            if (size < 2) {
                return null;
            }
            if (i == 1) {
                arrayList2 = arrayList;
                if (size >= 2) {
                    view2 = (view == null || (indexOf = arrayList2.indexOf(view)) <= 0) ? (View) arrayList2.get(size - 1) : (View) arrayList2.get(indexOf - 1);
                }
            } else if (i == 2) {
                arrayList2 = arrayList;
                if (size >= 2) {
                    view2 = (view == null || (lastIndexOf = arrayList2.lastIndexOf(view)) < 0 || (i2 = lastIndexOf + 1) >= size) ? (View) arrayList2.get(0) : (View) arrayList2.get(i2);
                }
            } else if (i == 17 || i == 33 || i == 66 || i == 130) {
                arrayList2 = arrayList;
                view2 = FrostHunterBundlePulseFusionHero2475(i, this.FrostHunterAlphaAnimationNeoCosmos5761, view, viewGroup, arrayList2);
            } else {
                arrayList2 = arrayList;
            }
            return view2 == null ? (View) arrayList2.get(size - 1) : view2;
        } catch (Throwable th) {
            frostHunterDisplayMetricsGammaPulse7052.FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761();
            frostHunterDisplayMetricsGammaPulse7052.FrostHunterFlowMaxDragonHero5809.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            frostHunterDisplayMetricsGammaPulse7052.FrostHunterKeyframeGammaGamma1197.FrostHunterAlphaAnimationNeoCosmos5761();
            frostHunterDisplayMetricsGammaPulse7052.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761();
            throw th;
        }
    }

    public final View FrostHunterBundlePulseFusionHero2475(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        rect2.set(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = (View) arrayList.get(i2);
            if (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(view3, view) && !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(view3, viewGroup)) {
                Rect rect3 = this.FrostHunterBundlePulseFusionHero2475;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                FrostHunterBarrierThunderHyperion9659 FrostHunterPushNotificationStormTitanGamma8999 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterPushNotificationStormTitanGamma8999(rect3);
                FrostHunterBarrierThunderHyperion9659 FrostHunterPushNotificationStormTitanGamma89992 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterPushNotificationStormTitanGamma8999(rect2);
                FrostHunterBarrierThunderHyperion9659 FrostHunterPushNotificationStormTitanGamma89993 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterPushNotificationStormTitanGamma8999(rect);
                FrostHunterLaunchSolarQuantum2471 FrostHunterPermissionInfoAlphaDelta6279 = FrostHunterBindingAdapterSpeedNeo6677.FrostHunterPermissionInfoAlphaDelta6279(i);
                if (FrostHunterDisplayMetricsTurboMax7649.FrostHunterKeyframeGammaGamma1197(FrostHunterPushNotificationStormTitanGamma8999, FrostHunterPushNotificationStormTitanGamma89992, FrostHunterPushNotificationStormTitanGamma89993, FrostHunterPermissionInfoAlphaDelta6279 != null ? FrostHunterPermissionInfoAlphaDelta6279.FrostHunterAlphaAnimationNeoCosmos5761 : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }

    public final View FrostHunterConstraintSetCloneMasterUltraRogue2633(ViewGroup viewGroup, View view, int i) {
        ViewGroup viewGroup2;
        View view2 = null;
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else if (viewGroup3 != null) {
                    viewGroup2 = viewGroup3;
                }
            }
        }
        viewGroup2 = viewGroup;
        View FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterLifecycleBlazeGammaElite2889(view, viewGroup2, i);
        boolean z = true;
        View view3 = FrostHunterLifecycleBlazeGammaElite2889;
        while (FrostHunterLifecycleBlazeGammaElite2889 != null) {
            if (FrostHunterLifecycleBlazeGammaElite2889.isFocusable() && FrostHunterLifecycleBlazeGammaElite2889.getVisibility() == 0 && (!FrostHunterLifecycleBlazeGammaElite2889.isInTouchMode() || FrostHunterLifecycleBlazeGammaElite2889.isFocusableInTouchMode())) {
                view2 = FrostHunterLifecycleBlazeGammaElite2889;
                break;
            }
            FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterLifecycleBlazeGammaElite2889, viewGroup2, i);
            boolean z2 = !z;
            if (!z) {
                view3 = view3 != null ? FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterLifecycleBlazeGammaElite2889(view3, viewGroup2, i) : null;
                if (view3 == FrostHunterLifecycleBlazeGammaElite2889) {
                    break;
                }
            }
            z = z2;
        }
        if (view2 != null) {
            return view2;
        }
        ArrayList<View> arrayList = this.FrostHunterLifecycleBlazeGammaElite2889;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterCameraXPixelTurboCosmos9814(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                view2 = FrostHunterAlphaAnimationNeoCosmos5761(i, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return view2;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
