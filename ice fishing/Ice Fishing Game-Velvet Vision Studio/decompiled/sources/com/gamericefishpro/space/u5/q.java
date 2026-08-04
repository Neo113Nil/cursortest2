package com.gamericefishpro.space.u5;

import android.database.SQLException;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.ph.c0;
import com.gamericefishpro.space.s5.a0;
import com.gamericefishpro.space.s5.z;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements a0, r {
    public final f a;
    public final boolean b;
    public final com.gamericefishpro.space.ph.r c;
    public final AtomicBoolean d;

    public q(f delegate, boolean z) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
        this.b = z;
        this.c = new com.gamericefishpro.space.ph.r();
        this.d = new AtomicBoolean(false);
    }

    @Override // com.gamericefishpro.space.s5.a0
    public final Object a(com.gamericefishpro.space.vh.i iVar) {
        if (this.d.get()) {
            com.gamericefishpro.space.i.a.Q(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().j(a.e);
        if (aVar != null && aVar.d == this) {
            return Boolean.valueOf(!this.c.isEmpty());
        }
        com.gamericefishpro.space.i.a.Q(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // com.gamericefishpro.space.s5.a0
    public final Object b(z zVar, Function2 function2, com.gamericefishpro.space.vh.i iVar) {
        if (this.d.get()) {
            com.gamericefishpro.space.i.a.Q(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().j(a.e);
        if (aVar != null && aVar.d == this) {
            return g(zVar, function2, iVar);
        }
        com.gamericefishpro.space.i.a.Q(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.s5.m
    public final Object c(String str, Function1 function1, com.gamericefishpro.space.vh.c cVar) {
        p pVar;
        f fVar;
        q qVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i = pVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                pVar.z = i - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.w;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = pVar.z;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            if (this.d.get()) {
                com.gamericefishpro.space.i.a.Q(21, "Connection is recycled");
                throw null;
            }
            a aVar2 = (a) pVar.getContext().j(a.e);
            if (aVar2 == null || aVar2.d != this) {
                com.gamericefishpro.space.i.a.Q(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            pVar.d = this;
            pVar.e = str;
            pVar.i = function1;
            fVar = this.a;
            pVar.v = fVar;
            pVar.z = 1;
            if (fVar.e.c(pVar) == aVar) {
                return aVar;
            }
            qVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar2 = pVar.v;
            function1 = pVar.i;
            String str2 = pVar.e;
            qVar = pVar.d;
            com.gamericefishpro.space.wa.b.P(obj);
            fVar = fVar2;
            str = str2;
        }
        try {
            j jVar = new j(qVar, qVar.a.O(str));
            try {
                Object objInvoke = function1.invoke(jVar);
                y3.r(jVar, null);
                fVar.b(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    y3.r(jVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            fVar.b(null);
            throw th3;
        }
    }

    @Override // com.gamericefishpro.space.u5.r
    public final com.gamericefishpro.space.c6.a d() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(z zVar, com.gamericefishpro.space.vh.c cVar) {
        m mVar;
        f fVar;
        q qVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i = mVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.y = i - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.v;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = mVar.y;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            mVar.d = this;
            mVar.e = zVar;
            fVar = this.a;
            mVar.i = fVar;
            mVar.y = 1;
            if (fVar.e.c(mVar) == aVar) {
                return aVar;
            }
            qVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar2 = mVar.i;
            z zVar2 = mVar.e;
            qVar = mVar.d;
            com.gamericefishpro.space.wa.b.P(obj);
            fVar = fVar2;
            zVar = zVar2;
        }
        try {
            com.gamericefishpro.space.ph.r rVar = qVar.c;
            f fVar3 = qVar.a;
            int i3 = rVar.i;
            if (rVar.isEmpty()) {
                int iOrdinal = zVar.ordinal();
                if (iOrdinal == 0) {
                    com.gamericefishpro.space.i.a.r(fVar3, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    com.gamericefishpro.space.i.a.r(fVar3, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    com.gamericefishpro.space.i.a.r(fVar3, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                com.gamericefishpro.space.i.a.r(fVar3, "SAVEPOINT '" + i3 + '\'');
            }
            rVar.addLast(new l(i3));
            Unit unit = Unit.a;
            fVar.b(null);
            return unit;
        } catch (Throwable th) {
            fVar.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(boolean z, com.gamericefishpro.space.vh.c cVar) {
        n nVar;
        q qVar;
        f fVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i = nVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                nVar.y = i - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.v;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = nVar.y;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            nVar.d = this;
            f fVar2 = this.a;
            nVar.e = fVar2;
            nVar.i = z;
            nVar.y = 1;
            if (fVar2.e.c(nVar) == aVar) {
                return aVar;
            }
            qVar = this;
            fVar = fVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = nVar.i;
            fVar = nVar.e;
            qVar = nVar.d;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        try {
            com.gamericefishpro.space.ph.r rVar = qVar.c;
            f fVar3 = qVar.a;
            if (rVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            l lVar = (l) c0.n(rVar);
            if (z) {
                lVar.getClass();
                if (rVar.isEmpty()) {
                    com.gamericefishpro.space.i.a.r(fVar3, "END TRANSACTION");
                } else {
                    com.gamericefishpro.space.i.a.r(fVar3, "RELEASE SAVEPOINT '" + lVar.a + '\'');
                }
            } else if (rVar.isEmpty()) {
                com.gamericefishpro.space.i.a.r(fVar3, "ROLLBACK TRANSACTION");
            } else {
                com.gamericefishpro.space.i.a.r(fVar3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + lVar.a + '\'');
            }
            Unit unit = Unit.a;
            fVar.b(null);
            return unit;
        } catch (Throwable th) {
            fVar.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(z zVar, Function2 function2, com.gamericefishpro.space.vh.c cVar) throws Throwable {
        o oVar;
        q qVar;
        q qVar2;
        int i;
        SQLException e;
        Throwable th;
        boolean z;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i2 = oVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.y = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objInvoke = oVar.v;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i3 = oVar.y;
        try {
            if (i3 == 0) {
                com.gamericefishpro.space.wa.b.P(objInvoke);
                if (zVar == null) {
                    zVar = z.d;
                }
                oVar.d = this;
                oVar.e = (Serializable) function2;
                oVar.y = 1;
                if (e(zVar, oVar) != aVar) {
                    qVar = this;
                }
                return aVar;
            }
            if (i3 == 1) {
                function2 = (Function2) oVar.e;
                qVar = (q) oVar.d;
                com.gamericefishpro.space.wa.b.P(objInvoke);
            } else {
                if (i3 != 2) {
                    if (i3 == 3 || i3 == 4) {
                        Object obj = oVar.d;
                        com.gamericefishpro.space.wa.b.P(objInvoke);
                        return obj;
                    }
                    if (i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) oVar.e;
                    th = (Throwable) oVar.d;
                    try {
                        com.gamericefishpro.space.wa.b.P(objInvoke);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        com.gamericefishpro.space.oh.c.a(th, e);
                        throw th;
                    }
                }
                i = oVar.i;
                qVar2 = (q) oVar.d;
                try {
                    com.gamericefishpro.space.wa.b.P(objInvoke);
                    z = i != 0;
                    oVar.d = objInvoke;
                    oVar.y = 3;
                    if (qVar2.f(z, oVar) != aVar) {
                        return aVar;
                    }
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    qVar = qVar2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        try {
                            oVar.d = th;
                            oVar.e = th3;
                            oVar.y = 5;
                            if (qVar.f(false, oVar) != aVar) {
                                throw th3;
                            }
                        } catch (SQLException e3) {
                            e = e3;
                            th = th3;
                            if (th != null) {
                                throw e;
                            }
                            com.gamericefishpro.space.oh.c.a(th, e);
                            throw th;
                        }
                    }
                }
            }
            k kVar = new k(0, qVar);
            oVar.d = qVar;
            oVar.e = null;
            oVar.i = 1;
            oVar.y = 2;
            objInvoke = function2.invoke(kVar, oVar);
            if (objInvoke != aVar) {
                qVar2 = qVar;
                i = 1;
                if (i != 0) {
                }
                oVar.d = objInvoke;
                oVar.y = 3;
                if (qVar2.f(z, oVar) != aVar) {
                    return objInvoke;
                }
            }
            return aVar;
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }
}
