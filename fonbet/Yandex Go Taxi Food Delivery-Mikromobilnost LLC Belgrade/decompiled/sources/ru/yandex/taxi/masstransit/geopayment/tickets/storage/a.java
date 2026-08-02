package ru.yandex.taxi.masstransit.geopayment.tickets.storage;

import defpackage.dne0;
import defpackage.mdh;
import defpackage.r8;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.masstransit.geopayment.tickets.MtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1;

/* loaded from: classes6.dex */
public final class a extends r8 {
    public final tt2 c;

    public a(tt2 tt2Var, dne0 dne0Var) {
        super(7, dne0Var.a("ru.yandex.taxi.masstransit.LOCAL_MT_TICKETS_STORAGE"));
        this.c = tt2Var;
    }

    public final Object Hg(MtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1 mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new LocalTicketsStorage$getIds$2(this, null), mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1);
    }

    public final Object Ig(ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar, MtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1 mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new LocalTicketsStorage$save$2(this, aVar, null), mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
