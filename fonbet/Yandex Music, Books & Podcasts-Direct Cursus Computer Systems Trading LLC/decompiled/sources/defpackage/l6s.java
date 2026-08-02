package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l6s implements cm0 {
    public final rzt a;
    public final oct b;
    public final Object c;
    public final Object d;
    public final cn0 e;
    public final cn0 f;
    public final cn0 g;
    public long h;
    public cn0 i;

    public l6s(tm0 tm0Var, oct octVar, Object obj, Object obj2, cn0 cn0Var) {
        this.a = tm0Var.a(octVar);
        this.b = octVar;
        this.c = obj2;
        this.d = obj;
        this.e = (cn0) octVar.a.invoke(obj);
        Function1 function1 = octVar.a;
        this.f = (cn0) function1.invoke(obj2);
        this.g = cn0Var != null ? qwp.H(cn0Var) : ((cn0) function1.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.cm0
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.cm0
    public final cn0 b(long j) {
        if (!c(j)) {
            return this.a.x(j, this.e, this.f, this.g);
        }
        cn0 cn0Var = this.i;
        if (cn0Var != null) {
            return cn0Var;
        }
        cn0 v = this.a.v(this.e, this.f, this.g);
        this.i = v;
        return v;
    }

    @Override // defpackage.cm0
    public final long d() {
        if (this.h < 0) {
            this.h = this.a.m(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.cm0
    public final oct e() {
        return this.b;
    }

    @Override // defpackage.cm0
    public final Object f(long j) {
        if (c(j)) {
            return this.c;
        }
        cn0 A = this.a.A(j, this.e, this.f, this.g);
        int b = A.b();
        for (int i = 0; i < b; i++) {
            if (Float.isNaN(A.a(i))) {
                mlm.b("AnimationVector cannot contain a NaN. " + A + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.invoke(A);
    }

    @Override // defpackage.cm0
    public final Object g() {
        return this.c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (d() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
