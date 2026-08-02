package com.squareup.cash.featureflags;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class JsonFeatureFlags$MobileObservabilityConfig extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$MobileObservabilityConfig INSTANCE = new JsonFeatureFlags$MobileObservabilityConfig(Config.class, new FeatureFlag$JsonFeatureFlag.Options("default", new Config(0, 0, 0, 7, null)), "cashclient/mobile_observability_config");

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/featureflags/JsonFeatureFlags$MobileObservabilityConfig$Config", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class Config {
        public final int datadogRumSampleRateAndroid;
        public final int datadogTelemetrySampleRateAndroid;
        public final int datadogTracerSampleRateAndroid;

        public /* synthetic */ Config(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.datadogRumSampleRateAndroid == config.datadogRumSampleRateAndroid && this.datadogTelemetrySampleRateAndroid == config.datadogTelemetrySampleRateAndroid && this.datadogTracerSampleRateAndroid == config.datadogTracerSampleRateAndroid;
        }

        public final int hashCode() {
            return Integer.hashCode(this.datadogTracerSampleRateAndroid) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.datadogTelemetrySampleRateAndroid, Integer.hashCode(this.datadogRumSampleRateAndroid) * 31, 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.datadogTracerSampleRateAndroid, ")", Recorder$$ExternalSyntheticOutline2.m107m(this.datadogRumSampleRateAndroid, this.datadogTelemetrySampleRateAndroid, "Config(datadogRumSampleRateAndroid=", ", datadogTelemetrySampleRateAndroid=", ", datadogTracerSampleRateAndroid="));
        }

        public Config(int i, int i2, int i3) {
            this.datadogRumSampleRateAndroid = i;
            this.datadogTelemetrySampleRateAndroid = i2;
            this.datadogTracerSampleRateAndroid = i3;
        }
    }
}
