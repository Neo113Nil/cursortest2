package com.yandex.passport.data.network;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c1 implements com.yandex.passport.data.network.core.d {
    public final com.yandex.passport.data.network.core.t a;
    public final com.yandex.passport.data.network.core.l b;

    public c1(com.yandex.passport.data.network.core.t tVar, com.yandex.passport.data.network.core.l lVar) {
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
    public final Object a(a1 a1Var, cg6 cg6Var) {
        b1 b1Var;
        int i;
        com.yandex.passport.common.network.n nVar;
        if (cg6Var instanceof b1) {
            b1Var = (b1) cg6Var;
            int i2 = b1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = b1Var.k;
                nm6 nm6Var = nm6.a;
                i = b1Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.n nVar2 = new com.yandex.passport.common.network.n((String) com.appsflyer.internal.k.j(a1Var.c, this.a, a1Var.b).b, 0);
                    nVar2.J("/1/bundle/complete/status/");
                    nVar2.F("Ya-Consumer-Authorization", "OAuth ".concat(a1Var.a.e()));
                    String str = a1Var.d;
                    if (str != null) {
                        nVar2.O(CommonUrlParts.LOCALE, str);
                    }
                    long j = a1Var.e;
                    com.yandex.passport.common.time.a aVar = new com.yandex.passport.common.time.a(j);
                    if (Intrinsics.f(j, 0L) <= 0) {
                        aVar = null;
                    }
                    if (aVar != null) {
                        nVar2.O("completion_postponed_at", String.valueOf(aVar.a / 1000));
                    }
                    b1Var.j = nVar2;
                    b1Var.m = 1;
                    if (this.b.b(nVar2, b1Var) == nm6Var) {
                        return nm6Var;
                    }
                    nVar = nVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = b1Var.j;
                    qgg.h0(obj);
                }
                return nVar.z();
            }
        }
        b1Var = new b1(this, cg6Var);
        Object obj2 = b1Var.k;
        nm6 nm6Var2 = nm6.a;
        i = b1Var.m;
        if (i != 0) {
        }
        return nVar.z();
    }
}
