package Q0;

import L0.AbstractC0061t;
import L0.AbstractC0064w;
import L0.C0056n;
import L0.C0057o;
import L0.C0058p;
import L0.C0062u;
import L0.I;
import L0.Q;
import L0.a0;
import L0.h0;
import L0.i0;
import L0.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t0.AbstractC0249d;

/* renamed from: Q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0068a {

    /* renamed from: c, reason: collision with root package name */
    public static final A.j f871c;

    /* renamed from: d, reason: collision with root package name */
    public static final A.j f872d;

    /* renamed from: a, reason: collision with root package name */
    public static final A.j f869a = new A.j(11, "NO_DECISION");

    /* renamed from: b, reason: collision with root package name */
    public static final A.j f870b = new A.j(11, "CLOSED");

    /* renamed from: e, reason: collision with root package name */
    public static final A.j f873e = new A.j(11, "CONDITION_FALSE");

    /* renamed from: f, reason: collision with root package name */
    public static final A.j f874f = new A.j(11, "NO_THREAD_ELEMENTS");

    static {
        int i2 = 11;
        f871c = new A.j(i2, "UNDEFINED");
        f872d = new A.j(i2, "REUSABLE_CLAIMED");
    }

    public static final void a(D0.l lVar, Object obj, v0.i iVar) {
        C0058p b2 = b(lVar, obj, null);
        if (b2 != null) {
            AbstractC0064w.d(b2, iVar);
        }
    }

    public static final C0058p b(D0.l lVar, Object obj, C0058p c0058p) {
        try {
            lVar.i(obj);
        } catch (Throwable th) {
            if (c0058p == null || c0058p.getCause() == th) {
                return new C0058p("Exception in undelivered element handler for " + obj, th);
            }
            o.g.a(c0058p, th);
        }
        return c0058p;
    }

    public static final Object c(v vVar, long j2, D0.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (vVar.f914g >= j2 && !vVar.c()) {
                return vVar;
            }
            Object obj = d.f877e.get(vVar);
            A.j jVar = f870b;
            if (obj == jVar) {
                return jVar;
            }
            v vVar2 = (v) ((d) obj);
            if (vVar2 == null) {
                vVar2 = (v) pVar.f(Long.valueOf(vVar.f914g + 1), vVar);
                do {
                    atomicReferenceFieldUpdater = d.f877e;
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
        if (obj != f870b) {
            return (v) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void e(Throwable th, v0.i iVar) {
        Throwable runtimeException;
        Iterator it = f.f880a.iterator();
        while (it.hasNext()) {
            try {
                ((M0.b) it.next()).c(th, iVar);
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
        return obj == f870b;
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
        if (obj == f874f) {
            return;
        }
        if (!(obj instanceof A)) {
            Object m2 = iVar.m(null, y.f918h);
            E0.i.c(m2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            E0.h.h(m2);
            throw null;
        }
        A a2 = (A) obj;
        h0[] h0VarArr = a2.f868b;
        int length = h0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        h0 h0Var = h0VarArr[length];
        E0.i.b(null);
        Object obj2 = a2.f867a[length];
        throw null;
    }

    public static final void i(v0.d dVar, Object obj, D0.l lVar) {
        if (!(dVar instanceof h)) {
            dVar.c(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable a2 = AbstractC0249d.a(obj);
        Object c0057o = a2 == null ? lVar != null ? new C0057o(obj, lVar) : obj : new C0056n(a2, false);
        AbstractC0061t abstractC0061t = hVar.f883h;
        x0.b bVar = hVar.f884i;
        bVar.j();
        if (abstractC0061t.d()) {
            hVar.f885j = c0057o;
            hVar.f610g = 1;
            hVar.f883h.c(bVar.j(), hVar);
            return;
        }
        I a3 = i0.a();
        if (a3.f619g >= 4294967296L) {
            hVar.f885j = c0057o;
            hVar.f610g = 1;
            u0.b bVar2 = a3.f621i;
            if (bVar2 == null) {
                bVar2 = new u0.b();
                a3.f621i = bVar2;
            }
            bVar2.addLast(hVar);
            return;
        }
        a3.j(true);
        try {
            Q q2 = (Q) bVar.j().i(C0062u.f682f);
            if (q2 == null || q2.b()) {
                Object obj2 = hVar.f886k;
                v0.i j2 = bVar.j();
                Object n2 = n(j2, obj2);
                k0 m2 = n2 != f874f ? AbstractC0064w.m(bVar, j2, n2) : null;
                try {
                    bVar.c(obj);
                } finally {
                    if (m2 == null || m2.X()) {
                        h(j2, n2);
                    }
                }
            } else {
                CancellationException A2 = ((a0) q2).A();
                hVar.b(c0057o, A2);
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
        int i4 = x.f916a;
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
        Object m2 = iVar.m(0, y.f917g);
        E0.i.b(m2);
        return m2;
    }

    public static final Object n(v0.i iVar, Object obj) {
        if (obj == null) {
            obj = m(iVar);
        }
        if (obj == 0) {
            return f874f;
        }
        if (obj instanceof Integer) {
            return iVar.m(new A(((Number) obj).intValue(), iVar), y.f919i);
        }
        E0.h.h(obj);
        throw null;
    }
}
