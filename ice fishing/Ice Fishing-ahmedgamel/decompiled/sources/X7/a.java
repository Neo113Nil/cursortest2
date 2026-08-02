package X7;

import S7.AbstractC0402u;
import S7.AbstractC0406y;
import S7.C0398p;
import S7.C0403v;
import S7.P;
import S7.Y;
import S7.h0;
import S7.p0;
import S7.q0;
import S7.w0;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.AbstractC5091i;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final D2.b f3822c;

    /* renamed from: d, reason: collision with root package name */
    public static final D2.b f3823d;

    /* renamed from: a, reason: collision with root package name */
    public static final D2.b f3820a = new D2.b("NO_DECISION", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final D2.b f3821b = new D2.b("CLOSED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final D2.b f3824e = new D2.b("CONDITION_FALSE", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final D2.b f3825f = new D2.b("NO_THREAD_ELEMENTS", 1);

    static {
        int i = 1;
        f3822c = new D2.b("UNDEFINED", i);
        f3823d = new D2.b("REUSABLE_CLAIMED", i);
    }

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC4404f.e(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(t tVar, long j6, I7.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (tVar.f3860v >= j6 && !tVar.c()) {
                return tVar;
            }
            Object obj = d.f3828n.get(tVar);
            D2.b bVar = f3821b;
            if (obj == bVar) {
                return bVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f3860v + 1), tVar);
                do {
                    atomicReferenceFieldUpdater = d.f3828n;
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
        if (obj != f3821b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, InterfaceC5272i interfaceC5272i) {
        Throwable runtimeException;
        Iterator it = f.f3831a.iterator();
        while (it.hasNext()) {
            try {
                ((T7.b) it.next()).p(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    X2.e.y(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            X2.e.y(th, new g(interfaceC5272i));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f3821b;
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

    public static final void g(InterfaceC5272i interfaceC5272i, Object obj) {
        if (obj == f3825f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object l9 = interfaceC5272i.l(null, w.f3864v);
            kotlin.jvm.internal.h.c(l9, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            D.y.v(l9);
            throw null;
        }
        y yVar = (y) obj;
        p0[] p0VarArr = yVar.f3870b;
        int length = p0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        p0 p0Var = p0VarArr[length];
        kotlin.jvm.internal.h.b(null);
        Object obj2 = yVar.f3869a[length];
        throw null;
    }

    public static final void h(Object obj, InterfaceC5267d interfaceC5267d) {
        if (!(interfaceC5267d instanceof h)) {
            interfaceC5267d.resumeWith(obj);
            return;
        }
        h hVar = (h) interfaceC5267d;
        Throwable a9 = AbstractC5091i.a(obj);
        Object c0398p = a9 == null ? obj : new C0398p(a9, false);
        B7.c cVar = hVar.f3835x;
        cVar.getContext();
        AbstractC0402u abstractC0402u = hVar.f3834w;
        if (abstractC0402u.z()) {
            hVar.f3836y = c0398p;
            hVar.f2914v = 1;
            abstractC0402u.p(cVar.getContext(), hVar);
            return;
        }
        P a10 = q0.a();
        if (a10.f2932v >= 4294967296L) {
            hVar.f3836y = c0398p;
            hVar.f2914v = 1;
            a10.B(hVar);
            return;
        }
        a10.D(true);
        try {
            Y y7 = (Y) cVar.getContext().m(C0403v.f2998u);
            if (y7 == null || y7.j()) {
                Object obj2 = hVar.f3837z;
                InterfaceC5272i context = cVar.getContext();
                Object m4 = m(context, obj2);
                w0 x9 = m4 != f3825f ? AbstractC0406y.x(cVar, context, m4) : null;
                try {
                    cVar.resumeWith(obj);
                } finally {
                    if (x9 == null || x9.X()) {
                        g(context, m4);
                    }
                }
            } else {
                CancellationException w6 = ((h0) y7).w();
                hVar.b(c0398p, w6);
                hVar.resumeWith(com.bumptech.glide.d.f(w6));
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
        int i = v.f3862a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j6;
        }
        Long T8 = Q7.q.T(str2);
        if (T8 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = T8.longValue();
        if (j9 <= longValue && longValue <= j10) {
            return longValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j9);
        D.y.x(sb, "..", j10, ", but is '");
        sb.append(longValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int k(int i, int i6, String str) {
        return (int) j(str, i, 1, (i6 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object l(InterfaceC5272i interfaceC5272i) {
        Object l9 = interfaceC5272i.l(0, w.f3863u);
        kotlin.jvm.internal.h.b(l9);
        return l9;
    }

    public static final Object m(InterfaceC5272i interfaceC5272i, Object obj) {
        if (obj == null) {
            obj = l(interfaceC5272i);
        }
        if (obj == 0) {
            return f3825f;
        }
        if (obj instanceof Integer) {
            return interfaceC5272i.l(new y(((Number) obj).intValue(), interfaceC5272i), w.f3865w);
        }
        D.y.v(obj);
        throw null;
    }
}
