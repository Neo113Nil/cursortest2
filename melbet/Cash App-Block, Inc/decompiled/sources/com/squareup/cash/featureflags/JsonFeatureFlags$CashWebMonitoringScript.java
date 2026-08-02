package com.squareup.cash.featureflags;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class JsonFeatureFlags$CashWebMonitoringScript extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$CashWebMonitoringScript INSTANCE = new JsonFeatureFlags$CashWebMonitoringScript(WebMonitoringOptions.class, new FeatureFlag$JsonFeatureFlag.Options("default", new WebMonitoringOptions(false, null, null, 7, null)), "cashclient/cash_web_monitoring_script");

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/featureflags/JsonFeatureFlags$CashWebMonitoringScript$WebMonitoringOptions", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class WebMonitoringOptions {
        public final boolean enabled;
        public final String scriptRootFolderPath;
        public final String scriptVersion;

        public /* synthetic */ WebMonitoringOptions(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 1) != 0 ? false : z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebMonitoringOptions)) {
                return false;
            }
            WebMonitoringOptions webMonitoringOptions = (WebMonitoringOptions) obj;
            return this.enabled == webMonitoringOptions.enabled && Intrinsics.areEqual(this.scriptRootFolderPath, webMonitoringOptions.scriptRootFolderPath) && Intrinsics.areEqual(this.scriptVersion, webMonitoringOptions.scriptVersion);
        }

        public final int hashCode() {
            return this.scriptVersion.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.enabled) * 31, 31, this.scriptRootFolderPath);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("WebMonitoringOptions(enabled=", ", scriptRootFolderPath=", this.scriptRootFolderPath, ", scriptVersion=", this.enabled), this.scriptVersion, ")");
        }

        public WebMonitoringOptions(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.enabled = z;
            this.scriptRootFolderPath = str;
            this.scriptVersion = str2;
        }
    }
}
