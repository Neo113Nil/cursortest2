package defpackage;

import android.view.ViewGroup;
import com.yandex.go.drive.vertical.ui.tariff_card.DriveTariffCardModalView;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardCollapseSource;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardExpansionSource;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;

/* loaded from: classes12.dex */
public final class vgm implements xgm {
    public final /* synthetic */ DriveTariffCardModalView a;

    public vgm(DriveTariffCardModalView driveTariffCardModalView) {
        this.a = driveTariffCardModalView;
    }

    @Override // defpackage.xgm
    public final void G1(boolean z) {
        FloatButtonIconComponent floatButtonIconComponent;
        FloatButtonIconComponent floatButtonIconComponent2;
        DriveTariffCardModalView driveTariffCardModalView = this.a;
        if (z) {
            floatButtonIconComponent2 = driveTariffCardModalView.focusRouteButton;
            floatButtonIconComponent2.show();
        } else {
            floatButtonIconComponent = driveTariffCardModalView.focusRouteButton;
            floatButtonIconComponent.hide();
        }
    }

    @Override // defpackage.xgm
    public final void Ha(dem demVar) {
        rgm rgmVar;
        rgmVar = this.a.expandedView;
        rgmVar.a.launch(new kvx(demVar));
    }

    @Override // defpackage.xgm
    public final void collapse() {
        this.a.collapse();
    }

    @Override // defpackage.xgm
    public final void expand() {
        this.a.expand();
    }

    @Override // defpackage.xgm
    public final boolean isCollapsed() {
        AnchorBottomSheetBehavior bottomSheetBehavior;
        bottomSheetBehavior = this.a.getBottomSheetBehavior();
        int i = bottomSheetBehavior.E;
        return i == 4 || i == 6;
    }

    @Override // defpackage.xgm
    public final void k5() {
        rgm rgmVar;
        rgmVar = this.a.expandedView;
        rgmVar.a.launch(new jvx(pdm.a));
    }

    @Override // defpackage.xgm
    public final void notifySummaryCollapsed(DriveSummaryCardCollapseSource driveSummaryCardCollapseSource) {
        rgm rgmVar;
        rgmVar = this.a.expandedView;
        rgmVar.a.notifySummaryCollapsed(driveSummaryCardCollapseSource);
    }

    @Override // defpackage.xgm
    public final void notifySummaryExpanded(DriveSummaryCardExpansionSource driveSummaryCardExpansionSource) {
        rgm rgmVar;
        rgmVar = this.a.expandedView;
        rgmVar.a.notifySummaryExpanded(driveSummaryCardExpansionSource);
    }

    @Override // defpackage.xgm
    public final void pg(boolean z) {
        AnchorBottomSheetBehavior bottomSheetBehavior;
        bottomSheetBehavior = this.a.getBottomSheetBehavior();
        bottomSheetBehavior.a0 = z;
    }

    @Override // defpackage.xgm
    public final void z5(boolean z) {
        ViewGroup bottomSheet;
        BackButtonIconComponent backButtonIconComponent;
        FloatButtonIconComponent floatButtonIconComponent;
        DriveTariffCardModalView driveTariffCardModalView = this.a;
        bottomSheet = driveTariffCardModalView.getBottomSheet();
        bottomSheet.setBackground(z ? null : driveTariffCardModalView.bottomSheetBackground);
        if (z) {
            driveTariffCardModalView.getDimBackgroundView().setBackgroundColor(0);
        }
        backButtonIconComponent = driveTariffCardModalView.backButton;
        backButtonIconComponent.setVisibility(!z ? 0 : 8);
        floatButtonIconComponent = driveTariffCardModalView.focusRouteButton;
        floatButtonIconComponent.setVisibility(z ? 8 : 0);
    }
}
