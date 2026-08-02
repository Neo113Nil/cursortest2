package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.w1;
import defpackage.eno;
import defpackage.gv6;
import defpackage.pd;
import defpackage.uah;
import defpackage.x0q;
import defpackage.xdr;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class n0 implements com.yandex.passport.common.mvi.a {
    public static final Object c = uah.e(new Pair("mr", w1.e), new Pair("ok", w1.d), new Pair("vk", w1.a), new Pair("gg", w1.f), new Pair("tw", w1.c), new Pair("fb", w1.b), new Pair("esia", w1.g), new Pair("tv1001", w1.h));
    public final com.yandex.passport.internal.report.reporters.l a;
    public final com.yandex.passport.internal.usecase.ui.h0 b;

    public n0(com.yandex.passport.internal.report.reporters.l lVar, com.yandex.passport.internal.usecase.ui.h0 h0Var) {
        lVar.getClass();
        h0Var.getClass();
        this.a = lVar;
        this.b = h0Var;
    }

    public static com.yandex.passport.internal.ui.bouncer.model.k0 b(n0 n0Var, com.yandex.passport.internal.ui.bouncer.model.l1 l1Var, com.yandex.passport.internal.ui.domik.r rVar) {
        com.yandex.passport.internal.ui.bouncer.model.b1 b1Var = l1Var.d;
        return b1Var != null ? new com.yandex.passport.internal.ui.bouncer.model.p(new com.yandex.passport.internal.ui.bouncer.model.p1(b1Var.a, false, null, b1Var.d, b1Var.f, rVar, 4)) : new com.yandex.passport.internal.ui.bouncer.model.o("ProcessEventActor", "No bouncer parameters in current state", null);
    }

    @Override // com.yandex.passport.common.mvi.a
    public final eno a(x0q x0qVar, xdr xdrVar) {
        x0qVar.getClass();
        xdrVar.getClass();
        return pd.e0(new com.yandex.passport.internal.t(x0qVar, 11), xdrVar, new gv6(this, (Continuation) null, 19));
    }
}
