package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0353im {
    public final String a;
    public final Context b;
    public final CounterConfigurationReporterType c;
    public final C0440lm d;

    public C0353im(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C0440lm c0440lm) {
        this.a = str;
        this.b = context;
        int i = AbstractC0325hm.a[counterConfigurationReporterType.ordinal()];
        if (i == 1) {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i != 2) {
            this.c = null;
        } else {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.d = c0440lm;
    }
}
