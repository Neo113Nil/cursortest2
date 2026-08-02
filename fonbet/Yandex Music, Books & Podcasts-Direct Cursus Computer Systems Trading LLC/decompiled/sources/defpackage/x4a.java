package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x4a extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public boolean k;
    public int l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4a(boolean z, ruq ruqVar, int i, xsq xsqVar, mm6 mm6Var, hwq hwqVar, zsq zsqVar, pwq pwqVar, nyf nyfVar, Continuation continuation) {
        super(2, continuation);
        this.k = z;
        this.m = ruqVar;
        this.l = i;
        this.n = xsqVar;
        this.o = mm6Var;
        this.p = hwqVar;
        this.q = zsqVar;
        this.r = pwqVar;
        this.s = nyfVar;
    }

    public static final void k(mm6 mm6Var, z6v z6vVar, boolean z, String str, boolean z2) {
        Object value;
        n9v n9vVar;
        if (gld.T(mm6Var)) {
            z6vVar.i.set(z2);
            if (z2) {
                if (!z) {
                    ssg.a(5, "WaveWordsCenter", "bad network detected", null);
                }
                k9v k9vVar = new k9v(str, f6v.a);
                xdr xdrVar = z6vVar.k;
                do {
                    value = xdrVar.getValue();
                    n9vVar = (n9v) value;
                    if (Intrinsics.d(n9vVar, j9v.a)) {
                        n9vVar = k9vVar;
                    }
                } while (!xdrVar.k(value, n9vVar));
            }
        }
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                x4a x4aVar = new x4a((b5a) this.r, (t5a) this.p, this.k, (cir) this.n, (ov) this.s, continuation);
                x4aVar.q = obj;
                return x4aVar;
            case 1:
                return new x4a(this.k, (ruq) this.m, this.l, (xsq) this.n, (mm6) this.o, (hwq) this.p, (zsq) this.q, (pwq) this.r, (nyf) this.s, continuation);
            case 2:
                return new x4a((b9n) this.o, (String) this.p, (String) this.q, this.k, (iow) this.r, (String) this.s, continuation);
            default:
                x4a x4aVar2 = new x4a((vbn) this.r, (z6v) this.s, continuation);
                x4aVar2.q = obj;
                return x4aVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((x4a) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0231, code lost:
    
        if (r6 == r2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f9, code lost:
    
        if (r5 == r2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x008d, code lost:
    
        if (defpackage.zsd.h0(r3, r5, r25) == r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0265, code lost:
    
        if (r4 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0282, code lost:
    
        if (r0 == r2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0260, code lost:
    
        if (r4 == r2) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0139 A[Catch: all -> 0x013e, TryCatch #2 {all -> 0x013e, blocks: (B:12:0x0133, B:14:0x0139, B:15:0x0152, B:30:0x0144, B:32:0x014c, B:33:0x018f, B:34:0x0194), top: B:11:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018c A[LOOP:0: B:20:0x0173->B:25:0x018c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0144 A[Catch: all -> 0x013e, TryCatch #2 {all -> 0x013e, blocks: (B:12:0x0133, B:14:0x0139, B:15:0x0152, B:30:0x0144, B:32:0x014c, B:33:0x018f, B:34:0x0194), top: B:11:0x0133 }] */
    /* JADX WARN: Type inference failed for: r5v39, types: [r2f] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        StackTraceElement stackTraceElement;
        String str;
        Object g0;
        String str2;
        Object V;
        cvl cvlVar;
        Object V2;
        Object V3;
        String str3;
        xdr xdrVar;
        AtomicBoolean atomicBoolean;
        boolean z;
        rar rarVar;
        Object b;
        AtomicBoolean atomicBoolean2;
        String str4;
        rar rarVar2;
        xdr xdrVar2;
        CancellationException cancellationException;
        rar rarVar3;
        t6v t6vVar;
        Object obj2;
        n9v a;
        Object value;
        n9v n9vVar;
        xdr xdrVar3;
        int i = this.j;
        int i2 = 2;
        Object obj3 = this.s;
        Object obj4 = this.r;
        Continuation continuation = null;
        switch (i) {
            case 0:
                cir cirVar = (cir) this.n;
                b5a b5aVar = (b5a) obj4;
                t5a t5aVar = (t5a) this.p;
                syn synVar = (syn) this.q;
                nm6 nm6Var = nm6.a;
                int i3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    b5aVar.g(t5aVar, synVar, this.k);
                    g06 g06Var = b5aVar.h;
                    jyr b2 = btf.b(wg.p);
                    c5b c5bVar = c5b.a;
                    htb htbVar = ((thc) g06Var.c).a;
                    boolean booleanValue = Boolean.FALSE.booleanValue();
                    vhc vhcVar = vhc.d;
                    if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement.getMethodName();
                        Integer num = new Integer(stackTraceElement.getLineNumber());
                        if (num.intValue() <= 0) {
                            num = null;
                        }
                        if (num == null || (str = num.toString()) == null) {
                            str = "No line info";
                        }
                        vhcVar = new vhc(fileName, methodName, str);
                    }
                    g06Var.N(yhc.DEBUG, "Document successfully obtained by loading actor", b2, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
                    l4a l4aVar = (l4a) synVar.a;
                    if (l4aVar instanceof m4a) {
                        this.q = null;
                        this.m = cirVar;
                        this.o = t5aVar;
                        this.l = 1;
                        invoke = ((ov) obj3).invoke(l4aVar, this);
                        if (invoke == nm6Var) {
                            return nm6Var;
                        }
                        cirVar.b(new h5a(t5aVar, (m4a) invoke));
                    } else if (l4aVar instanceof j4a) {
                        cirVar.b(new d5a(t5aVar, null));
                    } else if (!(l4aVar instanceof k4a)) {
                        b6e.s();
                        return null;
                    }
                } else if (i3 == 1) {
                    t5aVar = (t5a) this.o;
                    cirVar = (cir) this.m;
                    qgg.h0(obj);
                    invoke = obj;
                    cirVar.b(new h5a(t5aVar, (m4a) invoke));
                } else {
                    if (i3 == 2) {
                        qgg.h0(obj);
                        String str5 = t5aVar.a;
                        throw null;
                    }
                    if (i3 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t5a t5aVar2 = (t5a) this.o;
                    cir cirVar2 = (cir) this.m;
                    qgg.h0(obj);
                    cirVar2.b(new h5a(t5aVar2, (m4a) obj));
                }
                return Unit.a;
            case 1:
                xsq xsqVar = (xsq) this.n;
                int i4 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (this.k) {
                    ((ruq) this.m).k(i4, new Long(xsqVar.a()), (mm6) this.o);
                    ((hwq) this.p).m(xsqVar, (zsq) this.q);
                    c9g.C(((nyf) obj3).b());
                    ((pwq) obj4).l(i4);
                }
                return Unit.a;
            case 2:
                b9n b9nVar = (b9n) this.o;
                nm6 nm6Var3 = nm6.a;
                int i5 = this.l;
                if (i5 == 0) {
                    qgg.h0(obj);
                    pjc g = b9nVar.c.g();
                    this.l = 1;
                    g0 = zsd.g0(g, this);
                    break;
                } else if (i5 == 1) {
                    qgg.h0(obj);
                    g0 = obj;
                } else if (i5 == 2) {
                    str2 = (String) this.m;
                    qgg.h0(obj);
                    V = obj;
                    String str6 = str2;
                    cvl cvlVar2 = (cvl) V;
                    if (cvlVar2 != null) {
                        cvlVar = cvlVar2;
                        Continuation continuation2 = null;
                        this.m = null;
                        this.n = cvlVar;
                        this.l = 4;
                        b9nVar.getClass();
                        V3 = x97.V(dm6.c, new s1n(b9nVar, continuation2, 7), this);
                        break;
                    } else {
                        fkg fkgVar = b9nVar.d;
                        String str7 = (String) this.p;
                        String str8 = (String) this.q;
                        boolean z2 = this.k;
                        this.m = null;
                        this.n = null;
                        this.l = 3;
                        V2 = x97.V(dm6.b, new r32(fkgVar, str6, str7, str8, z2, (Continuation) null), this);
                        break;
                    }
                } else if (i5 == 3) {
                    qgg.h0(obj);
                    V2 = obj;
                    cvlVar = (cvl) V2;
                    break;
                } else {
                    if (i5 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cvl cvlVar3 = (cvl) this.n;
                    qgg.h0(obj);
                    cvlVar = cvlVar3;
                    V3 = obj;
                    return new q9q((iow) obj4, cvlVar, (List) V3, (String) obj3);
                }
                str2 = ((xxq) g0).a;
                b9n b9nVar2 = (b9n) this.o;
                String str9 = (String) this.p;
                String str10 = (String) this.q;
                str2.getClass();
                mn7 mn7Var = dm6.a;
                rfg rfgVar = new rfg(b9nVar2, str2, str9, str10, null, 24);
                this.m = str2;
                this.n = null;
                this.l = 2;
                V = x97.V(mn7Var, rfgVar, this);
                break;
            default:
                vbn vbnVar = (vbn) obj4;
                z6v z6vVar = (z6v) obj3;
                xdr xdrVar4 = z6vVar.j;
                xdr xdrVar5 = z6vVar.k;
                mm6 mm6Var = (mm6) this.q;
                nm6 nm6Var4 = nm6.a;
                int i6 = this.l;
                j9v j9vVar = j9v.a;
                if (i6 == 0) {
                    qgg.h0(obj);
                    if (vbnVar != null) {
                        wor i7 = xdrVar5.i();
                        dt0 dt0Var = new dt0(i2, 19, continuation);
                        this.q = mm6Var;
                        this.l = 1;
                        break;
                    } else {
                        ssg.a(4, "WaveWordsCenter", "feature disabled, data cleared", null);
                        e5b e5bVar = e5b.a;
                        e5bVar.getClass();
                        xdrVar4.getClass();
                        xdrVar4.m(null, e5bVar);
                        xdrVar5.getClass();
                        xdrVar5.m(null, l9v.a);
                        return Unit.a;
                    }
                } else if (i6 == 1) {
                    qgg.h0(obj);
                } else {
                    if (i6 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = this.k;
                    xdr xdrVar6 = (xdr) this.p;
                    atomicBoolean = (AtomicBoolean) this.o;
                    ?? r5 = (r2f) this.n;
                    str3 = (String) this.m;
                    try {
                        qgg.h0(obj);
                        str4 = str3;
                        xdrVar = xdrVar5;
                        rarVar2 = r5;
                        atomicBoolean2 = atomicBoolean;
                        xdrVar2 = xdrVar6;
                        b = obj;
                    } catch (Throwable th) {
                        th = th;
                        cancellationException = null;
                        rarVar3 = r5;
                        rarVar3.g(cancellationException);
                        k(mm6Var, z6vVar, z, str3, atomicBoolean.get());
                        throw th;
                    }
                    try {
                        t6vVar = (t6v) b;
                        if (!(t6vVar instanceof s6v)) {
                            obj2 = ((s6v) t6vVar).a;
                        } else {
                            if (!Intrinsics.d(t6vVar, r6v.a)) {
                                throw new x7j();
                            }
                            obj2 = (Map) xdrVar4.getValue();
                        }
                        xdrVar2.l(obj2);
                        rarVar2.g(null);
                        k(mm6Var, z6vVar, z, str4, atomicBoolean2.get());
                        a = z6v.a(z6vVar, (Map) xdrVar4.getValue(), str4);
                        if (a == null) {
                            a = new k9v(str4, f6v.c);
                        }
                        while (true) {
                            value = xdrVar.getValue();
                            n9vVar = (n9v) value;
                            if (Intrinsics.d(n9vVar, j9vVar)) {
                                n9vVar = a;
                            }
                            xdrVar3 = xdrVar;
                            if (!xdrVar3.k(value, n9vVar)) {
                                return Unit.a;
                            }
                            xdrVar = xdrVar3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        atomicBoolean = atomicBoolean2;
                        rarVar = rarVar2;
                        str3 = str4;
                        cancellationException = null;
                        rarVar3 = rarVar;
                        rarVar3.g(cancellationException);
                        k(mm6Var, z6vVar, z, str3, atomicBoolean.get());
                        throw th;
                    }
                }
                Map map = (Map) xdrVar4.getValue();
                n9v a2 = z6v.a(z6vVar, map, vbnVar.b.b.a);
                if (a2 != null) {
                    xdrVar5.getClass();
                    xdrVar5.m(null, a2);
                    return Unit.a;
                }
                str3 = vbnVar.b.b.a;
                if (!z6vVar.b.g()) {
                    f6v f6vVar = f6v.a;
                    m9v m9vVar = new m9v(str3);
                    xdrVar5.getClass();
                    xdrVar5.m(null, m9vVar);
                    return Unit.a;
                }
                boolean z3 = z6vVar.i.get();
                if (z3) {
                    k9v k9vVar = new k9v(str3, f6v.a);
                    xdrVar5.getClass();
                    xdrVar5.m(null, k9vVar);
                } else {
                    xdrVar5.getClass();
                    xdrVar5.m(null, j9vVar);
                }
                xdrVar = xdrVar5;
                long j = ((a7v) z6vVar.e.getValue()).m;
                xtu xtuVar = new xtu(mm6Var, z6vVar, z3, str3);
                AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
                rar y = x97.y(mm6Var, null, null, new f84(j, atomicBoolean3, xtuVar, (Continuation) null, 7), 3);
                try {
                    this.q = mm6Var;
                    this.m = str3;
                    this.n = y;
                    this.o = atomicBoolean3;
                    this.p = xdrVar4;
                    this.k = z3;
                    this.l = 2;
                    b = z6v.b(z6vVar, vbnVar, map, this);
                    if (b != nm6Var4) {
                        atomicBoolean2 = atomicBoolean3;
                        z = z3;
                        str4 = str3;
                        rarVar2 = y;
                        xdrVar2 = xdrVar4;
                        t6vVar = (t6v) b;
                        if (!(t6vVar instanceof s6v)) {
                        }
                        xdrVar2.l(obj2);
                        rarVar2.g(null);
                        k(mm6Var, z6vVar, z, str4, atomicBoolean2.get());
                        a = z6v.a(z6vVar, (Map) xdrVar4.getValue(), str4);
                        if (a == null) {
                        }
                        while (true) {
                            value = xdrVar.getValue();
                            n9vVar = (n9v) value;
                            if (Intrinsics.d(n9vVar, j9vVar)) {
                            }
                            xdrVar3 = xdrVar;
                            if (!xdrVar3.k(value, n9vVar)) {
                            }
                            xdrVar = xdrVar3;
                        }
                    }
                    return nm6Var4;
                } catch (Throwable th3) {
                    th = th3;
                    atomicBoolean = atomicBoolean3;
                    z = z3;
                    rarVar = y;
                    cancellationException = null;
                    rarVar3 = rarVar;
                    rarVar3.g(cancellationException);
                    k(mm6Var, z6vVar, z, str3, atomicBoolean.get());
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4a(b9n b9nVar, String str, String str2, boolean z, iow iowVar, String str3, Continuation continuation) {
        super(2, continuation);
        this.o = b9nVar;
        this.p = str;
        this.q = str2;
        this.k = z;
        this.r = iowVar;
        this.s = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4a(vbn vbnVar, z6v z6vVar, Continuation continuation) {
        super(2, continuation);
        this.r = vbnVar;
        this.s = z6vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4a(b5a b5aVar, t5a t5aVar, boolean z, cir cirVar, ov ovVar, Continuation continuation) {
        super(2, continuation);
        this.r = b5aVar;
        this.p = t5aVar;
        this.k = z;
        this.n = cirVar;
        this.s = ovVar;
    }
}
