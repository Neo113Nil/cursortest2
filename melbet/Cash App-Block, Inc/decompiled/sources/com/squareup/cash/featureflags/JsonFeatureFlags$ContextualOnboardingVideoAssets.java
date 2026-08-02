package com.squareup.cash.featureflags;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class JsonFeatureFlags$ContextualOnboardingVideoAssets extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$ContextualOnboardingVideoAssets INSTANCE = new JsonFeatureFlags$ContextualOnboardingVideoAssets(Config.class, new FeatureFlag$JsonFeatureFlag.Options("default", new Config(false, null, null, 7, null)), "cashclient/contextual_onboarding_video_assets");

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/featureflags/JsonFeatureFlags$ContextualOnboardingVideoAssets$Config", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class Config {
        public final boolean enabled;
        public final String placeholderImageUrl;
        public final String videoUrl;

        public /* synthetic */ Config(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 1) != 0 ? false : z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enabled == config.enabled && Intrinsics.areEqual(this.placeholderImageUrl, config.placeholderImageUrl) && Intrinsics.areEqual(this.videoUrl, config.videoUrl);
        }

        public final int hashCode() {
            return this.videoUrl.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.enabled) * 31, 31, this.placeholderImageUrl);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("Config(enabled=", ", placeholderImageUrl=", this.placeholderImageUrl, ", videoUrl=", this.enabled), this.videoUrl, ")");
        }

        public Config(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.enabled = z;
            this.placeholderImageUrl = str;
            this.videoUrl = str2;
        }
    }
}
