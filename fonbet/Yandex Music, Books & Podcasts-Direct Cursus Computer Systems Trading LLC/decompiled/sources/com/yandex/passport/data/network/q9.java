package com.yandex.passport.data.network;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class q9 implements com.yandex.passport.data.network.core.d {
    public final com.yandex.passport.data.network.core.t a;
    public final com.yandex.passport.data.network.core.l b;

    public q9(com.yandex.passport.data.network.core.t tVar, com.yandex.passport.data.network.core.l lVar) {
        tVar.getClass();
        lVar.getClass();
        this.a = tVar;
        this.b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o9 o9Var, cg6 cg6Var) {
        p9 p9Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof p9) {
            p9Var = (p9) cg6Var;
            int i2 = p9Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p9Var.m = i2 - Integer.MIN_VALUE;
                Object obj = p9Var.k;
                nm6 nm6Var = nm6.a;
                i = p9Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.a, o9Var.a).b, "/1/bundle/complete/commit_phonish_to_neophonish/");
                    k.F("Ya-Consumer-Authorization", "OAuth " + o9Var.b);
                    k.S("track_id", o9Var.c);
                    k.S("firstname", o9Var.d);
                    k.S("lastname", o9Var.e);
                    p9Var.j = k;
                    p9Var.m = 1;
                    if (this.b.b(k, p9Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = p9Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        p9Var = new p9(this, cg6Var);
        Object obj2 = p9Var.k;
        nm6 nm6Var2 = nm6.a;
        i = p9Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }
}
