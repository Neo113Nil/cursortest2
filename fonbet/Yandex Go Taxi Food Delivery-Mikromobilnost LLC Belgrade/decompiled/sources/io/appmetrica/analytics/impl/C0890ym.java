package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0890ym {
    public final String a;
    public final Context b;
    public final CounterConfigurationReporterType c;
    public final Bm d;

    public C0890ym(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, Bm bm) {
        this.a = str;
        this.b = context;
        int i = AbstractC0861xm.a[counterConfigurationReporterType.ordinal()];
        if (i == 1) {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i != 2) {
            this.c = null;
        } else {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.d = bm;
    }
}
