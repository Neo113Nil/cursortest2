package com.yandex.plus.metrica.utils;

import defpackage.ezc;
import io.appmetrica.analytics.IReporterYandex;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class w extends ezc implements Function1 {
    public static final w a = new w(1, com.yandex.plus.core.analytics.metrica.g.class, "<init>", "<init>(Lio/appmetrica/analytics/IReporterYandex;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IReporterYandex iReporterYandex = (IReporterYandex) obj;
        iReporterYandex.getClass();
        return new com.yandex.plus.core.analytics.metrica.g(iReporterYandex);
    }
}
