package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.MviMetricsReporter;

/* renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC0335fg {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[MviMetricsReporter.KeyMetric.values().length];
        try {
            iArr[MviMetricsReporter.KeyMetric.FIRST_CONTENTFUL_PAINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MviMetricsReporter.KeyMetric.LARGEST_CONTENTFUL_PAINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MviMetricsReporter.KeyMetric.TIME_TO_INTERACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MviMetricsReporter.KeyMetric.TOTAL_BLOCKING_TIME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MviMetricsReporter.KeyMetric.FIRST_INPUT_DELAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MviMetricsReporter.KeyMetric.INTERACTION_TO_NEXT_PAINT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[MviMetricsReporter.StartupType.values().length];
        try {
            iArr2[MviMetricsReporter.StartupType.COLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[MviMetricsReporter.StartupType.WARM.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[MviMetricsReporter.StartupType.HOT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
    }
}
