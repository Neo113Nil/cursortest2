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
public final class AccountCleanupCleanupCompleted implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final CleanupStyle style;

    public AccountCleanupCleanupCompleted(CleanupStyle cleanupStyle) {
        this.style = cleanupStyle;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Account", "cdf_action", "Cleanup");
        Countries.putSafe(m, "style", cleanupStyle);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountCleanupCleanupCompleted) && this.style == ((AccountCleanupCleanupCompleted) obj).style;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Cleanup CleanupCompleted";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.style.hashCode() * 31;
    }

    public final String toString() {
        return "AccountCleanupCleanupCompleted(style=" + this.style + ", duration_ms=null)";
    }
}
