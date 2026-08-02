package com.squareup.cash.attribution;

import com.squareup.cash.analytics.firebase.real.RealCashFirebaseAnalytics;
import com.squareup.cash.attribution.wrappers.AppsFlyerClient;
import com.squareup.cash.attribution.wrappers.ProductionAppsFlyerClient;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.api.Role;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class ProductionAttributionEventEmitter {
    public final AppsFlyerClient appsFlyerClient;
    public final RealCashFirebaseAnalytics cashFirebaseAnalytics;

    public ProductionAttributionEventEmitter(AppsFlyerClient appsFlyerClient, RealCashFirebaseAnalytics realCashFirebaseAnalytics, Analytics analytics) {
        this.appsFlyerClient = appsFlyerClient;
        this.cashFirebaseAnalytics = realCashFirebaseAnalytics;
    }

    public final void paymentConfirmationInitiated() {
        trackEvent("Attempted Money Movement", MapsKt__MapsKt.mutableMapOf(new Pair("type", "p2p")));
    }

    public final void paymentConfirmationSuccessful(Role role) {
        role.getClass();
        trackEvent("Successful Money Movement", MapsKt__MapsKt.mutableMapOf(new Pair("type", "p2p")));
    }

    public final void trackEvent(String str, LinkedHashMap linkedHashMap) {
        Map<String, Object> asMutableMap = TypeIntrinsics.asMutableMap(linkedHashMap);
        ProductionAppsFlyerClient productionAppsFlyerClient = (ProductionAppsFlyerClient) this.appsFlyerClient;
        asMutableMap.getClass();
        productionAppsFlyerClient.getAppsFlyerLib().logEvent(productionAppsFlyerClient.f1049app, str, asMutableMap);
        Timber.Forest.v("trackEvent: " + str + " (" + asMutableMap + ")", new Object[0]);
        this.cashFirebaseAnalytics.logEvent(linkedHashMap, str, false);
    }
}
