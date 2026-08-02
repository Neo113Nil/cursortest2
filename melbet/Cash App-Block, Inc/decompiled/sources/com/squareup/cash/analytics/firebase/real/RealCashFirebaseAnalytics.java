package com.squareup.cash.analytics.firebase.real;

import com.braze.enums.DataStoreKey$$ExternalSyntheticLambda0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ParametersBuilder;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.integration.analytics.Analytics;
import dev.zacsweers.metro.internal.Factory;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class RealCashFirebaseAnalytics implements Analytics {
    public final Lazy firebaseAnalytics$delegate = LazyKt.lazy(new DataStoreKey$$ExternalSyntheticLambda0(20));
    public static final Set allowedClientScenarios = SetsKt__SetsJVMKt.setOf("EXCHANGE_EQUITY");
    public static final Set allowedBlockerIds = ArraysKt___ArraysKt.toSet(new String[]{"TRADE_CONFIRMATION_BLOCKER_DESCRIPTOR_ID", "INVEST_EQUITY_TRADE_CONFIRMATION"});
    public static final Set allowedEvents = ArraysKt___ArraysKt.toSet(new String[]{"Alias Register Complete", "Boost Add Select", "CashCard Activate Start", "CashAppPay Auth Start", "Crypto Trade Complete", "BlockerFlow Interact ViewBlockerResponse"});

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealCashFirebaseAnalytics();
        }
    }

    public static void sendEvent(FirebaseAnalytics firebaseAnalytics, String str, Map map) {
        str.getClass();
        String replace = StringsKt__StringsJVMKt.replace(str, ' ', '_', false);
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            str3.getClass();
            parametersBuilder.param(str2, StringsKt__StringsJVMKt.replace(str3, ' ', '_', false));
        }
        firebaseAnalytics.logEvent(parametersBuilder.getBundle(), replace);
    }

    public final void logEvent(Map map, String str, boolean z) {
        str.getClass();
        map.getClass();
        if (!(z && allowedEvents.contains(str)) && z) {
            return;
        }
        boolean equals = str.equals("BlockerFlow Interact ViewBlockerResponse");
        Lazy lazy = this.firebaseAnalytics$delegate;
        if (!equals) {
            sendEvent((FirebaseAnalytics) lazy.getValue(), str, map);
        } else if (str.equals("BlockerFlow Interact ViewBlockerResponse") && Intrinsics.areEqual(map.get("status"), "SUCCESS") && CollectionsKt.contains(allowedClientScenarios, map.get("client_scenario")) && CollectionsKt.contains(allowedBlockerIds, map.get("blocker_id"))) {
            sendEvent((FirebaseAnalytics) lazy.getValue(), "Successful_Money_Movement_Equities", map);
        }
    }

    @Override // com.squareup.cash.integration.analytics.Analytics
    public final void track(Event event, Long l) {
        event.getClass();
        logEvent(event.getParameters(), event.getName(), true);
    }
}
