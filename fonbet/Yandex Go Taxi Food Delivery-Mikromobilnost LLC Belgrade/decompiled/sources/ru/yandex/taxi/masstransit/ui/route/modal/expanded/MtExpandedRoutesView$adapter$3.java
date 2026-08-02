package ru.yandex.taxi.masstransit.ui.route.modal.expanded;

import defpackage.ae40;
import defpackage.cv5;
import defpackage.ee01;
import defpackage.fe01;
import defpackage.fl10;
import defpackage.hh40;
import defpackage.lj30;
import defpackage.su30;
import defpackage.sx30;
import defpackage.tls;
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
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleEntryPointSource;
import ru.yandex.taxi.masstransit.trains.schedule.e;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class MtExpandedRoutesView$adapter$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ee01 ee01Var = (ee01) obj;
        lj30 lj30Var = (lj30) this.receiver;
        yw30 yw30Var = lj30Var.B;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV2 = TransportRouteAnalytics$DetailCardTappedButtonV2.ScheduleTickets;
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
        su30 d = lj30Var.A.d();
        yw30Var.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, d != null ? wtb1.d(d.a) : EmptyList.a, lj30.Kg(ee01Var.c));
        fl10 fl10Var = lj30Var.x;
        fe01 fe01Var = ee01Var.b;
        vx30 vx30Var = (vx30) fl10Var.a;
        vx30Var.A((e) ((cv5) ((ae40) vx30Var.S.get()).a(TransportRouteAnalytics$FlowOrigin.DetailCard).A).get(), new hh40(fe01Var.a, fe01Var.b, TransportRouteAnalytics$ScheduleEntryPointSource.DetailCard, 4), new sx30());
        return zy11.a;
    }
}
