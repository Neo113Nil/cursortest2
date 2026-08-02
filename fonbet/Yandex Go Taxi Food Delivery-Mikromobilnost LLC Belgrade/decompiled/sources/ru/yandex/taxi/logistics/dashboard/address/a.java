package ru.yandex.taxi.logistics.dashboard.address;

import defpackage.bei;
import defpackage.h55;
import defpackage.i0i;
import defpackage.j0i;
import defpackage.jsd;
import defpackage.k0i;
import defpackage.kyh0;
import defpackage.l30;
import defpackage.ljz;
import defpackage.m950;
import defpackage.o501;
import defpackage.q501;
import defpackage.q7v0;
import defpackage.w511;
import defpackage.yvf0;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class a extends h55 {
    public final yvf0 D;
    public final com.yandex.go.route.interactor.c E;
    public final ljz F;
    public l30 G;

    public a(yvf0 yvf0Var, com.yandex.go.route.interactor.c cVar, ljz ljzVar) {
        super(null);
        this.D = yvf0Var;
        this.E = cVar;
        this.F = ljzVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        l30 l30Var = this.G;
        if (l30Var != null) {
            l30Var.cancel();
        }
        this.G = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        SourcePicker sourcePicker;
        this.G = this.F.a.c(new i0i(new DeliveryCompositeSuggestRouterImpl$onLaunch$1(bei.b, bei.class, "value", "getValue()Ljava/lang/String;", 0), 0));
        PointType pointType = ((q7v0) obj).a;
        m950 m950Var = (m950) this.D.get();
        int i = j0i.a[pointType.ordinal()];
        if (i == 1) {
            sourcePicker = SourcePicker.SOURCE_FROM_DELIVERY;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            sourcePicker = SourcePicker.DEST_FROM_DELIVERY;
        }
        A(m950Var, new jsd(pointType, sourcePicker, true, new q501(new o501(kyh0.address_search_modal_view_from, kyh0.address_search_modal_view_to, 14), new o501(kyh0.composite_address_source_delivery_hint, kyh0.composite_address_destination_delivery_hint, 14)), this.E.d(), TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, null, 1792), new k0i(this, 0));
    }
}
