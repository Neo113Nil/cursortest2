package com.squareup.cash.clientrouting.routers.merchant;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.analytics.RouteAnalyticsParams$ViewMerchantProfileAnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.merchant.screens.BackNavigationAction;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantAnalytics;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantBlockingScreen;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantInfoFeedbackBottomSheetScreen;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.merchant.screens.SquareLoyaltyDetailsScreen;
import com.squareup.cash.merchant.screens.SquareLoyaltySheetScreen;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MerchantRouter {
    public final Navigator navigator;

    public MerchantRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewMerchantProfile viewMerchantProfile, RoutingParams routingParams) {
        RouteAnalyticsParams$ViewMerchantProfileAnalyticsParams routeAnalyticsParams$ViewMerchantProfileAnalyticsParams;
        GetProfileDetailsContext getProfileDetailsContext;
        viewMerchantProfile.getClass();
        routingParams.getClass();
        AnalyticsParams analyticsParams = routingParams.analyticsParams;
        MerchantScreen$MerchantProfileScreen merchantScreen$MerchantProfileScreen = null;
        if (analyticsParams instanceof AnalyticsParams.GlobalSearchAnalyticsParams) {
            AnalyticsParams.GlobalSearchAnalyticsParams globalSearchAnalyticsParams = (AnalyticsParams.GlobalSearchAnalyticsParams) analyticsParams;
            routeAnalyticsParams$ViewMerchantProfileAnalyticsParams = new RouteAnalyticsParams$ViewMerchantProfileAnalyticsParams(globalSearchAnalyticsParams.currentFlow, globalSearchAnalyticsParams.queryToken);
        } else {
            routeAnalyticsParams$ViewMerchantProfileAnalyticsParams = null;
        }
        String str = viewMerchantProfile.merchantOrBrandToken;
        if (routeAnalyticsParams$ViewMerchantProfileAnalyticsParams == null || (getProfileDetailsContext = routeAnalyticsParams$ViewMerchantProfileAnalyticsParams.currentFlow) == null) {
            getProfileDetailsContext = GetProfileDetailsContext.UNKNOWN;
        }
        GetProfileDetailsContext getProfileDetailsContext2 = getProfileDetailsContext;
        String str2 = routeAnalyticsParams$ViewMerchantProfileAnalyticsParams != null ? routeAnalyticsParams$ViewMerchantProfileAnalyticsParams.queryToken : null;
        MerchantScreen$MerchantAnalytics merchantScreen$MerchantAnalytics = str2 == null ? null : new MerchantScreen$MerchantAnalytics(str2, null);
        String str3 = viewMerchantProfile.genericElementsContext;
        if (str != null && (StringsKt__StringsJVMKt.startsWith(str, "M_", false) || StringsKt__StringsJVMKt.startsWith(str, "BRAND_", false))) {
            merchantScreen$MerchantProfileScreen = new MerchantScreen$MerchantProfileScreen(new RedactedString(str), getProfileDetailsContext2, merchantScreen$MerchantAnalytics, BackNavigationAction.CLOSE, str3);
        }
        if (merchantScreen$MerchantProfileScreen != null) {
            this.navigator.goTo(merchantScreen$MerchantProfileScreen);
        }
    }

    public final void route(ClientRoute.ViewSquareLoyaltySheet viewSquareLoyaltySheet) {
        viewSquareLoyaltySheet.getClass();
        this.navigator.goTo(new SquareLoyaltySheetScreen(viewSquareLoyaltySheet.entityToken, viewSquareLoyaltySheet.genericElementsContext, null));
    }

    public final void route(ClientRoute.ViewSquareLoyaltyDetails viewSquareLoyaltyDetails) {
        viewSquareLoyaltyDetails.getClass();
        this.navigator.goTo(new SquareLoyaltyDetailsScreen(viewSquareLoyaltyDetails.entityToken, viewSquareLoyaltyDetails.genericElementsContext, 28));
    }

    public final void route(ClientRoute.ViewSquareLoyaltyStatusTierDetails viewSquareLoyaltyStatusTierDetails) {
        viewSquareLoyaltyStatusTierDetails.getClass();
        this.navigator.goTo(new SquareLoyaltyDetailsScreen(viewSquareLoyaltyStatusTierDetails.entityToken, viewSquareLoyaltyStatusTierDetails.genericElementsContext, 12));
    }

    public final void route(ClientRoute.ViewCardBlockedBusinesses viewCardBlockedBusinesses) {
        viewCardBlockedBusinesses.getClass();
        this.navigator.goTo(new MerchantScreen$MerchantBlockingScreen(true));
    }

    public final void route(ClientRoute.ViewCardMerchantInfoFeedback viewCardMerchantInfoFeedback) {
        viewCardMerchantInfoFeedback.getClass();
        this.navigator.goTo(new MerchantScreen$MerchantInfoFeedbackBottomSheetScreen(viewCardMerchantInfoFeedback.merchantToken, viewCardMerchantInfoFeedback.transactionToken, null));
    }

    public final void route(ClientRoute.ViewCardMerchantInfoFeedbackWithAddress viewCardMerchantInfoFeedbackWithAddress) {
        viewCardMerchantInfoFeedbackWithAddress.getClass();
        String str = viewCardMerchantInfoFeedbackWithAddress.merchantToken;
        String str2 = viewCardMerchantInfoFeedbackWithAddress.transactionToken;
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewCardMerchantInfoFeedbackWithAddress.address);
        this.navigator.goTo(new MerchantScreen$MerchantInfoFeedbackBottomSheetScreen(str, str2, decodeBase64 != null ? decodeBase64.utf8() : null));
    }
}
