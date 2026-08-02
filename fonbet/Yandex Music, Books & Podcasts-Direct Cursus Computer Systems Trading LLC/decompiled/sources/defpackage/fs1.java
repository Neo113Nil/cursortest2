package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class fs1 extends w4k implements eun {
    public tf6 e;
    public final xdr f = ydr.a(new nmq(0));
    public final x6k g = szf.g0(null);
    public final t6k h = new t6k(1.0f);
    public final x6k i = szf.g0(null);
    public bs1 j;
    public w4k k;
    public Function1 l;
    public Function1 m;
    public jd6 n;
    public int o;
    public boolean p;
    public final x6k q;
    public final x6k r;
    public final x6k s;

    public fs1(rce rceVar, cce cceVar) {
        xr1 xr1Var = xr1.a;
        this.j = xr1Var;
        this.l = rq1.u;
        this.n = hd6.b;
        this.o = 1;
        this.q = szf.g0(xr1Var);
        this.r = szf.g0(rceVar);
        this.s = szf.g0(cceVar);
    }

    @Override // defpackage.w4k
    public final void a(float f) {
        this.h.h(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eun
    public final void b() {
        if (this.e != null) {
            return;
        }
        wqr n = a4g.n();
        dq7 dq7Var = ca8.a;
        tf6 e = gld.e(e.c(n, j5h.a.g));
        this.e = e;
        w4k w4kVar = this.k;
        Object[] objArr = 0;
        eun eunVar = w4kVar instanceof eun ? (eun) w4kVar : null;
        if (eunVar != null) {
            eunVar.b();
        }
        if (!this.p) {
            x97.y(e, null, null, new hl(this, objArr == true ? 1 : 0, 13), 3);
            return;
        }
        pce a = rce.a((rce) this.r.getValue());
        a.b = ((cce) this.s.getValue()).b();
        a.B = null;
        rce a2 = a.a();
        Drawable b = i.b(a2, null, a2.B, a2.F.j);
        m(new zr1(b != null ? l(b) : null));
    }

    @Override // defpackage.w4k
    public final void c(m85 m85Var) {
        this.i.setValue(m85Var);
    }

    @Override // defpackage.eun
    public final void d() {
        tf6 tf6Var = this.e;
        if (tf6Var != null) {
            gld.L(tf6Var, null);
        }
        this.e = null;
        Object obj = this.k;
        eun eunVar = obj instanceof eun ? (eun) obj : null;
        if (eunVar != null) {
            eunVar.d();
        }
    }

    @Override // defpackage.eun
    public final void e() {
        tf6 tf6Var = this.e;
        if (tf6Var != null) {
            gld.L(tf6Var, null);
        }
        this.e = null;
        Object obj = this.k;
        eun eunVar = obj instanceof eun ? (eun) obj : null;
        if (eunVar != null) {
            eunVar.e();
        }
    }

    @Override // defpackage.w4k
    public final long i() {
        w4k w4kVar = (w4k) this.g.getValue();
        if (w4kVar != null) {
            return w4kVar.i();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.w4k
    public final void j(jpa jpaVar) {
        nmq nmqVar = new nmq(jpaVar.e());
        xdr xdrVar = this.f;
        xdrVar.getClass();
        xdrVar.m(null, nmqVar);
        w4k w4kVar = (w4k) this.g.getValue();
        if (w4kVar != null) {
            w4kVar.g(jpaVar, jpaVar.e(), this.h.e(), (m85) this.i.getValue());
        }
    }

    public final bs1 k() {
        return (bs1) this.q.getValue();
    }

    public final w4k l(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return new opa(drawable.mutate());
        }
        yg0 yg0Var = new yg0(((BitmapDrawable) drawable).getBitmap());
        int i = this.o;
        q33 q33Var = new q33(yg0Var, (r9.getWidth() << 32) | (r9.getHeight() & 4294967295L));
        q33Var.g = i;
        return q33Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(bs1 bs1Var) {
        sce sceVar;
        w4k w4kVar;
        Function1 function1;
        eun eunVar;
        eun eunVar2;
        bs1 bs1Var2 = this.j;
        bs1 bs1Var3 = (bs1) this.l.invoke(bs1Var);
        this.j = bs1Var3;
        this.q.setValue(bs1Var3);
        if (!(bs1Var3 instanceof as1)) {
            if (bs1Var3 instanceof yr1) {
                sceVar = ((yr1) bs1Var3).b;
            }
            w4kVar = null;
            if (w4kVar == null) {
                w4kVar = bs1Var3.a();
            }
            this.k = w4kVar;
            this.g.setValue(w4kVar);
            if (this.e != null && bs1Var2.a() != bs1Var3.a()) {
                Object a = bs1Var2.a();
                eunVar = !(a instanceof eun) ? (eun) a : null;
                if (eunVar != null) {
                    eunVar.e();
                }
                Object a2 = bs1Var3.a();
                eunVar2 = a2 instanceof eun ? (eun) a2 : null;
                if (eunVar2 != null) {
                    eunVar2.b();
                }
            }
            function1 = this.m;
            if (function1 != null) {
                function1.invoke(bs1Var3);
                return;
            }
            return;
        }
        sceVar = ((as1) bs1Var3).b;
        c8t a3 = sceVar.b().j.a(yd5.a, sceVar);
        if (a3 instanceof wu6) {
            w4kVar = new qu6(bs1Var2 instanceof zr1 ? bs1Var2.a() : null, bs1Var3.a(), this.n, ((wu6) a3).c, ((sceVar instanceof bqr) && ((bqr) sceVar).g) ? false : true);
            if (w4kVar == null) {
            }
            this.k = w4kVar;
            this.g.setValue(w4kVar);
            if (this.e != null) {
                Object a4 = bs1Var2.a();
                if (!(a4 instanceof eun)) {
                }
                if (eunVar != null) {
                }
                Object a22 = bs1Var3.a();
                if (a22 instanceof eun) {
                }
                if (eunVar2 != null) {
                }
            }
            function1 = this.m;
            if (function1 != null) {
            }
        }
        w4kVar = null;
        if (w4kVar == null) {
        }
        this.k = w4kVar;
        this.g.setValue(w4kVar);
        if (this.e != null) {
        }
        function1 = this.m;
        if (function1 != null) {
        }
    }
}
