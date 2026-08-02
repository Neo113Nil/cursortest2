package com.squareup.cash.cdf.borrowlimithub;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BorrowLimitHubViewBulletinSheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String identifier;
    public final LinkedHashMap parameters;

    public BorrowLimitHubViewBulletinSheet(String str) {
        this.identifier = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BorrowLimitHub", "cdf_action", "View");
        Countries.putSafe(m, "identifier", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowLimitHubViewBulletinSheet) && Intrinsics.areEqual(this.identifier, ((BorrowLimitHubViewBulletinSheet) obj).identifier);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BorrowLimitHub View BulletinSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.identifier;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BorrowLimitHubViewBulletinSheet(identifier=", this.identifier, ")");
    }
}
