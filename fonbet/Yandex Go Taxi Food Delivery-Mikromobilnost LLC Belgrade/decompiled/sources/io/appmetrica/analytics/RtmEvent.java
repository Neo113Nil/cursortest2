package io.appmetrica.analytics;

/* loaded from: classes9.dex */
public abstract class RtmEvent {
    public final String additional;
    public final RtmAdditionalData compositeAdditional;
    public final String page;
    public final String referrer;
    public final String requestId;
    public final String service;
    public final String source;
    public final String version;
    public final String versionFlavor;

    public RtmEvent(Builder builder) {
        this.version = builder.a;
        this.versionFlavor = builder.b;
        this.service = builder.c;
        this.source = builder.d;
        this.referrer = builder.e;
        this.additional = builder.f;
        this.compositeAdditional = builder.g;
        this.page = builder.h;
        this.requestId = builder.i;
    }

    public static Builder newBaseBuilder() {
        return new Builder(0);
    }

    public static class Builder {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private RtmAdditionalData g;
        private String h;
        private String i;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder withAdditional(String str) {
            this.f = str;
            return this;
        }

        public Builder withPage(String str) {
            this.h = str;
            return this;
        }

        public Builder withReferrer(String str) {
            this.e = str;
            return this;
        }

        public Builder withRequestId(String str) {
            this.i = str;
            return this;
        }

        public Builder withService(String str) {
            this.c = str;
            return this;
        }

        public Builder withSource(String str) {
            this.d = str;
            return this;
        }

        public Builder withVersion(String str) {
            this.a = str;
            return this;
        }

        public Builder withVersionFlavor(String str) {
            this.b = str;
            return this;
        }

        public Builder withAdditional(RtmAdditionalData rtmAdditionalData) {
            this.g = rtmAdditionalData;
            return this;
        }

        private Builder() {
        }
    }
}
