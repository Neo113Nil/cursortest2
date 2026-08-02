package com.squareup.cash.shopping.backend.real;

import android.content.SharedPreferences;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.shopping.backend.analytics.ShopHubAnalyticsHelper$Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes7.dex */
public final class RealShopHubAnalyticsHelper {
    public final SharedPreferences preferences;

    public RealShopHubAnalyticsHelper(SharedPreferences sharedPreferences, RealUuidGenerator realUuidGenerator) {
        this.preferences = sharedPreferences;
        FlowKt.MutableStateFlow(null);
    }

    public final String getFlowToken(ShopHubAnalyticsHelper$Flow shopHubAnalyticsHelper$Flow) {
        String str = shopHubAnalyticsHelper$Flow.key;
        SharedPreferences sharedPreferences = this.preferences;
        String string2 = sharedPreferences.getString(str, null);
        if (string2 != null) {
            return string2;
        }
        String m = re$$ExternalSyntheticOutline0.m();
        sharedPreferences.edit().putString(str, m).apply();
        return m;
    }
}
