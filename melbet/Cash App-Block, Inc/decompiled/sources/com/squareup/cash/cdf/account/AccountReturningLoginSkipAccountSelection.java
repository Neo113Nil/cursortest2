package com.squareup.cash.cdf.account;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class AccountReturningLoginSkipAccountSelection implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final LinkedHashMap parameters = BalanceFeedKt$$ExternalSyntheticOutline0.m$1("cdf_entity", 2, "Account", "cdf_action", "ReturningLogin");
    public final String name = "Account ReturningLogin SkipAccountSelection";

    public final boolean equals(Object obj) {
        return obj instanceof AccountReturningLoginSkipAccountSelection;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return this.name;
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }
}
