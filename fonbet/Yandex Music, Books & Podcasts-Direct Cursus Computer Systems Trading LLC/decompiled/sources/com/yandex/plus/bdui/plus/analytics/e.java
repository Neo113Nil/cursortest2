package com.yandex.plus.bdui.plus.analytics;

import com.yandex.plus.bdui.plus.checkout.j;
import com.yandex.plus.core.analytics.o;
import defpackage.btf;
import defpackage.jyr;
import defpackage.r0w;

/* loaded from: classes4.dex */
public final class e extends a {
    public final /* synthetic */ int d = 1;
    public final jyr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.yandex.plus.core.analytics.h hVar, com.yandex.plus.log.api.b bVar, j jVar) {
        super(jVar, bVar, "PlusStatboxAnalyticsTransport");
        hVar.getClass();
        bVar.getClass();
        this.e = btf.b(new com.yandex.plus.bdui.flex.factory.d(0, hVar, com.yandex.plus.core.analytics.h.class, "getStatboxReporter", "getStatboxReporter()Lcom/yandex/plus/core/analytics/StatboxReporter;", 0, 20));
    }

    @Override // com.yandex.plus.bdui.analytics.a
    public final void a(com.yandex.plus.bdui.analytics.c cVar) {
        int i = this.d;
        cVar.getClass();
        switch (i) {
            case 0:
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                com.yandex.plus.log.api.b bVar = this.b;
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "PlusDiagnosticAnalyticsTransport", "sendEvent(); event = " + cVar);
                }
                com.yandex.plus.core.analytics.c cVar2 = (com.yandex.plus.core.analytics.c) this.e.getValue();
                if (cVar2 != null) {
                    b(cVar2, cVar, new r0w(14, this));
                    break;
                }
                break;
            default:
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                com.yandex.plus.log.api.b bVar2 = this.b;
                if (bVar2.b(aVar2)) {
                    bVar2.c(aVar2, "PlusStatboxAnalyticsTransport", "sendEvent(); event = " + cVar);
                }
                o oVar = (o) this.e.getValue();
                if (oVar != null) {
                    b(oVar, cVar, new r0w(18, this));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.yandex.plus.core.analytics.h hVar, com.yandex.plus.log.api.b bVar, j jVar, byte b) {
        super(jVar, bVar, "PlusDiagnosticAnalyticsTransport");
        hVar.getClass();
        bVar.getClass();
        this.e = btf.b(new com.yandex.plus.bdui.flex.factory.d(0, hVar, com.yandex.plus.core.analytics.h.class, "getDiagnosticReporter", "getDiagnosticReporter()Lcom/yandex/plus/core/analytics/DiagnosticReporter;", 0, 18));
    }
}
