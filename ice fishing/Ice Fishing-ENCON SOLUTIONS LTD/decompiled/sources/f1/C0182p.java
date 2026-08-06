package f1;

import F.C0041q;
import h1.C0239i;
import m1.EnumC0985a;

/* renamed from: f1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182p implements D1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D1.e f2953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2954c;

    public /* synthetic */ C0182p(D1.e eVar, I.d dVar, int i2) {
        this.f2952a = i2;
        this.f2953b = eVar;
        this.f2954c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    @Override // D1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, l1.d dVar) {
        C0181o c0181o;
        int i2;
        C0187u c0187u;
        int i3;
        C0191y c0191y;
        int i4;
        C0150A c0150a;
        int i5;
        D1.n nVar;
        int i6;
        boolean z2;
        Object obj2;
        Object obj3;
        C0182p c0182p;
        switch (this.f2952a) {
            case 0:
                if (dVar instanceof C0181o) {
                    c0181o = (C0181o) dVar;
                    int i7 = c0181o.f2950e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0181o.f2950e = i7 - Integer.MIN_VALUE;
                        Object obj4 = c0181o.f2949d;
                        EnumC0985a enumC0985a = EnumC0985a.f8194a;
                        i2 = c0181o.f2950e;
                        if (i2 != 0) {
                            R1.l.F(obj4);
                            Object c2 = ((I.b) obj).c((I.d) this.f2954c);
                            c0181o.f2950e = 1;
                            if (this.f2953b.a(c2, c0181o) == enumC0985a) {
                                return enumC0985a;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.l.F(obj4);
                        }
                        return C0239i.f3393a;
                    }
                }
                c0181o = new C0181o(this, dVar);
                Object obj42 = c0181o.f2949d;
                EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
                i2 = c0181o.f2950e;
                if (i2 != 0) {
                }
                return C0239i.f3393a;
            case 1:
                if (dVar instanceof C0187u) {
                    c0187u = (C0187u) dVar;
                    int i8 = c0187u.f2972e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0187u.f2972e = i8 - Integer.MIN_VALUE;
                        Object obj5 = c0187u.f2971d;
                        EnumC0985a enumC0985a3 = EnumC0985a.f8194a;
                        i3 = c0187u.f2972e;
                        if (i3 != 0) {
                            R1.l.F(obj5);
                            Object c3 = ((I.b) obj).c((I.d) this.f2954c);
                            c0187u.f2972e = 1;
                            if (this.f2953b.a(c3, c0187u) == enumC0985a3) {
                                return enumC0985a3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.l.F(obj5);
                        }
                        return C0239i.f3393a;
                    }
                }
                c0187u = new C0187u(this, dVar);
                Object obj52 = c0187u.f2971d;
                EnumC0985a enumC0985a32 = EnumC0985a.f8194a;
                i3 = c0187u.f2972e;
                if (i3 != 0) {
                }
                return C0239i.f3393a;
            case 2:
                if (dVar instanceof C0191y) {
                    c0191y = (C0191y) dVar;
                    int i9 = c0191y.f2991e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c0191y.f2991e = i9 - Integer.MIN_VALUE;
                        Object obj6 = c0191y.f2990d;
                        EnumC0985a enumC0985a4 = EnumC0985a.f8194a;
                        i4 = c0191y.f2991e;
                        if (i4 != 0) {
                            R1.l.F(obj6);
                            Object c4 = ((I.b) obj).c((I.d) this.f2954c);
                            c0191y.f2991e = 1;
                            if (this.f2953b.a(c4, c0191y) == enumC0985a4) {
                                return enumC0985a4;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.l.F(obj6);
                        }
                        return C0239i.f3393a;
                    }
                }
                c0191y = new C0191y(this, dVar);
                Object obj62 = c0191y.f2990d;
                EnumC0985a enumC0985a42 = EnumC0985a.f8194a;
                i4 = c0191y.f2991e;
                if (i4 != 0) {
                }
                return C0239i.f3393a;
            case 3:
                if (dVar instanceof C0150A) {
                    c0150a = (C0150A) dVar;
                    int i10 = c0150a.f2871e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0150a.f2871e = i10 - Integer.MIN_VALUE;
                        Object obj7 = c0150a.f2870d;
                        EnumC0985a enumC0985a5 = EnumC0985a.f8194a;
                        i5 = c0150a.f2871e;
                        if (i5 != 0) {
                            R1.l.F(obj7);
                            Object c5 = ((I.b) obj).c((I.d) this.f2954c);
                            c0150a.f2871e = 1;
                            if (this.f2953b.a(c5, c0150a) == enumC0985a5) {
                                return enumC0985a5;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.l.F(obj7);
                        }
                        return C0239i.f3393a;
                    }
                }
                c0150a = new C0150A(this, dVar);
                Object obj72 = c0150a.f2870d;
                EnumC0985a enumC0985a52 = EnumC0985a.f8194a;
                i5 = c0150a.f2871e;
                if (i5 != 0) {
                }
                return C0239i.f3393a;
            default:
                if (dVar instanceof D1.n) {
                    nVar = (D1.n) dVar;
                    int i11 = nVar.f282f;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        nVar.f282f = i11 - Integer.MIN_VALUE;
                        Object obj8 = nVar.f281e;
                        EnumC0985a enumC0985a6 = EnumC0985a.f8194a;
                        i6 = nVar.f282f;
                        z2 = true;
                        if (i6 != 0) {
                            R1.l.F(obj8);
                            nVar.f280d = this;
                            nVar.f284h = obj;
                            nVar.f282f = 1;
                            Object invoke = ((C0041q) this.f2954c).invoke(obj, nVar);
                            if (invoke == enumC0985a6) {
                                return enumC0985a6;
                            }
                            obj2 = invoke;
                            obj3 = obj;
                            c0182p = this;
                        } else {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0182p = nVar.f280d;
                                R1.l.F(obj8);
                                if (z2) {
                                    return C0239i.f3393a;
                                }
                                throw new E1.a(c0182p);
                            }
                            Object obj9 = nVar.f284h;
                            C0182p c0182p2 = nVar.f280d;
                            R1.l.F(obj8);
                            obj3 = obj9;
                            c0182p = c0182p2;
                            obj2 = obj8;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z2 = false;
                        } else {
                            D1.e eVar = c0182p.f2953b;
                            nVar.f280d = c0182p;
                            nVar.f284h = null;
                            nVar.f282f = 2;
                            if (eVar.a(obj3, nVar) == enumC0985a6) {
                                return enumC0985a6;
                            }
                        }
                        if (z2) {
                        }
                    }
                }
                nVar = new D1.n(this, dVar);
                Object obj82 = nVar.f281e;
                EnumC0985a enumC0985a62 = EnumC0985a.f8194a;
                i6 = nVar.f282f;
                z2 = true;
                if (i6 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z2) {
                }
        }
    }

    public C0182p(C0041q c0041q, D1.e eVar) {
        this.f2952a = 4;
        this.f2954c = c0041q;
        this.f2953b = eVar;
    }
}
