package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$AddressPlacement;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryAction;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.d;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class ue30 implements SourceDestinationComponent.a {
    public final /* synthetic */ MtCollapsedRoutesView a;

    public ue30(MtCollapsedRoutesView mtCollapsedRoutesView) {
        this.a = mtCollapsedRoutesView;
    }

    @Override // ru.yandex.taxi.address.design.SourceDestinationComponent.a
    public final void Y() {
        d dVar;
        dVar = this.a.presenter;
        dVar.I.e(SummaryAnalytics$SummaryExpandingState.Collapsed, SummaryAnalytics$AddressPlacement.AddressHeader);
        dVar.x.B(PointType.SOURCE);
    }

    @Override // ru.yandex.taxi.address.design.SourceDestinationComponent.a
    public final void x0() {
        d dVar;
        dVar = this.a.presenter;
        xcv0 xcv0Var = dVar.I;
        int size = dVar.F.a().b.size();
        fl10 fl10Var = dVar.x;
        if (size <= 1) {
            fl10Var.B(PointType.DESTINATION);
            xcv0Var.c(SummaryAnalytics$SummaryExpandingState.Collapsed, SummaryAnalytics$AddressPlacement.AddressHeader, SummaryAnalytics$SummaryAction.AddressSuggest);
            return;
        }
        vx30 vx30Var = (vx30) fl10Var.a;
        o8g0 o8g0Var = new o8g0(((avj0) vx30Var.Q).h(kyh0.add_route_stop), new m020(28, fl10Var));
        odl0 odl0Var = (odl0) vx30Var.P.get();
        vx30Var.A(new vdm(odl0Var.a, odl0Var.b, odl0Var.c, vx30Var.R, 1), new gdl0(o8g0Var, ModalViewOrigin.SUMMARY, false, new qx30()), sy60.Q2);
        xcv0Var.c(SummaryAnalytics$SummaryExpandingState.Collapsed, SummaryAnalytics$AddressPlacement.AddressHeader, SummaryAnalytics$SummaryAction.StopsList);
    }
}
