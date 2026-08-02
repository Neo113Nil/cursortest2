package com.squareup.cash.attribution.deeplink;

import com.squareup.cash.cdf.appsflyerdeeplink.AppsFlyerDeepLinkNavigationOutcomeComplete;

/* loaded from: classes5.dex */
public final class RealDeferredDeepLinkNavigator$NavigationResult {
    public final AppsFlyerDeepLinkNavigationOutcomeComplete.Handler handler;
    public final boolean isSuccessful;

    public RealDeferredDeepLinkNavigator$NavigationResult(boolean z, AppsFlyerDeepLinkNavigationOutcomeComplete.Handler handler) {
        this.isSuccessful = z;
        this.handler = handler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealDeferredDeepLinkNavigator$NavigationResult)) {
            return false;
        }
        RealDeferredDeepLinkNavigator$NavigationResult realDeferredDeepLinkNavigator$NavigationResult = (RealDeferredDeepLinkNavigator$NavigationResult) obj;
        return this.isSuccessful == realDeferredDeepLinkNavigator$NavigationResult.isSuccessful && this.handler == realDeferredDeepLinkNavigator$NavigationResult.handler;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isSuccessful) * 31;
        AppsFlyerDeepLinkNavigationOutcomeComplete.Handler handler = this.handler;
        return hashCode + (handler == null ? 0 : handler.hashCode());
    }

    public final String toString() {
        return "NavigationResult(isSuccessful=" + this.isSuccessful + ", handler=" + this.handler + ")";
    }
}
