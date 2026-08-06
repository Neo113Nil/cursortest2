package F1;

import A1.AbstractC0018t;
import A1.AbstractC0022x;
import A1.C0013n;
import A1.C0014o;
import A1.C0015p;
import A1.C0019u;
import A1.J;
import A1.S;
import A1.b0;
import A1.i0;
import A1.j0;
import A1.l0;
import h1.AbstractC0236f;
import i1.C0250g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n1.AbstractC0991b;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C.j f591c;

    /* renamed from: d, reason: collision with root package name */
    public static final C.j f592d;

    /* renamed from: a, reason: collision with root package name */
    public static final C.j f589a = new C.j(5, "NO_DECISION");

    /* renamed from: b, reason: collision with root package name */
    public static final C.j f590b = new C.j(5, "CLOSED");

    /* renamed from: e, reason: collision with root package name */
    public static final C.j f593e = new C.j(5, "CONDITION_FALSE");

    /* renamed from: f, reason: collision with root package name */
    public static final C.j f594f = new C.j(5, "NO_THREAD_ELEMENTS");

    static {
        int i2 = 5;
        f591c = new C.j(i2, "UNDEFINED");
        f592d = new C.j(i2, "REUSABLE_CLAIMED");
    }

    public static final C0015p a(t1.l lVar, Object obj, C0015p c0015p) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (c0015p == null || c0015p.getCause() == th) {
                return new C0015p("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC1050a.a(c0015p, th);
        }
        return c0015p;
    }

    public static final Object b(u uVar, long j2, t1.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f631c >= j2 && !uVar.c()) {
                return uVar;
            }
            Object obj = d.f597a.get(uVar);
            C.j jVar = f590b;
            if (obj == jVar) {
                return jVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.invoke(Long.valueOf(uVar.f631c + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = d.f597a;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final u c(Object obj) {
        if (obj != f590b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, l1.i iVar) {
        Throwable runtimeException;
        Iterator it = f.f600a.iterator();
        while (it.hasNext()) {
            try {
                ((B1.b) it.next()).j(th, iVar);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC1050a.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC1050a.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f590b;
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

    public static final void g(l1.i iVar, Object obj) {
        if (obj == f594f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object k2 = iVar.k(null, x.f635g);
            kotlin.jvm.internal.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            C1.a.n(k2);
            throw null;
        }
        z zVar = (z) obj;
        i0[] i0VarArr = zVar.f640b;
        int length = i0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        i0 i0Var = i0VarArr[length];
        kotlin.jvm.internal.i.b(null);
        Object obj2 = zVar.f639a[length];
        throw null;
    }

    public static final void h(l1.d dVar, Object obj, t1.l lVar) {
        if (!(dVar instanceof h)) {
            dVar.i(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable a2 = AbstractC0236f.a(obj);
        Object c0014o = a2 == null ? lVar != null ? new C0014o(obj, lVar) : obj : new C0013n(a2, false);
        AbstractC0991b abstractC0991b = hVar.f604e;
        abstractC0991b.getContext();
        AbstractC0018t abstractC0018t = hVar.f603d;
        if (abstractC0018t.n()) {
            hVar.f605f = c0014o;
            hVar.f1c = 1;
            abstractC0018t.j(abstractC0991b.getContext(), hVar);
            return;
        }
        J a3 = j0.a();
        if (a3.f10c >= 4294967296L) {
            hVar.f605f = c0014o;
            hVar.f1c = 1;
            C0250g c0250g = a3.f12e;
            if (c0250g == null) {
                c0250g = new C0250g();
                a3.f12e = c0250g;
            }
            c0250g.addLast(hVar);
            return;
        }
        a3.q(true);
        try {
            S s2 = (S) abstractC0991b.getContext().m(C0019u.f73b);
            if (s2 == null || s2.b()) {
                Object obj2 = hVar.f606g;
                l1.i context = abstractC0991b.getContext();
                Object m2 = m(context, obj2);
                l0 m3 = m2 != f594f ? AbstractC0022x.m(abstractC0991b, context, m2) : null;
                try {
                    abstractC0991b.i(obj);
                } finally {
                    if (m3 == null || m3.W()) {
                        g(context, m2);
                    }
                }
            } else {
                CancellationException z2 = ((b0) s2).z();
                hVar.b(c0014o, z2);
                hVar.i(R1.l.h(z2));
            }
            while (a3.s()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long j(String str, long j2, long j3, long j4) {
        String str2;
        int i2;
        Long valueOf;
        long j5;
        int i3 = w.f633a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        R1.d.b(10);
        int length = str2.length();
        if (length != 0) {
            int i4 = 0;
            char charAt = str2.charAt(0);
            long j6 = -9223372036854775807L;
            if (kotlin.jvm.internal.i.f(charAt, 48) < 0) {
                if (length != 1) {
                    if (charAt == '+') {
                        i2 = 0;
                        i4 = 1;
                        long j7 = 0;
                        long j8 = -256204778801521550L;
                        while (i4 < length) {
                            int digit = Character.digit((int) str2.charAt(i4), 10);
                            if (digit >= 0) {
                                if (j7 < j8) {
                                    if (j8 == -256204778801521550L) {
                                        j8 = j6 / 10;
                                        if (j7 < j8) {
                                        }
                                    }
                                }
                                long j9 = j7 * 10;
                                long j10 = digit;
                                if (j9 >= j6 + j10) {
                                    j7 = j9 - j10;
                                    i4++;
                                }
                            }
                        }
                        valueOf = i2 == 0 ? Long.valueOf(j7) : Long.valueOf(-j7);
                        if (valueOf == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j3 <= longValue) {
                            j5 = j4;
                            if (longValue <= j5) {
                                return longValue;
                            }
                        } else {
                            j5 = j4;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j5 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j6 = Long.MIN_VALUE;
                        i4 = 1;
                    }
                }
            }
            i2 = i4;
            long j72 = 0;
            long j82 = -256204778801521550L;
            while (i4 < length) {
            }
            valueOf = i2 == 0 ? Long.valueOf(j72) : Long.valueOf(-j72);
            if (valueOf == null) {
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static int k(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) j(str, i2, i3, i4);
    }

    public static final Object l(l1.i iVar) {
        Object k2 = iVar.k(0, x.f634f);
        kotlin.jvm.internal.i.b(k2);
        return k2;
    }

    public static final Object m(l1.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f594f;
        }
        if (obj instanceof Integer) {
            return iVar.k(new z(((Number) obj).intValue(), iVar), x.f636h);
        }
        C1.a.n(obj);
        throw null;
    }
}
