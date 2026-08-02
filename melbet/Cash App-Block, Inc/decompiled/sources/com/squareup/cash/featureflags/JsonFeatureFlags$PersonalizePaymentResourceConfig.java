package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class JsonFeatureFlags$PersonalizePaymentResourceConfig extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$PersonalizePaymentResourceConfig INSTANCE = new JsonFeatureFlags$PersonalizePaymentResourceConfig(ResourceConfigVersion.class, new FeatureFlag$JsonFeatureFlag.Options("default", new ResourceConfigVersion(0, 1, null)), "cashclient/personalization_resources_config");

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/featureflags/JsonFeatureFlags$PersonalizePaymentResourceConfig$ResourceConfigVersion", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class ResourceConfigVersion {
        public final int version;

        public /* synthetic */ ResourceConfigVersion(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResourceConfigVersion) && this.version == ((ResourceConfigVersion) obj).version;
        }

        public final int hashCode() {
            return Integer.hashCode(this.version);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.version, "ResourceConfigVersion(version=", ")");
        }

        public ResourceConfigVersion(int i) {
            this.version = i;
        }
    }
}
