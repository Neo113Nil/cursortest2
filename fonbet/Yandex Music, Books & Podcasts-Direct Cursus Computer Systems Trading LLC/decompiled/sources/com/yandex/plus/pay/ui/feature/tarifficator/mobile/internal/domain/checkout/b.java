package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout;

import com.appsflyer.internal.k;
import defpackage.b6e;
import defpackage.bdk;
import defpackage.cdk;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class b {
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a a;
    public final cdk b;

    public b(com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar, cdk cdkVar) {
        aVar.getClass();
        cdkVar.getClass();
        this.a = aVar;
        this.b = cdkVar;
    }

    public static bdk a(com.yandex.plus.pay.ui.yb.api.e eVar) {
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            return bdk.Opening;
        }
        if (ordinal == 1) {
            return bdk.Topup;
        }
        b6e.s();
        return null;
    }

    public final void b(String str, com.yandex.plus.pay.ui.yb.api.e eVar, String str2) {
        str.getClass();
        eVar.getClass();
        String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(this.a.a.a().a);
        bdk a = a(eVar);
        if (str2 == null) {
            str2 = "no_value";
        }
        cdk cdkVar = this.b;
        LinkedHashMap t = k.t(cdkVar, d, "purchase_session_id", d);
        t.put("url", str);
        t.put("action_scenario", a.a);
        t.put("payment_method_id", str2);
        t.put("_meta", cdk.c(new HashMap()));
        cdkVar.f("OpeningYbCard.Result.Success", t);
    }
}
