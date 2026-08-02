package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.data.models.w;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.h1;
import com.yandex.passport.internal.usecase.t1;
import com.yandex.passport.internal.usecase.u1;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class o extends com.yandex.passport.common.domain.a {
    public final u1 b;
    public final com.yandex.passport.data.network.m c;
    public final com.yandex.passport.internal.report.reporters.h d;
    public final x e;
    public final com.yandex.passport.internal.network.mappers.b f;
    public final com.yandex.passport.internal.network.mappers.a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.yandex.passport.common.coroutine.a aVar, u1 u1Var, com.yandex.passport.data.network.m mVar, com.yandex.passport.internal.report.reporters.h hVar, x xVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.network.mappers.a aVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        u1Var.getClass();
        mVar.getClass();
        hVar.getClass();
        xVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this.b = u1Var;
        this.c = mVar;
        this.d = hVar;
        this.e = xVar;
        this.f = bVar;
        this.g = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e7, code lost:
    
        if (r2 == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e9, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (r2 == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(m mVar, cg6 cg6Var) {
        n nVar;
        int i;
        int i2;
        Object obj;
        m mVar2 = mVar;
        if (cg6Var instanceof n) {
            nVar = (n) cg6Var;
            int i3 = nVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.n = i3 - Integer.MIN_VALUE;
                Object obj2 = nVar.l;
                nm6 nm6Var = nm6.a;
                i = nVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.common.core.b bVar = mVar2.a;
                    com.yandex.passport.internal.credentials.f b = this.e.b(bVar);
                    if (b == null) {
                        throw new com.yandex.passport.api.exception.h(com.yandex.plus.core.network.api.utils.a.P(bVar));
                    }
                    String str = mVar2.b;
                    com.yandex.passport.internal.report.reporters.h hVar = this.d;
                    hVar.getClass();
                    str.getClass();
                    i2 = 0;
                    hVar.n(h1.d, new ff(str, 14));
                    com.yandex.passport.common.core.b bVar2 = mVar2.a;
                    this.f.getClass();
                    com.yandex.passport.data.network.e eVar = new com.yandex.passport.data.network.e(com.yandex.passport.internal.network.mappers.b.a(bVar2), mVar2.b, mVar2.c, mVar2.d, b.c, mVar2.e.a);
                    nVar.j = mVar2;
                    nVar.k = 0;
                    nVar.n = 1;
                    obj2 = this.c.g(eVar, nVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        obj = (com.yandex.passport.internal.l) obj2;
                        r7o r7oVar = z7o.b;
                        return new z7o(obj);
                    }
                    int i4 = nVar.k;
                    m mVar3 = nVar.j;
                    qgg.h0(obj2);
                    i2 = i4;
                    mVar2 = mVar3;
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    r7o r7oVar2 = z7o.b;
                    com.yandex.passport.data.models.c cVar = (com.yandex.passport.data.models.c) obj;
                    com.yandex.passport.common.core.b bVar3 = mVar2.a;
                    com.yandex.passport.internal.network.mappers.a aVar = this.g;
                    aVar.getClass();
                    cVar.getClass();
                    com.yandex.passport.common.account.a aVar2 = cVar.a;
                    com.yandex.passport.data.mapper.a aVar3 = aVar.a;
                    w wVar = cVar.b;
                    aVar3.getClass();
                    com.yandex.passport.common.core.g a = com.yandex.passport.data.mapper.a.a(wVar);
                    com.yandex.passport.data.models.e eVar2 = cVar.c;
                    t1 t1Var = new t1(bVar3, new com.yandex.passport.internal.network.response.c(aVar2, a, eVar2 != null ? new com.yandex.passport.internal.entities.e(eVar2.a, eVar2.b) : null), mVar2.e);
                    nVar.j = null;
                    nVar.k = i2;
                    nVar.n = 2;
                    obj2 = this.b.g(t1Var, nVar);
                }
                return new z7o(obj);
            }
        }
        nVar = new n(this, cg6Var);
        Object obj22 = nVar.l;
        nm6 nm6Var2 = nm6.a;
        i = nVar.n;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        return new z7o(obj);
    }
}
