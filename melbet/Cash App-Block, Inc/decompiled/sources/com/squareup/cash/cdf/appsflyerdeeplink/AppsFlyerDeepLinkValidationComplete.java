package com.squareup.cash.cdf.appsflyerdeeplink;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AppsFlyerDeepLinkValidationComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final String appsflyer_id;
    public final Boolean is_valid;
    public final LinkedHashMap parameters;
    public final String url;

    public AppsFlyerDeepLinkValidationComplete(Boolean bool, String str, String str2) {
        this.url = str;
        this.is_valid = bool;
        this.appsflyer_id = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "AppsFlyerDeepLink", "cdf_action", "Validation");
        Countries.putSafe(m, "url", str);
        Countries.putSafe(m, "is_valid", bool);
        Countries.putSafe(m, "appsflyer_id", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsFlyerDeepLinkValidationComplete)) {
            return false;
        }
        AppsFlyerDeepLinkValidationComplete appsFlyerDeepLinkValidationComplete = (AppsFlyerDeepLinkValidationComplete) obj;
        return Intrinsics.areEqual(this.url, appsFlyerDeepLinkValidationComplete.url) && this.is_valid.equals(appsFlyerDeepLinkValidationComplete.is_valid) && Intrinsics.areEqual(this.appsflyer_id, appsFlyerDeepLinkValidationComplete.appsflyer_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AppsFlyerDeepLink Validation Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.url;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_valid, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.appsflyer_id;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Thread$State$EnumUnboxingLocalUtility.m(this.is_valid, "AppsFlyerDeepLinkValidationComplete(url=", this.url, ", is_valid=", ", appsflyer_id="), this.appsflyer_id, ")");
    }
}
