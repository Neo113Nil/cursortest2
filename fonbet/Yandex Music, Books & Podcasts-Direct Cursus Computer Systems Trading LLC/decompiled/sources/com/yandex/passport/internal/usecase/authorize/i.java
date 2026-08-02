package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.internal.usecase.a3;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class i extends a3 {
    public final com.yandex.passport.data.network.token.s d;
    public final com.yandex.passport.internal.network.mappers.b e;
    public final com.yandex.passport.internal.credentials.g f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.k kVar, com.yandex.passport.internal.usecase.r rVar, com.yandex.passport.data.network.token.s sVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.credentials.g gVar) {
        super(aVar, kVar, rVar);
        aVar.getClass();
        kVar.getClass();
        rVar.getClass();
        sVar.getClass();
        bVar.getClass();
        gVar.getClass();
        this.d = sVar;
        this.e = bVar;
        this.f = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.internal.usecase.a3
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(g gVar, cg6 cg6Var) {
        h hVar;
        int i;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hVar.j;
                nm6 nm6Var = nm6.a;
                i = hVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.b bVar = gVar.b;
                    com.yandex.passport.internal.credentials.g gVar2 = this.f;
                    gVar2.getClass();
                    com.yandex.passport.internal.credentials.f w = com.yandex.plus.pay.ui.core.b.w(gVar2.a, bVar);
                    com.yandex.passport.common.core.b bVar2 = gVar.b;
                    this.e.getClass();
                    com.yandex.passport.data.network.token.n nVar = new com.yandex.passport.data.network.token.n(com.yandex.passport.internal.network.mappers.b.a(bVar2), gVar.a, w.c, w.d);
                    hVar.l = 1;
                    obj = this.d.g(nVar, hVar);
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
        hVar = new h(this, cg6Var);
        Object obj2 = hVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }
}
