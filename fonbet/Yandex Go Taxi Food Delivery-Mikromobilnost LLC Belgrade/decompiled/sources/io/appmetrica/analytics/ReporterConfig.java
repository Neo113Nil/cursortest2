package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C0260cr;
import io.appmetrica.analytics.impl.C0412i6;
import io.appmetrica.analytics.impl.C0550n0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class ReporterConfig {
    public final Map<String, Object> additionalConfig;
    public final String apiKey;
    public final Map<String, String> appEnvironment;
    public final Boolean dataSendingEnabled;
    public final Integer dispatchPeriodSeconds;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final String userProfileID;

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.b;
        this.sessionTimeout = builder.c;
        this.logs = builder.d;
        this.dataSendingEnabled = builder.e;
        this.maxReportsInDatabaseCount = builder.f;
        this.userProfileID = builder.g;
        this.dispatchPeriodSeconds = builder.h;
        this.maxReportsCount = builder.i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.k);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    public static class Builder {
        private static final C0260cr l = new C0260cr(new C0550n0());
        private final C0412i6 a;
        private final String b;
        private Integer c;
        private Boolean d;
        private Boolean e;
        private Integer f;
        private String g;
        private Integer h;
        private Integer i;
        private final HashMap j;
        private final HashMap k;

        private Builder(String str) {
            this.j = new HashMap();
            this.k = new HashMap();
            l.a(str);
            this.a = new C0412i6(str);
            this.b = str;
        }

        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.k.put(str, obj);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.j.put(str, str2);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i) {
            this.h = Integer.valueOf(i);
            return this;
        }

        public Builder withLogs() {
            this.d = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i) {
            this.i = Integer.valueOf(i);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f = Integer.valueOf(this.a.a(i));
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.g = str;
            return this;
        }

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i) {
        this(builder);
    }

    public ReporterConfig(ReporterConfig reporterConfig) {
        this.apiKey = reporterConfig.apiKey;
        this.sessionTimeout = reporterConfig.sessionTimeout;
        this.logs = reporterConfig.logs;
        this.dataSendingEnabled = reporterConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = reporterConfig.maxReportsInDatabaseCount;
        this.userProfileID = reporterConfig.userProfileID;
        this.dispatchPeriodSeconds = reporterConfig.dispatchPeriodSeconds;
        this.maxReportsCount = reporterConfig.maxReportsCount;
        this.appEnvironment = reporterConfig.appEnvironment;
        this.additionalConfig = reporterConfig.additionalConfig;
    }
}
