package X7;

import E2.C0316m;
import S7.AbstractC0406u;
import S7.AbstractC0410y;
import S7.C0402p;
import S7.C0407v;
import S7.P;
import S7.Y;
import S7.h0;
import S7.p0;
import S7.q0;
import S7.w0;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.AbstractC5083i;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0316m f3775a = new C0316m("NO_DECISION", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final C0316m f3776b = new C0316m("CLOSED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final C0316m f3777c = new C0316m("UNDEFINED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0316m f3778d = new C0316m("REUSABLE_CLAIMED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final C0316m f3779e = new C0316m("CONDITION_FALSE", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final C0316m f3780f = new C0316m("NO_THREAD_ELEMENTS", 1);

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(Wv.f(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(t tVar, long j6, I7.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (tVar.f3815v >= j6 && !tVar.c()) {
                return tVar;
            }
            Object obj = d.f3783n.get(tVar);
            C0316m c0316m = f3776b;
            if (obj == c0316m) {
                return c0316m;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f3815v + 1), tVar);
                do {
                    atomicReferenceFieldUpdater = d.f3783n;
                    if (atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                        if (tVar.c()) {
                            tVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(tVar) == null);
            }
            tVar = tVar2;
        }
    }

    public static final t c(Object obj) {
        if (obj != f3776b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, InterfaceC5245i interfaceC5245i) {
        Throwable runtimeException;
        Iterator it = f.f3786a.iterator();
        while (it.hasNext()) {
            try {
                ((T7.b) it.next()).p(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    A8.b.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            A8.b.a(th, new g(interfaceC5245i));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f3776b;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(InterfaceC5245i interfaceC5245i, Object obj) {
        if (obj == f3780f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object l9 = interfaceC5245i.l(null, w.f3819v);
            kotlin.jvm.internal.h.c(l9, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            D.x.x(l9);
            throw null;
        }
        y yVar = (y) obj;
        p0[] p0VarArr = yVar.f3825b;
        int length = p0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        p0 p0Var = p0VarArr[length];
        kotlin.jvm.internal.h.b(null);
        Object obj2 = yVar.f3824a[length];
        throw null;
    }

    public static final void h(Object obj, InterfaceC5240d interfaceC5240d) {
        if (!(interfaceC5240d instanceof h)) {
            interfaceC5240d.resumeWith(obj);
            return;
        }
        h hVar = (h) interfaceC5240d;
        Throwable a9 = AbstractC5083i.a(obj);
        Object c0402p = a9 == null ? obj : new C0402p(a9, false);
        B7.c cVar = hVar.f3790x;
        cVar.getContext();
        AbstractC0406u abstractC0406u = hVar.f3789w;
        if (abstractC0406u.z()) {
            hVar.f3791y = c0402p;
            hVar.f2997v = 1;
            abstractC0406u.p(cVar.getContext(), hVar);
            return;
        }
        P a10 = q0.a();
        if (a10.f3015v >= 4294967296L) {
            hVar.f3791y = c0402p;
            hVar.f2997v = 1;
            a10.B(hVar);
            return;
        }
        a10.D(true);
        try {
            Y y7 = (Y) cVar.getContext().m(C0407v.f3081u);
            if (y7 == null || y7.j()) {
                Object obj2 = hVar.f3792z;
                InterfaceC5245i context = cVar.getContext();
                Object m9 = m(context, obj2);
                w0 x9 = m9 != f3780f ? AbstractC0410y.x(cVar, context, m9) : null;
                try {
                    cVar.resumeWith(obj);
                } finally {
                    if (x9 == null || x9.X()) {
                        g(context, m9);
                    }
                }
            } else {
                CancellationException w3 = ((h0) y7).w();
                hVar.b(c0402p, w3);
                hVar.resumeWith(Q3.b.b(w3));
            }
            while (a10.F()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final long j(String str, long j6, long j9, long j10) {
        String str2;
        int i = v.f3817a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j6;
        }
        Long j02 = Q7.q.j0(str2);
        if (j02 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = j02.longValue();
        if (j9 <= longValue && longValue <= j10) {
            return longValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j9);
        com.IceFishing.LiveIceFishing.k.z(sb, "..", j10, ", but is '");
        sb.append(longValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int k(int i, int i4, String str) {
        return (int) j(str, i, 1, (i4 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object l(InterfaceC5245i interfaceC5245i) {
        Object l9 = interfaceC5245i.l(0, w.f3818u);
        kotlin.jvm.internal.h.b(l9);
        return l9;
    }

    public static final Object m(InterfaceC5245i interfaceC5245i, Object obj) {
        if (obj == null) {
            obj = l(interfaceC5245i);
        }
        if (obj == 0) {
            return f3780f;
        }
        if (obj instanceof Integer) {
            return interfaceC5245i.l(new y(((Number) obj).intValue(), interfaceC5245i), w.f3820w);
        }
        D.x.x(obj);
        throw null;
    }
}
