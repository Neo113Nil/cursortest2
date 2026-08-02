package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.internal.usecase.a3;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class f extends a3 {
    public final com.yandex.passport.data.network.token.f d;
    public final com.yandex.passport.internal.credentials.g e;
    public final com.yandex.passport.internal.network.mappers.b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.k kVar, com.yandex.passport.internal.usecase.r rVar, com.yandex.passport.data.network.token.f fVar, com.yandex.passport.internal.credentials.g gVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(aVar, kVar, rVar);
        aVar.getClass();
        kVar.getClass();
        rVar.getClass();
        fVar.getClass();
        gVar.getClass();
        bVar.getClass();
        this.d = fVar;
        this.e = gVar;
        this.f = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.internal.usecase.a3
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(d dVar, cg6 cg6Var) {
        e eVar;
        int i;
        com.yandex.passport.internal.credentials.f a;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.l = i2 - Integer.MIN_VALUE;
                Object obj = eVar.j;
                nm6 nm6Var = nm6.a;
                i = eVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.credentials.e eVar2 = dVar.c;
                    com.yandex.passport.internal.entities.f fVar = dVar.a;
                    if (eVar2 instanceof com.yandex.passport.internal.credentials.d) {
                        com.yandex.passport.internal.credentials.f fVar2 = ((com.yandex.passport.internal.credentials.d) eVar2).a;
                        fVar2.getClass();
                        String str = fVar2.a;
                        String str2 = fVar2.b;
                        str.getClass();
                        str2.getClass();
                        a = new com.yandex.passport.internal.credentials.f(str, str2);
                    } else {
                        a = this.e.a(fVar.a);
                    }
                    com.yandex.passport.common.core.b L = com.yandex.plus.core.network.api.utils.a.L(fVar.a);
                    this.f.getClass();
                    com.yandex.passport.data.network.token.a aVar = new com.yandex.passport.data.network.token.a(com.yandex.passport.internal.network.mappers.b.a(L), a.c, a.d, fVar.b, dVar.b);
                    eVar.l = 1;
                    obj = this.d.g(aVar, eVar);
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
        eVar = new e(this, cg6Var);
        Object obj2 = eVar.j;
        nm6 nm6Var2 = nm6.a;
        i = eVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }
}
