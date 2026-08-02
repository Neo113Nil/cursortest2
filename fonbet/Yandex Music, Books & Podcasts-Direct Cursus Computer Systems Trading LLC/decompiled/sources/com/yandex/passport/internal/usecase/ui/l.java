package com.yandex.passport.internal.usecase.ui;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class l extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.usecase.r b;
    public final com.yandex.passport.data.network.token.y c;
    public final com.yandex.passport.internal.credentials.g d;
    public final com.yandex.passport.internal.network.mappers.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.r rVar, com.yandex.passport.data.network.token.y yVar, com.yandex.passport.internal.credentials.g gVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        rVar.getClass();
        yVar.getClass();
        gVar.getClass();
        bVar.getClass();
        this.b = rVar;
        this.c = yVar;
        this.d = gVar;
        this.e = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        if (r15 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r2 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(j jVar, cg6 cg6Var) {
        k kVar;
        int i;
        int i2;
        Object g;
        Throwable a;
        Object t7oVar;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i3 = kVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.n = i3 - Integer.MIN_VALUE;
                Object obj = kVar.l;
                nm6 nm6Var = nm6.a;
                i = kVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.b bVar = jVar.a;
                    com.yandex.passport.internal.credentials.g gVar = this.d;
                    gVar.getClass();
                    com.yandex.passport.internal.credentials.f w = com.yandex.plus.pay.ui.core.b.w(gVar.a, bVar);
                    com.yandex.passport.common.core.b bVar2 = jVar.a;
                    this.e.getClass();
                    com.yandex.passport.data.network.token.t tVar = new com.yandex.passport.data.network.token.t(com.yandex.passport.internal.network.mappers.b.a(bVar2), jVar.b, w.c, w.d);
                    kVar.j = jVar;
                    i2 = 0;
                    kVar.k = 0;
                    kVar.n = 1;
                    g = this.c.g(tVar, kVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        t7oVar = ((z7o) obj).a;
                        return new z7o(t7oVar);
                    }
                    int i4 = kVar.k;
                    j jVar2 = kVar.j;
                    qgg.h0(obj);
                    i2 = i4;
                    jVar = jVar2;
                    g = obj;
                }
                Object obj2 = ((z7o) g).a;
                a = z7o.a(obj2);
                if (a == null) {
                    t7oVar = new t7o(a);
                    return new z7o(t7oVar);
                }
                com.yandex.passport.internal.usecase.s sVar = new com.yandex.passport.internal.usecase.s(jVar.a, 0L, (com.yandex.passport.common.account.a) obj2, jVar.c, com.yandex.passport.internal.analytics.a.q);
                kVar.j = null;
                kVar.k = i2;
                kVar.n = 2;
                obj = this.b.g(sVar, kVar);
            }
        }
        kVar = new k(this, cg6Var);
        Object obj3 = kVar.l;
        nm6 nm6Var2 = nm6.a;
        i = kVar.n;
        if (i != 0) {
        }
        Object obj22 = ((z7o) g).a;
        a = z7o.a(obj22);
        if (a == null) {
        }
    }
}
