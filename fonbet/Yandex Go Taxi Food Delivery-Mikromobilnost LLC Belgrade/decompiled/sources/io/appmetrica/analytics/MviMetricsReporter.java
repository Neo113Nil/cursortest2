package io.appmetrica.analytics;

import java.util.Map;

/* loaded from: classes9.dex */
public interface MviMetricsReporter {

    /* loaded from: classes4.dex */
    public enum AdditionalMetric {
        FIRST_INPUT_TIME,
        INTERACTION_COUNT
    }

    public enum KeyMetric {
        FIRST_CONTENTFUL_PAINT,
        LARGEST_CONTENTFUL_PAINT,
        TIME_TO_INTERACTIVE,
        TOTAL_BLOCKING_TIME,
        FIRST_INPUT_DELAY,
        INTERACTION_TO_NEXT_PAINT
    }

    public enum ReportToPulse {
        REPORT,
        SKIP
    }

    public enum ReportToPulseTotal {
        REPORT_TOTAL_AND_STARTUP_SPECIFIC,
        REPORT_ONLY_STARTUP_SPECIFIC,
        SKIP
    }

    public enum StartupType {
        COLD,
        WARM,
        HOT
    }

    ReportToPulse reportAdditionalMetric(MviScreen mviScreen, AdditionalMetric additionalMetric, Long l, StartupType startupType);

    ReportToPulse reportKeyMetric(MviScreen mviScreen, KeyMetric keyMetric, Long l, Double d, String str, StartupType startupType);

    ReportToPulseTotal reportTotalScore(MviScreen mviScreen, Double d, Map<KeyMetric, Double> map, StartupType startupType);

    default ReportToPulseTotal reportTotalScoreV2(MviScreen mviScreen, Double d, Map<KeyMetric, Double> map, StartupType startupType) {
        return ReportToPulseTotal.REPORT_TOTAL_AND_STARTUP_SPECIFIC;
    }
}
