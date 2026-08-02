package ru.yandex.taxi.scooters.presentation.detailed_order.v2.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.bhn0;
import defpackage.cma1;
import defpackage.fhn0;
import defpackage.ny61;
import defpackage.pfh0;
import defpackage.qrh0;
import defpackage.tje;
import defpackage.v1n0;
import defpackage.v3n0;
import defpackage.xw31;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2ModalView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.ScootersOrderSelectorView;
import ru.yandex.taxi.scooters.presentation.route_navigation.route_summary.ScootersRouteSummaryView;
import ru.yandex.taxi.scooters.utils.ScootersCompassRotatableFloatButton;
import ru.yandex.taxi.scooters.utils.ScootersGeoButtonIconComponent;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes6.dex */
public abstract class a {
    public static final bhn0 a(ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView, ScootersCompassRotatableFloatButton scootersCompassRotatableFloatButton, fhn0 fhn0Var, fhn0 fhn0Var2, fhn0 fhn0Var3, v1n0 v1n0Var) {
        View inflate = LayoutInflater.from(scootersDetailedOrderV2ModalView.getContext()).inflate(qrh0.scooters_detailed_order_v2_above_card, (ViewGroup) scootersDetailedOrderV2ModalView, false);
        int i = pfh0.arrows_view;
        ArrowsView arrowsView = (ArrowsView) cma1.O(i, inflate);
        if (arrowsView != null) {
            i = pfh0.back_button;
            BackButtonIconComponent backButtonIconComponent = (BackButtonIconComponent) cma1.O(i, inflate);
            if (backButtonIconComponent != null) {
                i = pfh0.geo_button;
                ScootersGeoButtonIconComponent scootersGeoButtonIconComponent = (ScootersGeoButtonIconComponent) cma1.O(i, inflate);
                if (scootersGeoButtonIconComponent != null) {
                    i = pfh0.geo_control;
                    GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                    if (goFrameLayout != null) {
                        i = pfh0.order_selector_view;
                        ScootersOrderSelectorView scootersOrderSelectorView = (ScootersOrderSelectorView) cma1.O(i, inflate);
                        if (scootersOrderSelectorView != null) {
                            i = pfh0.route_summary_view;
                            ScootersRouteSummaryView scootersRouteSummaryView = (ScootersRouteSummaryView) cma1.O(i, inflate);
                            if (scootersRouteSummaryView != null) {
                                GoConstraintLayout goConstraintLayout = (GoConstraintLayout) inflate;
                                bhn0 bhn0Var = new bhn0(goConstraintLayout, arrowsView, backButtonIconComponent, scootersGeoButtonIconComponent, goFrameLayout, scootersOrderSelectorView, scootersRouteSummaryView);
                                goConstraintLayout.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -2));
                                SlideableModalView.addViewAboveCard$default(scootersDetailedOrderV2ModalView, goConstraintLayout, 48, 0, 4, null);
                                xw31.E(goConstraintLayout, null, null, null, Integer.valueOf(tje.u(8, scootersDetailedOrderV2ModalView.getContext())));
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                layoutParams.gravity = 81;
                                goFrameLayout.addView(scootersCompassRotatableFloatButton, layoutParams);
                                scootersRouteSummaryView.setStopListener(new ScootersDetailedOrderCardExtensionsKt$attachTopButtonContainer$1$1(0, fhn0Var3, Runnable.class, "run", "run()V", 0));
                                scootersGeoButtonIconComponent.setDebounceClickListener(new v3n0(6, fhn0Var));
                                backButtonIconComponent.setDebounceClickListener(new v3n0(7, fhn0Var2));
                                ScootersDetailedOrderV2ModalView.topButtonContainer$lambda$3(bhn0Var);
                                return bhn0Var;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
