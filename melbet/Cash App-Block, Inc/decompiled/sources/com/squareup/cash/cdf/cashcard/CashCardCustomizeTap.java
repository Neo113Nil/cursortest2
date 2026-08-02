package com.squareup.cash.cdf.cashcard;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class CashCardCustomizeTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String flow_token;
    public final Boolean has_customization;
    public final LinkedHashMap parameters;

    public CashCardCustomizeTap(String str, String str2, Boolean bool) {
        this.client_scenario = str;
        this.flow_token = str2;
        this.has_customization = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CashCard", "cdf_action", "Customize");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "has_customization", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCardCustomizeTap)) {
            return false;
        }
        CashCardCustomizeTap cashCardCustomizeTap = (CashCardCustomizeTap) obj;
        return this.client_scenario.equals(cashCardCustomizeTap.client_scenario) && Intrinsics.areEqual(this.flow_token, cashCardCustomizeTap.flow_token) && this.has_customization.equals(cashCardCustomizeTap.has_customization);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard Customize Tap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.client_scenario.hashCode() * 31;
        String str = this.flow_token;
        return this.has_customization.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashCardCustomizeTap(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ", has_customization="), this.has_customization, ")");
    }
}
