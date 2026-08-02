package com.yandex.plus.core.analytics.metrica;

import com.yandex.plus.core.analytics.j;
import com.yandex.plus.core.analytics.k;
import defpackage.fob;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.RtmErrorEvent;

/* loaded from: classes4.dex */
public final class d implements k {
    public final IReporterYandex a;

    public d(IReporterYandex iReporterYandex) {
        iReporterYandex.getClass();
        this.a = iReporterYandex;
    }

    @Override // com.yandex.plus.core.analytics.k
    public final void a(j jVar) {
        jVar.getClass();
        String str = jVar.a;
        if (str == null) {
            str = "unknown";
        }
        RtmErrorEvent.Builder withAdditional = RtmErrorEvent.newBuilder(str).withVersion(jVar.b).withService(jVar.c).withSource("unknown").withRequestId(jVar.d).withAdditional(jVar.e);
        Throwable th = jVar.f;
        RtmErrorEvent build = withAdditional.withStacktrace(th != null ? fob.b(th) : null).withErrorLevel(null).withSilent(null).withUrl(jVar.g).build();
        build.getClass();
        this.a.reportRtmError(build);
    }
}
