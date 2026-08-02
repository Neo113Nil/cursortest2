package com.yandex.plus.core.analytics.metrica;

import com.yandex.plus.core.analytics.l;
import com.yandex.plus.core.analytics.m;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.RtmClientEvent;

/* loaded from: classes4.dex */
public final class e implements m {
    public final IReporterYandex a;

    public e(IReporterYandex iReporterYandex) {
        iReporterYandex.getClass();
        this.a = iReporterYandex;
    }

    @Override // com.yandex.plus.core.analytics.m
    public final void a(l lVar) {
        String str = lVar.a;
        if (str == null) {
            str = "unknown";
        }
        RtmClientEvent.Builder newBuilder = RtmClientEvent.newBuilder(str, (String) null);
        newBuilder.getClass();
        RtmClientEvent build = newBuilder.withVersion(lVar.b).withService(lVar.c).withSource("unknown").withRequestId(lVar.d).withAdditional(lVar.e).withLoggedIn(null).build();
        build.getClass();
        this.a.reportRtmEvent(build);
    }
}
