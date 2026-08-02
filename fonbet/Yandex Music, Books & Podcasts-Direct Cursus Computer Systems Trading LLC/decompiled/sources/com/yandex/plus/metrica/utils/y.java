package com.yandex.plus.metrica.utils;

import defpackage.b6e;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.RtmConfig;

/* loaded from: classes5.dex */
public final class y extends j {
    public final String d;
    public final com.yandex.plus.core.config.a e;
    public final com.yandex.plus.home.feature.webviews.internal.stories.i f;

    public y(String str, com.yandex.plus.core.config.a aVar, com.yandex.plus.home.feature.webviews.internal.stories.i iVar) {
        aVar.getClass();
        this.d = str;
        this.e = aVar;
        this.f = iVar;
    }

    @Override // com.yandex.plus.metrica.utils.j
    public final void b() {
        RtmConfig.Environment environment;
        IReporterYandex iReporterYandex = (IReporterYandex) this.f.invoke();
        if (iReporterYandex == null) {
            return;
        }
        RtmConfig.Builder withProjectName = RtmConfig.newBuilder().withProjectName(this.d);
        int ordinal = this.e.ordinal();
        if (ordinal == 0) {
            environment = RtmConfig.Environment.TESTING;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            environment = RtmConfig.Environment.PRODUCTION;
        }
        RtmConfig build = withProjectName.withEnvironment(environment).withUserId(this.b).withSlot(this.c).build();
        build.getClass();
        iReporterYandex.updateRtmConfig(build);
    }
}
