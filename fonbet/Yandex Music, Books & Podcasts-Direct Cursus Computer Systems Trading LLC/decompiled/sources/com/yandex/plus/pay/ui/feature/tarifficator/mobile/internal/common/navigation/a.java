package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation;

import androidx.fragment.app.o;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.q;
import defpackage.bj2;
import defpackage.fmq;
import defpackage.gao;
import defpackage.js6;
import defpackage.ob5;
import defpackage.oi2;
import defpackage.qf0;
import defpackage.rb5;

/* loaded from: classes5.dex */
public final class a {
    public final gao a;

    public a(gao gaoVar) {
        this.a = gaoVar;
    }

    public final void a() {
        ob5[] ob5VarArr = {new bj2(), new oi2()};
        rb5 rb5Var = (rb5) this.a.a;
        rb5Var.getClass();
        rb5Var.c.post(new qf0(11, rb5Var, ob5VarArr));
    }

    public final void b() {
        c(new q(), "Checkout");
    }

    public final void c(o oVar, String str) {
        this.a.M(new fmq(str, (js6) new com.yandex.passport.sloth.ui.c(16, oVar), true));
    }
}
