package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C0445h0;
import io.appmetrica.analytics.impl.C0605n5;
import io.appmetrica.analytics.impl.En;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
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

    public static class Builder {

        /* renamed from: l, reason: collision with root package name */
        private static final En f3488l = new En(new C0445h0());

        /* renamed from: a, reason: collision with root package name */
        private final C0605n5 f3489a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3490b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f3491c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f3492d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f3493e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f3494f;

        /* renamed from: g, reason: collision with root package name */
        private String f3495g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f3496h;

        /* renamed from: i, reason: collision with root package name */
        private Integer f3497i;

        /* renamed from: j, reason: collision with root package name */
        private final HashMap f3498j;

        /* renamed from: k, reason: collision with root package name */
        private final HashMap f3499k;

        public /* synthetic */ Builder(String str, int i2) {
            this(str);
        }

        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f3499k.put(str, obj);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f3498j.put(str, str2);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z2) {
            this.f3493e = Boolean.valueOf(z2);
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i2) {
            this.f3496h = Integer.valueOf(i2);
            return this;
        }

        public Builder withLogs() {
            this.f3492d = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i2) {
            this.f3497i = Integer.valueOf(i2);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i2) {
            this.f3494f = Integer.valueOf(this.f3489a.a(i2));
            return this;
        }

        public Builder withSessionTimeout(int i2) {
            this.f3491c = Integer.valueOf(i2);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f3495g = str;
            return this;
        }

        private Builder(String str) {
            this.f3498j = new HashMap();
            this.f3499k = new HashMap();
            f3488l.a(str);
            this.f3489a = new C0605n5(str);
            this.f3490b = str;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i2) {
        this(builder);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f3490b;
        this.sessionTimeout = builder.f3491c;
        this.logs = builder.f3492d;
        this.dataSendingEnabled = builder.f3493e;
        this.maxReportsInDatabaseCount = builder.f3494f;
        this.userProfileID = builder.f3495g;
        this.dispatchPeriodSeconds = builder.f3496h;
        this.maxReportsCount = builder.f3497i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f3498j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f3499k);
    }
}
