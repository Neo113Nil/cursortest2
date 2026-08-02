package com.squareup.cash.cdf.account;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AccountAuthenticateViewLockSplashScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Integer threshold;
    public final Boolean ui_access_available;

    public AccountAuthenticateViewLockSplashScreen(Integer num, Boolean bool) {
        this.threshold = num;
        this.ui_access_available = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Account", "cdf_action", "Authenticate");
        Countries.putSafe(m, "threshold", num);
        Countries.putSafe(m, "ui_access_available", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAuthenticateViewLockSplashScreen)) {
            return false;
        }
        AccountAuthenticateViewLockSplashScreen accountAuthenticateViewLockSplashScreen = (AccountAuthenticateViewLockSplashScreen) obj;
        return this.threshold.equals(accountAuthenticateViewLockSplashScreen.threshold) && this.ui_access_available.equals(accountAuthenticateViewLockSplashScreen.ui_access_available);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Authenticate ViewLockSplashScreen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.ui_access_available.hashCode() + (this.threshold.hashCode() * 31);
    }

    public final String toString() {
        return "AccountAuthenticateViewLockSplashScreen(threshold=" + this.threshold + ", ui_access_available=" + this.ui_access_available + ")";
    }
}
