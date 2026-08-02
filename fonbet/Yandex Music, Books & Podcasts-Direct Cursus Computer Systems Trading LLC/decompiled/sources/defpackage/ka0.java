package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ka0 {
    public final uif a;
    public final uif b;
    public final tm0 c;
    public final Function1 d;
    public final x6k g;
    public final t6k k;
    public final x6k l;
    public final x6k m;
    public final da0 n;
    public final ave e = new ave();
    public final ga0 f = new ga0(this);
    public final zx7 h = szf.U(new v90(this, 4));
    public final zx7 i = szf.U(new v90(this, 2));
    public final t6k j = new t6k(Float.NaN);

    /* JADX WARN: Multi-variable type inference failed */
    public ka0(Object obj, Function1 function1, Function0 function0, tm0 tm0Var, Function1 function12) {
        this.a = (uif) function1;
        this.b = (uif) function0;
        this.c = tm0Var;
        this.d = function12;
        this.g = szf.g0(obj);
        szf.T(ehv.h, new v90(this, 3));
        this.k = new t6k(0.0f);
        this.l = szf.g0(null);
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.m = szf.g0(new j9h(e5bVar));
        this.n = new da0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hqi hqiVar, ea0 ea0Var, Continuation continuation) {
        t90 t90Var;
        int i;
        ka0 ka0Var;
        ave aveVar;
        w90 w90Var;
        Object a;
        Object a2;
        if (continuation instanceof t90) {
            t90Var = (t90) continuation;
            int i2 = t90Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t90Var.m = i2 - Integer.MIN_VALUE;
                Object obj = t90Var.k;
                nm6 nm6Var = nm6.a;
                i = t90Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        aveVar = this.e;
                        w90Var = new w90(this, ea0Var, null, 2);
                        t90Var.j = this;
                        t90Var.m = 1;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        aveVar.getClass();
                        if (gld.Q(new y7b(hqiVar, aveVar, w90Var, (Continuation) null), t90Var) == nm6Var) {
                            return nm6Var;
                        }
                        ka0Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        ka0Var = this;
                        j9h e = ka0Var.e();
                        t6k t6kVar = ka0Var.j;
                        a = e.a(t6kVar.e());
                        if (a != null) {
                            ka0Var.h(a);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ka0Var = t90Var.j;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        j9h e2 = ka0Var.e();
                        t6k t6kVar2 = ka0Var.j;
                        a = e2.a(t6kVar2.e());
                        if (a != null && Math.abs(t6kVar2.e() - ka0Var.e().c(a)) <= 0.5f && ((Boolean) ka0Var.d.invoke(a)).booleanValue()) {
                            ka0Var.h(a);
                        }
                        throw th;
                    }
                }
                j9h e3 = ka0Var.e();
                t6k t6kVar3 = ka0Var.j;
                a2 = e3.a(t6kVar3.e());
                if (a2 != null && Math.abs(t6kVar3.e() - ka0Var.e().c(a2)) <= 0.5f && ((Boolean) ka0Var.d.invoke(a2)).booleanValue()) {
                    ka0Var.h(a2);
                }
                return Unit.a;
            }
        }
        t90Var = new t90(this, continuation);
        Object obj2 = t90Var.k;
        nm6 nm6Var2 = nm6.a;
        i = t90Var.m;
        if (i != 0) {
        }
        j9h e32 = ka0Var.e();
        t6k t6kVar32 = ka0Var.j;
        a2 = e32.a(t6kVar32.e());
        if (a2 != null) {
            ka0Var.h(a2);
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, hqi hqiVar, e90 e90Var, cg6 cg6Var) {
        z90 z90Var;
        int i;
        ka0 ka0Var;
        Throwable th;
        ka0 ka0Var2;
        Object a;
        Object a2;
        if (cg6Var instanceof z90) {
            z90Var = (z90) cg6Var;
            int i2 = z90Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z90Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = z90Var.k;
                nm6 nm6Var = nm6.a;
                i = z90Var.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (!e().a.containsKey(obj)) {
                        h(obj);
                        return Unit.a;
                    }
                    try {
                        ave aveVar = this.e;
                        ka0Var = this;
                        try {
                            aa0 aa0Var = new aa0(ka0Var, obj, e90Var, continuation, 2);
                            z90Var.j = ka0Var;
                            z90Var.m = 1;
                            try {
                                aveVar.getClass();
                                if (gld.Q(new y7b(hqiVar, aveVar, aa0Var, (Continuation) null), z90Var) == nm6Var) {
                                    return nm6Var;
                                }
                                ka0Var2 = ka0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                ka0Var2 = ka0Var;
                                ka0Var2.i(null);
                                t6k t6kVar = ka0Var2.j;
                                a = ka0Var2.e().a(t6kVar.e());
                                if (a == null) {
                                    throw th;
                                }
                                if (Math.abs(t6kVar.e() - ka0Var2.e().c(a)) > 0.5f) {
                                    throw th;
                                }
                                if (!((Boolean) ka0Var2.d.invoke(a)).booleanValue()) {
                                    throw th;
                                }
                                ka0Var2.h(a);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            ka0Var2 = ka0Var;
                            ka0Var2.i(null);
                            t6k t6kVar2 = ka0Var2.j;
                            a = ka0Var2.e().a(t6kVar2.e());
                            if (a == null) {
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        ka0Var = this;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ka0Var2 = z90Var.j;
                    try {
                        qgg.h0(obj2);
                    } catch (Throwable th5) {
                        th = th5;
                        ka0Var2.i(null);
                        t6k t6kVar22 = ka0Var2.j;
                        a = ka0Var2.e().a(t6kVar22.e());
                        if (a == null) {
                        }
                    }
                }
                ka0Var2.i(null);
                t6k t6kVar3 = ka0Var2.j;
                a2 = ka0Var2.e().a(t6kVar3.e());
                if (a2 != null && Math.abs(t6kVar3.e() - ka0Var2.e().c(a2)) <= 0.5f && ((Boolean) ka0Var2.d.invoke(a2)).booleanValue()) {
                    ka0Var2.h(a2);
                }
                return Unit.a;
            }
        }
        z90Var = new z90(this, cg6Var);
        Object obj22 = z90Var.k;
        nm6 nm6Var2 = nm6.a;
        i = z90Var.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ka0Var2.i(null);
        t6k t6kVar32 = ka0Var2.j;
        a2 = ka0Var2.e().a(t6kVar32.e());
        if (a2 != null) {
            ka0Var2.h(a2);
        }
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function1, uif] */
    public final Object c(float f, float f2, Object obj) {
        j9h e = e();
        float c = e.c(obj);
        float floatValue = ((Number) this.b.invoke()).floatValue();
        if (c != f && !Float.isNaN(c)) {
            ?? r4 = this.a;
            if (c < f) {
                if (f2 >= floatValue) {
                    Object b = e.b(true, f);
                    b.getClass();
                    return b;
                }
                Object b2 = e.b(true, f);
                b2.getClass();
                if (f >= Math.abs(Math.abs(((Number) r4.invoke(Float.valueOf(Math.abs(e.c(b2) - c)))).floatValue()) + c)) {
                    return b2;
                }
            } else {
                if (f2 <= (-floatValue)) {
                    Object b3 = e.b(false, f);
                    b3.getClass();
                    return b3;
                }
                Object b4 = e.b(false, f);
                b4.getClass();
                float abs = Math.abs(c - Math.abs(((Number) r4.invoke(Float.valueOf(Math.abs(c - e.c(b4))))).floatValue()));
                if (f >= 0.0f ? f <= abs : Math.abs(f) >= abs) {
                    return b4;
                }
            }
        }
        return obj;
    }

    public final float d(float f) {
        float f2 = f(f);
        t6k t6kVar = this.j;
        float e = Float.isNaN(t6kVar.e()) ? 0.0f : t6kVar.e();
        t6kVar.h(f2);
        return f2 - e;
    }

    public final j9h e() {
        return (j9h) this.m.getValue();
    }

    public final float f(float f) {
        t6k t6kVar = this.j;
        float e = (Float.isNaN(t6kVar.e()) ? 0.0f : t6kVar.e()) + f;
        Float c0 = CollectionsKt.c0(e().a.values());
        float floatValue = c0 != null ? c0.floatValue() : Float.NaN;
        Float a0 = CollectionsKt.a0(e().a.values());
        return yhn.c(e, floatValue, a0 != null ? a0.floatValue() : Float.NaN);
    }

    public final float g() {
        t6k t6kVar = this.j;
        if (!Float.isNaN(t6kVar.e())) {
            return t6kVar.e();
        }
        xq0.q("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void h(Object obj) {
        this.g.setValue(obj);
    }

    public final void i(Object obj) {
        this.l.setValue(obj);
    }

    public final Object j(float f, cg6 cg6Var) {
        Object value = this.g.getValue();
        Object c = c(g(), f, value);
        if (((Boolean) this.d.invoke(c)).booleanValue()) {
            Object p = xp3.p(this, c, f, cg6Var);
            return p == nm6.a ? p : Unit.a;
        }
        Object p2 = xp3.p(this, value, f, cg6Var);
        return p2 == nm6.a ? p2 : Unit.a;
    }

    public final boolean k(Object obj) {
        ha0 ha0Var = new ha0(1, this, obj);
        qqi qqiVar = this.e.b;
        boolean g = qqiVar.g();
        if (!g) {
            return g;
        }
        try {
            ha0Var.invoke();
            return g;
        } finally {
            qqiVar.b(null);
        }
    }
}
