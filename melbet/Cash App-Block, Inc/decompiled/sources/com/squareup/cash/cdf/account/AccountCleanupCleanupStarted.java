package com.squareup.cash.cdf.account;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class AccountCleanupCleanupStarted implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final CleanupStyle style;

    public AccountCleanupCleanupStarted(CleanupStyle cleanupStyle) {
        this.style = cleanupStyle;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Account", "cdf_action", "Cleanup");
        Countries.putSafe(m, "style", cleanupStyle);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountCleanupCleanupStarted) && this.style == ((AccountCleanupCleanupStarted) obj).style;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Cleanup CleanupStarted";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.style.hashCode();
    }

    public final String toString() {
        return "AccountCleanupCleanupStarted(style=" + this.style + ")";
    }
}
