package io.appmetrica.analytics.impl;

import defpackage.uif;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.vc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0719vc extends uif implements Function1 {
    public static final C0719vc a = new C0719vc();

    public C0719vc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CounterReportApi counterReportApi = (CounterReportApi) obj;
        return Boolean.valueOf((counterReportApi.getCustomType() == 9 || counterReportApi.getCustomType() == 12) ? false : true);
    }
}
