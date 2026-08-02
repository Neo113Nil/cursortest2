package ru.yandex.taxi.masstransit.ui.route.modal.expanded;

import defpackage.a60;
import defpackage.ge01;
import defpackage.lj30;
import defpackage.su30;
import defpackage.tls;
import defpackage.v770;
import defpackage.vx30;
import defpackage.wtb1;
import defpackage.yw30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardTappedButtonV2;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class MtExpandedRoutesView$adapter$4 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ge01 ge01Var = (ge01) obj;
        lj30 lj30Var = (lj30) this.receiver;
        yw30 yw30Var = lj30Var.B;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV2 = TransportRouteAnalytics$DetailCardTappedButtonV2.MyTickets;
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
        su30 d = lj30Var.A.d();
        yw30Var.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, d != null ? wtb1.d(d.a) : EmptyList.a, lj30.Kg(ge01Var.c));
        String str = ge01Var.b;
        if (str != null) {
            ((a60) ((vx30) lj30Var.x.a).G).c(str, v770.c);
        }
        return zy11.a;
    }
}
