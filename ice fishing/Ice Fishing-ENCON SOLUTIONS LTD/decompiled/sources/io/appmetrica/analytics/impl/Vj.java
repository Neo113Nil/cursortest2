package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes.dex */
public final class Vj extends X4 {
    public Vj(Context context, C0415fm c0415fm, Q4 q4, C0630o4 c0630o4, InterfaceC0462hh interfaceC0462hh, V4 v4, P4 p4) {
        this(context, q4, new C0522k0(), new TimePassedChecker(), new C0321c5(context, q4, c0630o4, v4, c0415fm, interfaceC0462hh, C0610na.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0610na.k().l(), p4), c0630o4);
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Ea
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public Vj(Context context, Q4 q4, C0522k0 c0522k0, TimePassedChecker timePassedChecker, C0321c5 c0321c5, C0630o4 c0630o4) {
        super(context, q4, c0522k0, timePassedChecker, c0321c5, c0630o4);
    }
}
