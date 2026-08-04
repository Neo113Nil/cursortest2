package com.gamericefishpro.space.ui;

import com.gamericefishpro.space.pi.c2;
import com.gamericefishpro.space.pi.d1;
import com.gamericefishpro.space.pi.g0;
import com.gamericefishpro.space.pi.u0;
import com.gamericefishpro.space.pi.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final com.gamericefishpro.space.d6.a a = new com.gamericefishpro.space.d6.a("CLOSED", 2);
    public static final com.gamericefishpro.space.d6.a b = new com.gamericefishpro.space.d6.a("UNDEFINED", 2);
    public static final com.gamericefishpro.space.d6.a c = new com.gamericefishpro.space.d6.a("REUSABLE_CLAIMED", 2);

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(q qVar, long j, Function2 function2) {
        while (true) {
            if (qVar.c >= j && !qVar.c()) {
                return qVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.a;
            Object obj = atomicReferenceFieldUpdater.get(qVar);
            com.gamericefishpro.space.d6.a aVar = a;
            if (obj == aVar) {
                return aVar;
            }
            q qVar2 = (q) ((b) obj);
            if (qVar2 == null) {
                qVar2 = (q) function2.invoke(Long.valueOf(qVar.c + 1), qVar);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(qVar, null, qVar2)) {
                        if (qVar.c()) {
                            qVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(qVar) == null);
            }
            qVar = qVar2;
        }
    }

    public static final q c(Object obj) {
        if (obj != a) {
            return (q) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = d.a.iterator();
        while (it.hasNext()) {
            try {
                ((com.gamericefishpro.space.pi.v) it.next()).N(th, coroutineContext);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    com.gamericefishpro.space.oh.c.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            com.gamericefishpro.space.oh.c.a(th, new e(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == a;
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

    public static final void g(com.gamericefishpro.space.th.a aVar, Object obj) throws g0 {
        if (!(aVar instanceof f)) {
            aVar.resumeWith(obj);
            return;
        }
        f fVar = (f) aVar;
        com.gamericefishpro.space.pi.t tVar = fVar.v;
        com.gamericefishpro.space.vh.c cVar = fVar.w;
        Throwable thA = com.gamericefishpro.space.oh.p.a(obj);
        Object qVar = thA == null ? obj : new com.gamericefishpro.space.pi.q(thA, false);
        if (i(tVar, cVar.getContext())) {
            fVar.y = qVar;
            fVar.i = 1;
            h(tVar, cVar.getContext(), fVar);
            return;
        }
        u0 u0VarA = w1.a();
        if (u0VarA.i >= 4294967296L) {
            fVar.y = qVar;
            fVar.i = 1;
            u0VarA.U(fVar);
            return;
        }
        u0VarA.W(true);
        try {
            d1 d1Var = (d1) cVar.getContext().j(com.gamericefishpro.space.pi.u.e);
            if (d1Var == null || d1Var.b()) {
                Object obj2 = fVar.z;
                CoroutineContext context = cVar.getContext();
                Object objC = t.c(context, obj2);
                c2 c2VarC = objC != t.a ? com.gamericefishpro.space.pi.r.c(cVar, context, objC) : null;
                try {
                    cVar.resumeWith(obj);
                    Unit unit = Unit.a;
                    if (c2VarC == null || c2VarC.n0()) {
                        t.a(context, objC);
                    }
                } catch (Throwable th) {
                    if (c2VarC == null || c2VarC.n0()) {
                        t.a(context, objC);
                    }
                    throw th;
                }
            } else {
                fVar.resumeWith(com.gamericefishpro.space.wa.b.q(d1Var.t()));
            }
            while (u0VarA.Y()) {
            }
        } catch (Throwable th2) {
            try {
                fVar.g(th2);
            } finally {
                u0VarA.T(true);
            }
        }
    }

    public static final void h(com.gamericefishpro.space.pi.t tVar, CoroutineContext coroutineContext, Runnable runnable) throws g0 {
        try {
            tVar.P(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new g0(th, tVar, coroutineContext);
        }
    }

    public static final boolean i(com.gamericefishpro.space.pi.t tVar, CoroutineContext coroutineContext) throws g0 {
        try {
            return tVar.R(coroutineContext);
        } catch (Throwable th) {
            throw new g0(th, tVar, coroutineContext);
        }
    }

    public static final long j(String str, long j, long j2, long j3) {
        String property;
        int i = s.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lC = StringsKt.C(property);
        if (lC == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lC.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int k(String str, int i, int i2) {
        return (int) j(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
