package F;

import A1.AbstractC0022x;
import A1.C0011l;
import A1.C0013n;
import A1.C0015p;
import A1.C0019u;
import A1.InterfaceC0010k;
import A1.InterfaceC0020v;
import h1.AbstractC0236f;
import h1.C0234d;
import h1.C0237g;
import h1.C0239i;
import i1.AbstractC0252i;
import java.util.List;
import m1.EnumC0985a;
import n1.AbstractC0991b;
import n1.AbstractC0995f;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public final class P implements InterfaceC0033i {

    /* renamed from: a, reason: collision with root package name */
    public final V f412a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.j f413b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0020v f414c;

    /* renamed from: f, reason: collision with root package name */
    public int f417f;

    /* renamed from: g, reason: collision with root package name */
    public A1.g0 f418g;

    /* renamed from: i, reason: collision with root package name */
    public final C0038n f420i;

    /* renamed from: j, reason: collision with root package name */
    public final C0237g f421j;

    /* renamed from: k, reason: collision with root package name */
    public final C0237g f422k;

    /* renamed from: l, reason: collision with root package name */
    public final C0038n f423l;

    /* renamed from: d, reason: collision with root package name */
    public final C.j f415d = new C.j(new C0045v(this, null));

    /* renamed from: e, reason: collision with root package name */
    public final I1.d f416e = I1.e.a();

    /* renamed from: h, reason: collision with root package name */
    public final C.j f419h = new C.j(4);

    public P(V v2, List list, m0.j jVar, InterfaceC0020v interfaceC0020v) {
        this.f412a = v2;
        this.f413b = jVar;
        this.f414c = interfaceC0020v;
        C0038n c0038n = new C0038n();
        c0038n.f535d = this;
        c0038n.f532a = I1.e.a();
        C0011l c0011l = new C0011l(true);
        c0011l.G(null);
        c0038n.f533b = c0011l;
        c0038n.f534c = AbstractC0252i.R(list);
        this.f420i = c0038n;
        this.f421j = R1.d.y(new C0039o(this, 1));
        this.f422k = R1.d.y(new C0039o(this, 0));
        C1.p pVar = new C1.p(1, this);
        M m2 = new M(this, null);
        C0038n c0038n2 = new C0038n();
        c0038n2.f532a = interfaceC0020v;
        c0038n2.f533b = m2;
        c0038n2.f534c = C1.j.a(Integer.MAX_VALUE, 0, 6);
        c0038n2.f535d = new C.j(2);
        A1.S s2 = (A1.S) interfaceC0020v.h().m(C0019u.f73b);
        if (s2 != null) {
            ((A1.b0) s2).H(false, true, new I1.b(2, pVar, c0038n2));
        }
        this.f423l = c0038n2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(P p2, AbstractC0991b abstractC0991b) {
        C0046w c0046w;
        int i2;
        I1.d dVar;
        int i3;
        p2.getClass();
        try {
            if (abstractC0991b instanceof C0046w) {
                c0046w = (C0046w) abstractC0991b;
                int i4 = c0046w.f562h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0046w.f562h = i4 - Integer.MIN_VALUE;
                    Object obj = c0046w.f560f;
                    EnumC0985a enumC0985a = EnumC0985a.f8194a;
                    i2 = c0046w.f562h;
                    if (i2 != 0) {
                        R1.l.F(obj);
                        c0046w.f558d = p2;
                        dVar = p2.f416e;
                        c0046w.f559e = dVar;
                        c0046w.f562h = 1;
                        if (dVar.c(c0046w) == enumC0985a) {
                            return enumC0985a;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        I1.d dVar2 = c0046w.f559e;
                        P p3 = c0046w.f558d;
                        R1.l.F(obj);
                        dVar = dVar2;
                        p2 = p3;
                    }
                    i3 = p2.f417f - 1;
                    p2.f417f = i3;
                    if (i3 == 0) {
                        A1.g0 g0Var = p2.f418g;
                        if (g0Var != null) {
                            g0Var.a(null);
                        }
                        p2.f418g = null;
                    }
                    dVar.e(null);
                    return C0239i.f3393a;
                }
            }
            i3 = p2.f417f - 1;
            p2.f417f = i3;
            if (i3 == 0) {
            }
            dVar.e(null);
            return C0239i.f3393a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0046w = new C0046w(p2, abstractC0991b);
        Object obj2 = c0046w.f560f;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        i2 = c0046w.f562h;
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
    /* JADX WARN: Type inference failed for: r2v3, types: [n1.f, t1.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [n1.f, t1.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(P p2, c0 c0Var, AbstractC0991b abstractC0991b) {
        C0048y c0048y;
        EnumC0985a enumC0985a;
        int i2;
        InterfaceC0010k interfaceC0010k;
        C0011l c0011l;
        P p3;
        Object b2;
        InterfaceC0010k interfaceC0010k2;
        Throwable a2;
        k0 l2;
        p2.getClass();
        if (abstractC0991b instanceof C0048y) {
            c0048y = (C0048y) abstractC0991b;
            int i3 = c0048y.f570i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0048y.f570i = i3 - Integer.MIN_VALUE;
                Object obj = c0048y.f568g;
                enumC0985a = EnumC0985a.f8194a;
                i2 = c0048y.f570i;
                boolean z2 = true;
                if (i2 == 0) {
                    try {
                        if (i2 == 1) {
                            interfaceC0010k = (InterfaceC0010k) c0048y.f565d;
                        } else if (i2 == 2) {
                            C0011l c0011l2 = c0048y.f567f;
                            P p4 = c0048y.f566e;
                            c0 c0Var2 = (c0) c0048y.f565d;
                            R1.l.F(obj);
                            c0011l = c0011l2;
                            p3 = p4;
                            c0Var = c0Var2;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0010k = (InterfaceC0010k) c0048y.f565d;
                        }
                        R1.l.F(obj);
                        interfaceC0010k2 = interfaceC0010k;
                    } catch (Throwable th) {
                        th = th;
                        obj = R1.l.h(th);
                        interfaceC0010k2 = p2;
                        a2 = AbstractC0236f.a(obj);
                        C0011l c0011l3 = (C0011l) interfaceC0010k2;
                        if (a2 != null) {
                        }
                        return C0239i.f3393a;
                    }
                    a2 = AbstractC0236f.a(obj);
                    C0011l c0011l32 = (C0011l) interfaceC0010k2;
                    if (a2 != null) {
                        c0011l32.J(obj);
                    } else {
                        c0011l32.getClass();
                        c0011l32.J(new C0013n(a2, false));
                    }
                    return C0239i.f3393a;
                }
                R1.l.F(obj);
                c0011l = c0Var.f463b;
                try {
                    l2 = p2.f419h.l();
                } catch (Throwable th2) {
                    th = th2;
                    p2 = c0011l;
                    obj = R1.l.h(th);
                    interfaceC0010k2 = p2;
                    a2 = AbstractC0236f.a(obj);
                    C0011l c0011l322 = (C0011l) interfaceC0010k2;
                    if (a2 != null) {
                    }
                    return C0239i.f3393a;
                }
                if (l2 instanceof C0028d) {
                    ?? r2 = c0Var.f462a;
                    l1.i iVar = c0Var.f465d;
                    c0048y.f565d = c0011l;
                    c0048y.f570i = 1;
                    try {
                        b2 = p2.f().b(new H(p2, iVar, (t1.p) r2, (l1.d) null), c0048y);
                        if (b2 == enumC0985a) {
                            return enumC0985a;
                        }
                        C0011l c0011l4 = c0011l;
                        obj = b2;
                        interfaceC0010k2 = c0011l4;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        p2 = c0011l;
                        obj = R1.l.h(th);
                        interfaceC0010k2 = p2;
                        a2 = AbstractC0236f.a(obj);
                        C0011l c0011l3222 = (C0011l) interfaceC0010k2;
                        if (a2 != null) {
                        }
                        return C0239i.f3393a;
                    }
                    a2 = AbstractC0236f.a(obj);
                    C0011l c0011l32222 = (C0011l) interfaceC0010k2;
                    if (a2 != null) {
                    }
                    return C0239i.f3393a;
                }
                if (!(l2 instanceof d0)) {
                    z2 = l2 instanceof l0;
                }
                if (!z2) {
                    if (l2 instanceof b0) {
                        throw ((b0) l2).f461b;
                    }
                    throw new C0015p();
                }
                if (l2 != c0Var.f464c) {
                    kotlin.jvm.internal.i.c(l2, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((d0) l2).f468b;
                }
                c0048y.f565d = c0Var;
                c0048y.f566e = p2;
                c0048y.f567f = c0011l;
                c0048y.f570i = 2;
                Object g2 = p2.g(c0048y);
                p3 = p2;
                if (g2 == enumC0985a) {
                    return enumC0985a;
                }
                ?? r22 = c0Var.f462a;
                l1.i iVar2 = c0Var.f465d;
                c0048y.f565d = c0011l;
                c0048y.f566e = null;
                c0048y.f567f = null;
                c0048y.f570i = 3;
                b2 = p3.f().b(new H(p3, iVar2, (t1.p) r22, (l1.d) null), c0048y);
                if (b2 == enumC0985a) {
                    return enumC0985a;
                }
                C0011l c0011l42 = c0011l;
                obj = b2;
                interfaceC0010k2 = c0011l42;
                a2 = AbstractC0236f.a(obj);
                C0011l c0011l322222 = (C0011l) interfaceC0010k2;
                if (a2 != null) {
                }
                return C0239i.f3393a;
            }
        }
        c0048y = new C0048y(p2, abstractC0991b);
        Object obj2 = c0048y.f568g;
        enumC0985a = EnumC0985a.f8194a;
        i2 = c0048y.f570i;
        boolean z22 = true;
        if (i2 == 0) {
        }
        ?? r222 = c0Var.f462a;
        l1.i iVar22 = c0Var.f465d;
        c0048y.f565d = c0011l;
        c0048y.f566e = null;
        c0048y.f567f = null;
        c0048y.f570i = 3;
        b2 = p3.f().b(new H(p3, iVar22, (t1.p) r222, (l1.d) null), c0048y);
        if (b2 == enumC0985a) {
        }
        C0011l c0011l422 = c0011l;
        obj2 = b2;
        interfaceC0010k2 = c0011l422;
        a2 = AbstractC0236f.a(obj2);
        C0011l c0011l3222222 = (C0011l) interfaceC0010k2;
        if (a2 != null) {
        }
        return C0239i.f3393a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(P p2, AbstractC0991b abstractC0991b) {
        C0049z c0049z;
        int i2;
        I1.d dVar;
        int i3;
        p2.getClass();
        try {
            if (abstractC0991b instanceof C0049z) {
                c0049z = (C0049z) abstractC0991b;
                int i4 = c0049z.f575h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0049z.f575h = i4 - Integer.MIN_VALUE;
                    Object obj = c0049z.f573f;
                    EnumC0985a enumC0985a = EnumC0985a.f8194a;
                    i2 = c0049z.f575h;
                    if (i2 != 0) {
                        R1.l.F(obj);
                        c0049z.f571d = p2;
                        dVar = p2.f416e;
                        c0049z.f572e = dVar;
                        c0049z.f575h = 1;
                        if (dVar.c(c0049z) == enumC0985a) {
                            return enumC0985a;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        I1.d dVar2 = c0049z.f572e;
                        P p3 = c0049z.f571d;
                        R1.l.F(obj);
                        dVar = dVar2;
                        p2 = p3;
                    }
                    i3 = p2.f417f + 1;
                    p2.f417f = i3;
                    if (i3 == 1) {
                        p2.f418g = AbstractC0022x.g(p2.f414c, new A(p2, null));
                    }
                    dVar.e(null);
                    return C0239i.f3393a;
                }
            }
            i3 = p2.f417f + 1;
            p2.f417f = i3;
            if (i3 == 1) {
            }
            dVar.e(null);
            return C0239i.f3393a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0049z = new C0049z(p2, abstractC0991b);
        Object obj2 = c0049z.f573f;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        i2 = c0049z.f575h;
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
    public static final Object d(P p2, boolean z2, l1.d dVar) {
        C c2;
        int i2;
        P p3;
        k0 k0Var;
        boolean z3;
        P p4;
        C0234d c0234d;
        p2.getClass();
        if (dVar instanceof C) {
            c2 = (C) dVar;
            int i3 = c2.f359i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2.f359i = i3 - Integer.MIN_VALUE;
                Object obj = c2.f357g;
                EnumC0985a enumC0985a = EnumC0985a.f8194a;
                i2 = c2.f359i;
                if (i2 != 0) {
                    R1.l.F(obj);
                    k0 l2 = p2.f419h.l();
                    if (l2 instanceof l0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    j0 f2 = p2.f();
                    c2.f354d = p2;
                    c2.f355e = l2;
                    c2.f356f = z2;
                    c2.f359i = 1;
                    Integer a2 = f2.a();
                    if (a2 == enumC0985a) {
                        return enumC0985a;
                    }
                    p3 = p2;
                    k0Var = l2;
                    obj = a2;
                } else if (i2 == 1) {
                    z2 = c2.f356f;
                    k0Var = c2.f355e;
                    p3 = c2.f354d;
                    R1.l.F(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p4 = c2.f354d;
                        R1.l.F(obj);
                        c0234d = (C0234d) obj;
                        k0 k0Var2 = (k0) c0234d.f3386a;
                        if (((Boolean) c0234d.f3387b).booleanValue()) {
                            return k0Var2;
                        }
                        p4.f419h.p(k0Var2);
                        return k0Var2;
                    }
                    p4 = c2.f354d;
                    R1.l.F(obj);
                    c0234d = (C0234d) obj;
                    k0 k0Var22 = (k0) c0234d.f3386a;
                    if (((Boolean) c0234d.f3387b).booleanValue()) {
                    }
                }
                int intValue = ((Number) obj).intValue();
                z3 = k0Var instanceof C0028d;
                int i4 = !z3 ? k0Var.f516a : -1;
                if (!z3 && intValue == i4) {
                    return k0Var;
                }
                if (z2) {
                    j0 f3 = p3.f();
                    E e2 = new E(p3, i4, null);
                    c2.f354d = p3;
                    c2.f355e = null;
                    c2.f359i = 3;
                    obj = f3.c(e2, c2);
                    if (obj == enumC0985a) {
                        return enumC0985a;
                    }
                    p4 = p3;
                    c0234d = (C0234d) obj;
                    k0 k0Var222 = (k0) c0234d.f3386a;
                    if (((Boolean) c0234d.f3387b).booleanValue()) {
                    }
                } else {
                    j0 f4 = p3.f();
                    D d2 = new D(p3, null);
                    c2.f354d = p3;
                    c2.f355e = null;
                    c2.f359i = 2;
                    obj = f4.b(d2, c2);
                    if (obj == enumC0985a) {
                        return enumC0985a;
                    }
                    p4 = p3;
                    c0234d = (C0234d) obj;
                    k0 k0Var2222 = (k0) c0234d.f3386a;
                    if (((Boolean) c0234d.f3387b).booleanValue()) {
                    }
                }
            }
        }
        c2 = new C(p2, dVar);
        Object obj2 = c2.f357g;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        i2 = c2.f359i;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z3 = k0Var instanceof C0028d;
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
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea A[Catch: c -> 0x00ab, TryCatch #0 {c -> 0x00ab, blocks: (B:36:0x00a6, B:37:0x0144, B:41:0x00b4, B:42:0x0127, B:58:0x00d1, B:60:0x00ea, B:61:0x00ee, B:67:0x00da, B:71:0x0115), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(P p2, boolean z2, AbstractC0991b abstractC0991b) {
        F f2;
        Integer a2;
        Object obj;
        P p3;
        int i2;
        C0027c c0027c;
        Object b2;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.p pVar;
        p2.getClass();
        try {
            if (abstractC0991b instanceof F) {
                f2 = (F) abstractC0991b;
                int i3 = f2.f376l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    f2.f376l = i3 - Integer.MIN_VALUE;
                    Object obj2 = f2.f374j;
                    EnumC0985a enumC0985a = EnumC0985a.f8194a;
                    switch (f2.f376l) {
                        case 0:
                            R1.l.F(obj2);
                            if (!z2) {
                                j0 f3 = p2.f();
                                f2.f368d = p2;
                                f2.f372h = z2;
                                f2.f376l = 3;
                                obj2 = f3.a();
                                if (obj2 == enumC0985a) {
                                    return enumC0985a;
                                }
                                int intValue = ((Number) obj2).intValue();
                                j0 f4 = p2.f();
                                G g2 = new G(p2, intValue, null);
                                f2.f368d = p2;
                                f2.f372h = z2;
                                f2.f376l = 4;
                                obj2 = f4.c(g2, f2);
                                if (obj2 == enumC0985a) {
                                    return enumC0985a;
                                }
                                return (C0028d) obj2;
                            }
                            f2.f368d = p2;
                            f2.f372h = z2;
                            f2.f376l = 1;
                            obj2 = p2.h(f2);
                            if (obj2 == enumC0985a) {
                                return enumC0985a;
                            }
                            int hashCode = obj2 != null ? obj2.hashCode() : 0;
                            j0 f5 = p2.f();
                            f2.f368d = p2;
                            f2.f369e = obj2;
                            f2.f372h = z2;
                            f2.f373i = hashCode;
                            f2.f376l = 2;
                            a2 = f5.a();
                            if (a2 != enumC0985a) {
                                return enumC0985a;
                            }
                            obj = obj2;
                            obj2 = a2;
                            p3 = p2;
                            i2 = hashCode;
                            return new C0028d(i2, ((Number) obj2).intValue(), obj);
                        case 1:
                            z2 = f2.f372h;
                            p2 = (P) f2.f368d;
                            R1.l.F(obj2);
                            if (obj2 != null) {
                            }
                            j0 f52 = p2.f();
                            f2.f368d = p2;
                            f2.f369e = obj2;
                            f2.f372h = z2;
                            f2.f373i = hashCode;
                            f2.f376l = 2;
                            a2 = f52.a();
                            if (a2 != enumC0985a) {
                            }
                            break;
                        case 2:
                            i2 = f2.f373i;
                            z2 = f2.f372h;
                            obj = f2.f369e;
                            p3 = (P) f2.f368d;
                            try {
                                R1.l.F(obj2);
                                return new C0028d(i2, ((Number) obj2).intValue(), obj);
                            } catch (C0027c e2) {
                                e = e2;
                                p2 = p3;
                                kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                                m0.j jVar = p2.f413b;
                                f2.f368d = p2;
                                f2.f369e = e;
                                f2.f370f = pVar2;
                                f2.f371g = pVar2;
                                f2.f372h = z2;
                                f2.f376l = 5;
                                throw e;
                            }
                        case 3:
                            z2 = f2.f372h;
                            p2 = (P) f2.f368d;
                            R1.l.F(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            j0 f42 = p2.f();
                            G g22 = new G(p2, intValue2, null);
                            f2.f368d = p2;
                            f2.f372h = z2;
                            f2.f376l = 4;
                            obj2 = f42.c(g22, f2);
                            if (obj2 == enumC0985a) {
                            }
                            return (C0028d) obj2;
                        case 4:
                            boolean z3 = f2.f372h;
                            R1.l.F(obj2);
                            return (C0028d) obj2;
                        case 5:
                            boolean z4 = f2.f372h;
                            kotlin.jvm.internal.p pVar3 = f2.f371g;
                            kotlin.jvm.internal.p pVar4 = (kotlin.jvm.internal.p) f2.f370f;
                            C0027c c0027c2 = (C0027c) f2.f369e;
                            P p4 = (P) f2.f368d;
                            R1.l.F(obj2);
                            pVar3.f8076a = obj2;
                            kotlin.jvm.internal.o oVar2 = new kotlin.jvm.internal.o();
                            try {
                                H h2 = new H(pVar4, p4, oVar2, (l1.d) null);
                                f2.f368d = c0027c2;
                                f2.f369e = pVar4;
                                f2.f370f = oVar2;
                                f2.f371g = null;
                                f2.f376l = 6;
                                if (z4) {
                                    p4.getClass();
                                    b2 = h2.invoke(f2);
                                } else {
                                    b2 = p4.f().b(new C0047x(h2, null), f2);
                                }
                                if (b2 == enumC0985a) {
                                    return enumC0985a;
                                }
                                oVar = oVar2;
                                pVar = pVar4;
                                Object obj3 = pVar.f8076a;
                                return new C0028d(obj3 != null ? obj3.hashCode() : 0, oVar.f8075a, obj3);
                            } catch (Throwable th) {
                                th = th;
                                c0027c = c0027c2;
                                AbstractC1050a.a(c0027c, th);
                                throw c0027c;
                            }
                        case 6:
                            oVar = (kotlin.jvm.internal.o) f2.f370f;
                            pVar = (kotlin.jvm.internal.p) f2.f369e;
                            c0027c = (C0027c) f2.f368d;
                            try {
                                R1.l.F(obj2);
                                Object obj32 = pVar.f8076a;
                                return new C0028d(obj32 != null ? obj32.hashCode() : 0, oVar.f8075a, obj32);
                            } catch (Throwable th2) {
                                th = th2;
                                AbstractC1050a.a(c0027c, th);
                                throw c0027c;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (f2.f376l) {
            }
        } catch (C0027c e3) {
            e = e3;
        }
        f2 = new F(p2, abstractC0991b);
        Object obj22 = f2.f374j;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
    }

    public final j0 f() {
        return (j0) this.f422k.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(AbstractC0991b abstractC0991b) {
        B b2;
        Object obj;
        int i2;
        P p2;
        int intValue;
        int i3;
        Throwable th;
        P p3;
        C0038n c0038n;
        try {
            if (abstractC0991b instanceof B) {
                b2 = (B) abstractC0991b;
                int i4 = b2.f353h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    b2.f353h = i4 - Integer.MIN_VALUE;
                    Object obj2 = b2.f351f;
                    obj = EnumC0985a.f8194a;
                    i2 = b2.f353h;
                    if (i2 != 0) {
                        R1.l.F(obj2);
                        j0 f2 = f();
                        b2.f349d = this;
                        b2.f353h = 1;
                        obj2 = f2.a();
                        if (obj2 == obj) {
                            return obj;
                        }
                        p2 = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i3 = b2.f350e;
                            p3 = b2.f349d;
                            try {
                                R1.l.F(obj2);
                                return C0239i.f3393a;
                            } catch (Throwable th2) {
                                th = th2;
                                p3.f419h.p(new d0(th, i3));
                                throw th;
                            }
                        }
                        p2 = b2.f349d;
                        R1.l.F(obj2);
                    }
                    intValue = ((Number) obj2).intValue();
                    c0038n = p2.f420i;
                    b2.f349d = p2;
                    b2.f350e = intValue;
                    b2.f353h = 2;
                    if (c0038n.f(b2) == obj) {
                        return obj;
                    }
                    return C0239i.f3393a;
                }
            }
            c0038n = p2.f420i;
            b2.f349d = p2;
            b2.f350e = intValue;
            b2.f353h = 2;
            if (c0038n.f(b2) == obj) {
            }
            return C0239i.f3393a;
        } catch (Throwable th3) {
            i3 = intValue;
            th = th3;
            p3 = p2;
            p3.f419h.p(new d0(th, i3));
            throw th;
        }
        b2 = new B(this, abstractC0991b);
        Object obj22 = b2.f351f;
        obj = EnumC0985a.f8194a;
        i2 = b2.f353h;
        if (i2 != 0) {
        }
        intValue = ((Number) obj22).intValue();
    }

    @Override // F.InterfaceC0033i
    public final D1.d getData() {
        return this.f415d;
    }

    public final Object h(AbstractC0991b abstractC0991b) {
        return ((Y) this.f421j.a()).a(new C0042s(3, (l1.d) null), abstractC0991b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, boolean z2, AbstractC0991b abstractC0991b) {
        N n2;
        int i2;
        kotlin.jvm.internal.o oVar;
        if (abstractC0991b instanceof N) {
            n2 = (N) abstractC0991b;
            int i3 = n2.f404g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n2.f404g = i3 - Integer.MIN_VALUE;
                Object obj2 = n2.f402e;
                EnumC0985a enumC0985a = EnumC0985a.f8194a;
                i2 = n2.f404g;
                if (i2 != 0) {
                    R1.l.F(obj2);
                    kotlin.jvm.internal.o oVar2 = new kotlin.jvm.internal.o();
                    Y y2 = (Y) this.f421j.a();
                    O o2 = new O(oVar2, this, obj, z2, null);
                    n2.f401d = oVar2;
                    n2.f404g = 1;
                    if (y2.b(o2, n2) == enumC0985a) {
                        return enumC0985a;
                    }
                    oVar = oVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = n2.f401d;
                    R1.l.F(obj2);
                }
                return new Integer(oVar.f8075a);
            }
        }
        n2 = new N(this, abstractC0991b);
        Object obj22 = n2.f402e;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        i2 = n2.f404g;
        if (i2 != 0) {
        }
        return new Integer(oVar.f8075a);
    }

    @Override // F.InterfaceC0033i
    public final Object j(t1.p pVar, AbstractC0995f abstractC0995f) {
        l1.i iVar = abstractC0995f.f8213b;
        kotlin.jvm.internal.i.b(iVar);
        o0 o0Var = (o0) iVar.m(n0.f536a);
        if (o0Var != null) {
            o0Var.d(this);
        }
        return AbstractC0022x.n(new o0(o0Var, this), new K(this, pVar, null), abstractC0995f);
    }
}
