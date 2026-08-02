package com.yandex.passport.data.network;

import defpackage.cg6;
import defpackage.itv;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t9f;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class pa extends com.yandex.passport.data.network.core.b {
    public final com.yandex.passport.internal.network.b f;
    public final ka g;
    public final com.yandex.passport.data.network.core.x h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pa(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, ka kaVar, com.yandex.passport.data.network.core.x xVar) {
        super(aVar, bVar, j0Var, new com.yandex.passport.common.network.n(r0, com.yandex.passport.common.network.u.Companion.serializer()), new com.yandex.passport.common.core.a(27));
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        kaVar.getClass();
        xVar.getClass();
        t9f serializer = na.Companion.serializer();
        serializer.getClass();
        this.f = bVar;
        this.g = kaVar;
        this.h = xVar;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(ia iaVar, cg6 cg6Var) {
        oa oaVar;
        int i;
        if (cg6Var instanceof oa) {
            oaVar = (oa) cg6Var;
            int i2 = oaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = oaVar.j;
                nm6 nm6Var = nm6.a;
                i = oaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.data.network.core.v vVar = new com.yandex.passport.data.network.core.v(iaVar, "SendAuthToTrackRequest", new itv(19, this, iaVar));
                    oaVar.l = 1;
                    obj = this.h.g(vVar, oaVar);
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
                this.f.b(((z7o) obj).a, com.yandex.passport.data.network.core.m.c);
                return obj;
            }
        }
        oaVar = new oa(this, cg6Var);
        Object obj2 = oaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = oaVar.l;
        if (i != 0) {
        }
        this.f.b(((z7o) obj2).a, com.yandex.passport.data.network.core.m.c);
        return obj2;
    }
}
