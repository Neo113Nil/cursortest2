package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.kj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541kj {

    /* renamed from: a, reason: collision with root package name */
    public final String f6395a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6396b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f6397c;

    /* renamed from: d, reason: collision with root package name */
    public final C0619nj f6398d;

    public C0541kj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C0619nj c0619nj) {
        this.f6395a = str;
        this.f6396b = context;
        int i2 = AbstractC0515jj.f6303a[counterConfigurationReporterType.ordinal()];
        if (i2 == 1) {
            this.f6397c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i2 != 2) {
            this.f6397c = null;
        } else {
            this.f6397c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f6398d = c0619nj;
    }
}
