package ru.yandex.taxi.masstransit.geopayment.checkout;

import defpackage.avj0;
import defpackage.d441;
import defpackage.gf41;
import defpackage.he30;
import defpackage.in30;
import defpackage.je30;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.t130;
import defpackage.tje;
import defpackage.wz00;
import defpackage.zy11;

/* loaded from: classes6.dex */
public final class u implements in30 {
    public final /* synthetic */ je30 a;

    public u(je30 je30Var) {
        this.a = je30Var;
    }

    public final void a() {
        je30 je30Var = this.a;
        je30Var.S.f(false);
        ru.yandex.taxi.masstransit.geopayment.linkcard.b bVar = je30Var.W;
        if (bVar != null) {
            bVar.i();
        }
        je30Var.W = null;
        je30Var.z((m950) je30Var.N.get(), new wz00(je30Var, 2));
    }

    public final void b() {
        je30 je30Var = this.a;
        je30Var.S.f(false);
        ru.yandex.taxi.masstransit.geopayment.linkcard.b bVar = je30Var.W;
        if (bVar != null) {
            bVar.i();
        }
        je30Var.W = null;
        tje.N(je30Var.o(), null, null, new MtCheckoutRouter$launchLinkCardFlow$1$onLinkCardSuccess$1(je30Var, null), 3);
        je30Var.Q.a(((avj0) je30Var.R).h(kyh0.mt_card_binding_success_notification));
    }

    public final void c(String str, t130 t130Var) {
        je30 je30Var = this.a;
        ru.yandex.taxi.masstransit.geopayment.linkcard.b bVar = new ru.yandex.taxi.masstransit.geopayment.linkcard.b((gf41) ((d441) je30Var.P.a.a).get(), str, t130Var);
        je30Var.W = bVar;
        je30Var.A(bVar, zy11.a, new he30(je30Var, 1));
    }
}
