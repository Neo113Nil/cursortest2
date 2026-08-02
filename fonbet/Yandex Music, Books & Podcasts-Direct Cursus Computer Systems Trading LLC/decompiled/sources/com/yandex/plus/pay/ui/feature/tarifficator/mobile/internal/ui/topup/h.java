package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup;

import defpackage.bfu;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.ot0;
import defpackage.x97;
import defpackage.xdr;
import defpackage.ydr;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class h extends bfu {
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.c k;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a l;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.topup.a m;
    public final com.yandex.plus.pay.log.impl.b n;
    public com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.a o;
    public final xdr p;
    public final xdr q;

    public h(com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.c cVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a aVar2, com.yandex.plus.pay.ui.core.tarifficator.api.domain.topup.a aVar3, com.yandex.plus.pay.log.impl.b bVar) {
        aVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        bVar.getClass();
        this.k = cVar;
        this.l = aVar2;
        this.m = aVar3;
        this.n = bVar;
        xdr a = ydr.a(f.a);
        this.p = a;
        this.q = a;
        x97.y(ot0.F(this), null, null, new com.yandex.plus.home.feature.webviews.internal.treasury.d(this, aVar.a.a(), null, 19), 3);
    }

    public final void G() {
        this.l.b(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.b.b);
    }

    public final void H() {
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.a aVar = this.o;
        if (aVar != null) {
            String str = aVar.a;
            String str2 = aVar.b;
            if (str2 == null) {
                str2 = "no_value";
            }
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.topup.a aVar2 = this.m;
            aVar2.getClass();
            str.getClass();
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = aVar2.a.a();
            cdk cdkVar = aVar2.b;
            String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
            cdkVar.getClass();
            d.getClass();
            LinkedHashMap m = dfi.m("purchase_session_id", d, "action_scenario", str);
            m.put("url", str2);
            m.put("_meta", cdk.c(new HashMap()));
            cdkVar.f("PostPaymentYB.Result.Cancelled", m);
        }
        G();
    }
}
