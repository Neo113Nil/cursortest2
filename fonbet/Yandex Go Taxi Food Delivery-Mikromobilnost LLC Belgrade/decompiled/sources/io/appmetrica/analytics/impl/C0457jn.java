package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.jn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0457jn extends S5 {
    public C0457jn(Context context, Bp bp, K5 k5, C0439j5 c0439j5, Uj uj, Q5 q5, J5 j5) {
        this(context, k5, new C0637q0(), new TimePassedChecker(), new X5(context, k5, c0439j5, q5, bp, uj, Jb.k().w().e(), PackageManagerUtils.getAppVersionCodeInt(context), Jb.k().l(), j5), c0439j5);
    }

    @Override // io.appmetrica.analytics.impl.S5, io.appmetrica.analytics.impl.InterfaceC0302ec
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C0457jn(Context context, K5 k5, C0637q0 c0637q0, TimePassedChecker timePassedChecker, X5 x5, C0439j5 c0439j5) {
        super(context, k5, c0637q0, timePassedChecker, x5, c0439j5);
    }
}
