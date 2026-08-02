package com.squareup.cash.boost.backend;

import android.content.SharedPreferences;
import com.squareup.cash.integration.analytics.RealUuidGenerator;

/* loaded from: classes7.dex */
public final class RealBoostAnalyticsHelper {
    public final SharedPreferences preferences;

    public RealBoostAnalyticsHelper(SharedPreferences sharedPreferences, RealUuidGenerator realUuidGenerator) {
        this.preferences = sharedPreferences;
    }

    public final String getFlowToken() {
        SharedPreferences sharedPreferences = this.preferences;
        String string2 = sharedPreferences.getString("BOOST_FLOW_TOKEN", null);
        if (string2 != null) {
            return string2;
        }
        String uuid = RealUuidGenerator.generate().toString();
        sharedPreferences.edit().putString("BOOST_FLOW_TOKEN", uuid).apply();
        uuid.getClass();
        return uuid;
    }
}
