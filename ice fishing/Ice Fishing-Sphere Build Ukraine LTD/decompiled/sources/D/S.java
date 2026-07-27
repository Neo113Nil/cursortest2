package D;

import L0.AbstractC0064w;
import L0.C0054l;
import L0.C0056n;
import L0.C0058p;
import L0.C0062u;
import L0.InterfaceC0053k;
import L0.InterfaceC0063v;
import java.util.List;
import t0.AbstractC0249d;
import t0.C0247b;
import t0.C0250e;
import t0.C0252g;

/* loaded from: classes.dex */
public final class S implements InterfaceC0008i {

    /* renamed from: e, reason: collision with root package name */
    public final X f125e;

    /* renamed from: f, reason: collision with root package name */
    public final E.a f126f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0063v f127g;

    /* renamed from: j, reason: collision with root package name */
    public int f130j;

    /* renamed from: k, reason: collision with root package name */
    public L0.f0 f131k;

    /* renamed from: m, reason: collision with root package name */
    public final C0013n f133m;

    /* renamed from: n, reason: collision with root package name */
    public final C0250e f134n;

    /* renamed from: o, reason: collision with root package name */
    public final C0250e f135o;

    /* renamed from: p, reason: collision with root package name */
    public final C0013n f136p;

    /* renamed from: h, reason: collision with root package name */
    public final A.j f128h = new A.j(new C0020v(this, null));

    /* renamed from: i, reason: collision with root package name */
    public final T0.d f129i = T0.e.a();

    /* renamed from: l, reason: collision with root package name */
    public final A.j f132l = new A.j(3);

    public S(X x2, List list, E.a aVar, InterfaceC0063v interfaceC0063v) {
        this.f125e = x2;
        this.f126f = aVar;
        this.f127g = interfaceC0063v;
        C0013n c0013n = new C0013n();
        c0013n.f246d = this;
        c0013n.f243a = T0.e.a();
        C0054l c0054l = new C0054l(true);
        c0054l.H(null);
        c0013n.f244b = c0054l;
        c0013n.f245c = u0.d.F(list);
        this.f133m = c0013n;
        this.f134n = new C0250e(new C0014o(this, 1));
        this.f135o = new C0250e(new C0014o(this, 0));
        M m2 = new M(0, this);
        O o2 = new O(this, null);
        C0013n c0013n2 = new C0013n();
        c0013n2.f243a = interfaceC0063v;
        c0013n2.f244b = o2;
        c0013n2.f245c = N0.i.a(Integer.MAX_VALUE, 0, 6);
        c0013n2.f246d = new A.j(1);
        L0.Q q2 = (L0.Q) interfaceC0063v.o().i(C0062u.f682f);
        if (q2 != null) {
            ((L0.a0) q2).I(false, true, new T0.b(2, m2, c0013n2));
        }
        this.f136p = c0013n2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(S s2, x0.b bVar) {
        C0021w c0021w;
        int i2;
        T0.d dVar;
        int i3;
        s2.getClass();
        try {
            if (bVar instanceof C0021w) {
                c0021w = (C0021w) bVar;
                int i4 = c0021w.f275l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0021w.f275l = i4 - Integer.MIN_VALUE;
                    Object obj = c0021w.f273j;
                    w0.a aVar = w0.a.f3076e;
                    i2 = c0021w.f275l;
                    if (i2 != 0) {
                        o.g.z(obj);
                        c0021w.f271h = s2;
                        dVar = s2.f129i;
                        c0021w.f272i = dVar;
                        c0021w.f275l = 1;
                        if (dVar.c(c0021w) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        T0.d dVar2 = c0021w.f272i;
                        S s3 = c0021w.f271h;
                        o.g.z(obj);
                        dVar = dVar2;
                        s2 = s3;
                    }
                    i3 = s2.f130j - 1;
                    s2.f130j = i3;
                    if (i3 == 0) {
                        L0.f0 f0Var = s2.f131k;
                        if (f0Var != null) {
                            f0Var.a(null);
                        }
                        s2.f131k = null;
                    }
                    dVar.e(null);
                    return C0252g.f2994a;
                }
            }
            i3 = s2.f130j - 1;
            s2.f130j = i3;
            if (i3 == 0) {
            }
            dVar.e(null);
            return C0252g.f2994a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0021w = new C0021w(s2, bVar);
        Object obj2 = c0021w.f273j;
        w0.a aVar2 = w0.a.f3076e;
        i2 = c0021w.f275l;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|(7:57|(1:(1:(1:61)(2:63|64))(3:65|66|67))(1:68)|62|17|(1:19)(1:23)|20|21)(4:8|9|10|(9:12|13|14|(1:24)|16|17|(0)(0)|20|21)(3:30|(1:32)(1:55)|(2:34|(2:36|(2:38|39))(2:47|48))(2:49|(2:51|52)(2:53|54))))|40|41|42|(1:44)|16|17|(0)(0)|20|21))|70|6|(0)(0)|40|41|42|(0)|16|17|(0)(0)|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /* JADX WARN: Type inference failed for: r2v3, types: [D0.p, x0.f] */
    /* JADX WARN: Type inference failed for: r2v9, types: [D0.p, x0.f] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(S s2, e0 e0Var, x0.b bVar) {
        C0023y c0023y;
        w0.a aVar;
        int i2;
        InterfaceC0053k interfaceC0053k;
        C0054l c0054l;
        S s3;
        Object b2;
        InterfaceC0053k interfaceC0053k2;
        Throwable a2;
        m0 x2;
        s2.getClass();
        if (bVar instanceof C0023y) {
            c0023y = (C0023y) bVar;
            int i3 = c0023y.f283m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0023y.f283m = i3 - Integer.MIN_VALUE;
                Object obj = c0023y.f281k;
                aVar = w0.a.f3076e;
                i2 = c0023y.f283m;
                boolean z2 = true;
                if (i2 == 0) {
                    try {
                        if (i2 == 1) {
                            interfaceC0053k = (InterfaceC0053k) c0023y.f278h;
                        } else if (i2 == 2) {
                            C0054l c0054l2 = c0023y.f280j;
                            S s4 = c0023y.f279i;
                            e0 e0Var2 = (e0) c0023y.f278h;
                            o.g.z(obj);
                            c0054l = c0054l2;
                            s3 = s4;
                            e0Var = e0Var2;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0053k = (InterfaceC0053k) c0023y.f278h;
                        }
                        o.g.z(obj);
                        interfaceC0053k2 = interfaceC0053k;
                    } catch (Throwable th) {
                        th = th;
                        obj = o.g.f(th);
                        interfaceC0053k2 = s2;
                        a2 = AbstractC0249d.a(obj);
                        C0054l c0054l3 = (C0054l) interfaceC0053k2;
                        if (a2 != null) {
                        }
                        return C0252g.f2994a;
                    }
                    a2 = AbstractC0249d.a(obj);
                    C0054l c0054l32 = (C0054l) interfaceC0053k2;
                    if (a2 != null) {
                        c0054l32.K(obj);
                    } else {
                        c0054l32.getClass();
                        c0054l32.K(new C0056n(a2, false));
                    }
                    return C0252g.f2994a;
                }
                o.g.z(obj);
                c0054l = e0Var.f181b;
                try {
                    x2 = s2.f132l.x();
                } catch (Throwable th2) {
                    th = th2;
                    s2 = c0054l;
                    obj = o.g.f(th);
                    interfaceC0053k2 = s2;
                    a2 = AbstractC0249d.a(obj);
                    C0054l c0054l322 = (C0054l) interfaceC0053k2;
                    if (a2 != null) {
                    }
                    return C0252g.f2994a;
                }
                if (x2 instanceof C0003d) {
                    ?? r2 = e0Var.f180a;
                    v0.i iVar = e0Var.f183d;
                    c0023y.f278h = c0054l;
                    c0023y.f283m = 1;
                    try {
                        b2 = s2.f().b(new I(s2, iVar, (D0.p) r2, (v0.d) null), c0023y);
                        if (b2 == aVar) {
                            return aVar;
                        }
                        C0054l c0054l4 = c0054l;
                        obj = b2;
                        interfaceC0053k2 = c0054l4;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        s2 = c0054l;
                        obj = o.g.f(th);
                        interfaceC0053k2 = s2;
                        a2 = AbstractC0249d.a(obj);
                        C0054l c0054l3222 = (C0054l) interfaceC0053k2;
                        if (a2 != null) {
                        }
                        return C0252g.f2994a;
                    }
                    a2 = AbstractC0249d.a(obj);
                    C0054l c0054l32222 = (C0054l) interfaceC0053k2;
                    if (a2 != null) {
                    }
                    return C0252g.f2994a;
                }
                if (!(x2 instanceof f0)) {
                    z2 = x2 instanceof n0;
                }
                if (!z2) {
                    if (x2 instanceof d0) {
                        throw ((d0) x2).f176b;
                    }
                    throw new C0058p();
                }
                if (x2 != e0Var.f182c) {
                    E0.i.c(x2, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((f0) x2).f188b;
                }
                c0023y.f278h = e0Var;
                c0023y.f279i = s2;
                c0023y.f280j = c0054l;
                c0023y.f283m = 2;
                Object g2 = s2.g(c0023y);
                s3 = s2;
                if (g2 == aVar) {
                    return aVar;
                }
                ?? r22 = e0Var.f180a;
                v0.i iVar2 = e0Var.f183d;
                c0023y.f278h = c0054l;
                c0023y.f279i = null;
                c0023y.f280j = null;
                c0023y.f283m = 3;
                b2 = s3.f().b(new I(s3, iVar2, (D0.p) r22, (v0.d) null), c0023y);
                if (b2 == aVar) {
                    return aVar;
                }
                C0054l c0054l42 = c0054l;
                obj = b2;
                interfaceC0053k2 = c0054l42;
                a2 = AbstractC0249d.a(obj);
                C0054l c0054l322222 = (C0054l) interfaceC0053k2;
                if (a2 != null) {
                }
                return C0252g.f2994a;
            }
        }
        c0023y = new C0023y(s2, bVar);
        Object obj2 = c0023y.f281k;
        aVar = w0.a.f3076e;
        i2 = c0023y.f283m;
        boolean z22 = true;
        if (i2 == 0) {
        }
        ?? r222 = e0Var.f180a;
        v0.i iVar22 = e0Var.f183d;
        c0023y.f278h = c0054l;
        c0023y.f279i = null;
        c0023y.f280j = null;
        c0023y.f283m = 3;
        b2 = s3.f().b(new I(s3, iVar22, (D0.p) r222, (v0.d) null), c0023y);
        if (b2 == aVar) {
        }
        C0054l c0054l422 = c0054l;
        obj2 = b2;
        interfaceC0053k2 = c0054l422;
        a2 = AbstractC0249d.a(obj2);
        C0054l c0054l3222222 = (C0054l) interfaceC0053k2;
        if (a2 != null) {
        }
        return C0252g.f2994a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(S s2, x0.b bVar) {
        C0024z c0024z;
        int i2;
        T0.d dVar;
        int i3;
        s2.getClass();
        try {
            if (bVar instanceof C0024z) {
                c0024z = (C0024z) bVar;
                int i4 = c0024z.f288l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0024z.f288l = i4 - Integer.MIN_VALUE;
                    Object obj = c0024z.f286j;
                    w0.a aVar = w0.a.f3076e;
                    i2 = c0024z.f288l;
                    if (i2 != 0) {
                        o.g.z(obj);
                        c0024z.f284h = s2;
                        dVar = s2.f129i;
                        c0024z.f285i = dVar;
                        c0024z.f288l = 1;
                        if (dVar.c(c0024z) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        T0.d dVar2 = c0024z.f285i;
                        S s3 = c0024z.f284h;
                        o.g.z(obj);
                        dVar = dVar2;
                        s2 = s3;
                    }
                    i3 = s2.f130j + 1;
                    s2.f130j = i3;
                    if (i3 == 1) {
                        s2.f131k = AbstractC0064w.g(s2.f127g, new B(s2, null));
                    }
                    dVar.e(null);
                    return C0252g.f2994a;
                }
            }
            i3 = s2.f130j + 1;
            s2.f130j = i3;
            if (i3 == 1) {
            }
            dVar.e(null);
            return C0252g.f2994a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0024z = new C0024z(s2, bVar);
        Object obj2 = c0024z.f286j;
        w0.a aVar2 = w0.a.f3076e;
        i2 = c0024z.f288l;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(S s2, boolean z2, v0.d dVar) {
        D d2;
        int i2;
        S s3;
        m0 m0Var;
        boolean z3;
        S s4;
        C0247b c0247b;
        s2.getClass();
        if (dVar instanceof D) {
            d2 = (D) dVar;
            int i3 = d2.f70m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d2.f70m = i3 - Integer.MIN_VALUE;
                Object obj = d2.f68k;
                w0.a aVar = w0.a.f3076e;
                i2 = d2.f70m;
                if (i2 != 0) {
                    o.g.z(obj);
                    m0 x2 = s2.f132l.x();
                    if (x2 instanceof n0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    l0 f2 = s2.f();
                    d2.f65h = s2;
                    d2.f66i = x2;
                    d2.f67j = z2;
                    d2.f70m = 1;
                    Integer a2 = f2.a();
                    if (a2 == aVar) {
                        return aVar;
                    }
                    s3 = s2;
                    m0Var = x2;
                    obj = a2;
                } else if (i2 == 1) {
                    z2 = d2.f67j;
                    m0Var = d2.f66i;
                    s3 = d2.f65h;
                    o.g.z(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s4 = d2.f65h;
                        o.g.z(obj);
                        c0247b = (C0247b) obj;
                        m0 m0Var2 = (m0) c0247b.f2987e;
                        if (((Boolean) c0247b.f2988f).booleanValue()) {
                            return m0Var2;
                        }
                        s4.f132l.G(m0Var2);
                        return m0Var2;
                    }
                    s4 = d2.f65h;
                    o.g.z(obj);
                    c0247b = (C0247b) obj;
                    m0 m0Var22 = (m0) c0247b.f2987e;
                    if (((Boolean) c0247b.f2988f).booleanValue()) {
                    }
                }
                int intValue = ((Number) obj).intValue();
                z3 = m0Var instanceof C0003d;
                int i4 = !z3 ? m0Var.f242a : -1;
                if (!z3 && intValue == i4) {
                    return m0Var;
                }
                if (z2) {
                    l0 f3 = s3.f();
                    F f4 = new F(s3, i4, null);
                    d2.f65h = s3;
                    d2.f66i = null;
                    d2.f70m = 3;
                    obj = f3.c(f4, d2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    s4 = s3;
                    c0247b = (C0247b) obj;
                    m0 m0Var222 = (m0) c0247b.f2987e;
                    if (((Boolean) c0247b.f2988f).booleanValue()) {
                    }
                } else {
                    l0 f5 = s3.f();
                    E e2 = new E(s3, null);
                    d2.f65h = s3;
                    d2.f66i = null;
                    d2.f70m = 2;
                    obj = f5.b(e2, d2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    s4 = s3;
                    c0247b = (C0247b) obj;
                    m0 m0Var2222 = (m0) c0247b.f2987e;
                    if (((Boolean) c0247b.f2988f).booleanValue()) {
                    }
                }
            }
        }
        d2 = new D(s2, dVar);
        Object obj2 = d2.f68k;
        w0.a aVar2 = w0.a.f3076e;
        i2 = d2.f70m;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z3 = m0Var instanceof C0003d;
        if (!z3) {
        }
        if (!z3) {
        }
        if (z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea A[Catch: c -> 0x00ab, TryCatch #1 {c -> 0x00ab, blocks: (B:36:0x00a6, B:37:0x0144, B:41:0x00b4, B:42:0x0127, B:58:0x00d1, B:60:0x00ea, B:61:0x00ee, B:67:0x00da, B:71:0x0115), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(S s2, boolean z2, x0.b bVar) {
        G g2;
        Integer a2;
        Object obj;
        S s3;
        int i2;
        C0002c c0002c;
        Object b2;
        E0.o oVar;
        E0.p pVar;
        s2.getClass();
        try {
            if (bVar instanceof G) {
                g2 = (G) bVar;
                int i3 = g2.f87p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    g2.f87p = i3 - Integer.MIN_VALUE;
                    Object obj2 = g2.f85n;
                    w0.a aVar = w0.a.f3076e;
                    switch (g2.f87p) {
                        case 0:
                            o.g.z(obj2);
                            if (!z2) {
                                l0 f2 = s2.f();
                                g2.f79h = s2;
                                g2.f83l = z2;
                                g2.f87p = 3;
                                obj2 = f2.a();
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                int intValue = ((Number) obj2).intValue();
                                l0 f3 = s2.f();
                                H h2 = new H(s2, intValue, null);
                                g2.f79h = s2;
                                g2.f83l = z2;
                                g2.f87p = 4;
                                obj2 = f3.c(h2, g2);
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                return (C0003d) obj2;
                            }
                            g2.f79h = s2;
                            g2.f83l = z2;
                            g2.f87p = 1;
                            obj2 = s2.h(g2);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            int hashCode = obj2 != null ? obj2.hashCode() : 0;
                            l0 f4 = s2.f();
                            g2.f79h = s2;
                            g2.f80i = obj2;
                            g2.f83l = z2;
                            g2.f84m = hashCode;
                            g2.f87p = 2;
                            a2 = f4.a();
                            if (a2 != aVar) {
                                return aVar;
                            }
                            obj = obj2;
                            obj2 = a2;
                            s3 = s2;
                            i2 = hashCode;
                            return new C0003d(obj, i2, ((Number) obj2).intValue());
                        case 1:
                            z2 = g2.f83l;
                            s2 = (S) g2.f79h;
                            o.g.z(obj2);
                            if (obj2 != null) {
                            }
                            l0 f42 = s2.f();
                            g2.f79h = s2;
                            g2.f80i = obj2;
                            g2.f83l = z2;
                            g2.f84m = hashCode;
                            g2.f87p = 2;
                            a2 = f42.a();
                            if (a2 != aVar) {
                            }
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            i2 = g2.f84m;
                            z2 = g2.f83l;
                            obj = g2.f80i;
                            s3 = (S) g2.f79h;
                            try {
                                o.g.z(obj2);
                                return new C0003d(obj, i2, ((Number) obj2).intValue());
                            } catch (C0002c e2) {
                                e = e2;
                                s2 = s3;
                                E0.p pVar2 = new E0.p();
                                E.a aVar2 = s2.f126f;
                                g2.f79h = s2;
                                g2.f80i = e;
                                g2.f81j = pVar2;
                                g2.f82k = pVar2;
                                g2.f83l = z2;
                                g2.f87p = 5;
                                throw e;
                            }
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            z2 = g2.f83l;
                            s2 = (S) g2.f79h;
                            o.g.z(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            l0 f32 = s2.f();
                            H h22 = new H(s2, intValue2, null);
                            g2.f79h = s2;
                            g2.f83l = z2;
                            g2.f87p = 4;
                            obj2 = f32.c(h22, g2);
                            if (obj2 == aVar) {
                            }
                            return (C0003d) obj2;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            boolean z3 = g2.f83l;
                            o.g.z(obj2);
                            return (C0003d) obj2;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            boolean z4 = g2.f83l;
                            E0.p pVar3 = g2.f82k;
                            E0.p pVar4 = (E0.p) g2.f81j;
                            C0002c c0002c2 = (C0002c) g2.f80i;
                            S s4 = (S) g2.f79h;
                            o.g.z(obj2);
                            pVar3.f313e = obj2;
                            E0.o oVar2 = new E0.o();
                            try {
                                I i4 = new I(pVar4, s4, oVar2, (v0.d) null);
                                g2.f79h = c0002c2;
                                g2.f80i = pVar4;
                                g2.f81j = oVar2;
                                g2.f82k = null;
                                g2.f87p = 6;
                                if (z4) {
                                    s4.getClass();
                                    b2 = i4.i(g2);
                                } else {
                                    b2 = s4.f().b(new C0022x(i4, null), g2);
                                }
                                if (b2 == aVar) {
                                    return aVar;
                                }
                                oVar = oVar2;
                                pVar = pVar4;
                                Object obj3 = pVar.f313e;
                                return new C0003d(obj3, obj3 != null ? obj3.hashCode() : 0, oVar.f312e);
                            } catch (Throwable th) {
                                th = th;
                                c0002c = c0002c2;
                                o.g.a(c0002c, th);
                                throw c0002c;
                            }
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            oVar = (E0.o) g2.f81j;
                            pVar = (E0.p) g2.f80i;
                            c0002c = (C0002c) g2.f79h;
                            try {
                                o.g.z(obj2);
                                Object obj32 = pVar.f313e;
                                return new C0003d(obj32, obj32 != null ? obj32.hashCode() : 0, oVar.f312e);
                            } catch (Throwable th2) {
                                th = th2;
                                o.g.a(c0002c, th);
                                throw c0002c;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (g2.f87p) {
            }
        } catch (C0002c e3) {
            e = e3;
        }
        g2 = new G(s2, bVar);
        Object obj22 = g2.f85n;
        w0.a aVar3 = w0.a.f3076e;
    }

    public final l0 f() {
        return (l0) this.f135o.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(x0.b bVar) {
        C c2;
        Object obj;
        int i2;
        S s2;
        int intValue;
        int i3;
        Throwable th;
        S s3;
        C0013n c0013n;
        try {
            if (bVar instanceof C) {
                c2 = (C) bVar;
                int i4 = c2.f64l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c2.f64l = i4 - Integer.MIN_VALUE;
                    Object obj2 = c2.f62j;
                    obj = w0.a.f3076e;
                    i2 = c2.f64l;
                    if (i2 != 0) {
                        o.g.z(obj2);
                        l0 f2 = f();
                        c2.f60h = this;
                        c2.f64l = 1;
                        obj2 = f2.a();
                        if (obj2 == obj) {
                            return obj;
                        }
                        s2 = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i3 = c2.f61i;
                            s3 = c2.f60h;
                            try {
                                o.g.z(obj2);
                                return C0252g.f2994a;
                            } catch (Throwable th2) {
                                th = th2;
                                s3.f132l.G(new f0(th, i3));
                                throw th;
                            }
                        }
                        s2 = c2.f60h;
                        o.g.z(obj2);
                    }
                    intValue = ((Number) obj2).intValue();
                    c0013n = s2.f133m;
                    c2.f60h = s2;
                    c2.f61i = intValue;
                    c2.f64l = 2;
                    if (c0013n.h(c2) == obj) {
                        return obj;
                    }
                    return C0252g.f2994a;
                }
            }
            c0013n = s2.f133m;
            c2.f60h = s2;
            c2.f61i = intValue;
            c2.f64l = 2;
            if (c0013n.h(c2) == obj) {
            }
            return C0252g.f2994a;
        } catch (Throwable th3) {
            i3 = intValue;
            th = th3;
            s3 = s2;
            s3.f132l.G(new f0(th, i3));
            throw th;
        }
        c2 = new C(this, bVar);
        Object obj22 = c2.f62j;
        obj = w0.a.f3076e;
        i2 = c2.f64l;
        if (i2 != 0) {
        }
        intValue = ((Number) obj22).intValue();
    }

    public final Object h(x0.b bVar) {
        return ((a0) this.f134n.a()).a(new C0017s(3, (v0.d) null), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, boolean z2, x0.b bVar) {
        P p2;
        int i2;
        E0.o oVar;
        if (bVar instanceof P) {
            p2 = (P) bVar;
            int i3 = p2.f117k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p2.f117k = i3 - Integer.MIN_VALUE;
                Object obj2 = p2.f115i;
                w0.a aVar = w0.a.f3076e;
                i2 = p2.f117k;
                if (i2 != 0) {
                    o.g.z(obj2);
                    E0.o oVar2 = new E0.o();
                    a0 a0Var = (a0) this.f134n.a();
                    Q q2 = new Q(oVar2, this, obj, z2, null);
                    p2.f114h = oVar2;
                    p2.f117k = 1;
                    if (a0Var.b(q2, p2) == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = p2.f114h;
                    o.g.z(obj2);
                }
                return new Integer(oVar.f312e);
            }
        }
        p2 = new P(this, bVar);
        Object obj22 = p2.f115i;
        w0.a aVar2 = w0.a.f3076e;
        i2 = p2.f117k;
        if (i2 != 0) {
        }
        return new Integer(oVar.f312e);
    }

    @Override // D.InterfaceC0008i
    public final O0.d l() {
        return this.f128h;
    }

    @Override // D.InterfaceC0008i
    public final Object o(D0.p pVar, x0.f fVar) {
        v0.i iVar = fVar.f3091f;
        E0.i.b(iVar);
        q0 q0Var = (q0) iVar.i(p0.f253e);
        if (q0Var != null) {
            q0Var.c(this);
        }
        return AbstractC0064w.n(new q0(q0Var, this), new L(this, pVar, null), fVar);
    }
}
