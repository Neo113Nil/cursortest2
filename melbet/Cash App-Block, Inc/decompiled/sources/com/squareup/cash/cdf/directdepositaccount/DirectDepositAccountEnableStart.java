package com.squareup.cash.cdf.directdepositaccount;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DirectDepositAccountEnableStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final LinkedHashMap parameters;
    public final Boolean view_modal;

    public DirectDepositAccountEnableStart(String str, int i) {
        Boolean bool = Boolean.TRUE;
        str = (i & 1) != 0 ? null : str;
        bool = (i & 2) != 0 ? null : bool;
        this.client_scenario = str;
        this.view_modal = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "DirectDepositAccount", "cdf_action", "Enable");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "view_modal", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectDepositAccountEnableStart)) {
            return false;
        }
        DirectDepositAccountEnableStart directDepositAccountEnableStart = (DirectDepositAccountEnableStart) obj;
        return Intrinsics.areEqual(this.client_scenario, directDepositAccountEnableStart.client_scenario) && Intrinsics.areEqual(this.view_modal, directDepositAccountEnableStart.view_modal);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "DirectDepositAccount Enable Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.view_modal;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "DirectDepositAccountEnableStart(client_scenario=" + this.client_scenario + ", view_modal=" + this.view_modal + ")";
    }
}
