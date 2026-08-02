package com.yandex.plus.pay.ui.yb.web.internal.ui;

import defpackage.bdk;
import defpackage.bfu;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.ot0;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xdr;
import defpackage.y0q;
import defpackage.ydr;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class g extends bfu {
    public final String k;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b l;
    public final com.yandex.plus.pay.ui.yb.api.e m;
    public com.yandex.plus.pay.ui.yb.web.internal.e n;
    public final x0q o;
    public final x0q p;
    public final xdr q;

    public g(String str, long j, long j2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b bVar, com.yandex.plus.pay.ui.yb.api.e eVar) {
        str.getClass();
        bVar.getClass();
        eVar.getClass();
        this.k = str;
        this.l = bVar;
        this.m = eVar;
        this.n = com.yandex.plus.pay.ui.yb.web.internal.a.a;
        x0q b = y0q.b(0, 0, null, 7);
        this.o = b;
        this.p = b;
        this.q = ydr.a(new f(str, j, j2));
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = bVar.a.a.a();
        cdk cdkVar = bVar.b;
        String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
        bdk a2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b.a(eVar);
        cdkVar.getClass();
        d.getClass();
        LinkedHashMap m = dfi.m("purchase_session_id", d, "url", str);
        m.put("action_scenario", a2.a);
        m.put("_meta", cdk.c(new HashMap()));
        cdkVar.f("OpeningYbCard.Screen.Shown", m);
    }

    public final void G() {
        x97.y(ot0.F(this), null, null, new com.yandex.plus.pay.ui.core.debug.internal.ui.form.b(this, null, 9), 3);
    }

    public final void H() {
        this.n = com.yandex.plus.pay.ui.yb.web.internal.a.a;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b bVar = this.l;
        bVar.getClass();
        String str = this.k;
        str.getClass();
        com.yandex.plus.pay.ui.yb.api.e eVar = this.m;
        eVar.getClass();
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = bVar.a.a.a();
        cdk cdkVar = bVar.b;
        String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
        bdk a2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b.a(eVar);
        cdkVar.getClass();
        d.getClass();
        LinkedHashMap m = dfi.m("purchase_session_id", d, "url", str);
        m.put("action_scenario", a2.a);
        m.put("_meta", cdk.c(new HashMap()));
        cdkVar.f("OpeningYbCard.Result.Cancelled", m);
        G();
    }

    public final void J(String str) {
        this.n = com.yandex.plus.pay.ui.yb.web.internal.b.a;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b bVar = this.l;
        bVar.getClass();
        String str2 = this.k;
        str2.getClass();
        com.yandex.plus.pay.ui.yb.api.e eVar = this.m;
        eVar.getClass();
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = bVar.a.a.a();
        cdk cdkVar = bVar.b;
        String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
        bdk a2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b.a(eVar);
        cdkVar.getClass();
        d.getClass();
        LinkedHashMap m = dfi.m("purchase_session_id", d, "url", str2);
        m.put("action_scenario", a2.a);
        m.put("fail_reason", str);
        m.put("_meta", cdk.c(new HashMap()));
        cdkVar.f("OpeningYbCard.Result.Failed", m);
        G();
    }
}
