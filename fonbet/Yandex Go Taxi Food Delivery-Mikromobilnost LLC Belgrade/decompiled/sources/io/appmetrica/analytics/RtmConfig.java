package io.appmetrica.analytics;

import com.adjust.sdk.AdjustConfig;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class RtmConfig {
    public static final boolean EVENTS_SENDING_RETRY_ENABLED = false;
    public static final long EVENTS_SENDING_RETRY_TTL_SECONDS = 600;
    public static final int SILENT_FREQUENT_ERRORS_COUNT_LIMIT_PER_WINDOW_DEFAULT = 10;
    public static final boolean SILENT_FREQUENT_ERRORS_DEFAULT = false;
    public static final long SILENT_FREQUENT_ERRORS_TIME_WINDOW_DEFAULT = 300;
    private final Wrapper a;
    private final Wrapper b;
    private final Wrapper c;
    private final Wrapper d;
    private final Wrapper e;
    private final Wrapper f;
    private final Wrapper g;
    private final Wrapper h;
    private final Boolean i;
    private final Long j;
    private final Integer k;
    private final Boolean l;
    private final Long m;
    private final RtmMessageConstraints n;

    public enum Environment {
        DEVELOPMENT("development"),
        TESTING("testing"),
        PRESTABLE("prestable"),
        PRODUCTION(AdjustConfig.ENVIRONMENT_PRODUCTION),
        PREPRODUCTION("pre-production");

        private final String a;

        Environment(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    public static class Wrapper<T> {
        public final T value;

        public Wrapper(T t) {
            this.value = t;
        }

        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                T t = this.value;
                if (t != null) {
                    jSONObject.put("value", t.toString());
                }
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    private RtmConfig(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
        this.k = builder.k;
        this.l = builder.l;
        this.m = builder.m;
        this.n = builder.n;
    }

    private static void a(JSONObject jSONObject, String str, Wrapper wrapper) {
        if (wrapper != null) {
            jSONObject.put(str, wrapper.toJson());
        }
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject, "projectName", this.a);
            a(jSONObject, Constants.KEY_VERSION_FLAVOR, this.b);
            a(jSONObject, "userAgent", this.c);
            a(jSONObject, "userId", this.e);
            a(jSONObject, "experiment", this.f);
            a(jSONObject, "slot", this.g);
            a(jSONObject, WebViewActivity.KEY_ENVIRONMENT, this.d);
            a(jSONObject, "uploadUrl", this.h);
            Boolean bool = this.i;
            if (bool != null) {
                jSONObject.put("silent_frequent_errors", bool);
            }
            Long l = this.j;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (l != null && l.longValue() >= 1) {
                jSONObject.put("silent_frequent_errors_time_window", timeUnit.toMillis(this.j.longValue()));
            }
            Integer num = this.k;
            if (num != null) {
                jSONObject.put("silent_frequent_errors_count_limit", num);
            }
            Boolean bool2 = this.l;
            jSONObject.put("events_sending_retry_enabled", bool2 == null ? false : bool2.booleanValue());
            Long l2 = this.m;
            jSONObject.put("events_sending_retry_ttl", timeUnit.toMillis(l2 == null ? 600L : l2.longValue()));
            RtmMessageConstraints rtmMessageConstraints = this.n;
            if (rtmMessageConstraints != null) {
                JSONObject json2 = rtmMessageConstraints.toJson();
                if (json2.length() > 0) {
                    jSONObject.put("message_constraints", json2);
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static class Builder {
        private Wrapper a;
        private Wrapper b;
        private Wrapper c;
        private Wrapper d;
        private Wrapper e;
        private Wrapper f;
        private Wrapper g;
        private Wrapper h;
        private Boolean i;
        private Long j;
        private Integer k;
        private Boolean l;
        private Long m;
        private RtmMessageConstraints n;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public RtmConfig build() {
            return new RtmConfig(this, 0);
        }

        public Builder withEnvironment(Environment environment) {
            this.d = new Wrapper(environment);
            return this;
        }

        public Builder withEventsSendingRetry(long j) {
            this.l = Boolean.TRUE;
            this.m = Long.valueOf(j);
            return this;
        }

        public Builder withExperiment(String str) {
            this.f = new Wrapper(str);
            return this;
        }

        public Builder withMessageConstraints(RtmMessageConstraints rtmMessageConstraints) {
            this.n = rtmMessageConstraints;
            return this;
        }

        public Builder withProjectName(String str) {
            this.a = new Wrapper(str);
            return this;
        }

        public Builder withSilentErrors(long j, int i) {
            this.i = Boolean.TRUE;
            this.j = Long.valueOf(j);
            this.k = Integer.valueOf(i);
            return this;
        }

        public Builder withSlot(String str) {
            this.g = new Wrapper(str);
            return this;
        }

        public Builder withUploadUrl(String str) {
            this.h = new Wrapper(str);
            return this;
        }

        public Builder withUserAgent(String str) {
            this.c = new Wrapper(str);
            return this;
        }

        public Builder withUserId(String str) {
            this.e = new Wrapper(str);
            return this;
        }

        public Builder withVersionFlavor(String str) {
            this.b = new Wrapper(str);
            return this;
        }

        private Builder() {
        }

        public Builder withEventsSendingRetry() {
            return withEventsSendingRetry(600L);
        }

        public Builder withSilentErrors() {
            this.i = Boolean.TRUE;
            return this;
        }
    }

    public /* synthetic */ RtmConfig(Builder builder, int i) {
        this(builder);
    }
}
