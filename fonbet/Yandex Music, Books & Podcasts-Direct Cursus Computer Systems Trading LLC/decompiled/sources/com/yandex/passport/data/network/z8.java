package com.yandex.passport.data.network;

import com.connectsdk.service.airplay.PListParser;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class z8 implements com.yandex.passport.data.network.core.d {
    public final com.yandex.passport.data.network.core.t a;
    public final com.yandex.passport.data.network.core.l b;

    public z8(com.yandex.passport.data.network.core.t tVar, com.yandex.passport.data.network.core.l lVar) {
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
    public final Object a(x8 x8Var, cg6 cg6Var) {
        y8 y8Var;
        int i;
        com.yandex.passport.common.network.n nVar;
        if (cg6Var instanceof y8) {
            y8Var = (y8) cg6Var;
            int i2 = y8Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y8Var.m = i2 - Integer.MIN_VALUE;
                Object obj = y8Var.k;
                nm6 nm6Var = nm6.a;
                i = y8Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.n nVar2 = new com.yandex.passport.common.network.n((String) com.appsflyer.internal.k.j(x8Var.c, this.a, x8Var.b).b, 0);
                    nVar2.J("/1/bundle/account/short_info/");
                    nVar2.F("Authorization", "OAuth " + x8Var.a.a);
                    nVar2.F("If-None-Match", x8Var.e);
                    nVar2.O("language", x8Var.d);
                    nVar2.O("avatar_size", "islands-300");
                    nVar2.O("need_children", PListParser.TAG_TRUE);
                    nVar2.O("need_completion_status", PListParser.TAG_TRUE);
                    y8Var.j = nVar2;
                    y8Var.m = 1;
                    if (this.b.b(nVar2, y8Var) == nm6Var) {
                        return nm6Var;
                    }
                    nVar = nVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = y8Var.j;
                    qgg.h0(obj);
                }
                return nVar.z();
            }
        }
        y8Var = new y8(this, cg6Var);
        Object obj2 = y8Var.k;
        nm6 nm6Var2 = nm6.a;
        i = y8Var.m;
        if (i != 0) {
        }
        return nVar.z();
    }
}
