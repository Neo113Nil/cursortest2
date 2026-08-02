package ru.yandex.taxi.masstransit.ui.route.modal.expanded;

import defpackage.bzy0;
import defpackage.fl10;
import defpackage.lj30;
import defpackage.m950;
import defpackage.o640;
import defpackage.pk40;
import defpackage.rg30;
import defpackage.su30;
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
import ru.yandex.taxi.masstransit.threads.ThreadsCardMode;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class MtExpandedRoutesView$adapter$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        bzy0 bzy0Var = (bzy0) obj;
        lj30 lj30Var = (lj30) this.receiver;
        yw30 yw30Var = lj30Var.B;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV2 = TransportRouteAnalytics$DetailCardTappedButtonV2.Variants;
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
        su30 d = lj30Var.A.d();
        yw30Var.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, d != null ? wtb1.d(d.a) : EmptyList.a, null);
        fl10 fl10Var = lj30Var.x;
        fl10Var.getClass();
        o640 o640Var = new o640(bzy0Var, ThreadsCardMode.FULL_HEIGHT, (pk40) null, 12);
        vx30 vx30Var = (vx30) fl10Var.a;
        vx30Var.A((m950) vx30Var.K.get(), o640Var, new rg30(1, vx30Var));
        return zy11.a;
    }
}
