package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class JsonFeatureFlags$MobileDependenciesConfig extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$MobileDependenciesConfig INSTANCE = new JsonFeatureFlags$MobileDependenciesConfig(Config.class, new FeatureFlag$JsonFeatureFlag.Options("default", new Config(null, 1, 0 == true ? 1 : 0)), "cashclient/mobile_dependencies_config");

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/featureflags/JsonFeatureFlags$MobileDependenciesConfig$FillrConfig", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class FillrConfig {
        public final boolean enabled;
        public final List merchantDenyList;

        public FillrConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? EmptyList.INSTANCE : list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FillrConfig)) {
                return false;
            }
            FillrConfig fillrConfig = (FillrConfig) obj;
            return this.enabled == fillrConfig.enabled && Intrinsics.areEqual(this.merchantDenyList, fillrConfig.merchantDenyList);
        }

        public final int hashCode() {
            return this.merchantDenyList.hashCode() + (Boolean.hashCode(this.enabled) * 31);
        }

        public final String toString() {
            return "FillrConfig(enabled=" + this.enabled + ", merchantDenyList=" + this.merchantDenyList + ")";
        }

        public FillrConfig(boolean z, List list) {
            list.getClass();
            this.enabled = z;
            this.merchantDenyList = list;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/featureflags/JsonFeatureFlags$MobileDependenciesConfig$Config", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class Config {
        public final FillrConfig fillr;

        public /* synthetic */ Config(FillrConfig fillrConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new FillrConfig(false, null, 3, null) : fillrConfig);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && Intrinsics.areEqual(this.fillr, ((Config) obj).fillr);
        }

        public final int hashCode() {
            return this.fillr.hashCode();
        }

        public final String toString() {
            return "Config(fillr=" + this.fillr + ")";
        }

        public Config(FillrConfig fillrConfig) {
            fillrConfig.getClass();
            this.fillr = fillrConfig;
        }
    }
}
