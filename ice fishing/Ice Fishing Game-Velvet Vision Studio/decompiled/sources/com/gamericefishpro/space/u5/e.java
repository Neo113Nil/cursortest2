package com.gamericefishpro.space.u5;

import android.database.SQLException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.pi.y1;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.ui.u;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b {
    public final i d;
    public final i e;
    public final ThreadLocal i;
    public final AtomicBoolean v;
    public final long w;

    public e(s driver) {
        long jL;
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(":memory:", "fileName");
        this.i = new ThreadLocal();
        this.v = new AtomicBoolean(false);
        com.gamericefishpro.space.ni.a aVar = com.gamericefishpro.space.ni.b.d;
        com.gamericefishpro.space.ni.d unit = com.gamericefishpro.space.ni.d.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (unit.compareTo(unit) <= 0) {
            jL = com.gamericefishpro.space.ni.e.b(30, unit, com.gamericefishpro.space.ni.d.NANOSECONDS) << 1;
            int i = com.gamericefishpro.space.ni.c.a;
        } else {
            jL = com.gamericefishpro.space.u6.f.L(30, unit);
        }
        this.w = jL;
        i iVar = new i(1, new com.gamericefishpro.space.a3.b(17, driver));
        this.d = iVar;
        this.e = iVar;
    }

    public final void b(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.e.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.d.c(sb);
        com.gamericefishpro.space.i.a.Q(5, sb.toString());
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.v.compareAndSet(false, true)) {
            this.d.b();
            this.e.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01f7 A[Catch: all -> 0x0210, TRY_LEAVE, TryCatch #1 {all -> 0x0210, blocks: (B:115:0x01f1, B:117:0x01f7, B:119:0x0201, B:120:0x0206), top: B:149:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // com.gamericefishpro.space.u5.b
    public final Object s(boolean z, Function2 function2, com.gamericefishpro.space.vh.c cVar) {
        d dVar;
        a0 a0Var;
        Throwable th;
        i iVar;
        a0 a0Var2;
        i iVar2;
        CoroutineContext context;
        a0 a0Var3;
        e eVar;
        a0 a0Var4;
        Function2 function3;
        a0 a0Var5;
        Throwable th2;
        boolean z2;
        a0 a0Var6;
        q qVar;
        q qVar2;
        boolean z3 = z;
        Function2 function4 = function2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.C = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objD = dVar.A;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = dVar.C;
        com.gamericefishpro.space.th.a aVar2 = null;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(objD);
                if (this.v.get()) {
                    com.gamericefishpro.space.i.a.Q(21, "Connection pool is closed");
                    throw null;
                }
                ThreadLocal threadLocal = this.i;
                q qVar3 = (q) threadLocal.get();
                com.gamericefishpro.space.u3.k kVar = a.e;
                if (qVar3 == null) {
                    a aVar3 = (a) dVar.getContext().j(kVar);
                    qVar3 = aVar3 != null ? aVar3.d : null;
                }
                if (qVar3 == null) {
                    i iVar3 = z3 ? this.d : this.e;
                    a0Var = new a0();
                    try {
                        CoroutineContext context2 = dVar.getContext();
                        a0 a0Var7 = new a0();
                        try {
                            long j = this.w;
                            com.gamericefishpro.space.db.d dVar2 = new com.gamericefishpro.space.db.d(a0Var7, iVar3, aVar2, 13);
                            dVar.d = this;
                            dVar.e = (Serializable) function4;
                            dVar.i = iVar3;
                            dVar.v = a0Var;
                            dVar.w = context2;
                            dVar.y = a0Var7;
                            dVar.z = z3;
                            dVar.C = 3;
                            com.gamericefishpro.space.ni.a aVar4 = com.gamericefishpro.space.ni.b.d;
                            long jE = 0;
                            boolean z4 = j > 0;
                            try {
                                if (z4) {
                                    a0Var4 = a0Var7;
                                    long jD = com.gamericefishpro.space.ni.b.d(j, com.gamericefishpro.space.u6.f.L(999999L, com.gamericefishpro.space.ni.d.NANOSECONDS));
                                    jE = (!((((int) jD) & 1) == 1) || com.gamericefishpro.space.ni.b.c(jD)) ? com.gamericefishpro.space.ni.b.e(jD, com.gamericefishpro.space.ni.d.MILLISECONDS) : jD >> 1;
                                } else {
                                    a0Var4 = a0Var7;
                                    if (z4) {
                                        throw new com.gamericefishpro.space.oh.k();
                                    }
                                }
                                if (com.gamericefishpro.space.pi.a0.E(jE, dVar2, dVar) != aVar) {
                                    iVar2 = iVar3;
                                    context = context2;
                                    function3 = function4;
                                    a0Var3 = a0Var;
                                    a0Var5 = a0Var4;
                                    eVar = this;
                                    th2 = null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                iVar2 = iVar3;
                                context = context2;
                                a0Var3 = a0Var;
                                eVar = this;
                                th2 = th;
                                function3 = function4;
                                a0Var5 = a0Var2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            a0Var2 = a0Var7;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        iVar = iVar3;
                        throw th;
                    }
                } else {
                    if (!z3 && qVar3.b) {
                        com.gamericefishpro.space.i.a.Q(1, "Cannot upgrade connection from reader to writer");
                        throw null;
                    }
                    if (dVar.getContext().j(kVar) == null) {
                        a aVar5 = new a(qVar3);
                        Intrinsics.checkNotNullParameter(threadLocal, "<this>");
                        CoroutineContext coroutineContextC = kotlin.coroutines.e.c(aVar5, new u(qVar3, threadLocal));
                        com.gamericefishpro.space.b0.o oVar = new com.gamericefishpro.space.b0.o(function4, qVar3, aVar2, 24);
                        dVar.C = 1;
                        Object objD2 = com.gamericefishpro.space.pi.a0.D(coroutineContextC, oVar, dVar);
                        if (objD2 != aVar) {
                            return objD2;
                        }
                    } else {
                        dVar.C = 2;
                        Object objInvoke = function4.invoke(qVar3, dVar);
                        if (objInvoke != aVar) {
                            return objInvoke;
                        }
                    }
                }
                return aVar;
            }
            if (i2 == 1) {
                com.gamericefishpro.space.wa.b.P(objD);
                return objD;
            }
            if (i2 == 2) {
                com.gamericefishpro.space.wa.b.P(objD);
                return objD;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0Var6 = (a0) dVar.e;
                iVar = (i) dVar.d;
                try {
                    com.gamericefishpro.space.wa.b.P(objD);
                    try {
                        qVar2 = (q) a0Var6.d;
                        if (qVar2 != null) {
                            if (qVar2.d.compareAndSet(false, true)) {
                                try {
                                    com.gamericefishpro.space.i.a.r(qVar2.a, "ROLLBACK TRANSACTION");
                                } catch (SQLException unused) {
                                }
                            }
                            f fVar = qVar2.a;
                            fVar.i = null;
                            fVar.v = null;
                            iVar.d(fVar);
                        }
                    } catch (Throwable unused2) {
                    }
                    return objD;
                } catch (Throwable th6) {
                    th = th6;
                    a0Var = a0Var6;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th7) {
                        try {
                            q qVar4 = (q) a0Var.d;
                            if (qVar4 == null) {
                                throw th7;
                            }
                            if (qVar4.d.compareAndSet(false, true)) {
                                try {
                                    com.gamericefishpro.space.i.a.r(qVar4.a, "ROLLBACK TRANSACTION");
                                } catch (SQLException unused3) {
                                }
                            }
                            f fVar2 = qVar4.a;
                            fVar2.i = null;
                            fVar2.v = null;
                            iVar.d(fVar2);
                            throw th7;
                        } catch (Throwable th8) {
                            com.gamericefishpro.space.oh.c.a(th, th8);
                            throw th7;
                        }
                    }
                }
            }
            z3 = dVar.z;
            a0Var5 = dVar.y;
            context = dVar.w;
            a0Var3 = dVar.v;
            iVar2 = dVar.i;
            function3 = (Function2) dVar.e;
            eVar = (e) dVar.d;
            try {
                com.gamericefishpro.space.wa.b.P(objD);
                th2 = null;
            } catch (Throwable th9) {
                th = th9;
                a0Var2 = a0Var5;
                function4 = function3;
                th2 = th;
                function3 = function4;
                a0Var5 = a0Var2;
            }
            f fVar3 = (f) a0Var5.d;
            if (fVar3 != null) {
                Intrinsics.checkNotNullParameter(context, "context");
                fVar3.i = context;
                fVar3.v = new Throwable();
                qVar = new q(fVar3, eVar.d != eVar.e && z2);
            } else {
                qVar = null;
            }
            a0Var6.d = qVar;
            if (th2 instanceof y1) {
                eVar.b(z2);
                throw null;
            }
            if (th2 != null) {
                throw th2;
            }
            if (qVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            eVar.getClass();
            a aVar6 = new a(qVar);
            ThreadLocal threadLocal2 = eVar.i;
            Intrinsics.checkNotNullParameter(threadLocal2, "<this>");
            CoroutineContext coroutineContextC2 = kotlin.coroutines.e.c(aVar6, new u(qVar, threadLocal2));
            com.gamericefishpro.space.b0.o oVar2 = new com.gamericefishpro.space.b0.o(function3, a0Var6, null, 25);
            dVar.d = iVar2;
            dVar.e = a0Var6;
            dVar.i = null;
            dVar.v = null;
            dVar.w = null;
            dVar.y = null;
            dVar.C = 4;
            objD = com.gamericefishpro.space.pi.a0.D(coroutineContextC2, oVar2, dVar);
            if (objD != aVar) {
                iVar = iVar2;
                qVar2 = (q) a0Var6.d;
                if (qVar2 != null) {
                    if (qVar2.d.compareAndSet(false, true)) {
                        com.gamericefishpro.space.i.a.r(qVar2.a, "ROLLBACK TRANSACTION");
                    }
                    f fVar4 = qVar2.a;
                    fVar4.i = null;
                    fVar4.v = null;
                    iVar.d(fVar4);
                }
                return objD;
            }
            return aVar;
        } catch (Throwable th10) {
            th = th10;
            a0Var = a0Var6;
            iVar = iVar2;
            th = th;
            throw th;
        }
        z2 = z3;
        a0Var6 = a0Var3;
    }

    public e(final s driver, final String fileName, int i) {
        long jL;
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.i = new ThreadLocal();
        final int i2 = 0;
        this.v = new AtomicBoolean(false);
        com.gamericefishpro.space.ni.a aVar = com.gamericefishpro.space.ni.b.d;
        com.gamericefishpro.space.ni.d unit = com.gamericefishpro.space.ni.d.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        final int i3 = 1;
        if (unit.compareTo(unit) <= 0) {
            jL = com.gamericefishpro.space.ni.e.b(30, unit, com.gamericefishpro.space.ni.d.NANOSECONDS) << 1;
            int i4 = com.gamericefishpro.space.ni.c.a;
        } else {
            jL = com.gamericefishpro.space.u6.f.L(30, unit);
        }
        this.w = jL;
        if (i > 0) {
            this.d = new i(i, new Function0() { // from class: com.gamericefishpro.space.u5.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            com.gamericefishpro.space.c6.a aVarE = driver.e(fileName);
                            com.gamericefishpro.space.i.a.r(aVarE, "PRAGMA query_only = 1");
                            return aVarE;
                        default:
                            return driver.e(fileName);
                    }
                }
            });
            this.e = new i(1, new Function0() { // from class: com.gamericefishpro.space.u5.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            com.gamericefishpro.space.c6.a aVarE = driver.e(fileName);
                            com.gamericefishpro.space.i.a.r(aVarE, "PRAGMA query_only = 1");
                            return aVarE;
                        default:
                            return driver.e(fileName);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
