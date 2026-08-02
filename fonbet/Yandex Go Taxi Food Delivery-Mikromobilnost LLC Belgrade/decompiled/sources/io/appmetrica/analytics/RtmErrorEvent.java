package io.appmetrica.analytics;

import io.appmetrica.analytics.RtmEvent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class RtmErrorEvent extends RtmEvent {
    public final Map<String, String> genericVariables;
    public final ErrorLevel level;
    public final String message;
    public final Boolean silent;
    public final String stacktrace;
    public final String table;
    public final String url;

    public enum ErrorLevel {
        INFO("info"),
        DEBUG("debug"),
        WARN("warn"),
        ERROR("error"),
        FATAL("fatal");

        public final String tag;

        ErrorLevel(String str) {
            this.tag = str;
        }
    }

    private RtmErrorEvent(Builder builder) {
        super(builder.a);
        this.message = builder.b;
        this.stacktrace = builder.c;
        this.level = builder.d;
        this.silent = builder.e;
        this.url = builder.f;
        this.table = builder.g;
        this.genericVariables = builder.h;
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public static class Builder {
        private final RtmEvent.Builder a;
        private final String b;
        private String c;
        private ErrorLevel d;
        private Boolean e;
        private String f;
        private String g;
        private final HashMap h;

        private Builder(String str) {
            this.h = new HashMap();
            this.a = RtmEvent.newBaseBuilder();
            this.b = str;
        }

        public Builder addGenericVariable(String str, String str2) {
            this.h.put(str, str2);
            return this;
        }

        public RtmErrorEvent build() {
            return new RtmErrorEvent(this, 0);
        }

        public Builder withAdditional(String str) {
            this.a.withAdditional(str);
            return this;
        }

        public Builder withErrorLevel(ErrorLevel errorLevel) {
            this.d = errorLevel;
            return this;
        }

        public Builder withPage(String str) {
            this.a.withPage(str);
            return this;
        }

        public Builder withReferrer(String str) {
            this.a.withReferrer(str);
            return this;
        }

        public Builder withRequestId(String str) {
            this.a.withRequestId(str);
            return this;
        }

        public Builder withService(String str) {
            this.a.withService(str);
            return this;
        }

        public Builder withSilent(Boolean bool) {
            this.e = bool;
            return this;
        }

        public Builder withSource(String str) {
            this.a.withSource(str);
            return this;
        }

        public Builder withStacktrace(String str) {
            this.c = str;
            return this;
        }

        public Builder withTable(String str) {
            this.g = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.f = str;
            return this;
        }

        public Builder withVersion(String str) {
            this.a.withVersion(str);
            return this;
        }

        public Builder withVersionFlavor(String str) {
            this.a.withVersionFlavor(str);
            return this;
        }

        public Builder withAdditional(RtmAdditionalData rtmAdditionalData) {
            this.a.withAdditional(rtmAdditionalData);
            return this;
        }

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }
    }

    public /* synthetic */ RtmErrorEvent(Builder builder, int i) {
        this(builder);
    }
}
