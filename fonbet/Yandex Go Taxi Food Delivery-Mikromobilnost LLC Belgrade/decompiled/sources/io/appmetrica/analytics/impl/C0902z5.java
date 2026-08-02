package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.z5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0902z5 extends C0714sk {
    public C0902z5(C0597oi c0597oi) {
        super(c0597oi, new CounterConfiguration(), new R9(new Po(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment")));
        b().setReporterType(CounterConfigurationReporterType.COMMUTATION);
    }

    @Override // io.appmetrica.analytics.impl.C0714sk
    public final boolean f() {
        return true;
    }
}
