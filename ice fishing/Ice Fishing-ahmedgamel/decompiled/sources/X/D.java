package X;

import S7.AbstractC0410y;
import S7.C0399m;
import S7.C0402p;
import S7.InterfaceC0398l;
import S7.InterfaceC0408w;
import a8.InterfaceC0451a;
import com.google.android.gms.internal.ads.C3831qx;
import com.google.android.gms.internal.ads.C3884rx;
import com.google.android.gms.internal.ads.C3938sx;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import u7.AbstractC5083i;
import u7.C5085k;
import v7.AbstractC5119j;
import z7.InterfaceC5245i;

/* loaded from: classes.dex */
public final class D implements InterfaceC0417f {

    /* renamed from: h, reason: collision with root package name */
    public static final LinkedHashSet f3642h = new LinkedHashSet();
    public static final Object i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final C3938sx f3643a;

    /* renamed from: b, reason: collision with root package name */
    public final I0.j f3644b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3645c;

    /* renamed from: d, reason: collision with root package name */
    public final C5085k f3646d;

    /* renamed from: e, reason: collision with root package name */
    public final V7.n f3647e;

    /* renamed from: f, reason: collision with root package name */
    public List f3648f;

    /* renamed from: g, reason: collision with root package name */
    public final S0.n f3649g;

    public D(C3938sx c3938sx, List list, c4.e eVar, InterfaceC0408w interfaceC0408w) {
        C3831qx c3831qx = C3884rx.f34545a;
        this.f3643a = c3938sx;
        this.f3644b = new I0.j(14, new q(this, null));
        this.f3645c = ".tmp";
        this.f3646d = N3.C.O(new r(0, this));
        this.f3647e = new V7.n(F.f3650a);
        this.f3648f = AbstractC5119j.J(list);
        this.f3649g = new S0.n(interfaceC0408w, new J0.k(2, this), new n(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r8 != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /* JADX WARN: Type inference failed for: r2v10, types: [B7.h, I7.p] */
    /* JADX WARN: Type inference failed for: r2v3, types: [B7.h, I7.p] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(D d9, k kVar, B7.c cVar) {
        s sVar;
        int i4;
        InterfaceC0398l interfaceC0398l;
        C0399m c0399m;
        D d10;
        Object h3;
        InterfaceC0398l interfaceC0398l2;
        Throwable a9;
        E e9;
        d9.getClass();
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i6 = sVar.f3697y;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                sVar.f3697y = i6 - Integer.MIN_VALUE;
                Object obj = sVar.f3695w;
                A7.a aVar = A7.a.f215n;
                i4 = sVar.f3697y;
                boolean z6 = true;
                if (i4 == 0) {
                    try {
                        if (i4 == 1) {
                            interfaceC0398l = (InterfaceC0398l) sVar.f3692n;
                        } else if (i4 == 2) {
                            C0399m c0399m2 = sVar.f3694v;
                            D d11 = sVar.f3693u;
                            k kVar2 = (k) sVar.f3692n;
                            Q3.b.s(obj);
                            c0399m = c0399m2;
                            d10 = d11;
                            kVar = kVar2;
                        } else {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0398l = (InterfaceC0398l) sVar.f3692n;
                        }
                        Q3.b.s(obj);
                        interfaceC0398l2 = interfaceC0398l;
                    } catch (Throwable th) {
                        th = th;
                        obj = Q3.b.b(th);
                        interfaceC0398l2 = d9;
                        a9 = AbstractC5083i.a(obj);
                        C0399m c0399m3 = (C0399m) interfaceC0398l2;
                        if (a9 != null) {
                        }
                        return u7.v.f41073a;
                    }
                    a9 = AbstractC5083i.a(obj);
                    C0399m c0399m32 = (C0399m) interfaceC0398l2;
                    if (a9 != null) {
                        c0399m32.J(obj);
                    } else {
                        c0399m32.getClass();
                        c0399m32.J(new C0402p(a9, false));
                    }
                    return u7.v.f41073a;
                }
                Q3.b.s(obj);
                c0399m = kVar.f3674b;
                try {
                    e9 = (E) d9.f3647e.E();
                } catch (Throwable th2) {
                    th = th2;
                    d9 = c0399m;
                    obj = Q3.b.b(th);
                    interfaceC0398l2 = d9;
                    a9 = AbstractC5083i.a(obj);
                    C0399m c0399m322 = (C0399m) interfaceC0398l2;
                    if (a9 != null) {
                    }
                    return u7.v.f41073a;
                }
                if (e9 instanceof C0412a) {
                    ?? r22 = kVar.f3673a;
                    InterfaceC5245i interfaceC5245i = kVar.f3676d;
                    sVar.f3692n = c0399m;
                    sVar.f3697y = 1;
                    h3 = d9.h(r22, interfaceC5245i, sVar);
                    if (h3 == aVar) {
                    }
                    C0399m c0399m4 = c0399m;
                    obj = h3;
                    interfaceC0398l2 = c0399m4;
                    a9 = AbstractC5083i.a(obj);
                    C0399m c0399m3222 = (C0399m) interfaceC0398l2;
                    if (a9 != null) {
                    }
                    return u7.v.f41073a;
                }
                if (!(e9 instanceof h)) {
                    z6 = e9 instanceof F;
                }
                if (!z6) {
                    if (e9 instanceof g) {
                        throw ((g) e9).f3667a;
                    }
                    throw new B0.c();
                }
                if (e9 != kVar.f3675c) {
                    throw ((h) e9).f3668a;
                }
                sVar.f3692n = kVar;
                sVar.f3693u = d9;
                sVar.f3694v = c0399m;
                sVar.f3697y = 2;
                Object d12 = d9.d(sVar);
                d10 = d9;
                if (d12 == aVar) {
                }
                return aVar;
                ?? r23 = kVar.f3673a;
                InterfaceC5245i interfaceC5245i2 = kVar.f3676d;
                sVar.f3692n = c0399m;
                sVar.f3693u = null;
                sVar.f3694v = null;
                sVar.f3697y = 3;
                h3 = d10.h(r23, interfaceC5245i2, sVar);
            }
        }
        sVar = new s(d9, cVar);
        Object obj2 = sVar.f3695w;
        A7.a aVar2 = A7.a.f215n;
        i4 = sVar.f3697y;
        boolean z62 = true;
        if (i4 == 0) {
        }
        ?? r232 = kVar.f3673a;
        InterfaceC5245i interfaceC5245i22 = kVar.f3676d;
        sVar.f3692n = c0399m;
        sVar.f3693u = null;
        sVar.f3694v = null;
        sVar.f3697y = 3;
        h3 = d10.h(r232, interfaceC5245i22, sVar);
    }

    public final File b() {
        return (File) this.f3646d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(B7.c cVar) {
        t tVar;
        int i4;
        InterfaceC0451a dVar;
        kotlin.jvm.internal.r rVar;
        D d9;
        kotlin.jvm.internal.r rVar2;
        List list;
        D d10;
        kotlin.jvm.internal.r rVar3;
        v vVar;
        Iterator it;
        InterfaceC0451a interfaceC0451a;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.p pVar2;
        t tVar2;
        D d11;
        a8.d dVar2;
        InterfaceC0451a interfaceC0451a2;
        kotlin.jvm.internal.r rVar4;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i6 = tVar.f3699B;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                tVar.f3699B = i6 - Integer.MIN_VALUE;
                Object obj = tVar.f3706z;
                A7.a aVar = A7.a.f215n;
                i4 = tVar.f3699B;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    V7.n nVar = this.f3647e;
                    if (!kotlin.jvm.internal.h.a(nVar.E(), F.f3650a) && !(nVar.E() instanceof h)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    dVar = new a8.d();
                    rVar = new kotlin.jvm.internal.r();
                    tVar.f3700n = this;
                    tVar.f3701u = dVar;
                    tVar.f3702v = rVar;
                    tVar.f3703w = rVar;
                    tVar.f3699B = 1;
                    obj = g(tVar);
                    if (obj != aVar) {
                        d9 = this;
                        rVar2 = rVar;
                    }
                    return aVar;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0451a2 = (InterfaceC0451a) tVar.f3703w;
                        pVar2 = (kotlin.jvm.internal.p) tVar.f3702v;
                        rVar4 = (kotlin.jvm.internal.r) tVar.f3701u;
                        d11 = tVar.f3700n;
                        Q3.b.s(obj);
                        try {
                            pVar2.f38642n = true;
                            ((a8.d) interfaceC0451a2).d(null);
                            V7.n nVar2 = d11.f3647e;
                            Object obj2 = rVar4.f38644n;
                            nVar2.F(new C0412a(obj2 == null ? obj2.hashCode() : 0, obj2));
                            return u7.v.f41073a;
                        } catch (Throwable th) {
                            ((a8.d) interfaceC0451a2).d(null);
                            throw th;
                        }
                    }
                    it = tVar.f3705y;
                    vVar = tVar.f3704x;
                    pVar = (kotlin.jvm.internal.p) tVar.f3703w;
                    rVar3 = (kotlin.jvm.internal.r) tVar.f3702v;
                    interfaceC0451a = (InterfaceC0451a) tVar.f3701u;
                    d10 = tVar.f3700n;
                    Q3.b.s(obj);
                    while (it.hasNext()) {
                        I7.p pVar3 = (I7.p) it.next();
                        tVar.f3700n = d10;
                        tVar.f3701u = interfaceC0451a;
                        tVar.f3702v = rVar3;
                        tVar.f3703w = pVar;
                        tVar.f3704x = vVar;
                        tVar.f3705y = it;
                        tVar.f3699B = 2;
                        if (pVar3.invoke(vVar, tVar) == aVar) {
                            break;
                        }
                    }
                    tVar2 = tVar;
                    pVar2 = pVar;
                    rVar2 = rVar3;
                    dVar = interfaceC0451a;
                    d11 = d10;
                    d11.f3648f = null;
                    tVar2.f3700n = d11;
                    tVar2.f3701u = rVar2;
                    tVar2.f3702v = pVar2;
                    tVar2.f3703w = dVar;
                    tVar2.f3704x = null;
                    tVar2.f3705y = null;
                    tVar2.f3699B = 3;
                    dVar2 = (a8.d) dVar;
                    if (dVar2.c(tVar2) != aVar) {
                        interfaceC0451a2 = dVar2;
                        rVar4 = rVar2;
                        pVar2.f38642n = true;
                        ((a8.d) interfaceC0451a2).d(null);
                        V7.n nVar22 = d11.f3647e;
                        Object obj22 = rVar4.f38644n;
                        nVar22.F(new C0412a(obj22 == null ? obj22.hashCode() : 0, obj22));
                        return u7.v.f41073a;
                    }
                    return aVar;
                }
                rVar = (kotlin.jvm.internal.r) tVar.f3703w;
                rVar2 = (kotlin.jvm.internal.r) tVar.f3702v;
                dVar = (InterfaceC0451a) tVar.f3701u;
                d9 = tVar.f3700n;
                Q3.b.s(obj);
                rVar.f38644n = obj;
                kotlin.jvm.internal.p pVar4 = new kotlin.jvm.internal.p();
                v vVar2 = new v(dVar, pVar4, rVar2, d9);
                list = d9.f3648f;
                if (list != null) {
                    pVar2 = pVar4;
                    tVar2 = tVar;
                    d11 = d9;
                    d11.f3648f = null;
                    tVar2.f3700n = d11;
                    tVar2.f3701u = rVar2;
                    tVar2.f3702v = pVar2;
                    tVar2.f3703w = dVar;
                    tVar2.f3704x = null;
                    tVar2.f3705y = null;
                    tVar2.f3699B = 3;
                    dVar2 = (a8.d) dVar;
                    if (dVar2.c(tVar2) != aVar) {
                    }
                    return aVar;
                }
                d10 = d9;
                rVar3 = rVar2;
                vVar = vVar2;
                it = list.iterator();
                interfaceC0451a = dVar;
                pVar = pVar4;
                while (it.hasNext()) {
                }
                tVar2 = tVar;
                pVar2 = pVar;
                rVar2 = rVar3;
                dVar = interfaceC0451a;
                d11 = d10;
                d11.f3648f = null;
                tVar2.f3700n = d11;
                tVar2.f3701u = rVar2;
                tVar2.f3702v = pVar2;
                tVar2.f3703w = dVar;
                tVar2.f3704x = null;
                tVar2.f3705y = null;
                tVar2.f3699B = 3;
                dVar2 = (a8.d) dVar;
                if (dVar2.c(tVar2) != aVar) {
                }
                return aVar;
            }
        }
        tVar = new t(this, cVar);
        Object obj3 = tVar.f3706z;
        A7.a aVar2 = A7.a.f215n;
        i4 = tVar.f3699B;
        if (i4 != 0) {
        }
        rVar.f38644n = obj3;
        kotlin.jvm.internal.p pVar42 = new kotlin.jvm.internal.p();
        v vVar22 = new v(dVar, pVar42, rVar2, d9);
        list = d9.f3648f;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(B7.c cVar) {
        w wVar;
        int i4;
        D d9;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i6 = wVar.f3722w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                wVar.f3722w = i6 - Integer.MIN_VALUE;
                Object obj = wVar.f3720u;
                A7.a aVar = A7.a.f215n;
                i4 = wVar.f3722w;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    try {
                        wVar.f3719n = this;
                        wVar.f3722w = 1;
                        if (c(wVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        d9 = this;
                        d9.f3647e.F(new h(th));
                        throw th;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d9 = wVar.f3719n;
                    try {
                        Q3.b.s(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        d9.f3647e.F(new h(th));
                        throw th;
                    }
                }
                return u7.v.f41073a;
            }
        }
        wVar = new w(this, cVar);
        Object obj2 = wVar.f3720u;
        A7.a aVar2 = A7.a.f215n;
        i4 = wVar.f3722w;
        if (i4 != 0) {
        }
        return u7.v.f41073a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(B7.c cVar) {
        x xVar;
        int i4;
        D d9;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i6 = xVar.f3726w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                xVar.f3726w = i6 - Integer.MIN_VALUE;
                Object obj = xVar.f3724u;
                A7.a aVar = A7.a.f215n;
                i4 = xVar.f3726w;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    try {
                        xVar.f3723n = this;
                        xVar.f3726w = 1;
                        if (c(xVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        d9 = this;
                        d9.f3647e.F(new h(th));
                        return u7.v.f41073a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d9 = xVar.f3723n;
                    try {
                        Q3.b.s(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        d9.f3647e.F(new h(th));
                        return u7.v.f41073a;
                    }
                }
                return u7.v.f41073a;
            }
        }
        xVar = new x(this, cVar);
        Object obj2 = xVar.f3724u;
        A7.a aVar2 = A7.a.f215n;
        i4 = xVar.f3726w;
        if (i4 != 0) {
        }
        return u7.v.f41073a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.D] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.D] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(B7.c cVar) {
        ?? r02;
        int i4;
        FileInputStream fileInputStream;
        Throwable th;
        C3831qx c3831qx;
        try {
            if (cVar instanceof y) {
                y yVar = (y) cVar;
                int i6 = yVar.f3731x;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    yVar.f3731x = i6 - Integer.MIN_VALUE;
                    r02 = yVar;
                    Object obj = r02.f3729v;
                    A7.a aVar = A7.a.f215n;
                    i4 = r02.f3731x;
                    if (i4 != 0) {
                        Q3.b.s(obj);
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(b());
                            try {
                                C3831qx c3831qx2 = C3884rx.f34545a;
                                r02.f3727n = this;
                                r02.f3728u = fileInputStream2;
                                r02.f3731x = 1;
                                try {
                                    c3831qx = C3831qx.C(fileInputStream2);
                                } catch (Exception unused) {
                                    c3831qx = C3884rx.f34545a;
                                }
                                if (c3831qx == aVar) {
                                    return aVar;
                                }
                                fileInputStream = fileInputStream2;
                                obj = c3831qx;
                            } catch (Throwable th2) {
                                fileInputStream = fileInputStream2;
                                th = th2;
                                r02 = this;
                                throw th;
                            }
                        } catch (FileNotFoundException e9) {
                            e = e9;
                            r02 = this;
                            if (!r02.b().exists()) {
                                throw e;
                            }
                            C3831qx c3831qx3 = C3884rx.f34545a;
                            return C3884rx.f34545a;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileInputStream = r02.f3728u;
                        r02 = r02.f3727n;
                        try {
                            Q3.b.s(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                com.bumptech.glide.d.h(fileInputStream, th);
                                throw th4;
                            }
                        }
                    }
                    com.bumptech.glide.d.h(fileInputStream, null);
                    return obj;
                }
            }
            if (i4 != 0) {
            }
            com.bumptech.glide.d.h(fileInputStream, null);
            return obj;
        } catch (FileNotFoundException e10) {
            e = e10;
            if (!r02.b().exists()) {
            }
        }
        r02 = new y(this, cVar);
        Object obj2 = r02.f3729v;
        A7.a aVar2 = A7.a.f215n;
        i4 = r02.f3731x;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(B7.c cVar) {
        z zVar;
        int i4;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i6 = zVar.f3736x;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                zVar.f3736x = i6 - Integer.MIN_VALUE;
                Object obj = zVar.f3734v;
                Object obj2 = A7.a.f215n;
                i4 = zVar.f3736x;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    zVar.f3732n = this;
                    zVar.f3736x = 1;
                    Object f2 = f(zVar);
                    if (f2 != obj2) {
                        return f2;
                    }
                } else {
                    if (i4 == 1) {
                        Q3.b.s(obj);
                        return obj;
                    }
                    try {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj3 = zVar.f3733u;
                            if (zVar.f3732n != null) {
                                throw new ClassCastException();
                            }
                            Q3.b.s(obj);
                            return obj3;
                        }
                        if (zVar.f3733u != null) {
                            throw new ClassCastException();
                        }
                        D d9 = zVar.f3732n;
                        Q3.b.s(obj);
                        zVar.f3732n = null;
                        zVar.f3733u = obj;
                        zVar.f3736x = 3;
                        if (d9.j(obj, zVar) != obj2) {
                            return obj;
                        }
                    } catch (IOException e9) {
                        A8.b.a(null, e9);
                        throw null;
                    }
                }
                return obj2;
            }
        }
        zVar = new z(this, cVar);
        Object obj4 = zVar.f3734v;
        Object obj22 = A7.a.f215n;
        i4 = zVar.f3736x;
        if (i4 != 0) {
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(I7.p pVar, InterfaceC5245i interfaceC5245i, B7.c cVar) {
        A a9;
        int i4;
        D d9;
        C0412a c0412a;
        Object obj;
        Object obj2;
        Object obj3;
        D d10;
        if (cVar instanceof A) {
            a9 = (A) cVar;
            int i6 = a9.f3631y;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                a9.f3631y = i6 - Integer.MIN_VALUE;
                Object obj4 = a9.f3629w;
                A7.a aVar = A7.a.f215n;
                i4 = a9.f3631y;
                if (i4 != 0) {
                    Q3.b.s(obj4);
                    C0412a c0412a2 = (C0412a) this.f3647e.E();
                    Object obj5 = c0412a2.f3651a;
                    if ((obj5 != null ? obj5.hashCode() : 0) != c0412a2.f3652b) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    Object obj6 = c0412a2.f3651a;
                    B b9 = new B(pVar, obj6, null);
                    a9.f3626n = this;
                    a9.f3627u = c0412a2;
                    a9.f3628v = obj6;
                    a9.f3631y = 1;
                    Object y7 = AbstractC0410y.y(interfaceC5245i, b9, a9);
                    if (y7 != aVar) {
                        d9 = this;
                        c0412a = c0412a2;
                        obj4 = y7;
                        obj = obj6;
                    }
                    return aVar;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = a9.f3627u;
                    d10 = a9.f3626n;
                    Q3.b.s(obj4);
                    d10.f3647e.F(new C0412a(obj3 != null ? obj3.hashCode() : 0, obj3));
                    return obj3;
                }
                obj = a9.f3628v;
                c0412a = (C0412a) a9.f3627u;
                d9 = a9.f3626n;
                Q3.b.s(obj4);
                obj2 = c0412a.f3651a;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0412a.f3652b) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (kotlin.jvm.internal.h.a(obj, obj4)) {
                    return obj;
                }
                a9.f3626n = d9;
                a9.f3627u = obj4;
                a9.f3628v = null;
                a9.f3631y = 2;
                if (d9.j(obj4, a9) != aVar) {
                    obj3 = obj4;
                    d10 = d9;
                    d10.f3647e.F(new C0412a(obj3 != null ? obj3.hashCode() : 0, obj3));
                    return obj3;
                }
                return aVar;
            }
        }
        a9 = new A(this, cVar);
        Object obj42 = a9.f3629w;
        A7.a aVar2 = A7.a.f215n;
        i4 = a9.f3631y;
        if (i4 != 0) {
        }
        obj2 = c0412a.f3651a;
        if ((obj2 == null ? obj2.hashCode() : 0) == c0412a.f3652b) {
        }
    }

    public final Object i(I7.p pVar, B7.c cVar) {
        C0399m a9 = AbstractC0410y.a();
        this.f3649g.l(new k(pVar, a9, (E) this.f3647e.E(), cVar.getContext()));
        return a9.U(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae A[Catch: IOException -> 0x00c5, TryCatch #1 {IOException -> 0x00c5, blocks: (B:14:0x00a0, B:18:0x00ae, B:19:0x00c4, B:26:0x00cd, B:27:0x00d0, B:43:0x0077, B:23:0x00cb), top: B:42:0x0077, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, B7.c cVar) {
        C c9;
        int i4;
        File file;
        FileOutputStream fileOutputStream;
        D d9;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof C) {
            c9 = (C) cVar;
            int i6 = c9.f3641z;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c9.f3641z = i6 - Integer.MIN_VALUE;
                Object obj2 = c9.f3639x;
                A7.a aVar = A7.a.f215n;
                i4 = c9.f3641z;
                u7.v vVar = u7.v.f41073a;
                if (i4 != 0) {
                    Q3.b.s(obj2);
                    File b9 = b();
                    File parentFile = b9.getCanonicalFile().getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                        if (!parentFile.isDirectory()) {
                            throw new IOException("Unable to create parent directories of " + b9);
                        }
                    }
                    file = new File(b().getAbsolutePath() + ((Object) this.f3645c));
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            C3831qx c3831qx = C3884rx.f34545a;
                            m mVar = new m(fileOutputStream3);
                            c9.f3635n = this;
                            c9.f3636u = file;
                            c9.f3637v = fileOutputStream3;
                            c9.f3638w = fileOutputStream3;
                            c9.f3641z = 1;
                            ((C3831qx) obj).c(mVar);
                            if (vVar == aVar) {
                                return aVar;
                            }
                            d9 = this;
                            fileOutputStream2 = fileOutputStream3;
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream3;
                            throw th;
                        }
                    } catch (IOException e9) {
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e9;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = c9.f3638w;
                    fileOutputStream = c9.f3637v;
                    file = c9.f3636u;
                    d9 = c9.f3635n;
                    try {
                        Q3.b.s(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            com.bumptech.glide.d.h(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                com.bumptech.glide.d.h(fileOutputStream, null);
                if (!file.renameTo(d9.b())) {
                    return vVar;
                }
                throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
            }
        }
        c9 = new C(this, cVar);
        Object obj22 = c9.f3639x;
        A7.a aVar2 = A7.a.f215n;
        i4 = c9.f3641z;
        u7.v vVar2 = u7.v.f41073a;
        if (i4 != 0) {
        }
        fileOutputStream2.getFD().sync();
        com.bumptech.glide.d.h(fileOutputStream, null);
        if (!file.renameTo(d9.b())) {
        }
    }
}
