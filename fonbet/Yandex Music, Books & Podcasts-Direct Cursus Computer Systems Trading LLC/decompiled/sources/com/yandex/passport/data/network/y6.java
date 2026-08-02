package com.yandex.passport.data.network;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class y6 extends com.yandex.passport.data.network.core.b {
    public final com.yandex.passport.internal.network.b f;
    public final g g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(com.yandex.passport.common.core.a aVar, com.yandex.passport.common.core.a aVar2, com.yandex.passport.common.coroutine.a aVar3, com.yandex.passport.common.network.j0 j0Var, g gVar, com.yandex.passport.internal.network.b bVar) {
        super(aVar3, bVar, j0Var, aVar, aVar2);
        aVar3.getClass();
        j0Var.getClass();
        bVar.getClass();
        gVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f = bVar;
        this.g = gVar;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.b
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(s6 s6Var, cg6 cg6Var) {
        x6 x6Var;
        int i;
        if (cg6Var instanceof x6) {
            x6Var = (x6) cg6Var;
            int i2 = x6Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x6Var.l = i2 - Integer.MIN_VALUE;
                Object obj = x6Var.j;
                nm6 nm6Var = nm6.a;
                i = x6Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    x6Var.l = 1;
                    obj = com.yandex.passport.data.network.core.b.w(this, s6Var, x6Var);
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
                this.f.b(((z7o) obj).a, com.yandex.passport.data.network.core.m.d);
                return obj;
            }
        }
        x6Var = new x6(this, cg6Var);
        Object obj2 = x6Var.j;
        nm6 nm6Var2 = nm6.a;
        i = x6Var.l;
        if (i != 0) {
        }
        this.f.b(((z7o) obj2).a, com.yandex.passport.data.network.core.m.d);
        return obj2;
    }
}
