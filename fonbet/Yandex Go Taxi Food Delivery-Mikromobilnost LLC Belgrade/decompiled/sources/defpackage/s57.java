package defpackage;

import com.yandex.go.taxi.order.detailed_price.ui.DetailedPriceModalView;
import java.util.HashMap;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardTappedButtonV2;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutModalView;
import ru.yandex.taxi.masstransit.ui.route.modal.expanded.MtExpandedRoutesView;

/* loaded from: classes6.dex */
public final /* synthetic */ class s57 implements b57 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s57(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b57
    public final void a(zy6 zy6Var) {
        lj30 lj30Var;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV2;
        lj30 lj30Var2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((u57) obj).T.a(((t57) zy6Var).a);
                break;
            case 1:
                ((b57) obj).a(zy6Var);
                break;
            case 2:
                ((txc) ((y57) obj).T).a(((x57) zy6Var).a);
                break;
            case 3:
                DetailedPriceModalView._init_$lambda$1((DetailedPriceModalView) obj, zy6Var);
                break;
            case 4:
                MtCheckoutModalView.onAttachedToWindow$lambda$0$0((MtCheckoutModalView) obj, (yi30) zy6Var);
                break;
            default:
                MtExpandedRoutesView mtExpandedRoutesView = (MtExpandedRoutesView) obj;
                hj30 hj30Var = (hj30) zy6Var;
                boolean z = hj30Var instanceof gj30;
                if (!z) {
                    if (!(hj30Var instanceof fj30)) {
                        if (!jl40.l(hj30Var, ej30.a)) {
                            w511.b();
                            break;
                        }
                    } else {
                        q5z.c0(((fj30) hj30Var).a, null, mtExpandedRoutesView.getContext(), 0);
                    }
                } else {
                    lj30Var2 = mtExpandedRoutesView.presenter;
                    b611 b611Var = lj30Var2.B.a;
                    b611Var.a.a("TransportRoute.DetailCard.RouteOnMap.Tapped", smw0.o(b611Var), 1, new HashMap());
                    ((vx30) lj30Var2.x.a).r(new pi30(17));
                }
                lj30Var = mtExpandedRoutesView.presenter;
                yw30 yw30Var = lj30Var.B;
                if (!(hj30Var instanceof fj30)) {
                    if (!z && !(hj30Var instanceof ej30)) {
                        w511.b();
                        break;
                    } else {
                        transportRouteAnalytics$DetailCardTappedButtonV2 = TransportRouteAnalytics$DetailCardTappedButtonV2.ViewOnMap;
                    }
                } else {
                    transportRouteAnalytics$DetailCardTappedButtonV2 = TransportRouteAnalytics$DetailCardTappedButtonV2.ShareRoute;
                }
                TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV22 = transportRouteAnalytics$DetailCardTappedButtonV2;
                TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
                TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                su30 d = lj30Var.A.d();
                yw30Var.c(transportRouteAnalytics$DetailCardTappedButtonV22, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, d != null ? wtb1.d(d.a) : EmptyList.a, null);
                break;
        }
    }
}
