package com.squareup.cash.cdf.appsflyerdeeplink;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AppsFlyerDeepLinkNavigationOutcomeComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final String appsflyer_id;
    public final Handler handler;
    public final Boolean is_successful;
    public final LinkedHashMap parameters;
    public final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class Handler {
        public static final /* synthetic */ Handler[] $VALUES;
        public static final Handler CLIENT_ROUTER;
        public static final Handler DEEP_LINKING;
        public static final Handler EXTERNAL_BROWSER_FALLBACK;

        static {
            Handler handler = new Handler("DEEP_LINKING", 0);
            DEEP_LINKING = handler;
            Handler handler2 = new Handler("CLIENT_ROUTER", 1);
            CLIENT_ROUTER = handler2;
            Handler handler3 = new Handler("EXTERNAL_BROWSER_FALLBACK", 2);
            EXTERNAL_BROWSER_FALLBACK = handler3;
            $VALUES = new Handler[]{handler, handler2, handler3};
        }

        public static Handler valueOf(String str) {
            return (Handler) Enum.valueOf(Handler.class, str);
        }

        public static Handler[] values() {
            return (Handler[]) $VALUES.clone();
        }
    }

    public AppsFlyerDeepLinkNavigationOutcomeComplete(String str, Boolean bool, Handler handler, String str2) {
        this.url = str;
        this.is_successful = bool;
        this.handler = handler;
        this.appsflyer_id = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "AppsFlyerDeepLink", "cdf_action", "NavigationOutcome");
        Countries.putSafe(m, "url", str);
        Countries.putSafe(m, "is_successful", bool);
        Countries.putSafe(m, "handler", handler);
        Countries.putSafe(m, "appsflyer_id", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsFlyerDeepLinkNavigationOutcomeComplete)) {
            return false;
        }
        AppsFlyerDeepLinkNavigationOutcomeComplete appsFlyerDeepLinkNavigationOutcomeComplete = (AppsFlyerDeepLinkNavigationOutcomeComplete) obj;
        return Intrinsics.areEqual(this.url, appsFlyerDeepLinkNavigationOutcomeComplete.url) && this.is_successful.equals(appsFlyerDeepLinkNavigationOutcomeComplete.is_successful) && this.handler == appsFlyerDeepLinkNavigationOutcomeComplete.handler && Intrinsics.areEqual(this.appsflyer_id, appsFlyerDeepLinkNavigationOutcomeComplete.appsflyer_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AppsFlyerDeepLink NavigationOutcome Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.url;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_successful, (str == null ? 0 : str.hashCode()) * 31, 31);
        Handler handler = this.handler;
        int hashCode = (m + (handler == null ? 0 : handler.hashCode())) * 31;
        String str2 = this.appsflyer_id;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.is_successful, "AppsFlyerDeepLinkNavigationOutcomeComplete(url=", this.url, ", is_successful=", ", handler=");
        m.append(this.handler);
        m.append(", appsflyer_id=");
        m.append(this.appsflyer_id);
        m.append(")");
        return m.toString();
    }
}
