package com.yandex.plus.pay.internal.di;

import defpackage.eta;
import defpackage.ie5;
import defpackage.uah;
import defpackage.ub;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class p {
    public final /* synthetic */ ie5 a;

    public p(ie5 ie5Var) {
        this.a = ie5Var;
    }

    public final ub a() {
        String str;
        String e = eta.e();
        long currentTimeMillis = System.currentTimeMillis();
        Long id = ((com.yandex.plus.domain.auth.api.e) ((i) this.a.a).w.h.getValue()).getId();
        if (id == null || (str = id.toString()) == null) {
            str = "no_value";
        }
        e.getClass();
        ub ubVar = new ub();
        ubVar.a = uah.e(new Pair("scheme_name", "plus_payment_analytic"), new Pair("event_id", e), new Pair("timestamp", Long.valueOf(currentTimeMillis)), new Pair("puid", str));
        return ubVar;
    }
}
