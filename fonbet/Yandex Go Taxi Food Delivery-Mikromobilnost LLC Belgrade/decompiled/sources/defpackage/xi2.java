package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes10.dex */
public final class xi2 {
    public final gl11 a;
    public final Object b;
    public final long c;
    public final sls d;
    public final oz40 e;
    public sj2 f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final oz40 i = f.j(Boolean.TRUE);

    public xi2(Object obj, gl11 gl11Var, sj2 sj2Var, long j, Object obj2, long j2, sls slsVar) {
        this.a = gl11Var;
        this.b = obj2;
        this.c = j2;
        this.d = slsVar;
        this.e = f.j(obj);
        this.f = ooc.i(sj2Var);
        this.g = j;
    }

    public final void a() {
        k();
        this.d.invoke();
    }

    public final long b() {
        return this.h;
    }

    public final long c() {
        return this.g;
    }

    public final long d() {
        return this.c;
    }

    public final Object e() {
        return this.e.getValue();
    }

    public final Object f() {
        return this.a.b.invoke(this.f);
    }

    public final sj2 g() {
        return this.f;
    }

    public final boolean h() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    public final void i(long j) {
        this.h = j;
    }

    public final void j(long j) {
        this.g = j;
    }

    public final void k() {
        this.i.setValue(Boolean.FALSE);
    }

    public final void l(Object obj) {
        this.e.setValue(obj);
    }

    public final void m(sj2 sj2Var) {
        this.f = sj2Var;
    }
}
