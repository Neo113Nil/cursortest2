package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.MviMetricsReporter;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class Lf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MviMetricsReporter.StartupType.values().length];
        try {
            iArr[MviMetricsReporter.StartupType.COLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MviMetricsReporter.StartupType.WARM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MviMetricsReporter.StartupType.HOT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
