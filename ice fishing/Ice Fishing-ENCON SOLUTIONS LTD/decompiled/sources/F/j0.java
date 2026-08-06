package F;

import java.util.concurrent.atomic.AtomicInteger;
import m1.EnumC0985a;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final I1.d f505a = I1.e.a();

    /* renamed from: b, reason: collision with root package name */
    public final C.j f506b = new C.j(2);

    /* renamed from: c, reason: collision with root package name */
    public final C.j f507c = new C.j(new i0(2, null));

    public j0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f506b.f124b).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(t1.l lVar, AbstractC0991b abstractC0991b) {
        g0 g0Var;
        EnumC0985a enumC0985a;
        int i2;
        I1.d dVar;
        Throwable th;
        I1.a aVar;
        Object invoke;
        try {
            if (abstractC0991b instanceof g0) {
                g0Var = (g0) abstractC0991b;
                int i3 = g0Var.f489h;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    g0Var.f489h = i3 - Integer.MIN_VALUE;
                    Object obj = g0Var.f487f;
                    enumC0985a = EnumC0985a.f8194a;
                    i2 = g0Var.f489h;
                    if (i2 != 0) {
                        R1.l.F(obj);
                        g0Var.f485d = lVar;
                        dVar = this.f505a;
                        g0Var.f486e = dVar;
                        g0Var.f489h = 1;
                        if (dVar.c(g0Var) == enumC0985a) {
                            return enumC0985a;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (I1.a) g0Var.f485d;
                            try {
                                R1.l.F(obj);
                                ((I1.d) aVar).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((I1.d) aVar).e(null);
                                throw th;
                            }
                        }
                        I1.d dVar2 = g0Var.f486e;
                        t1.l lVar2 = (t1.l) g0Var.f485d;
                        R1.l.F(obj);
                        dVar = dVar2;
                        lVar = lVar2;
                    }
                    g0Var.f485d = dVar;
                    g0Var.f486e = null;
                    g0Var.f489h = 2;
                    invoke = lVar.invoke(g0Var);
                    if (invoke != enumC0985a) {
                        return enumC0985a;
                    }
                    I1.d dVar3 = dVar;
                    obj = invoke;
                    aVar = dVar3;
                    ((I1.d) aVar).e(null);
                    return obj;
                }
            }
            g0Var.f485d = dVar;
            g0Var.f486e = null;
            g0Var.f489h = 2;
            invoke = lVar.invoke(g0Var);
            if (invoke != enumC0985a) {
            }
        } catch (Throwable th3) {
            I1.d dVar4 = dVar;
            th = th3;
            aVar = dVar4;
            ((I1.d) aVar).e(null);
            throw th;
        }
        g0Var = new g0(this, abstractC0991b);
        Object obj2 = g0Var.f487f;
        enumC0985a = EnumC0985a.f8194a;
        i2 = g0Var.f489h;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(t1.p pVar, AbstractC0991b abstractC0991b) {
        h0 h0Var;
        int i2;
        I1.d dVar;
        Throwable th;
        boolean z2;
        if (abstractC0991b instanceof h0) {
            h0Var = (h0) abstractC0991b;
            int i3 = h0Var.f500h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h0Var.f500h = i3 - Integer.MIN_VALUE;
                Object obj = h0Var.f498f;
                Object obj2 = EnumC0985a.f8194a;
                i2 = h0Var.f500h;
                if (i2 != 0) {
                    R1.l.F(obj);
                    I1.d dVar2 = this.f505a;
                    boolean d2 = dVar2.d(null);
                    try {
                        Object valueOf = Boolean.valueOf(d2);
                        h0Var.f496d = dVar2;
                        h0Var.f497e = d2;
                        h0Var.f500h = 1;
                        Object invoke = pVar.invoke(valueOf, h0Var);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        dVar = dVar2;
                        obj = invoke;
                        z2 = d2;
                    } catch (Throwable th2) {
                        dVar = dVar2;
                        th = th2;
                        z2 = d2;
                        if (z2) {
                            dVar.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = h0Var.f497e;
                    dVar = h0Var.f496d;
                    try {
                        R1.l.F(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z2) {
                        }
                        throw th;
                    }
                }
                if (z2) {
                    dVar.e(null);
                }
                return obj;
            }
        }
        h0Var = new h0(this, abstractC0991b);
        Object obj3 = h0Var.f498f;
        Object obj22 = EnumC0985a.f8194a;
        i2 = h0Var.f500h;
        if (i2 != 0) {
        }
        if (z2) {
        }
        return obj3;
    }
}
