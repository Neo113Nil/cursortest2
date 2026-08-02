package com.yandex.plus.pay.internal.di;

import com.yandex.plus.pay.internal.analytics.tarifficator.v;
import com.yandex.plus.pay.internal.analytics.tarifficator.w;
import defpackage.ie5;
import defpackage.jk6;
import defpackage.jyr;
import defpackage.pnb;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class o implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie5 b;

    public /* synthetic */ o(ie5 ie5Var, int i) {
        this.a = i;
        this.b = ie5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 8;
        ie5 ie5Var = this.b;
        switch (i) {
            case 0:
                return new pnb(new com.yandex.plus.home.plaque.plugin.internal.proxy.a(i2, ie5Var), (p) ((jyr) ie5Var.e).getValue(), (q) ((jyr) ie5Var.f).getValue());
            case 1:
                pnb a = ie5Var.a();
                o oVar = new o(ie5Var, i2);
                i iVar = (i) ie5Var.a;
                return new com.yandex.plus.pay.internal.analytics.tarifficator.e(a, oVar, iVar.a, iVar.c);
            case 2:
                return new com.yandex.plus.pay.internal.analytics.tarifficator.s(ie5Var.a());
            case 3:
                return new com.yandex.plus.pay.internal.analytics.tarifficator.q(ie5Var.a());
            case 4:
                return new com.yandex.plus.pay.internal.analytics.tarifficator.p(ie5Var.a());
            case 5:
                return new com.yandex.plus.pay.internal.analytics.tarifficator.n(ie5Var.a());
            case 6:
                return new w(ie5Var.a());
            case 7:
                Object f = ((com.yandex.plus.experiments.impl.providers.h) ((jk6) ie5Var.c).get()).f();
                r7o r7oVar = z7o.b;
                return (com.yandex.plus.experiments.api.a) (f instanceof t7o ? null : f);
            case 8:
                Object f2 = ((com.yandex.plus.experiments.impl.providers.h) ((jk6) ie5Var.c).get()).f();
                r7o r7oVar2 = z7o.b;
                return (com.yandex.plus.experiments.api.a) (f2 instanceof t7o ? null : f2);
            case 9:
                return new v(ie5Var.a());
            case 10:
                return new com.yandex.plus.pay.internal.analytics.tarifficator.u(ie5Var.a());
            case 11:
                return new com.yandex.plus.pay.internal.analytics.tarifficator.r(ie5Var.a());
            case 12:
                return new com.yandex.plus.pay.internal.analytics.tarifficator.g(ie5Var.a());
            case 13:
                return new com.yandex.plus.pay.internal.analytics.tarifficator.i(ie5Var.a());
            case 14:
                return new com.yandex.plus.pay.internal.analytics.tarifficator.l(ie5Var.a());
            case 15:
                return new p(ie5Var);
            case 16:
                return new q(ie5Var);
            default:
                pnb a2 = ie5Var.a();
                o oVar2 = new o(ie5Var, 7);
                i iVar2 = (i) ie5Var.a;
                return new com.yandex.plus.pay.internal.analytics.tarifficator.t(a2, oVar2, iVar2.a, iVar2.c);
        }
    }
}
