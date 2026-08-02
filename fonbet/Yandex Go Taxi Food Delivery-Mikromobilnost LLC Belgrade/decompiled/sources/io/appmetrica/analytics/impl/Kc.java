package io.appmetrica.analytics.impl;

import defpackage.tls;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class Kc extends Lambda implements tls {
    public static final Kc a = new Kc();

    public Kc() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int customType = ((CounterReportApi) obj).getCustomType();
        Gc[] gcArr = Gc.a;
        return Boolean.valueOf(customType == 9);
    }
}
