package com.yandex.plus.home.graphql.user;

import com.yandex.passport.data.network.l;
import com.yandex.passport.sloth.ui.q;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.api.prefetch.j;
import com.yandex.plus.home.internal.di.i;
import com.yandex.plus.home.internal.di.k;
import defpackage.cg6;
import defpackage.dp0;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.saf;
import defpackage.tf6;
import defpackage.ub7;
import defpackage.w2f;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.z7o;
import defpackage.zsd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class e {
    public final dp0 a;
    public final i b;
    public final com.yandex.plus.core.dispatcher.b c;
    public final tf6 d;
    public final com.yandex.plus.core.analytics.logging.d e;
    public final f f;
    public final a1 g;
    public final xdr h;
    public final w2f i;

    public e(dp0 dp0Var, i iVar, k kVar, com.yandex.plus.core.dispatcher.b bVar, tf6 tf6Var, com.yandex.plus.core.analytics.logging.d dVar) {
        dp0Var.getClass();
        bVar.getClass();
        this.a = dp0Var;
        this.b = iVar;
        this.c = bVar;
        this.d = tf6Var;
        this.e = dVar;
        this.f = new f(29, new l(kVar), kVar);
        this.g = new a1(25);
        this.h = ydr.a(null);
        this.i = saf.p();
    }

    public final Unit a() {
        xdr xdrVar;
        Object value;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.core.analytics.logging.d dVar = this.e;
        if (dVar.b(aVar)) {
            dVar.a(aVar, "GraphQLUserRepository", "clearCache()", null);
        }
        do {
            xdrVar = this.h;
            value = xdrVar.getValue();
            saf.E(this.i);
        } while (!xdrVar.k(value, null));
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        a aVar;
        int i;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ((com.yandex.plus.core.dispatcher.a) this.c).getClass();
                    mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                    j jVar = new j(this, (Continuation) null, 14);
                    aVar.l = 1;
                    obj = x97.V(mn7Var, jVar, aVar);
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
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    public final pjc c() {
        ub7 ub7Var = new ub7(12, zsd.b0(new com.yandex.passport.common.mvi.d(this.h, this, 18)), new q(this, null, 11));
        ((com.yandex.plus.core.dispatcher.a) this.c).getClass();
        return zsd.k0(ub7Var, com.yandex.plus.core.dispatcher.a.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
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
                    ((com.yandex.plus.core.dispatcher.a) this.c).getClass();
                    mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                    com.yandex.plus.home.feature.webviews.internal.treasury.d dVar = new com.yandex.plus.home.feature.webviews.internal.treasury.d(this, null, 4);
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
