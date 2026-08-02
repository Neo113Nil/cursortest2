package com.yandex.plus.pay.internal.feature.user;

import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import defpackage.btf;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.rqi;
import defpackage.xq0;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class f {
    public final ExternalMediaBillingApi a;
    public final com.yandex.plus.pay.log.impl.b b;
    public final qqi c;

    public f(com.yandex.plus.domain.auth.impl.i iVar, ExternalMediaBillingApi externalMediaBillingApi, kotlinx.coroutines.a aVar, com.yandex.plus.pay.log.impl.b bVar) {
        externalMediaBillingApi.getClass();
        aVar.getClass();
        bVar.getClass();
        this.a = externalMediaBillingApi;
        this.b = bVar;
        btf.b(new com.yandex.plus.pay.internal.di.g(16));
        this.c = rqi.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        e eVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof e) {
                eVar = (e) cg6Var;
                int i2 = eVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = eVar.k;
                    nm6 nm6Var = nm6.a;
                    i = eVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar2 = this.c;
                        eVar.j = qqiVar2;
                        eVar.m = 1;
                        if (qqiVar2.a(eVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = eVar.j;
                        qgg.h0(obj);
                    }
                    com.yandex.plus.pay.log.impl.b bVar = this.b;
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                    bVar.getClass();
                    bVar.c(aVar, "RestUserExtendedInfoRepository", "Resetting user extended info cache");
                    return Unit.a;
                }
            }
            com.yandex.plus.pay.log.impl.b bVar2 = this.b;
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
            bVar2.getClass();
            bVar2.c(aVar2, "RestUserExtendedInfoRepository", "Resetting user extended info cache");
            return Unit.a;
        } finally {
            qqiVar.b(null);
        }
        eVar = new e(this, cg6Var);
        Object obj2 = eVar.k;
        nm6 nm6Var2 = nm6.a;
        i = eVar.m;
        if (i != 0) {
        }
    }
}
