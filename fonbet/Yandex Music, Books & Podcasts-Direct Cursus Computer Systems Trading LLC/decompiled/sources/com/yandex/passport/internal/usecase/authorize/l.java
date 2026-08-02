package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.data.network.token.i0;
import com.yandex.passport.data.network.token.n0;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.usecase.a3;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class l extends a3 {
    public final n0 d;
    public final f1 e;
    public final com.yandex.passport.internal.credentials.g f;
    public final com.yandex.passport.internal.network.mappers.b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.k kVar, com.yandex.passport.internal.usecase.r rVar, n0 n0Var, f1 f1Var, com.yandex.passport.internal.credentials.g gVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(aVar, kVar, rVar);
        aVar.getClass();
        kVar.getClass();
        rVar.getClass();
        n0Var.getClass();
        f1Var.getClass();
        gVar.getClass();
        bVar.getClass();
        this.d = n0Var;
        this.e = f1Var;
        this.f = gVar;
        this.g = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.yandex.passport.internal.usecase.a3
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(j jVar, cg6 cg6Var) {
        k kVar;
        int i;
        Object obj;
        Throwable a;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = kVar.k;
                nm6 nm6Var = nm6.a;
                i = kVar.m;
                f1 f1Var = this.e;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.internal.entities.t tVar = jVar.a;
                    f1Var.y(null, tVar.a, "by_track_id");
                    com.yandex.passport.internal.credentials.f b = this.f.b(jVar.b);
                    com.yandex.passport.common.core.b L = com.yandex.plus.core.network.api.utils.a.L(tVar.b);
                    this.g.getClass();
                    i0 i0Var = new i0(com.yandex.passport.internal.network.mappers.b.a(L), tVar.a, b.c, b.d);
                    kVar.j = jVar;
                    kVar.m = 1;
                    obj2 = this.d.g(i0Var, kVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jVar = kVar.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                a = z7o.a(obj);
                if (a != null) {
                    this.e.v(jVar.a.a, 0L, "by_track_id", String.valueOf(a.getMessage()));
                }
                if (!(obj instanceof t7o)) {
                    f1Var.x(0L, jVar.a.a, "by_track_id");
                }
                return obj;
            }
        }
        kVar = new k(this, cg6Var);
        Object obj22 = kVar.k;
        nm6 nm6Var2 = nm6.a;
        i = kVar.m;
        f1 f1Var2 = this.e;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        a = z7o.a(obj);
        if (a != null) {
        }
        if (!(obj instanceof t7o)) {
        }
        return obj;
    }
}
