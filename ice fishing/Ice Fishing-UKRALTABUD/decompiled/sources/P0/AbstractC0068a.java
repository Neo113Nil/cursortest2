package P0;

import K0.AbstractC0043t;
import K0.AbstractC0046w;
import K0.C0038n;
import K0.C0039o;
import K0.C0040p;
import K0.C0044u;
import K0.I;
import K0.Q;
import K0.a0;
import K0.h0;
import K0.i0;
import K0.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: P0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0068a {

    /* renamed from: c, reason: collision with root package name */
    public static final A.j f862c;

    /* renamed from: d, reason: collision with root package name */
    public static final A.j f863d;

    /* renamed from: a, reason: collision with root package name */
    public static final A.j f860a = new A.j(11, "NO_DECISION");

    /* renamed from: b, reason: collision with root package name */
    public static final A.j f861b = new A.j(11, "CLOSED");

    /* renamed from: e, reason: collision with root package name */
    public static final A.j f864e = new A.j(11, "CONDITION_FALSE");

    /* renamed from: f, reason: collision with root package name */
    public static final A.j f865f = new A.j(11, "NO_THREAD_ELEMENTS");

    static {
        int i2 = 11;
        f862c = new A.j(i2, "UNDEFINED");
        f863d = new A.j(i2, "REUSABLE_CLAIMED");
    }

    public static final void a(D0.l lVar, Object obj, v0.i iVar) {
        C0040p b2 = b(lVar, obj, null);
        if (b2 != null) {
            AbstractC0046w.d(b2, iVar);
        }
    }

    public static final C0040p b(D0.l lVar, Object obj, C0040p c0040p) {
        try {
            lVar.i(obj);
        } catch (Throwable th) {
            if (c0040p == null || c0040p.getCause() == th) {
                return new C0040p("Exception in undelivered element handler for " + obj, th);
            }
            o.g.a(c0040p, th);
        }
        return c0040p;
    }

    public static final Object c(v vVar, long j2, D0.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (vVar.f905h >= j2 && !vVar.c()) {
                return vVar;
            }
            Object obj = d.f868f.get(vVar);
            A.j jVar = f861b;
            if (obj == jVar) {
                return jVar;
            }
            v vVar2 = (v) ((d) obj);
            if (vVar2 == null) {
                vVar2 = (v) pVar.f(Long.valueOf(vVar.f905h + 1), vVar);
                do {
                    atomicReferenceFieldUpdater = d.f868f;
                    if (atomicReferenceFieldUpdater.compareAndSet(vVar, null, vVar2)) {
                        if (vVar.c()) {
                            vVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(vVar) == null);
            }
            vVar = vVar2;
        }
    }

    public static final v d(Object obj) {
        if (obj != f861b) {
            return (v) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void e(Throwable th, v0.i iVar) {
        Throwable runtimeException;
        Iterator it = f.f871a.iterator();
        while (it.hasNext()) {
            try {
                ((L0.b) it.next()).c(th, iVar);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    o.g.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            o.g.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean f(Object obj) {
        return obj == f861b;
    }

    public static final Object g(Object obj, Object obj2) {
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

    public static final void h(v0.i iVar, Object obj) {
        if (obj == f865f) {
            return;
        }
        if (!(obj instanceof A)) {
            Object m2 = iVar.m(null, y.f909i);
            E0.i.c(m2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            E0.h.i(m2);
            throw null;
        }
        A a2 = (A) obj;
        h0[] h0VarArr = a2.f859b;
        int length = h0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        h0 h0Var = h0VarArr[length];
        E0.i.b(null);
        Object obj2 = a2.f858a[length];
        throw null;
    }

    public static final void i(v0.d dVar, Object obj, D0.l lVar) {
        if (!(dVar instanceof h)) {
            dVar.c(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable a2 = t0.d.a(obj);
        Object c0039o = a2 == null ? lVar != null ? new C0039o(obj, lVar) : obj : new C0038n(a2, false);
        AbstractC0043t abstractC0043t = hVar.f874i;
        x0.b bVar = hVar.f875j;
        bVar.j();
        if (abstractC0043t.d()) {
            hVar.f876k = c0039o;
            hVar.f462h = 1;
            hVar.f874i.c(bVar.j(), hVar);
            return;
        }
        I a3 = i0.a();
        if (a3.f471h >= 4294967296L) {
            hVar.f876k = c0039o;
            hVar.f462h = 1;
            u0.b bVar2 = a3.f473j;
            if (bVar2 == null) {
                bVar2 = new u0.b();
                a3.f473j = bVar2;
            }
            bVar2.addLast(hVar);
            return;
        }
        a3.j(true);
        try {
            Q q2 = (Q) bVar.j().i(C0044u.f534g);
            if (q2 == null || q2.b()) {
                Object obj2 = hVar.f877l;
                v0.i j2 = bVar.j();
                Object n2 = n(j2, obj2);
                k0 m2 = n2 != f865f ? AbstractC0046w.m(bVar, j2, n2) : null;
                try {
                    bVar.c(obj);
                } finally {
                    if (m2 == null || m2.X()) {
                        h(j2, n2);
                    }
                }
            } else {
                CancellationException A2 = ((a0) q2).A();
                hVar.b(c0039o, A2);
                hVar.c(o.g.f(A2));
            }
            while (a3.l()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long k(String str, long j2, long j3, long j4) {
        String str2;
        int i2;
        String str3;
        Long valueOf;
        int i3;
        int i4 = x.f907a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        int length = str2.length();
        if (length != 0) {
            int i5 = 0;
            char charAt = str2.charAt(0);
            long j5 = -9223372036854775807L;
            if (charAt < '0') {
                if (length != 1) {
                    if (charAt == '+') {
                        i2 = 0;
                        i5 = 1;
                        long j6 = 0;
                        long j7 = -256204778801521550L;
                        while (i5 < length) {
                            int digit = Character.digit((int) str2.charAt(i5), 10);
                            if (digit >= 0) {
                                if (j6 >= j7) {
                                    str3 = str2;
                                    i3 = length;
                                } else if (j7 == -256204778801521550L) {
                                    str3 = str2;
                                    i3 = length;
                                    j7 = j5 / 10;
                                    if (j6 < j7) {
                                        valueOf = null;
                                        break;
                                    }
                                }
                                long j8 = j6 * 10;
                                long j9 = digit;
                                if (j8 < j5 + j9) {
                                    valueOf = null;
                                    break;
                                }
                                j6 = j8 - j9;
                                i5++;
                                length = i3;
                                str2 = str3;
                            }
                        }
                        str3 = str2;
                        if (i2 == 0) {
                            j6 = -j6;
                        }
                        valueOf = Long.valueOf(j6);
                        if (valueOf == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str3 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j3 <= longValue && longValue <= j4) {
                            return longValue;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j5 = Long.MIN_VALUE;
                        i5 = 1;
                    }
                }
            }
            i2 = i5;
            long j62 = 0;
            long j72 = -256204778801521550L;
            while (i5 < length) {
            }
            str3 = str2;
            if (i2 == 0) {
            }
            valueOf = Long.valueOf(j62);
            if (valueOf == null) {
            }
        }
        str3 = str2;
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static int l(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) k(str, i2, i3, i4);
    }

    public static final Object m(v0.i iVar) {
        Object m2 = iVar.m(0, y.f908h);
        E0.i.b(m2);
        return m2;
    }

    public static final Object n(v0.i iVar, Object obj) {
        if (obj == null) {
            obj = m(iVar);
        }
        if (obj == 0) {
            return f865f;
        }
        if (obj instanceof Integer) {
            return iVar.m(new A(((Number) obj).intValue(), iVar), y.f910j);
        }
        E0.h.i(obj);
        throw null;
    }
}
