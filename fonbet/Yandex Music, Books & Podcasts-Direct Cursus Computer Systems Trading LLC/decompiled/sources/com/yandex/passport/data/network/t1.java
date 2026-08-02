package com.yandex.passport.data.network;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class t1 extends com.yandex.passport.data.network.core.h {
    public final com.yandex.passport.internal.network.b i;
    public final g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, g gVar, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, bVar, j0Var, r1.Companion.serializer(), sVar, "DeviceAuthorizationCommitRequest");
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        gVar.getClass();
        sVar.getClass();
        this.i = bVar;
        this.j = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.o
    /* renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(n1 n1Var, cg6 cg6Var) {
        s1 s1Var;
        int i;
        if (cg6Var instanceof s1) {
            s1Var = (s1) cg6Var;
            int i2 = s1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = s1Var.j;
                nm6 nm6Var = nm6.a;
                i = s1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    s1Var.l = 1;
                    obj = com.yandex.passport.data.network.core.o.y(this, n1Var, s1Var);
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
                this.i.b(((z7o) obj).a, com.yandex.passport.data.network.core.m.a);
                return obj;
            }
        }
        s1Var = new s1(this, cg6Var);
        Object obj2 = s1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = s1Var.l;
        if (i != 0) {
        }
        this.i.b(((z7o) obj2).a, com.yandex.passport.data.network.core.m.a);
        return obj2;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.j;
    }
}
