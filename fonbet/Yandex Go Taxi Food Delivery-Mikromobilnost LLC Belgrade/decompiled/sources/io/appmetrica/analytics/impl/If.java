package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.MviMetricsReporter;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class If {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[MviMetricsReporter.ReportToPulse.values().length];
        try {
            iArr[MviMetricsReporter.ReportToPulse.REPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MviMetricsReporter.ReportToPulse.SKIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[MviMetricsReporter.ReportToPulseTotal.values().length];
        try {
            iArr2[MviMetricsReporter.ReportToPulseTotal.REPORT_TOTAL_AND_STARTUP_SPECIFIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[MviMetricsReporter.ReportToPulseTotal.REPORT_ONLY_STARTUP_SPECIFIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MviMetricsReporter.ReportToPulseTotal.SKIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
