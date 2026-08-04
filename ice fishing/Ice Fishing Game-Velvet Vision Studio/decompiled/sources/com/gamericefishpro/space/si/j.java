package com.gamericefishpro.space.si;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e {
    public final /* synthetic */ e d;
    public final /* synthetic */ com.gamericefishpro.space.vh.i e;

    /* JADX WARN: Multi-variable type inference failed */
    public j(e eVar, com.gamericefishpro.space.di.c cVar) {
        this.d = eVar;
        this.e = (com.gamericefishpro.space.vh.i) cVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.gamericefishpro.space.di.c, com.gamericefishpro.space.vh.i] */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.gamericefishpro.space.di.c, com.gamericefishpro.space.vh.i] */
    @Override // com.gamericefishpro.space.si.e
    public final Object a(f fVar, com.gamericefishpro.space.th.a aVar) throws Throwable {
        i iVar;
        j jVar;
        p0 p0Var;
        ?? r2;
        com.gamericefishpro.space.ti.t tVar;
        Throwable th;
        com.gamericefishpro.space.ti.t tVar2;
        ?? r9;
        if (aVar instanceof i) {
            iVar = (i) aVar;
            int i = iVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.e = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, aVar);
            }
        } else {
            iVar = new i(this, aVar);
        }
        Object obj = iVar.d;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = iVar.e;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            try {
                e eVar = this.d;
                iVar.v = this;
                iVar.w = fVar;
                iVar.e = 1;
                if (eVar.a(fVar, iVar) != aVar2) {
                    jVar = this;
                    tVar = new com.gamericefishpro.space.ti.t(fVar, iVar.getContext());
                    r9 = jVar.e;
                    iVar.v = tVar;
                    iVar.w = null;
                    iVar.e = 3;
                    if (r9.a(tVar, null, iVar) != aVar2) {
                        tVar2 = tVar;
                        tVar2.releaseIntercepted();
                        return Unit.a;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                jVar = this;
                p0Var = new p0(th);
                r2 = jVar.e;
                iVar.v = th;
                iVar.w = null;
                iVar.e = 2;
                if (e0.c(p0Var, r2, th, iVar) == aVar2) {
                    throw th;
                }
            }
            return aVar2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Throwable th3 = (Throwable) iVar.v;
                com.gamericefishpro.space.wa.b.P(obj);
                throw th3;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar2 = (com.gamericefishpro.space.ti.t) iVar.v;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
                tVar2.releaseIntercepted();
                return Unit.a;
            } catch (Throwable th4) {
                th = th4;
                tVar2.releaseIntercepted();
                throw th;
            }
        }
        fVar = iVar.w;
        jVar = (j) iVar.v;
        try {
            com.gamericefishpro.space.wa.b.P(obj);
            tVar = new com.gamericefishpro.space.ti.t(fVar, iVar.getContext());
            try {
                r9 = jVar.e;
                iVar.v = tVar;
                iVar.w = null;
                iVar.e = 3;
                if (r9.a(tVar, null, iVar) != aVar2) {
                    tVar2 = tVar;
                    tVar2.releaseIntercepted();
                    return Unit.a;
                }
            } catch (Throwable th5) {
                th = th5;
                tVar2 = tVar;
                tVar2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            p0Var = new p0(th);
            r2 = jVar.e;
            iVar.v = th;
            iVar.w = null;
            iVar.e = 2;
            if (e0.c(p0Var, r2, th, iVar) == aVar2) {
                throw th;
            }
        }
        return aVar2;
    }
}
