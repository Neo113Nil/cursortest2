package io.appmetrica.analytics;

import defpackage.oo31;

/* loaded from: classes9.dex */
public class AppMetricaLibraryAdapterConfig {
    public final Boolean advIdentifiersTracking;

    public static class Builder {
        private Boolean a;

        public AppMetricaLibraryAdapterConfig build() {
            return new AppMetricaLibraryAdapterConfig(this, 0);
        }

        public Builder withAdvIdentifiersTracking(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    private AppMetricaLibraryAdapterConfig(Builder builder) {
        this.advIdentifiersTracking = builder.a;
    }

    public static Builder newConfigBuilder() {
        return new Builder();
    }

    public String toString() {
        return oo31.i(new StringBuilder("AppMetricaLibraryAdapterConfig{advIdentifiersTracking="), this.advIdentifiersTracking, '}');
    }

    public /* synthetic */ AppMetricaLibraryAdapterConfig(Builder builder, int i) {
        this(builder);
    }
}
