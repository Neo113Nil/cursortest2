package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.usecase.a3;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class c extends a3 {
    public final com.yandex.passport.data.network.token.m d;
    public final f1 e;
    public final com.yandex.passport.internal.credentials.g f;
    public final com.yandex.passport.internal.network.mappers.b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.k kVar, com.yandex.passport.internal.usecase.r rVar, com.yandex.passport.data.network.token.m mVar, f1 f1Var, com.yandex.passport.internal.credentials.g gVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(aVar, kVar, rVar);
        aVar.getClass();
        kVar.getClass();
        rVar.getClass();
        mVar.getClass();
        f1Var.getClass();
        gVar.getClass();
        bVar.getClass();
        this.d = mVar;
        this.e = f1Var;
        this.f = gVar;
        this.g = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.yandex.passport.internal.usecase.a3
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(a aVar, cg6 cg6Var) {
        b bVar;
        int i;
        Object obj;
        Throwable a;
        a aVar2 = aVar;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.k;
                nm6 nm6Var = nm6.a;
                i = bVar.m;
                f1 f1Var = this.e;
                if (i != 0) {
                    qgg.h0(obj2);
                    String str = aVar2.c;
                    com.yandex.passport.internal.entities.h hVar = aVar2.a;
                    f1Var.y(new Long(aVar2.d), str, "by_cookie");
                    com.yandex.passport.internal.credentials.f b = this.f.b(aVar2.e);
                    String str2 = hVar.e;
                    if (str2 == null && (str2 = hVar.e()) == null) {
                        xq0.q("missed sessionid for cookies");
                        return null;
                    }
                    String str3 = str2;
                    com.yandex.passport.common.core.b L = com.yandex.plus.core.network.api.utils.a.L(hVar.a);
                    this.g.getClass();
                    com.yandex.passport.data.network.token.g gVar = new com.yandex.passport.data.network.token.g(com.yandex.passport.internal.network.mappers.b.a(L), hVar.d(), str3, aVar2.c, aVar2.d, b.c, b.d);
                    bVar.j = aVar2;
                    bVar.m = 1;
                    obj2 = this.d.g(gVar, bVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = bVar.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    f1Var.x(aVar2.d, aVar2.c, "by_cookie");
                }
                a = z7o.a(obj);
                if (a != null) {
                    this.e.v(aVar2.c, aVar2.d, "by_cookie", String.valueOf(a.getMessage()));
                }
                return obj;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj22 = bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar.m;
        f1 f1Var2 = this.e;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return obj;
    }
}
