package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.data.network.ea;
import com.yandex.passport.data.network.y9;
import com.yandex.passport.data.network.z9;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class m0 extends com.yandex.passport.common.domain.a {
    public final ea b;
    public final com.yandex.passport.internal.network.mappers.b c;
    public final com.yandex.passport.data.mapper.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.yandex.passport.common.coroutine.a aVar, ea eaVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.data.mapper.a aVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        eaVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this.b = eaVar;
        this.c = bVar;
        this.d = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(k0 k0Var, cg6 cg6Var) {
        l0 l0Var;
        int i;
        Object obj;
        if (cg6Var instanceof l0) {
            l0Var = (l0) cg6Var;
            int i2 = l0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l0Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = l0Var.k;
                nm6 nm6Var = nm6.a;
                i = l0Var.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.common.core.b bVar = k0Var.a;
                    this.c.getClass();
                    y9 y9Var = new y9(com.yandex.passport.internal.network.mappers.b.a(bVar), k0Var.b);
                    l0Var.j = k0Var;
                    l0Var.m = 1;
                    obj2 = this.b.g(y9Var, l0Var);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k0Var = l0Var.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    r7o r7oVar = z7o.b;
                    z9 z9Var = (z9) obj;
                    String str = z9Var.b;
                    if (str == null || str.length() <= 0 || str.equals("-")) {
                        str = null;
                    }
                    com.yandex.passport.common.account.a aVar = new com.yandex.passport.common.account.a(str);
                    String str2 = z9Var.c;
                    com.yandex.passport.internal.entities.e eVar = str2 != null ? new com.yandex.passport.internal.entities.e(str2, k0Var.c) : null;
                    com.yandex.passport.data.models.w wVar = z9Var.d;
                    this.d.getClass();
                    obj = new com.yandex.passport.internal.network.response.c(aVar, com.yandex.passport.data.mapper.a.a(wVar), eVar);
                }
                return new z7o(obj);
            }
        }
        l0Var = new l0(this, cg6Var);
        Object obj22 = l0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = l0Var.m;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        return new z7o(obj);
    }
}
