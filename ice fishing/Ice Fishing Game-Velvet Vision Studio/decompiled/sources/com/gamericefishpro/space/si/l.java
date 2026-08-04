package com.gamericefishpro.space.si;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements e {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    @Override // com.gamericefishpro.space.si.e
    public final Object a(f fVar, com.gamericefishpro.space.th.a aVar) throws Throwable {
        k kVar;
        Throwable th;
        com.gamericefishpro.space.ti.t tVar;
        l lVar;
        f fVar2;
        e eVar;
        o oVar;
        com.gamericefishpro.space.b0.n nVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (aVar instanceof k) {
                    kVar = (k) aVar;
                    int i = kVar.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kVar.e = i - Integer.MIN_VALUE;
                    } else {
                        kVar = new k(this, aVar);
                    }
                } else {
                    kVar = new k(this, aVar);
                }
                Object obj = kVar.d;
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = kVar.e;
                if (i2 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.ti.t tVar2 = new com.gamericefishpro.space.ti.t(fVar, kVar.getContext());
                    try {
                        com.gamericefishpro.space.l4.m mVar = (com.gamericefishpro.space.l4.m) this.e;
                        kVar.v = this;
                        kVar.w = fVar;
                        kVar.y = tVar2;
                        kVar.e = 1;
                        if (mVar.invoke(tVar2, kVar) == aVar2) {
                            return aVar2;
                        }
                        lVar = this;
                        fVar2 = fVar;
                        tVar = tVar2;
                        tVar.releaseIntercepted();
                        eVar = (e) lVar.i;
                        kVar.v = null;
                        kVar.w = null;
                        kVar.y = null;
                        kVar.e = 2;
                        if (eVar.a(fVar2, kVar) == aVar2) {
                            return aVar2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        tVar = tVar2;
                        tVar.releaseIntercepted();
                        throw th;
                    }
                } else if (i2 == 1) {
                    tVar = kVar.y;
                    fVar2 = kVar.w;
                    lVar = kVar.v;
                    try {
                        com.gamericefishpro.space.wa.b.P(obj);
                        tVar.releaseIntercepted();
                        eVar = (e) lVar.i;
                        kVar.v = null;
                        kVar.w = null;
                        kVar.y = null;
                        kVar.e = 2;
                        if (eVar.a(fVar2, kVar) == aVar2) {
                            return aVar2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        tVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 1:
                if (aVar instanceof o) {
                    oVar = (o) aVar;
                    int i3 = oVar.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        oVar.e = i3 - Integer.MIN_VALUE;
                    } else {
                        oVar = new o(this, aVar);
                    }
                } else {
                    oVar = new o(this, aVar);
                }
                Object obj2 = oVar.d;
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i4 = oVar.e;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = oVar.v;
                    try {
                        com.gamericefishpro.space.wa.b.P(obj2);
                    } catch (com.gamericefishpro.space.ti.a e) {
                        e = e;
                        if (e.d == nVar) {
                            throw e;
                        }
                        com.gamericefishpro.space.pi.a0.j(oVar.getContext());
                    }
                    break;
                } else {
                    com.gamericefishpro.space.wa.b.P(obj2);
                    l lVar2 = (l) this.e;
                    com.gamericefishpro.space.b0.n nVar2 = new com.gamericefishpro.space.b0.n(4, (com.gamericefishpro.space.c7.f) this.i, fVar);
                    try {
                        oVar.v = nVar2;
                        oVar.e = 1;
                        if (lVar2.a(nVar2, oVar) == aVar3) {
                            return aVar3;
                        }
                    } catch (com.gamericefishpro.space.ti.a e2) {
                        e = e2;
                        nVar = nVar2;
                        if (e.d == nVar) {
                            throw e;
                        }
                        com.gamericefishpro.space.pi.a0.j(oVar.getContext());
                    }
                }
                return Unit.a;
            default:
                Object objA = com.gamericefishpro.space.ti.c.a(new q((com.gamericefishpro.space.th.a) null, (com.gamericefishpro.space.s7.f) this.i), fVar, aVar, (e[]) this.e);
                return objA == com.gamericefishpro.space.uh.a.d ? objA : Unit.a;
        }
    }
}
