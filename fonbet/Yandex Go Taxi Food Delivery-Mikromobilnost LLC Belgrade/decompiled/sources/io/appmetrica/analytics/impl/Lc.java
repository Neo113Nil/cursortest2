package io.appmetrica.analytics.impl;

import defpackage.tls;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class Lc extends Lambda implements tls {
    public static final Lc a = new Lc();

    public Lc() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        CounterReportApi counterReportApi = (CounterReportApi) obj;
        int customType = counterReportApi.getCustomType();
        Gc[] gcArr = Gc.a;
        return Boolean.valueOf((customType == 9 || counterReportApi.getCustomType() == 12) ? false : true);
    }
}
