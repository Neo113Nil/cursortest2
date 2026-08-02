package com.yandex.plus.home.graphql.plusstate;

import com.yandex.passport.sloth.ui.q;
import com.yandex.plus.core.openapi.a;
import com.yandex.plus.core.openapi.g;
import com.yandex.plus.home.datasource.openapi.apis.PlusStateControllerApi;
import com.yandex.plus.home.datasource.openapi.models.b6;
import com.yandex.plus.home.datasource.openapi.models.m4;
import com.yandex.plus.home.datasource.openapi.models.x;
import com.yandex.plus.home.datasource.openapi.models.y5;
import com.yandex.plus.home.internal.di.i;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.saf;
import defpackage.tf6;
import defpackage.ub7;
import defpackage.w2f;
import defpackage.x7j;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.z7o;
import defpackage.zsd;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class f {
    public final PlusStateControllerApi a;
    public final g b;
    public final com.yandex.plus.core.location.a c;
    public final i d;
    public final com.yandex.plus.core.dispatcher.b e;
    public final tf6 f;
    public final com.yandex.plus.core.analytics.logging.d g;
    public final xdr h;
    public final w2f i;

    public f(PlusStateControllerApi plusStateControllerApi, g gVar, com.yandex.plus.core.location.a aVar, i iVar, com.yandex.plus.core.dispatcher.b bVar, tf6 tf6Var, com.yandex.plus.core.analytics.logging.d dVar) {
        gVar.getClass();
        aVar.getClass();
        bVar.getClass();
        this.a = plusStateControllerApi;
        this.b = gVar;
        this.c = aVar;
        this.d = iVar;
        this.e = bVar;
        this.f = tf6Var;
        this.g = dVar;
        this.h = ydr.a(null);
        this.i = saf.p();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|(1:(1:9)(2:47|48))(2:49|(1:51)(1:52))|10|11|12|(2:14|(1:16)(2:37|38))(2:39|(1:41)(2:42|43))|17|(3:19|(1:(2:22|(1:24)(2:29|30))(1:31))(1:32)|25)(2:33|(2:35|36))|26|27))|53|6|(0)(0)|10|11|12|(0)(0)|17|(0)(0)|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006a, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        r7 = new com.yandex.plus.core.openapi.a.AbstractC0017a.c(r7.getB(), r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:12:0x004f, B:14:0x0053, B:16:0x005e, B:37:0x006c, B:38:0x0073, B:39:0x0074, B:42:0x0079, B:43:0x007e), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074 A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:12:0x004f, B:14:0x0053, B:16:0x005e, B:37:0x006c, B:38:0x0073, B:39:0x0074, B:42:0x0079, B:43:0x007e), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, cg6 cg6Var) {
        b bVar;
        int i;
        com.yandex.plus.core.openapi.f fVar2;
        com.yandex.plus.core.openapi.a aVar;
        Object cVar;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                Object obj = bVar.k;
                nm6 nm6Var = nm6.a;
                i = bVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    fVar.c.getClass();
                    m4 m4Var = new m4();
                    PlusStateControllerApi plusStateControllerApi = fVar.a;
                    com.yandex.plus.core.openapi.f fVar3 = com.yandex.plus.core.openapi.f.a;
                    bVar.j = fVar3;
                    bVar.m = 1;
                    obj = plusStateControllerApi.a(m4Var, bVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    fVar2 = fVar3;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar2 = bVar.j;
                    qgg.h0(obj);
                }
                aVar = (com.yandex.plus.core.openapi.a) obj;
                if (!(aVar instanceof a.b)) {
                    y5 y5Var = ((b6) ((a.b) aVar).a).b;
                    if (y5Var == null) {
                        throw new IllegalArgumentException("mapNotNullCatching failed!");
                    }
                    aVar = new a.b(y5Var, ((a.b) aVar).b);
                } else if (!(aVar instanceof a.AbstractC0017a)) {
                    throw new x7j();
                }
                g gVar = fVar.b;
                fVar2.getClass();
                gVar.getClass();
                gVar.a(aVar);
                if (!(aVar instanceof a.b)) {
                    a.b bVar2 = (a.b) aVar;
                    y5 y5Var2 = (y5) bVar2.a;
                    y5Var2.getClass();
                    x xVar = y5Var2.a;
                    com.yandex.plus.home.repository.api.model.plusstate.a aVar2 = new com.yandex.plus.home.repository.api.model.plusstate.a(xVar.a.doubleValue(), xVar.b.name());
                    int ordinal = y5Var2.b.ordinal();
                    if (ordinal == 0) {
                        cVar = new com.yandex.plus.home.repository.api.model.plusstate.c(aVar2);
                    } else if (ordinal == 1) {
                        cVar = new com.yandex.plus.home.repository.api.model.plusstate.d(aVar2);
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        cVar = new com.yandex.plus.home.repository.api.model.plusstate.b(aVar2);
                    }
                    aVar = new a.b(cVar, bVar2.b);
                } else if (!(aVar instanceof a.AbstractC0017a)) {
                    b6e.s();
                    return null;
                }
                return com.yandex.plus.core.openapi.c.a(aVar);
            }
        }
        bVar = new b(fVar, cg6Var);
        Object obj2 = bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar.m;
        if (i != 0) {
        }
        aVar = (com.yandex.plus.core.openapi.a) obj2;
        if (!(aVar instanceof a.b)) {
        }
        g gVar2 = fVar.b;
        fVar2.getClass();
        gVar2.getClass();
        gVar2.a(aVar);
        if (!(aVar instanceof a.b)) {
        }
        return com.yandex.plus.core.openapi.c.a(aVar);
    }

    public final Unit b() {
        xdr xdrVar;
        Object value;
        do {
            xdrVar = this.h;
            value = xdrVar.getValue();
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
            com.yandex.plus.core.analytics.logging.d dVar = this.g;
            if (dVar.b(aVar)) {
                dVar.a(aVar, "PlusStateRepositoryImpl", "clearCache()", null);
            }
            saf.E(this.i);
        } while (!xdrVar.k(value, null));
        return Unit.a;
    }

    public final com.yandex.plus.home.repository.api.model.plusstate.f c() {
        com.yandex.plus.home.repository.api.model.plusstate.f fVar;
        Object obj;
        com.yandex.plus.home.repository.api.model.f fVar2 = (com.yandex.plus.home.repository.api.model.f) this.h.getValue();
        if (fVar2 != null) {
            if (!(fVar2 instanceof com.yandex.plus.home.repository.api.model.c)) {
                if (fVar2 instanceof com.yandex.plus.home.repository.api.model.e) {
                    obj = ((com.yandex.plus.home.repository.api.model.e) fVar2).a;
                    fVar = (com.yandex.plus.home.repository.api.model.plusstate.f) obj;
                } else if (!(fVar2 instanceof com.yandex.plus.home.repository.api.model.b)) {
                    b6e.s();
                    return null;
                }
            }
            obj = null;
            fVar = (com.yandex.plus.home.repository.api.model.plusstate.f) obj;
        } else {
            fVar = null;
        }
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.core.analytics.logging.d dVar = this.g;
        if (dVar.b(aVar)) {
            dVar.a(aVar, "PlusStateRepositoryImpl", "getCurrentPlusState(): " + fVar, null);
        }
        return fVar;
    }

    public final pjc d() {
        ub7 ub7Var = new ub7(12, zsd.b0(new com.yandex.passport.common.mvi.d(this.h, this, 17)), new q(this, null, 10));
        ((com.yandex.plus.core.dispatcher.a) this.e).getClass();
        return zsd.k0(ub7Var, com.yandex.plus.core.dispatcher.a.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        c cVar;
        int i;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ((com.yandex.plus.core.dispatcher.a) this.e).getClass();
                    mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                    com.yandex.plus.home.feature.webviews.internal.treasury.d dVar = new com.yandex.plus.home.feature.webviews.internal.treasury.d(this, null, 3);
                    cVar.l = 1;
                    obj = x97.V(mn7Var, dVar, cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }
}
