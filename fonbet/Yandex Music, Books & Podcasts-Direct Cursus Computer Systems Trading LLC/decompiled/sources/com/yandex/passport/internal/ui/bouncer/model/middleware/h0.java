package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.y1;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.eno;
import defpackage.nm6;
import defpackage.pd;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.x0q;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.z7o;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class h0 implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.usecase.s0 a;
    public final com.yandex.passport.internal.usecase.ui.b0 b;
    public final com.yandex.passport.internal.usecase.ui.e c;
    public final com.yandex.passport.internal.flags.i d;

    public h0(com.yandex.passport.internal.usecase.s0 s0Var, com.yandex.passport.internal.usecase.ui.b0 b0Var, com.yandex.passport.internal.usecase.ui.e eVar, com.yandex.passport.internal.flags.i iVar) {
        s0Var.getClass();
        b0Var.getClass();
        eVar.getClass();
        iVar.getClass();
        this.a = s0Var;
        this.b = b0Var;
        this.c = eVar;
        this.d = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h0 h0Var, com.yandex.passport.internal.ui.bouncer.model.j jVar, com.yandex.passport.internal.properties.l lVar, cg6 cg6Var) {
        g0 g0Var;
        int i;
        Throwable th;
        Object obj;
        wis e;
        com.yandex.passport.internal.l lVar2;
        Object t7oVar;
        try {
            if (cg6Var instanceof g0) {
                g0Var = (g0) cg6Var;
                int i2 = g0Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    g0Var.m = i2 - Integer.MIN_VALUE;
                    Object obj2 = g0Var.k;
                    Object obj3 = nm6.a;
                    i = g0Var.m;
                    if (i != 0) {
                        qgg.h0(obj2);
                        if (!((Boolean) h0Var.d.b(com.yandex.passport.internal.flags.o.q0)).booleanValue()) {
                            com.yandex.passport.internal.ui.bouncer.model.h hVar = jVar instanceof com.yandex.passport.internal.ui.bouncer.model.h ? (com.yandex.passport.internal.ui.bouncer.model.h) jVar : null;
                            if (hVar != null && (lVar2 = hVar.a) != null) {
                                return lVar2;
                            }
                            xq0.q("Can't handle member account.");
                            return null;
                        }
                        if (jVar instanceof com.yandex.passport.internal.ui.bouncer.model.h) {
                            com.yandex.passport.internal.l lVar3 = ((com.yandex.passport.internal.ui.bouncer.model.h) jVar).a;
                            com.yandex.passport.common.core.f fVar = lVar3.c;
                            if (fVar == null || lVar3.e.Z) {
                                return lVar3;
                            }
                            try {
                                r7o r7oVar = z7o.b;
                                com.yandex.passport.common.core.f fVar2 = lVar3.b;
                                g0Var.j = lVar3;
                                g0Var.m = 1;
                                obj2 = h0Var.c(lVar, fVar2, fVar, g0Var);
                                if (obj2 != obj3) {
                                    obj = lVar3;
                                }
                            } catch (wis e2) {
                                e = e2;
                                obj = lVar3;
                                r7o r7oVar2 = z7o.b;
                                t7oVar = new t7o(e);
                                if (!(t7oVar instanceof t7o)) {
                                }
                                return (com.yandex.passport.internal.l) obj;
                            } catch (Throwable th2) {
                                th = th2;
                                obj = lVar3;
                                r7o r7oVar3 = z7o.b;
                                t7oVar = new t7o(th);
                                if (!(t7oVar instanceof t7o)) {
                                }
                                return (com.yandex.passport.internal.l) obj;
                            }
                        } else {
                            if (!(jVar instanceof com.yandex.passport.internal.ui.bouncer.model.i)) {
                                b6e.s();
                                return null;
                            }
                            com.yandex.passport.internal.ui.bouncer.model.i iVar = (com.yandex.passport.internal.ui.bouncer.model.i) jVar;
                            com.yandex.passport.common.core.f fVar3 = iVar.a;
                            com.yandex.passport.common.core.f fVar4 = iVar.b;
                            g0Var.m = 2;
                            Object c = h0Var.c(lVar, fVar3, fVar4, g0Var);
                            if (c != obj3) {
                                return c;
                            }
                        }
                        return obj3;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return obj2;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = g0Var.j;
                    try {
                        qgg.h0(obj2);
                    } catch (wis e3) {
                        e = e3;
                        r7o r7oVar22 = z7o.b;
                        t7oVar = new t7o(e);
                        if (!(t7oVar instanceof t7o)) {
                        }
                        return (com.yandex.passport.internal.l) obj;
                    } catch (Throwable th3) {
                        th = th3;
                        r7o r7oVar32 = z7o.b;
                        t7oVar = new t7o(th);
                        if (!(t7oVar instanceof t7o)) {
                        }
                        return (com.yandex.passport.internal.l) obj;
                    }
                    t7oVar = (com.yandex.passport.internal.l) obj2;
                    r7o r7oVar4 = z7o.b;
                    if (!(t7oVar instanceof t7o)) {
                        obj = t7oVar;
                    }
                    return (com.yandex.passport.internal.l) obj;
                }
            }
            if (i != 0) {
            }
            t7oVar = (com.yandex.passport.internal.l) obj2;
            r7o r7oVar42 = z7o.b;
            if (!(t7oVar instanceof t7o)) {
            }
            return (com.yandex.passport.internal.l) obj;
        } catch (CancellationException e4) {
            throw e4;
        }
        g0Var = new g0(h0Var, cg6Var);
        Object obj22 = g0Var.k;
        Object obj32 = nm6.a;
        i = g0Var.m;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final eno a(x0q x0qVar, xdr xdrVar) {
        x0qVar.getClass();
        xdrVar.getClass();
        return pd.e0(new com.yandex.passport.internal.t(x0qVar, 9), xdrVar, new e0(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.passport.internal.properties.l lVar, com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2, cg6 cg6Var) {
        f0 f0Var;
        int i;
        com.yandex.passport.internal.properties.l lVar2;
        com.yandex.passport.common.core.f fVar3;
        com.yandex.passport.internal.l lVar3;
        com.yandex.passport.internal.properties.l lVar4;
        Throwable a;
        y1 y1Var;
        com.yandex.passport.common.core.f fVar4 = fVar2;
        if (cg6Var instanceof f0) {
            f0Var = (f0) cg6Var;
            int i2 = f0Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.p = i2 - Integer.MIN_VALUE;
                Object obj = f0Var.n;
                nm6 nm6Var = nm6.a;
                i = f0Var.p;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.ui.a0 a0Var = new com.yandex.passport.internal.usecase.ui.a0(fVar4);
                    lVar2 = lVar;
                    f0Var.j = lVar2;
                    f0Var.k = fVar;
                    f0Var.l = fVar4;
                    f0Var.p = 1;
                    obj = this.b.g(a0Var, f0Var);
                    if (obj != nm6Var) {
                        fVar3 = fVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lVar3 = f0Var.m;
                    com.yandex.passport.common.core.f fVar5 = f0Var.k;
                    lVar4 = f0Var.j;
                    qgg.h0(obj);
                    fVar3 = fVar5;
                    Object obj2 = ((z7o) obj).a;
                    a = z7o.a(obj2);
                    if (a != null) {
                        qgg.h0(obj2);
                        return obj2;
                    }
                    boolean z = a instanceof com.yandex.passport.data.exceptions.d;
                    if (z || (a instanceof com.yandex.passport.data.exceptions.c)) {
                        throw new b0(new com.yandex.passport.internal.ui.bouncer.model.g0(new com.yandex.passport.sloth.data.m(new com.yandex.passport.sloth.data.k0(lVar3.b, fVar3, lVar3.h(), z, (lVar4 == null || (y1Var = lVar4.e) == null) ? com.yandex.passport.sloth.data.o.c : com.yandex.plus.core.network.api.utils.a.S(y1Var)), fVar3.a, (com.yandex.passport.common.properties.a) null, 12)));
                    }
                    throw a;
                }
                fVar4 = f0Var.l;
                com.yandex.passport.common.core.f fVar6 = f0Var.k;
                com.yandex.passport.internal.properties.l lVar5 = f0Var.j;
                qgg.h0(obj);
                fVar3 = fVar6;
                lVar2 = lVar5;
                com.yandex.passport.common.core.f fVar7 = fVar4;
                lVar3 = (com.yandex.passport.internal.l) obj;
                if (lVar3 != null) {
                    throw new c0();
                }
                com.yandex.passport.common.core.f fVar8 = lVar3.b;
                com.yandex.passport.internal.usecase.ui.c cVar = new com.yandex.passport.internal.usecase.ui.c(fVar3, fVar7, fVar8, lVar3.d, fVar8.a, com.yandex.passport.internal.analytics.a.z, lVar3.h());
                f0Var.j = lVar2;
                f0Var.k = fVar3;
                f0Var.l = null;
                f0Var.m = lVar3;
                f0Var.p = 2;
                obj = this.c.g(cVar, f0Var);
                if (obj != nm6Var) {
                    lVar4 = lVar2;
                    Object obj22 = ((z7o) obj).a;
                    a = z7o.a(obj22);
                    if (a != null) {
                    }
                }
                return nm6Var;
            }
        }
        f0Var = new f0(this, cg6Var);
        Object obj3 = f0Var.n;
        nm6 nm6Var2 = nm6.a;
        i = f0Var.p;
        if (i != 0) {
        }
        com.yandex.passport.common.core.f fVar72 = fVar4;
        lVar3 = (com.yandex.passport.internal.l) obj3;
        if (lVar3 != null) {
        }
    }
}
