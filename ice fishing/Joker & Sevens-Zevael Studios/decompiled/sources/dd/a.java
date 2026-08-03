package dd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yc.b1;
import yc.s0;
import yc.t1;
import yc.u1;
import yc.z1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f1839a = new w("NO_DECISION", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final w f1840b = new w("CLOSED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final w f1841c = new w("UNDEFINED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final w f1842d = new w("REUSABLE_CLAIMED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final w f1843e = new w("CONDITION_FALSE", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final w f1844f = new w("NO_THREAD_ELEMENTS", 0);

    public static final Object a(u uVar, long j3, oc.e eVar) {
        while (true) {
            if (uVar.f1884c >= j3 && !uVar.c()) {
                return uVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1849a;
            Object obj = atomicReferenceFieldUpdater.get(uVar);
            w wVar = f1840b;
            if (obj == wVar) {
                return wVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) eVar.invoke(Long.valueOf(uVar.f1884c + 1), uVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                    if (atomicReferenceFieldUpdater.get(uVar) != null) {
                        break;
                    }
                }
                if (uVar.c()) {
                    uVar.d();
                }
            }
            uVar = uVar2;
        }
    }

    public static final u b(Object obj) {
        if (obj != f1840b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(fc.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f1852a.iterator();
        while (it.hasNext()) {
            try {
                ((yc.w) it.next()).q(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    i7.b.k(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            i7.b.k(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean d(Object obj) {
        return obj == f1840b;
    }

    public static final Object e(Object obj, Object obj2) {
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

    public static final void f(fc.i iVar, Object obj) {
        if (obj == f1844f) {
            return;
        }
        if (!(obj instanceof a0)) {
            Object i10 = iVar.i(null, y.f1890i);
            pc.j.c(i10, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a4.d.s(i10);
            throw null;
        }
        a0 a0Var = (a0) obj;
        t1[] t1VarArr = a0Var.f1846b;
        int length = t1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        t1 t1Var = t1VarArr[length];
        pc.j.b(null);
        Object obj2 = a0Var.f1845a[length];
        throw null;
    }

    public static final void g(fc.d dVar, Object obj) {
        if (!(dVar instanceof h)) {
            dVar.resumeWith(obj);
            return;
        }
        h hVar = (h) dVar;
        yc.u uVar = hVar.f1855j;
        hc.c cVar = hVar.f1856k;
        Throwable a6 = ac.l.a(obj);
        Object pVar = a6 == null ? obj : new yc.p(a6, false);
        cVar.getContext();
        if (uVar.y()) {
            hVar.f1857l = pVar;
            hVar.f8853i = 1;
            uVar.w(cVar.getContext(), hVar);
            return;
        }
        s0 a8 = u1.a();
        if (a8.f8901i >= 4294967296L) {
            hVar.f1857l = pVar;
            hVar.f8853i = 1;
            a8.A(hVar);
            return;
        }
        a8.C(true);
        try {
            b1 b1Var = (b1) cVar.getContext().v(yc.v.f8910h);
            if (b1Var == null || b1Var.b()) {
                Object obj2 = hVar.f1858m;
                fc.i context = cVar.getContext();
                Object l10 = l(context, obj2);
                z1 z10 = l10 != f1844f ? yc.a0.z(cVar, context, l10) : null;
                try {
                    cVar.resumeWith(obj);
                } finally {
                    if (z10 == null || z10.g0()) {
                        f(context, l10);
                    }
                }
            } else {
                CancellationException m10 = b1Var.m();
                hVar.b(pVar, m10);
                hVar.resumeWith(v6.a.s(m10));
            }
            while (a8.E()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(String str, long j3, long j6, long j10) {
        String str2;
        boolean z10;
        String str3;
        Long valueOf;
        int i10 = x.f1888a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j3;
        }
        u2.b.i(10);
        int length = str2.length();
        if (length != 0) {
            int i11 = 0;
            char charAt = str2.charAt(0);
            long j11 = -9223372036854775807L;
            if (pc.j.f(charAt, 48) < 0) {
                z10 = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z10 = false;
                        i11 = 1;
                    } else if (charAt == '-') {
                        j11 = Long.MIN_VALUE;
                        i11 = 1;
                    }
                }
            } else {
                z10 = false;
            }
            long j12 = 0;
            long j13 = -256204778801521550L;
            while (i11 < length) {
                int digit = Character.digit((int) str2.charAt(i11), 10);
                if (digit >= 0) {
                    if (j12 >= j13) {
                        str3 = str2;
                    } else if (j13 == -256204778801521550L) {
                        str3 = str2;
                        j13 = j11 / 10;
                        if (j12 < j13) {
                            valueOf = null;
                            break;
                        }
                    }
                    long j14 = j12 * 10;
                    long j15 = digit;
                    if (j14 < j11 + j15) {
                        valueOf = null;
                        break;
                    }
                    j12 = j14 - j15;
                    i11++;
                    str2 = str3;
                }
            }
            str3 = str2;
            valueOf = z10 ? Long.valueOf(j12) : Long.valueOf(-j12);
            if (valueOf != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str3 + '\'').toString());
            }
            long longValue = valueOf.longValue();
            if (j6 <= longValue && longValue <= j10) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j6 + ".." + j10 + ", but is '" + longValue + '\'').toString());
        }
        str3 = str2;
        valueOf = null;
        if (valueOf != null) {
        }
    }

    public static int j(String str, int i10, int i11) {
        return (int) i(str, i10, 1, (i11 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(fc.i iVar) {
        Object i10 = iVar.i(0, y.f1889h);
        pc.j.b(i10);
        return i10;
    }

    public static final Object l(fc.i iVar, Object obj) {
        if (obj == null) {
            obj = k(iVar);
        }
        if (obj == 0) {
            return f1844f;
        }
        if (obj instanceof Integer) {
            return iVar.i(new a0(((Number) obj).intValue(), iVar), y.f1891j);
        }
        a4.d.s(obj);
        throw null;
    }
}
