package com.yandex.plus.bdui.plus.analytics;

import com.yandex.plus.bdui.plus.checkout.j;
import defpackage.btf;
import defpackage.jyr;
import defpackage.r0w;

/* loaded from: classes4.dex */
public final class g extends a {
    public final jyr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.yandex.plus.core.analytics.h hVar, com.yandex.plus.log.api.b bVar, j jVar) {
        super(jVar, bVar, "PlusMetricaAnalyticsTransport");
        hVar.getClass();
        bVar.getClass();
        this.d = btf.b(new com.yandex.plus.bdui.flex.factory.d(0, hVar, com.yandex.plus.core.analytics.h.class, "getEventReporter", "getEventReporter()Lcom/yandex/plus/core/analytics/EventReporter;", 0, 19));
    }

    @Override // com.yandex.plus.bdui.analytics.a
    public final void a(com.yandex.plus.bdui.analytics.c cVar) {
        cVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusMetricaAnalyticsTransport", "sendEvent(); event = " + cVar);
        }
        com.yandex.plus.core.analytics.f fVar = (com.yandex.plus.core.analytics.f) this.d.getValue();
        if (fVar != null) {
            b(fVar, cVar, new r0w(16, this));
        }
    }
}
