package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes5.dex */
public final class Tm extends P5 {
    public Tm(@NonNull Context context, @NonNull C0385jp c0385jp, @NonNull H5 h5, @NonNull C0250f5 c0250f5, @NonNull Kj kj, @NonNull N5 n5, @NonNull G5 g5) {
        this(context, h5, new C0505o0(), new TimePassedChecker(), new U5(context, h5, c0250f5, n5, c0385jp, kj, C0747wb.k().w().e(), PackageManagerUtils.getAppVersionCodeInt(context), C0747wb.k().l(), g5), c0250f5);
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.impl.Pb
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public Tm(Context context, H5 h5, C0505o0 c0505o0, TimePassedChecker timePassedChecker, U5 u5, C0250f5 c0250f5) {
        super(context, h5, c0505o0, timePassedChecker, u5, c0250f5);
    }
}
