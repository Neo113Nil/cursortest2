package X;

import S7.AbstractC0406y;
import S7.C0395m;
import S7.C0398p;
import S7.InterfaceC0394l;
import S7.InterfaceC0404w;
import a.AbstractC0422a;
import a8.InterfaceC0447a;
import com.google.android.gms.internal.ads.C3808qx;
import com.google.android.gms.internal.ads.C3861rx;
import com.google.android.gms.internal.ads.C3915sx;
import g1.C4523c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import u7.AbstractC5091i;
import u7.C5093k;
import v7.AbstractC5129j;
import z7.InterfaceC5272i;

/* loaded from: classes.dex */
public final class D implements InterfaceC0413f {

    /* renamed from: h, reason: collision with root package name */
    public static final LinkedHashSet f3480h = new LinkedHashSet();
    public static final Object i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final C3915sx f3481a;

    /* renamed from: b, reason: collision with root package name */
    public final C4523c f3482b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3483c;

    /* renamed from: d, reason: collision with root package name */
    public final C5093k f3484d;

    /* renamed from: e, reason: collision with root package name */
    public final V7.n f3485e;

    /* renamed from: f, reason: collision with root package name */
    public List f3486f;

    /* renamed from: g, reason: collision with root package name */
    public final S0.n f3487g;

    public D(C3915sx c3915sx, List list, E3.e eVar, InterfaceC0404w interfaceC0404w) {
        C3808qx c3808qx = C3861rx.f33777a;
        this.f3481a = c3915sx;
        this.f3482b = new C4523c(12, new q(this, null));
        this.f3483c = ".tmp";
        this.f3484d = AbstractC0422a.q(new r(0, this));
        this.f3485e = new V7.n(F.f3488a);
        this.f3486f = AbstractC5129j.L(list);
        this.f3487g = new S0.n(interfaceC0404w, new J0.l(2, this), new n(this, null));
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
    public static final Object a(D d2, k kVar, B7.c cVar) {
        s sVar;
        int i6;
        InterfaceC0394l interfaceC0394l;
        C0395m c0395m;
        D d9;
        Object h9;
        InterfaceC0394l interfaceC0394l2;
        Throwable a9;
        E e9;
        d2.getClass();
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i9 = sVar.f3535y;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                sVar.f3535y = i9 - Integer.MIN_VALUE;
                Object obj = sVar.f3533w;
                A7.a aVar = A7.a.f58n;
                i6 = sVar.f3535y;
                boolean z3 = true;
                if (i6 == 0) {
                    try {
                        if (i6 == 1) {
                            interfaceC0394l = (InterfaceC0394l) sVar.f3530n;
                        } else if (i6 == 2) {
                            C0395m c0395m2 = sVar.f3532v;
                            D d10 = sVar.f3531u;
                            k kVar2 = (k) sVar.f3530n;
                            com.bumptech.glide.d.k(obj);
                            c0395m = c0395m2;
                            d9 = d10;
                            kVar = kVar2;
                        } else {
                            if (i6 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0394l = (InterfaceC0394l) sVar.f3530n;
                        }
                        com.bumptech.glide.d.k(obj);
                        interfaceC0394l2 = interfaceC0394l;
                    } catch (Throwable th) {
                        th = th;
                        obj = com.bumptech.glide.d.f(th);
                        interfaceC0394l2 = d2;
                        a9 = AbstractC5091i.a(obj);
                        C0395m c0395m3 = (C0395m) interfaceC0394l2;
                        if (a9 != null) {
                        }
                        return u7.v.f41353a;
                    }
                    a9 = AbstractC5091i.a(obj);
                    C0395m c0395m32 = (C0395m) interfaceC0394l2;
                    if (a9 != null) {
                        c0395m32.J(obj);
                    } else {
                        c0395m32.getClass();
                        c0395m32.J(new C0398p(a9, false));
                    }
                    return u7.v.f41353a;
                }
                com.bumptech.glide.d.k(obj);
                c0395m = kVar.f3512b;
                try {
                    e9 = (E) d2.f3485e.E();
                } catch (Throwable th2) {
                    th = th2;
                    d2 = c0395m;
                    obj = com.bumptech.glide.d.f(th);
                    interfaceC0394l2 = d2;
                    a9 = AbstractC5091i.a(obj);
                    C0395m c0395m322 = (C0395m) interfaceC0394l2;
                    if (a9 != null) {
                    }
                    return u7.v.f41353a;
                }
                if (e9 instanceof C0408a) {
                    ?? r22 = kVar.f3511a;
                    InterfaceC5272i interfaceC5272i = kVar.f3514d;
                    sVar.f3530n = c0395m;
                    sVar.f3535y = 1;
                    h9 = d2.h(r22, interfaceC5272i, sVar);
                    if (h9 == aVar) {
                    }
                    C0395m c0395m4 = c0395m;
                    obj = h9;
                    interfaceC0394l2 = c0395m4;
                    a9 = AbstractC5091i.a(obj);
                    C0395m c0395m3222 = (C0395m) interfaceC0394l2;
                    if (a9 != null) {
                    }
                    return u7.v.f41353a;
                }
                if (!(e9 instanceof h)) {
                    z3 = e9 instanceof F;
                }
                if (!z3) {
                    if (e9 instanceof g) {
                        throw ((g) e9).f3505a;
                    }
                    throw new B0.c();
                }
                if (e9 != kVar.f3513c) {
                    throw ((h) e9).f3506a;
                }
                sVar.f3530n = kVar;
                sVar.f3531u = d2;
                sVar.f3532v = c0395m;
                sVar.f3535y = 2;
                Object d11 = d2.d(sVar);
                d9 = d2;
                if (d11 == aVar) {
                }
                return aVar;
                ?? r23 = kVar.f3511a;
                InterfaceC5272i interfaceC5272i2 = kVar.f3514d;
                sVar.f3530n = c0395m;
                sVar.f3531u = null;
                sVar.f3532v = null;
                sVar.f3535y = 3;
                h9 = d9.h(r23, interfaceC5272i2, sVar);
            }
        }
        sVar = new s(d2, cVar);
        Object obj2 = sVar.f3533w;
        A7.a aVar2 = A7.a.f58n;
        i6 = sVar.f3535y;
        boolean z32 = true;
        if (i6 == 0) {
        }
        ?? r232 = kVar.f3511a;
        InterfaceC5272i interfaceC5272i22 = kVar.f3514d;
        sVar.f3530n = c0395m;
        sVar.f3531u = null;
        sVar.f3532v = null;
        sVar.f3535y = 3;
        h9 = d9.h(r232, interfaceC5272i22, sVar);
    }

    public final File b() {
        return (File) this.f3484d.getValue();
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
        int i6;
        InterfaceC0447a dVar;
        kotlin.jvm.internal.r rVar;
        D d2;
        kotlin.jvm.internal.r rVar2;
        List list;
        D d9;
        kotlin.jvm.internal.r rVar3;
        v vVar;
        Iterator it;
        InterfaceC0447a interfaceC0447a;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.p pVar2;
        t tVar2;
        D d10;
        a8.d dVar2;
        InterfaceC0447a interfaceC0447a2;
        kotlin.jvm.internal.r rVar4;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i9 = tVar.f3537B;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                tVar.f3537B = i9 - Integer.MIN_VALUE;
                Object obj = tVar.f3544z;
                A7.a aVar = A7.a.f58n;
                i6 = tVar.f3537B;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    V7.n nVar = this.f3485e;
                    if (!kotlin.jvm.internal.h.a(nVar.E(), F.f3488a) && !(nVar.E() instanceof h)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    dVar = new a8.d();
                    rVar = new kotlin.jvm.internal.r();
                    tVar.f3538n = this;
                    tVar.f3539u = dVar;
                    tVar.f3540v = rVar;
                    tVar.f3541w = rVar;
                    tVar.f3537B = 1;
                    obj = g(tVar);
                    if (obj != aVar) {
                        d2 = this;
                        rVar2 = rVar;
                    }
                    return aVar;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0447a2 = (InterfaceC0447a) tVar.f3541w;
                        pVar2 = (kotlin.jvm.internal.p) tVar.f3540v;
                        rVar4 = (kotlin.jvm.internal.r) tVar.f3539u;
                        d10 = tVar.f3538n;
                        com.bumptech.glide.d.k(obj);
                        try {
                            pVar2.f38715n = true;
                            ((a8.d) interfaceC0447a2).d(null);
                            V7.n nVar2 = d10.f3485e;
                            Object obj2 = rVar4.f38717n;
                            nVar2.F(new C0408a(obj2 == null ? obj2.hashCode() : 0, obj2));
                            return u7.v.f41353a;
                        } catch (Throwable th) {
                            ((a8.d) interfaceC0447a2).d(null);
                            throw th;
                        }
                    }
                    it = tVar.f3543y;
                    vVar = tVar.f3542x;
                    pVar = (kotlin.jvm.internal.p) tVar.f3541w;
                    rVar3 = (kotlin.jvm.internal.r) tVar.f3540v;
                    interfaceC0447a = (InterfaceC0447a) tVar.f3539u;
                    d9 = tVar.f3538n;
                    com.bumptech.glide.d.k(obj);
                    while (it.hasNext()) {
                        I7.p pVar3 = (I7.p) it.next();
                        tVar.f3538n = d9;
                        tVar.f3539u = interfaceC0447a;
                        tVar.f3540v = rVar3;
                        tVar.f3541w = pVar;
                        tVar.f3542x = vVar;
                        tVar.f3543y = it;
                        tVar.f3537B = 2;
                        if (pVar3.invoke(vVar, tVar) == aVar) {
                            break;
                        }
                    }
                    tVar2 = tVar;
                    pVar2 = pVar;
                    rVar2 = rVar3;
                    dVar = interfaceC0447a;
                    d10 = d9;
                    d10.f3486f = null;
                    tVar2.f3538n = d10;
                    tVar2.f3539u = rVar2;
                    tVar2.f3540v = pVar2;
                    tVar2.f3541w = dVar;
                    tVar2.f3542x = null;
                    tVar2.f3543y = null;
                    tVar2.f3537B = 3;
                    dVar2 = (a8.d) dVar;
                    if (dVar2.c(tVar2) != aVar) {
                        interfaceC0447a2 = dVar2;
                        rVar4 = rVar2;
                        pVar2.f38715n = true;
                        ((a8.d) interfaceC0447a2).d(null);
                        V7.n nVar22 = d10.f3485e;
                        Object obj22 = rVar4.f38717n;
                        nVar22.F(new C0408a(obj22 == null ? obj22.hashCode() : 0, obj22));
                        return u7.v.f41353a;
                    }
                    return aVar;
                }
                rVar = (kotlin.jvm.internal.r) tVar.f3541w;
                rVar2 = (kotlin.jvm.internal.r) tVar.f3540v;
                dVar = (InterfaceC0447a) tVar.f3539u;
                d2 = tVar.f3538n;
                com.bumptech.glide.d.k(obj);
                rVar.f38717n = obj;
                kotlin.jvm.internal.p pVar4 = new kotlin.jvm.internal.p();
                v vVar2 = new v(dVar, pVar4, rVar2, d2);
                list = d2.f3486f;
                if (list != null) {
                    pVar2 = pVar4;
                    tVar2 = tVar;
                    d10 = d2;
                    d10.f3486f = null;
                    tVar2.f3538n = d10;
                    tVar2.f3539u = rVar2;
                    tVar2.f3540v = pVar2;
                    tVar2.f3541w = dVar;
                    tVar2.f3542x = null;
                    tVar2.f3543y = null;
                    tVar2.f3537B = 3;
                    dVar2 = (a8.d) dVar;
                    if (dVar2.c(tVar2) != aVar) {
                    }
                    return aVar;
                }
                d9 = d2;
                rVar3 = rVar2;
                vVar = vVar2;
                it = list.iterator();
                interfaceC0447a = dVar;
                pVar = pVar4;
                while (it.hasNext()) {
                }
                tVar2 = tVar;
                pVar2 = pVar;
                rVar2 = rVar3;
                dVar = interfaceC0447a;
                d10 = d9;
                d10.f3486f = null;
                tVar2.f3538n = d10;
                tVar2.f3539u = rVar2;
                tVar2.f3540v = pVar2;
                tVar2.f3541w = dVar;
                tVar2.f3542x = null;
                tVar2.f3543y = null;
                tVar2.f3537B = 3;
                dVar2 = (a8.d) dVar;
                if (dVar2.c(tVar2) != aVar) {
                }
                return aVar;
            }
        }
        tVar = new t(this, cVar);
        Object obj3 = tVar.f3544z;
        A7.a aVar2 = A7.a.f58n;
        i6 = tVar.f3537B;
        if (i6 != 0) {
        }
        rVar.f38717n = obj3;
        kotlin.jvm.internal.p pVar42 = new kotlin.jvm.internal.p();
        v vVar22 = new v(dVar, pVar42, rVar2, d2);
        list = d2.f3486f;
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
        int i6;
        D d2;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i9 = wVar.f3560w;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                wVar.f3560w = i9 - Integer.MIN_VALUE;
                Object obj = wVar.f3558u;
                A7.a aVar = A7.a.f58n;
                i6 = wVar.f3560w;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    try {
                        wVar.f3557n = this;
                        wVar.f3560w = 1;
                        if (c(wVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        d2 = this;
                        d2.f3485e.F(new h(th));
                        throw th;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d2 = wVar.f3557n;
                    try {
                        com.bumptech.glide.d.k(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        d2.f3485e.F(new h(th));
                        throw th;
                    }
                }
                return u7.v.f41353a;
            }
        }
        wVar = new w(this, cVar);
        Object obj2 = wVar.f3558u;
        A7.a aVar2 = A7.a.f58n;
        i6 = wVar.f3560w;
        if (i6 != 0) {
        }
        return u7.v.f41353a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(B7.c cVar) {
        x xVar;
        int i6;
        D d2;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i9 = xVar.f3564w;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                xVar.f3564w = i9 - Integer.MIN_VALUE;
                Object obj = xVar.f3562u;
                A7.a aVar = A7.a.f58n;
                i6 = xVar.f3564w;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    try {
                        xVar.f3561n = this;
                        xVar.f3564w = 1;
                        if (c(xVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        d2 = this;
                        d2.f3485e.F(new h(th));
                        return u7.v.f41353a;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d2 = xVar.f3561n;
                    try {
                        com.bumptech.glide.d.k(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        d2.f3485e.F(new h(th));
                        return u7.v.f41353a;
                    }
                }
                return u7.v.f41353a;
            }
        }
        xVar = new x(this, cVar);
        Object obj2 = xVar.f3562u;
        A7.a aVar2 = A7.a.f58n;
        i6 = xVar.f3564w;
        if (i6 != 0) {
        }
        return u7.v.f41353a;
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
        int i6;
        FileInputStream fileInputStream;
        Throwable th;
        C3808qx c3808qx;
        try {
            if (cVar instanceof y) {
                y yVar = (y) cVar;
                int i9 = yVar.f3569x;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    yVar.f3569x = i9 - Integer.MIN_VALUE;
                    r02 = yVar;
                    Object obj = r02.f3567v;
                    A7.a aVar = A7.a.f58n;
                    i6 = r02.f3569x;
                    if (i6 != 0) {
                        com.bumptech.glide.d.k(obj);
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(b());
                            try {
                                C3808qx c3808qx2 = C3861rx.f33777a;
                                r02.f3565n = this;
                                r02.f3566u = fileInputStream2;
                                r02.f3569x = 1;
                                try {
                                    c3808qx = C3808qx.C(fileInputStream2);
                                } catch (Exception unused) {
                                    c3808qx = C3861rx.f33777a;
                                }
                                if (c3808qx == aVar) {
                                    return aVar;
                                }
                                fileInputStream = fileInputStream2;
                                obj = c3808qx;
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
                            C3808qx c3808qx3 = C3861rx.f33777a;
                            return C3861rx.f33777a;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileInputStream = r02.f3566u;
                        r02 = r02.f3565n;
                        try {
                            com.bumptech.glide.d.k(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                com.bumptech.glide.d.c(fileInputStream, th);
                                throw th4;
                            }
                        }
                    }
                    com.bumptech.glide.d.c(fileInputStream, null);
                    return obj;
                }
            }
            if (i6 != 0) {
            }
            com.bumptech.glide.d.c(fileInputStream, null);
            return obj;
        } catch (FileNotFoundException e10) {
            e = e10;
            if (!r02.b().exists()) {
            }
        }
        r02 = new y(this, cVar);
        Object obj2 = r02.f3567v;
        A7.a aVar2 = A7.a.f58n;
        i6 = r02.f3569x;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(B7.c cVar) {
        z zVar;
        int i6;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i9 = zVar.f3574x;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                zVar.f3574x = i9 - Integer.MIN_VALUE;
                Object obj = zVar.f3572v;
                Object obj2 = A7.a.f58n;
                i6 = zVar.f3574x;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    zVar.f3570n = this;
                    zVar.f3574x = 1;
                    Object f3 = f(zVar);
                    if (f3 != obj2) {
                        return f3;
                    }
                } else {
                    if (i6 == 1) {
                        com.bumptech.glide.d.k(obj);
                        return obj;
                    }
                    try {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj3 = zVar.f3571u;
                            if (zVar.f3570n != null) {
                                throw new ClassCastException();
                            }
                            com.bumptech.glide.d.k(obj);
                            return obj3;
                        }
                        if (zVar.f3571u != null) {
                            throw new ClassCastException();
                        }
                        D d2 = zVar.f3570n;
                        com.bumptech.glide.d.k(obj);
                        zVar.f3570n = null;
                        zVar.f3571u = obj;
                        zVar.f3574x = 3;
                        if (d2.j(obj, zVar) != obj2) {
                            return obj;
                        }
                    } catch (IOException e9) {
                        X2.e.y(null, e9);
                        throw null;
                    }
                }
                return obj2;
            }
        }
        zVar = new z(this, cVar);
        Object obj4 = zVar.f3572v;
        Object obj22 = A7.a.f58n;
        i6 = zVar.f3574x;
        if (i6 != 0) {
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
    public final Object h(I7.p pVar, InterfaceC5272i interfaceC5272i, B7.c cVar) {
        A a9;
        int i6;
        D d2;
        C0408a c0408a;
        Object obj;
        Object obj2;
        Object obj3;
        D d9;
        if (cVar instanceof A) {
            a9 = (A) cVar;
            int i9 = a9.f3469y;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                a9.f3469y = i9 - Integer.MIN_VALUE;
                Object obj4 = a9.f3467w;
                A7.a aVar = A7.a.f58n;
                i6 = a9.f3469y;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj4);
                    C0408a c0408a2 = (C0408a) this.f3485e.E();
                    Object obj5 = c0408a2.f3489a;
                    if ((obj5 != null ? obj5.hashCode() : 0) != c0408a2.f3490b) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    Object obj6 = c0408a2.f3489a;
                    B b9 = new B(pVar, obj6, null);
                    a9.f3464n = this;
                    a9.f3465u = c0408a2;
                    a9.f3466v = obj6;
                    a9.f3469y = 1;
                    Object y7 = AbstractC0406y.y(interfaceC5272i, b9, a9);
                    if (y7 != aVar) {
                        d2 = this;
                        c0408a = c0408a2;
                        obj4 = y7;
                        obj = obj6;
                    }
                    return aVar;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = a9.f3465u;
                    d9 = a9.f3464n;
                    com.bumptech.glide.d.k(obj4);
                    d9.f3485e.F(new C0408a(obj3 != null ? obj3.hashCode() : 0, obj3));
                    return obj3;
                }
                obj = a9.f3466v;
                c0408a = (C0408a) a9.f3465u;
                d2 = a9.f3464n;
                com.bumptech.glide.d.k(obj4);
                obj2 = c0408a.f3489a;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0408a.f3490b) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (kotlin.jvm.internal.h.a(obj, obj4)) {
                    return obj;
                }
                a9.f3464n = d2;
                a9.f3465u = obj4;
                a9.f3466v = null;
                a9.f3469y = 2;
                if (d2.j(obj4, a9) != aVar) {
                    obj3 = obj4;
                    d9 = d2;
                    d9.f3485e.F(new C0408a(obj3 != null ? obj3.hashCode() : 0, obj3));
                    return obj3;
                }
                return aVar;
            }
        }
        a9 = new A(this, cVar);
        Object obj42 = a9.f3467w;
        A7.a aVar2 = A7.a.f58n;
        i6 = a9.f3469y;
        if (i6 != 0) {
        }
        obj2 = c0408a.f3489a;
        if ((obj2 == null ? obj2.hashCode() : 0) == c0408a.f3490b) {
        }
    }

    public final Object i(I7.p pVar, B7.c cVar) {
        C0395m a9 = AbstractC0406y.a();
        this.f3487g.p(new k(pVar, a9, (E) this.f3485e.E(), cVar.getContext()));
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
        int i6;
        File file;
        FileOutputStream fileOutputStream;
        D d2;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof C) {
            c9 = (C) cVar;
            int i9 = c9.f3479z;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c9.f3479z = i9 - Integer.MIN_VALUE;
                Object obj2 = c9.f3477x;
                A7.a aVar = A7.a.f58n;
                i6 = c9.f3479z;
                u7.v vVar = u7.v.f41353a;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj2);
                    File b9 = b();
                    File parentFile = b9.getCanonicalFile().getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                        if (!parentFile.isDirectory()) {
                            throw new IOException("Unable to create parent directories of " + b9);
                        }
                    }
                    file = new File(b().getAbsolutePath() + ((Object) this.f3483c));
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            C3808qx c3808qx = C3861rx.f33777a;
                            m mVar = new m(fileOutputStream3);
                            c9.f3473n = this;
                            c9.f3474u = file;
                            c9.f3475v = fileOutputStream3;
                            c9.f3476w = fileOutputStream3;
                            c9.f3479z = 1;
                            ((C3808qx) obj).c(mVar);
                            if (vVar == aVar) {
                                return aVar;
                            }
                            d2 = this;
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
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = c9.f3476w;
                    fileOutputStream = c9.f3475v;
                    file = c9.f3474u;
                    d2 = c9.f3473n;
                    try {
                        com.bumptech.glide.d.k(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            com.bumptech.glide.d.c(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                com.bumptech.glide.d.c(fileOutputStream, null);
                if (!file.renameTo(d2.b())) {
                    return vVar;
                }
                throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
            }
        }
        c9 = new C(this, cVar);
        Object obj22 = c9.f3477x;
        A7.a aVar2 = A7.a.f58n;
        i6 = c9.f3479z;
        u7.v vVar2 = u7.v.f41353a;
        if (i6 != 0) {
        }
        fileOutputStream2.getFD().sync();
        com.bumptech.glide.d.c(fileOutputStream, null);
        if (!file.renameTo(d2.b())) {
        }
    }
}
