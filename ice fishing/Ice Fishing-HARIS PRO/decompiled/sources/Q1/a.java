package Q1;

import L1.AbstractC0015p;
import L1.AbstractC0018t;
import L1.C0009j;
import L1.C0010k;
import L1.C0011l;
import L1.C0016q;
import L1.E;
import L1.K;
import L1.T;
import L1.Z;
import L1.a0;
import a.AbstractC0078a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final u f933a = new u("NO_DECISION", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final u f934b = new u("CLOSED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final u f935c = new u("UNDEFINED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final u f936d = new u("REUSABLE_CLAIMED", 0);
    public static final u e = new u("CONDITION_FALSE", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final u f937f = new u("NO_THREAD_ELEMENTS", 0);

    public static final C0011l a(C1.l lVar, Object obj, C0011l c0011l) {
        try {
            lVar.g(obj);
        } catch (Throwable th) {
            if (c0011l == null || c0011l.getCause() == th) {
                return new C0011l("Exception in undelivered element handler for " + obj, th);
            }
            h0.f.a(c0011l, th);
        }
        return c0011l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [Q1.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [Q1.s] */
    public static final Object b(long j, N1.h hVar) {
        N1.c cVar = N1.c.i;
        while (true) {
            long j2 = hVar.f970c;
            if (j2 >= j && !hVar.c()) {
                return hVar;
            }
            Object obj = d.f940a.get(hVar);
            u uVar = f934b;
            if (obj == uVar) {
                return uVar;
            }
            ?? r3 = (s) ((d) obj);
            if (r3 != 0) {
                hVar = r3;
            } else {
                ?? r1 = (s) cVar.d(Long.valueOf(j2 + 1), hVar);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f940a;
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, null, r1)) {
                        if (hVar.c()) {
                            hVar.d();
                        }
                        hVar = r1;
                    } else if (atomicReferenceFieldUpdater.get(hVar) != null) {
                        break;
                    }
                }
            }
        }
    }

    public static final s c(Object obj) {
        if (obj != f934b) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, v1.i iVar) {
        Throwable runtimeException;
        Iterator it = e.f942a.iterator();
        while (it.hasNext()) {
            try {
                ((M1.b) it.next()).b(th, iVar);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    h0.f.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            h0.f.a(th, new f(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f934b;
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

    public static final void g(v1.i iVar, Object obj) {
        if (obj == f937f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object d2 = iVar.d(null, w.f976d);
            D1.i.c(d2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            D1.h.i(d2);
            throw null;
        }
        y yVar = (y) obj;
        Z[] zArr = yVar.f980b;
        int length = zArr.length - 1;
        if (length < 0) {
            return;
        }
        Z z2 = zArr[length];
        D1.i.b(null);
        Object obj2 = yVar.f979a[length];
        throw null;
    }

    public static final void h(v1.d dVar, C1.l lVar) {
        t1.i iVar = t1.i.f4388c;
        if (!(dVar instanceof g)) {
            dVar.b(iVar);
            return;
        }
        g gVar = (g) dVar;
        Throwable a2 = t1.f.a(iVar);
        Object c0010k = a2 == null ? lVar != null ? new C0010k(iVar, lVar) : iVar : new C0009j(a2, false);
        x1.c cVar = gVar.e;
        cVar.h();
        AbstractC0015p abstractC0015p = gVar.f945d;
        if (abstractC0015p.g()) {
            gVar.f946f = c0010k;
            gVar.f585c = 1;
            abstractC0015p.b(cVar.h(), gVar);
            return;
        }
        E a3 = a0.a();
        if (a3.f529c >= 4294967296L) {
            gVar.f946f = c0010k;
            gVar.f585c = 1;
            u1.e eVar = a3.e;
            if (eVar == null) {
                eVar = new u1.e();
                a3.e = eVar;
            }
            eVar.addLast(gVar);
            return;
        }
        a3.j(true);
        try {
            K k2 = (K) cVar.h().e(C0016q.f576b);
            if (k2 == null || k2.a()) {
                Object obj = gVar.f947g;
                v1.i h2 = cVar.h();
                Object k3 = k(h2, obj);
                if (k3 != f937f) {
                    AbstractC0018t.g(cVar, h2);
                }
                try {
                    cVar.b(iVar);
                } finally {
                    g(h2, k3);
                }
            } else {
                CancellationException n2 = ((T) k2).n();
                gVar.c(c0010k, n2);
                gVar.b(new t1.e(n2));
            }
            while (a3.k()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(String str, long j, long j2, long j3) {
        String str2;
        int i;
        Long valueOf;
        long j4;
        int i2 = v.f974a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        AbstractC0078a.h(10);
        int length = str2.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str2.charAt(0);
            long j5 = -9223372036854775807L;
            if (charAt < '0') {
                if (length != 1) {
                    if (charAt == '+') {
                        i = 0;
                        i3 = 1;
                        long j6 = 0;
                        long j7 = -256204778801521550L;
                        while (i3 < length) {
                            int digit = Character.digit((int) str2.charAt(i3), 10);
                            if (digit >= 0) {
                                if (j6 < j7) {
                                    if (j7 == -256204778801521550L) {
                                        j7 = j5 / 10;
                                        if (j6 < j7) {
                                        }
                                    }
                                }
                                long j8 = j6 * 10;
                                long j9 = digit;
                                if (j8 >= j5 + j9) {
                                    j6 = j8 - j9;
                                    i3++;
                                }
                            }
                        }
                        valueOf = i == 0 ? Long.valueOf(j6) : Long.valueOf(-j6);
                        if (valueOf == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j2 <= longValue) {
                            j4 = j3;
                            if (longValue <= j4) {
                                return longValue;
                            }
                        } else {
                            j4 = j3;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j4 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j5 = Long.MIN_VALUE;
                        i3 = 1;
                    }
                }
            }
            i = i3;
            long j62 = 0;
            long j72 = -256204778801521550L;
            while (i3 < length) {
            }
            valueOf = i == 0 ? Long.valueOf(j62) : Long.valueOf(-j62);
            if (valueOf == null) {
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static int j(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) i(str, i, i2, i3);
    }

    public static final Object k(v1.i iVar, Object obj) {
        if (obj == null) {
            obj = iVar.d(0, w.f975c);
            D1.i.b(obj);
        }
        if (obj == 0) {
            return f937f;
        }
        if (obj instanceof Integer) {
            return iVar.d(new y(((Number) obj).intValue(), iVar), w.e);
        }
        D1.h.i(obj);
        throw null;
    }
}
