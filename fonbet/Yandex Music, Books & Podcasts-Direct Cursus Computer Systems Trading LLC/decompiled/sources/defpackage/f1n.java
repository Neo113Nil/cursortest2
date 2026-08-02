package defpackage;

import io.appmetrica.analytics.MviMetricsReporter;
import io.appmetrica.analytics.MviScreen;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f1n implements MviMetricsReporter {
    @Override // io.appmetrica.analytics.MviMetricsReporter
    public final MviMetricsReporter.ReportToPulse reportAdditionalMetric(MviScreen mviScreen, MviMetricsReporter.AdditionalMetric additionalMetric, Long l, MviMetricsReporter.StartupType startupType) {
        long longValue = l.longValue();
        mviScreen.getClass();
        additionalMetric.getClass();
        startupType.getClass();
        StringBuilder sb = new StringBuilder("MVI reportAdditionalMetric(screen = ");
        sb.append(mviScreen);
        sb.append(", metric = ");
        sb.append(additionalMetric);
        sb.append(", value = ");
        sb.append(longValue);
        sb.append(", startupType = ");
        sb.append(startupType);
        v3w.m(sb, ")", 2, null, null);
        return MviMetricsReporter.ReportToPulse.REPORT;
    }

    @Override // io.appmetrica.analytics.MviMetricsReporter
    public final MviMetricsReporter.ReportToPulse reportKeyMetric(MviScreen mviScreen, MviMetricsReporter.KeyMetric keyMetric, Long l, Double d, String str, MviMetricsReporter.StartupType startupType) {
        long longValue = l.longValue();
        double doubleValue = d.doubleValue();
        mviScreen.getClass();
        keyMetric.getClass();
        str.getClass();
        startupType.getClass();
        ssg.a(2, null, "MVI reportKeyMetric(screen = " + mviScreen + ", metric = " + keyMetric + ", value = " + longValue + ", score = " + doubleValue + ", startupType = " + startupType + ")", null);
        return MviMetricsReporter.ReportToPulse.REPORT;
    }

    @Override // io.appmetrica.analytics.MviMetricsReporter
    public final MviMetricsReporter.ReportToPulseTotal reportTotalScore(MviScreen mviScreen, Double d, Map map, MviMetricsReporter.StartupType startupType) {
        double doubleValue = d.doubleValue();
        mviScreen.getClass();
        map.getClass();
        startupType.getClass();
        ssg.a(2, null, "MVI reportTotalScore(screen = " + mviScreen + ", totalScore = " + doubleValue + ", startupType = " + startupType + ")", null);
        return MviMetricsReporter.ReportToPulseTotal.REPORT_TOTAL_AND_STARTUP_SPECIFIC;
    }
}
