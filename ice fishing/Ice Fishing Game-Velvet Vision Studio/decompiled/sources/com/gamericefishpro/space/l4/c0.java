package com.gamericefishpro.space.l4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.pi.d1;
import com.gamericefishpro.space.pi.s1;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements g {
    public final d0 A;
    public final com.gamericefishpro.space.u6.i B;
    public final com.gamericefishpro.space.oh.s C;
    public final com.gamericefishpro.space.oh.s D;
    public final com.gamericefishpro.space.u6.n E;
    public final h0 d;
    public final c e;
    public final com.gamericefishpro.space.ui.c i;
    public final p v;
    public final com.gamericefishpro.space.xi.c w;
    public int y;
    public s1 z;

    public c0(h0 storage, List initTasksList, c corruptionHandler, com.gamericefishpro.space.ui.c scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.d = storage;
        this.e = corruptionHandler;
        this.i = scope;
        com.gamericefishpro.space.th.a aVar = null;
        this.v = new p(new com.gamericefishpro.space.db.d(this, aVar, 4));
        this.w = new com.gamericefishpro.space.xi.c();
        this.A = new d0();
        this.B = new com.gamericefishpro.space.u6.i(this, initTasksList);
        this.C = com.gamericefishpro.space.oh.i.b(new l(this, 1));
        this.D = com.gamericefishpro.space.oh.i.b(new l(this, 0));
        com.gamericefishpro.space.b2.d0 onComplete = new com.gamericefishpro.space.b2.d0(15, this);
        com.gamericefishpro.space.b0.o consumeMessage = new com.gamericefishpro.space.b0.o(this, aVar, 13);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        z onUndeliveredElement = z.d;
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        com.gamericefishpro.space.u6.n nVar = new com.gamericefishpro.space.u6.n();
        nVar.d = scope;
        nVar.e = consumeMessage;
        nVar.i = com.gamericefishpro.space.hj.c.a(Integer.MAX_VALUE, 6, null);
        nVar.v = new com.gamericefishpro.space.vb.c(29);
        d1 d1Var = (d1) scope.d.j(com.gamericefishpro.space.pi.u.e);
        if (d1Var != null) {
            d1Var.n(new com.gamericefishpro.space.b2.t(8, onComplete, nVar));
        }
        this.E = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(c0 c0Var, com.gamericefishpro.space.vh.c cVar) {
        q qVar;
        com.gamericefishpro.space.xi.c cVar2;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i = qVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.w = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(c0Var, cVar);
            }
        } else {
            qVar = new q(c0Var, cVar);
        }
        Object obj = qVar.i;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = qVar.w;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            cVar2 = c0Var.w;
            qVar.d = c0Var;
            qVar.e = cVar2;
            qVar.w = 1;
            if (cVar2.c(qVar) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.xi.c cVar3 = qVar.e;
            c0 c0Var2 = qVar.d;
            com.gamericefishpro.space.wa.b.P(obj);
            cVar2 = cVar3;
            c0Var = c0Var2;
        }
        try {
            int i3 = c0Var.y - 1;
            c0Var.y = i3;
            if (i3 == 0) {
                s1 s1Var = c0Var.z;
                if (s1Var != null) {
                    s1Var.c(null);
                }
                c0Var.z = null;
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            cVar2.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.gamericefishpro.space.l4.c0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [com.gamericefishpro.space.l4.c0] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c0 c0Var, o0 o0Var, com.gamericefishpro.space.vh.c cVar) {
        r rVar;
        ?? r9;
        com.gamericefishpro.space.pi.n nVar;
        Object objB;
        ?? r10;
        ?? r2;
        CoroutineContext coroutineContext;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i = rVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.y = i - Integer.MIN_VALUE;
            } else {
                rVar = new r(c0Var, cVar);
            }
        } else {
            rVar = new r(c0Var, cVar);
        }
        Object objQ = rVar.v;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = rVar.y;
        boolean z = true;
        try {
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            com.gamericefishpro.space.pi.n nVar2 = rVar.i;
                            c0 c0Var2 = rVar.e;
                            o0 o0Var2 = (o0) rVar.d;
                            com.gamericefishpro.space.wa.b.P(objQ);
                            nVar = nVar2;
                            r10 = c0Var2;
                            o0Var = o0Var2;
                        } else if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    com.gamericefishpro.space.pi.m mVar = (com.gamericefishpro.space.pi.m) rVar.d;
                    com.gamericefishpro.space.wa.b.P(objQ);
                    c0Var = mVar;
                    com.gamericefishpro.space.oh.n nVar3 = com.gamericefishpro.space.oh.p.d;
                    r9 = c0Var;
                    Throwable thA = com.gamericefishpro.space.oh.p.a(objQ);
                    com.gamericefishpro.space.pi.n nVar4 = (com.gamericefishpro.space.pi.n) r9;
                    if (thA == null) {
                        nVar4.W(objQ);
                    } else {
                        nVar4.getClass();
                        nVar4.W(new com.gamericefishpro.space.pi.q(thA, false));
                    }
                    return Unit.a;
                }
                com.gamericefishpro.space.wa.b.P(objQ);
                nVar = o0Var.b;
                try {
                    com.gamericefishpro.space.oh.n nVar5 = com.gamericefishpro.space.oh.p.d;
                    u0 u0VarB = c0Var.A.b();
                    if (u0VarB instanceof d) {
                        ?? r3 = o0Var.a;
                        CoroutineContext coroutineContext2 = o0Var.d;
                        rVar.d = nVar;
                        rVar.y = 1;
                        try {
                            objB = c0Var.f().b(new y((c0) c0Var, coroutineContext2, (Function2) r3, (com.gamericefishpro.space.th.a) null), rVar);
                        } catch (Throwable th) {
                            th = th;
                            th = th;
                            c0Var = nVar;
                            com.gamericefishpro.space.oh.n nVar6 = com.gamericefishpro.space.oh.p.d;
                            objQ = com.gamericefishpro.space.wa.b.q(th);
                            r9 = c0Var;
                        }
                    } else {
                        if (!(u0VarB instanceof p0)) {
                            z = u0VarB instanceof v0;
                        }
                        if (!z) {
                            if (u0VarB instanceof n0) {
                                throw ((n0) u0VarB).b;
                            }
                            throw new com.gamericefishpro.space.oh.k();
                        }
                        if (u0VarB != o0Var.c) {
                            Intrinsics.c(u0VarB, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                            throw ((p0) u0VarB).b;
                        }
                        rVar.d = o0Var;
                        rVar.e = c0Var;
                        rVar.i = nVar;
                        rVar.y = 2;
                        if (c0Var.g(rVar) == aVar) {
                            r10 = c0Var;
                        }
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    c0Var = nVar;
                    com.gamericefishpro.space.oh.n nVar7 = com.gamericefishpro.space.oh.p.d;
                    objQ = com.gamericefishpro.space.wa.b.q(th);
                    r9 = c0Var;
                }
                objB = r10.f().b(new y((c0) r10, coroutineContext, (Function2) r2, (com.gamericefishpro.space.th.a) null), rVar);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                c0Var = nVar;
                com.gamericefishpro.space.oh.n nVar8 = com.gamericefishpro.space.oh.p.d;
                objQ = com.gamericefishpro.space.wa.b.q(th);
                r9 = c0Var;
            }
            r10 = c0Var;
            r2 = o0Var.a;
            coroutineContext = o0Var.d;
            rVar.d = nVar;
            rVar.e = null;
            rVar.i = null;
            rVar.y = 3;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(c0 c0Var, com.gamericefishpro.space.vh.c cVar) {
        s sVar;
        com.gamericefishpro.space.xi.c cVar2;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i = sVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                sVar.w = i - Integer.MIN_VALUE;
            } else {
                sVar = new s(c0Var, cVar);
            }
        } else {
            sVar = new s(c0Var, cVar);
        }
        Object obj = sVar.i;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = sVar.w;
        int i3 = 1;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            cVar2 = c0Var.w;
            sVar.d = c0Var;
            sVar.e = cVar2;
            sVar.w = 1;
            if (cVar2.c(sVar) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.xi.c cVar3 = sVar.e;
            c0 c0Var2 = sVar.d;
            com.gamericefishpro.space.wa.b.P(obj);
            cVar2 = cVar3;
            c0Var = c0Var2;
        }
        com.gamericefishpro.space.th.a aVar2 = null;
        try {
            int i4 = c0Var.y + 1;
            c0Var.y = i4;
            if (i4 == 1) {
                c0Var.z = com.gamericefishpro.space.pi.a0.u(c0Var.i, null, new m(c0Var, aVar2, i3), 3);
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            cVar2.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(c0 c0Var, boolean z, com.gamericefishpro.space.th.a aVar) {
        u uVar;
        c0 c0Var2;
        u0 u0Var;
        c0 c0Var3;
        Pair pair;
        u0 u0Var2;
        if (aVar instanceof u) {
            uVar = (u) aVar;
            int i = uVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.y = i - Integer.MIN_VALUE;
            } else {
                uVar = new u(c0Var, aVar);
            }
        } else {
            uVar = new u(c0Var, aVar);
        }
        Object objC = uVar.v;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = uVar.y;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objC);
            u0 u0VarB = c0Var.A.b();
            if (u0VarB instanceof v0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            t0 t0VarF = c0Var.f();
            uVar.d = c0Var;
            uVar.e = u0VarB;
            uVar.i = z;
            uVar.y = 1;
            Integer numA = t0VarF.a();
            if (numA != aVar2) {
                c0Var2 = c0Var;
                u0Var = u0VarB;
                objC = numA;
            }
            return aVar2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                c0Var3 = uVar.d;
                com.gamericefishpro.space.wa.b.P(objC);
                pair = (Pair) objC;
                u0Var2 = (u0) pair.d;
                if (((Boolean) pair.e).booleanValue()) {
                    c0Var3.A.d(u0Var2);
                }
                return u0Var2;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var3 = uVar.d;
            com.gamericefishpro.space.wa.b.P(objC);
            pair = (Pair) objC;
            u0Var2 = (u0) pair.d;
            if (((Boolean) pair.e).booleanValue()) {
                c0Var3.A.d(u0Var2);
            }
            return u0Var2;
        }
        z = uVar.i;
        u0Var = uVar.e;
        c0Var2 = uVar.d;
        com.gamericefishpro.space.wa.b.P(objC);
        int iIntValue = ((Number) objC).intValue();
        boolean z2 = u0Var instanceof d;
        int i3 = z2 ? u0Var.a : -1;
        if (z2 && iIntValue == i3) {
            return u0Var;
        }
        com.gamericefishpro.space.th.a aVar3 = null;
        if (z) {
            t0 t0VarF2 = c0Var2.f();
            v vVar = new v(c0Var2, null);
            uVar.d = c0Var2;
            uVar.e = null;
            uVar.y = 2;
            objC = t0VarF2.b(vVar, uVar);
            if (objC != aVar2) {
                c0Var3 = c0Var2;
                pair = (Pair) objC;
                u0Var2 = (u0) pair.d;
                if (((Boolean) pair.e).booleanValue()) {
                    c0Var3.A.d(u0Var2);
                }
                return u0Var2;
            }
        } else {
            t0 t0VarF3 = c0Var2.f();
            w wVar = new w(c0Var2, i3, aVar3, 0);
            uVar.d = c0Var2;
            uVar.e = null;
            uVar.y = 3;
            objC = t0VarF3.c(wVar, uVar);
            if (objC != aVar2) {
                c0Var3 = c0Var2;
                pair = (Pair) objC;
                u0Var2 = (u0) pair.d;
                if (((Boolean) pair.e).booleanValue()) {
                    c0Var3.A.d(u0Var2);
                }
                return u0Var2;
            }
        }
        return aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009f A[Catch: b -> 0x005f, TryCatch #3 {b -> 0x005f, blocks: (B:19:0x005a, B:54:0x00ff, B:24:0x0068, B:51:0x00e0, B:32:0x0085, B:40:0x009f, B:42:0x00a5, B:36:0x008e, B:48:0x00cd), top: B:83:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:61:0x012a, B:63:0x013c, B:64:0x0144), top: B:78:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0144 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #0 {all -> 0x0169, blocks: (B:61:0x012a, B:63:0x013c, B:64:0x0144), top: B:78:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:70:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(c0 c0Var, boolean z, com.gamericefishpro.space.vh.c cVar) {
        x xVar;
        com.gamericefishpro.space.ei.a0 a0Var;
        b bVar;
        c0 c0Var2;
        boolean z2;
        com.gamericefishpro.space.ei.a0 a0Var2;
        com.gamericefishpro.space.ei.y yVar;
        b bVar2;
        y yVar2;
        Object objB;
        com.gamericefishpro.space.ei.y yVar3;
        com.gamericefishpro.space.ei.a0 a0Var3;
        int iHashCode;
        Integer numA;
        c0 c0Var3;
        int i;
        Object obj;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i2 = xVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.B = i2 - Integer.MIN_VALUE;
            } else {
                xVar = new x(c0Var, cVar);
            }
        } else {
            xVar = new x(c0Var, cVar);
        }
        Object objA = xVar.z;
        Object dVar = com.gamericefishpro.space.uh.a.d;
        com.gamericefishpro.space.th.a aVar = null;
        try {
            switch (xVar.B) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    com.gamericefishpro.space.wa.b.P(objA);
                    if (z) {
                        xVar.d = c0Var;
                        xVar.w = z;
                        xVar.B = 1;
                        objA = c0Var.h(xVar);
                        if (objA != dVar) {
                            if (objA != null) {
                                iHashCode = objA.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            t0 t0VarF = c0Var.f();
                            xVar.d = c0Var;
                            xVar.e = objA;
                            xVar.w = z;
                            xVar.y = iHashCode;
                            xVar.B = 2;
                            numA = t0VarF.a();
                            if (numA != dVar) {
                                c0Var3 = c0Var;
                                i = iHashCode;
                                obj = objA;
                                objA = numA;
                                return new d(i, ((Number) objA).intValue(), obj);
                            }
                        }
                    } else {
                        t0 t0VarF2 = c0Var.f();
                        xVar.d = c0Var;
                        xVar.w = z;
                        xVar.B = 3;
                        objA = t0VarF2.a();
                        if (objA != dVar) {
                            int iIntValue = ((Number) objA).intValue();
                            t0 t0VarF3 = c0Var.f();
                            w wVar = new w(c0Var, iIntValue, aVar, 1);
                            xVar.d = c0Var;
                            xVar.w = z;
                            xVar.B = 4;
                            objA = t0VarF3.c(wVar, xVar);
                            if (objA == dVar) {
                            }
                            return (d) objA;
                        }
                    }
                    return dVar;
                case 1:
                    z = xVar.w;
                    c0Var = (c0) xVar.d;
                    com.gamericefishpro.space.wa.b.P(objA);
                    if (objA != null) {
                        iHashCode = objA.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    t0 t0VarF4 = c0Var.f();
                    xVar.d = c0Var;
                    xVar.e = objA;
                    xVar.w = z;
                    xVar.y = iHashCode;
                    xVar.B = 2;
                    numA = t0VarF4.a();
                    if (numA != dVar) {
                        c0Var3 = c0Var;
                        i = iHashCode;
                        obj = objA;
                        objA = numA;
                        return new d(i, ((Number) objA).intValue(), obj);
                    }
                    return dVar;
                case 2:
                    i = xVar.y;
                    z = xVar.w;
                    obj = xVar.e;
                    c0Var3 = (c0) xVar.d;
                    try {
                        com.gamericefishpro.space.wa.b.P(objA);
                        return new d(i, ((Number) objA).intValue(), obj);
                    } catch (b e) {
                        e = e;
                        c0Var = c0Var3;
                        a0Var = new com.gamericefishpro.space.ei.a0();
                        c cVar2 = c0Var.e;
                        xVar.d = c0Var;
                        xVar.e = e;
                        xVar.i = a0Var;
                        xVar.v = a0Var;
                        xVar.w = z;
                        xVar.B = 5;
                        Object objD = cVar2.d(e);
                        if (objD != dVar) {
                            bVar = e;
                            objA = objD;
                            c0Var2 = c0Var;
                            z2 = z;
                            a0Var2 = a0Var;
                            a0Var2.d = objA;
                            yVar = new com.gamericefishpro.space.ei.y();
                            try {
                                yVar2 = new y(a0Var, c0Var2, yVar, (com.gamericefishpro.space.th.a) null);
                                xVar.d = bVar;
                                xVar.e = a0Var;
                                xVar.i = yVar;
                                xVar.v = null;
                                xVar.B = 6;
                                if (z2) {
                                    c0Var2.getClass();
                                    objB = yVar2.invoke(xVar);
                                } else {
                                    objB = c0Var2.f().b(new f(yVar2, aVar, 1), xVar);
                                }
                                if (objB != dVar) {
                                    yVar3 = yVar;
                                    a0Var3 = a0Var;
                                    Object obj2 = a0Var3.d;
                                    dVar = new d(obj2 != null ? obj2.hashCode() : 0, yVar3.d, obj2);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bVar2 = bVar;
                                com.gamericefishpro.space.oh.c.a(bVar2, th);
                                throw bVar2;
                            }
                        }
                        return dVar;
                    }
                case 3:
                    z = xVar.w;
                    c0Var = (c0) xVar.d;
                    com.gamericefishpro.space.wa.b.P(objA);
                    int iIntValue2 = ((Number) objA).intValue();
                    t0 t0VarF5 = c0Var.f();
                    w wVar2 = new w(c0Var, iIntValue2, aVar, 1);
                    xVar.d = c0Var;
                    xVar.w = z;
                    xVar.B = 4;
                    objA = t0VarF5.c(wVar2, xVar);
                    if (objA == dVar) {
                        return dVar;
                    }
                    return (d) objA;
                case 4:
                    boolean z3 = xVar.w;
                    com.gamericefishpro.space.wa.b.P(objA);
                    return (d) objA;
                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    z2 = xVar.w;
                    a0Var2 = xVar.v;
                    a0Var = (com.gamericefishpro.space.ei.a0) xVar.i;
                    bVar = (b) xVar.e;
                    c0Var2 = (c0) xVar.d;
                    com.gamericefishpro.space.wa.b.P(objA);
                    a0Var2.d = objA;
                    yVar = new com.gamericefishpro.space.ei.y();
                    yVar2 = new y(a0Var, c0Var2, yVar, (com.gamericefishpro.space.th.a) null);
                    xVar.d = bVar;
                    xVar.e = a0Var;
                    xVar.i = yVar;
                    xVar.v = null;
                    xVar.B = 6;
                    if (z2) {
                        c0Var2.getClass();
                        objB = yVar2.invoke(xVar);
                    } else {
                        objB = c0Var2.f().b(new f(yVar2, aVar, 1), xVar);
                    }
                    if (objB != dVar) {
                        yVar3 = yVar;
                        a0Var3 = a0Var;
                        Object obj3 = a0Var3.d;
                        dVar = new d(obj3 != null ? obj3.hashCode() : 0, yVar3.d, obj3);
                    }
                    return dVar;
                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    yVar3 = (com.gamericefishpro.space.ei.y) xVar.i;
                    a0Var3 = (com.gamericefishpro.space.ei.a0) xVar.e;
                    bVar2 = (b) xVar.d;
                    try {
                        com.gamericefishpro.space.wa.b.P(objA);
                        Object obj4 = a0Var3.d;
                        dVar = new d(obj4 != null ? obj4.hashCode() : 0, yVar3.d, obj4);
                        return dVar;
                    } catch (Throwable th2) {
                        th = th2;
                        com.gamericefishpro.space.oh.c.a(bVar2, th);
                        throw bVar2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (b e2) {
            e = e2;
        }
    }

    public final t0 f() {
        return (t0) this.D.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.f(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(com.gamericefishpro.space.vh.c cVar) throws Throwable {
        t tVar;
        c0 c0Var;
        int iIntValue;
        int i;
        Throwable th;
        c0 c0Var2;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i2 = tVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.w = i2 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objA = tVar.i;
        Object obj = com.gamericefishpro.space.uh.a.d;
        int i3 = tVar.w;
        try {
            if (i3 == 0) {
                com.gamericefishpro.space.wa.b.P(objA);
                t0 t0VarF = f();
                tVar.d = this;
                tVar.w = 1;
                objA = t0VarF.a();
                if (objA != obj) {
                    c0Var = this;
                }
                return obj;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = tVar.e;
                c0Var2 = tVar.d;
                try {
                    com.gamericefishpro.space.wa.b.P(objA);
                    return Unit.a;
                } catch (Throwable th2) {
                    th = th2;
                    c0Var2.A.d(new p0(th, i));
                    throw th;
                }
            }
            c0Var = tVar.d;
            com.gamericefishpro.space.wa.b.P(objA);
            com.gamericefishpro.space.u6.i iVar = c0Var.B;
            tVar.d = c0Var;
            tVar.e = iIntValue;
            tVar.w = 2;
        } catch (Throwable th3) {
            i = iIntValue;
            th = th3;
            c0Var2 = c0Var;
            c0Var2.A.d(new p0(th, i));
            throw th;
        }
        iIntValue = ((Number) objA).intValue();
    }

    public final Object h(com.gamericefishpro.space.vh.c cVar) {
        return ((k0) this.C.getValue()).a(new n(3, 1, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Object obj, boolean z, com.gamericefishpro.space.vh.c cVar) {
        a0 a0Var;
        com.gamericefishpro.space.ei.y yVar;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i = a0Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0Var.v = i - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object obj2 = a0Var.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = a0Var.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj2);
            com.gamericefishpro.space.ei.y yVar2 = new com.gamericefishpro.space.ei.y();
            k0 k0Var = (k0) this.C.getValue();
            b0 b0Var = new b0(yVar2, this, obj, z, null);
            a0Var.d = yVar2;
            a0Var.v = 1;
            if (k0Var.b(b0Var, a0Var) == aVar) {
                return aVar;
            }
            yVar = yVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = a0Var.d;
            com.gamericefishpro.space.wa.b.P(obj2);
        }
        return new Integer(yVar.d);
    }

    @Override // com.gamericefishpro.space.l4.g
    public final com.gamericefishpro.space.si.e j() {
        return this.v;
    }

    @Override // com.gamericefishpro.space.l4.g
    public final Object m(Function2 function2, com.gamericefishpro.space.th.a aVar) {
        y0 y0Var = (y0) aVar.getContext().j(x0.d);
        if (y0Var != null) {
            y0Var.a(this);
        }
        return com.gamericefishpro.space.pi.a0.D(new y0(y0Var, this), new com.gamericefishpro.space.db.d(this, function2, (com.gamericefishpro.space.th.a) null), aVar);
    }
}
