package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fk0 {
    public final oct a;
    public final Object b;
    public final vm0 c;
    public final x6k d;
    public final x6k e;
    public Object f;
    public Object g;
    public final nqi h;
    public final b9r i;
    public final cn0 j;
    public final cn0 k;
    public cn0 l;
    public cn0 m;

    public fk0(Object obj, oct octVar, Object obj2) {
        this.a = octVar;
        this.b = obj2;
        vm0 vm0Var = new vm0(octVar, obj, null, 60);
        this.c = vm0Var;
        this.d = szf.g0(Boolean.FALSE);
        this.e = szf.g0(obj);
        this.h = new nqi();
        this.i = new b9r(3, obj2);
        cn0 cn0Var = vm0Var.c;
        boolean z = cn0Var instanceof ym0;
        cn0 cn0Var2 = z ? vq2.e : cn0Var instanceof zm0 ? vq2.f : cn0Var instanceof an0 ? vq2.g : vq2.h;
        this.j = cn0Var2;
        cn0 cn0Var3 = z ? vq2.a : cn0Var instanceof zm0 ? vq2.b : cn0Var instanceof an0 ? vq2.c : vq2.d;
        this.k = cn0Var3;
        this.l = cn0Var2;
        this.m = cn0Var3;
    }

    public static final void a(fk0 fk0Var) {
        vm0 vm0Var = fk0Var.c;
        vm0Var.c.d();
        vm0Var.d = Long.MIN_VALUE;
        fk0Var.d.setValue(Boolean.FALSE);
    }

    public static Object c(fk0 fk0Var, Object obj, tm0 tm0Var, Function1 function1, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            tm0Var = fk0Var.i;
        }
        tm0 tm0Var2 = tm0Var;
        Object invoke = fk0Var.a.b.invoke(fk0Var.c.c);
        if ((i & 8) != 0) {
            function1 = null;
        }
        return fk0Var.b(obj, tm0Var2, invoke, function1, continuation);
    }

    public final Object b(Object obj, tm0 tm0Var, Object obj2, Function1 function1, Continuation continuation) {
        Object e = e();
        oct octVar = this.a;
        return nqi.a(this.h, new bk0(this, obj2, new l6s(tm0Var, octVar, e, obj, (cn0) octVar.a.invoke(obj2)), this.c.d, function1, null), continuation);
    }

    public final Object d(Object obj) {
        if (Intrinsics.d(this.l, this.j) && Intrinsics.d(this.m, this.k)) {
            return obj;
        }
        oct octVar = this.a;
        cn0 cn0Var = (cn0) octVar.a.invoke(obj);
        int b = cn0Var.b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            if (cn0Var.a(i) < this.l.a(i) || cn0Var.a(i) > this.m.a(i)) {
                cn0Var.e(i, yhn.c(cn0Var.a(i), this.l.a(i), this.m.a(i)));
                z = true;
            }
        }
        return z ? octVar.b.invoke(cn0Var) : obj;
    }

    public final Object e() {
        return this.c.b.getValue();
    }

    public final Object f(Object obj, Continuation continuation) {
        Object a = nqi.a(this.h, new ck0(this, obj, null, 0), continuation);
        return a == nm6.a ? a : Unit.a;
    }

    public final Object g(aur aurVar) {
        Object a = nqi.a(this.h, new qs(this, null, 1), aurVar);
        return a == nm6.a ? a : Unit.a;
    }

    public final void h(Object obj, Object obj2) {
        cn0 cn0Var;
        cn0 cn0Var2;
        oct octVar = this.a;
        if (obj == null || (cn0Var = (cn0) octVar.a.invoke(obj)) == null) {
            cn0Var = this.j;
        }
        if (obj2 == null || (cn0Var2 = (cn0) octVar.a.invoke(obj2)) == null) {
            cn0Var2 = this.k;
        }
        int b = cn0Var.b();
        for (int i = 0; i < b; i++) {
            if (cn0Var.a(i) > cn0Var2.a(i)) {
                mlm.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + cn0Var + " is greater than upper bound " + cn0Var2 + " on index " + i);
            }
        }
        this.l = cn0Var;
        this.m = cn0Var2;
        this.g = obj2;
        this.f = obj;
        if (((Boolean) this.d.getValue()).booleanValue()) {
            return;
        }
        Object d = d(e());
        if (Intrinsics.d(d, e())) {
            return;
        }
        this.c.b.setValue(d);
    }

    public /* synthetic */ fk0(Object obj, oct octVar, Object obj2, int i) {
        this(obj, octVar, (i & 4) != 0 ? null : obj2);
    }
}
