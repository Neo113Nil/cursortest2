package io.appmetrica.analytics;

import io.appmetrica.analytics.RtmEvent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class RtmClientEvent extends RtmEvent {
    public final Map<String, String> customVars;
    public final Boolean loggedIn;
    public final String name;
    public final String value;
    public final String valueType;

    private RtmClientEvent(Builder builder) {
        super(builder.a);
        this.name = builder.b;
        this.value = builder.c;
        this.valueType = builder.d;
        this.loggedIn = builder.e;
        this.customVars = builder.f;
    }

    public static Builder newBuilder(String str, float f) {
        return new Builder(str, String.valueOf(f), "FLOAT", 0);
    }

    public static class Builder {
        private final RtmEvent.Builder a;
        private final String b;
        private final String c;
        private final String d;
        private Boolean e;
        private HashMap f;

        private Builder(String str, String str2, String str3) {
            this.f = new HashMap();
            this.a = RtmEvent.newBaseBuilder();
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public RtmClientEvent build() {
            return new RtmClientEvent(this, 0);
        }

        public Builder withAdditional(String str) {
            this.a.withAdditional(str);
            return this;
        }

        public Builder withCustomVars(Map<String, String> map) {
            this.f = new HashMap(map);
            return this;
        }

        public Builder withLoggedIn(Boolean bool) {
            this.e = bool;
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

        public Builder withSource(String str) {
            this.a.withSource(str);
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

        public /* synthetic */ Builder(String str, String str2, String str3, int i) {
            this(str, str2, str3);
        }
    }

    public static Builder newBuilder(String str, String str2) {
        return new Builder(str, str2, "STRING", 0);
    }

    public static Builder newBuilder(String str, int i) {
        return new Builder(str, String.valueOf(i), "INT", 0);
    }

    public /* synthetic */ RtmClientEvent(Builder builder, int i) {
        this(builder);
    }
}
