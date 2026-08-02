package com.yandex.passport.common.mvi;

import defpackage.bsd;
import defpackage.ca8;
import defpackage.dq7;
import defpackage.eu1;
import defpackage.gld;
import defpackage.j5h;
import defpackage.l7h;
import defpackage.q6k;
import defpackage.tf6;
import defpackage.wr7;
import defpackage.xr7;
import defpackage.xy2;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class h {
    public final eu1 a;
    public final tf6 b;

    public h() {
        dq7 dq7Var = ca8.a;
        bsd bsdVar = j5h.a;
        bsdVar.getClass();
        this.a = new eu1(null);
        this.b = gld.e(bsdVar);
    }

    public final void a(Object obj) {
        wr7 wr7Var = (wr7) q6k.F(this.a);
        l7h.a();
        xr7 xr7Var = wr7Var.a;
        xy2 xy2Var = xr7Var.f;
        if (xy2Var.b != null) {
            xy2Var.onNext(xr7Var.c.a(xy2Var.c, obj));
        }
    }

    public void b() {
        gld.L(this.b, null);
    }

    public Object c(Object obj, g gVar) {
        return Unit.a;
    }

    public Object d(Object obj, g gVar) {
        return Unit.a;
    }

    public final void e(Object obj) {
        wr7 wr7Var = (wr7) q6k.F(this.a);
        l7h.a();
        wr7Var.a.e.onNext(obj);
    }

    public abstract Unit f(Throwable th);

    public final void g(Object obj) {
        obj.getClass();
        wr7 wr7Var = (wr7) q6k.F(this.a);
        l7h.a();
        wr7Var.a.g.onNext(obj);
    }

    public final Object h() {
        return ((wr7) q6k.F(this.a)).a.f.c;
    }
}
