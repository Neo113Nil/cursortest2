package io.appmetrica.analytics;

import io.appmetrica.analytics.ReporterConfig;

/* loaded from: classes9.dex */
public class ReporterYandexConfig extends ReporterConfig {
    public static final String PULSE_LIBRARY_CONFIG_KEY = "YMM_pulseLibraryConfig";
    public static final String RTM_CONFIG_KEY = "YMM_rtmConfig";
    public final PulseLibraryConfig pulseLibraryConfig;
    public final RtmConfig rtmConfig;

    public static class Builder {
        private final ReporterConfig.Builder a;

        public Builder(String str) {
            this.a = ReporterConfig.newConfigBuilder(str);
        }

        public ReporterYandexConfig build() {
            return ReporterYandexConfig.from(this.a.build());
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.a.withAdditionalConfig(str, obj);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.a.withAppEnvironmentValue(str, str2);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z) {
            this.a.withDataSendingEnabled(z);
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i) {
            this.a.withDispatchPeriodSeconds(i);
            return this;
        }

        public Builder withLogs() {
            this.a.withLogs();
            return this;
        }

        public Builder withMaxReportsCount(int i) {
            this.a.withMaxReportsCount(i);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.a.withMaxReportsInDatabaseCount(i);
            return this;
        }

        public Builder withPulseLibraryConfig(PulseLibraryConfig pulseLibraryConfig) {
            this.a.withAdditionalConfig(ReporterYandexConfig.PULSE_LIBRARY_CONFIG_KEY, pulseLibraryConfig);
            return this;
        }

        public Builder withRtmConfig(RtmConfig rtmConfig) {
            this.a.withAdditionalConfig("YMM_rtmConfig", rtmConfig);
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.a.withSessionTimeout(i);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.a.withUserProfileID(str);
            return this;
        }
    }

    private ReporterYandexConfig(ReporterConfig reporterConfig) {
        super(reporterConfig);
        this.rtmConfig = (RtmConfig) a(reporterConfig, "YMM_rtmConfig");
        this.pulseLibraryConfig = (PulseLibraryConfig) a(reporterConfig, PULSE_LIBRARY_CONFIG_KEY);
    }

    private static Object a(ReporterConfig reporterConfig, String str) {
        try {
            return reporterConfig.additionalConfig.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ReporterYandexConfig from(ReporterConfig reporterConfig) {
        return reporterConfig instanceof ReporterYandexConfig ? (ReporterYandexConfig) reporterConfig : new ReporterYandexConfig(reporterConfig);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str);
    }

    public PulseLibraryConfig getPulseLibraryConfig() {
        return this.pulseLibraryConfig;
    }
}
