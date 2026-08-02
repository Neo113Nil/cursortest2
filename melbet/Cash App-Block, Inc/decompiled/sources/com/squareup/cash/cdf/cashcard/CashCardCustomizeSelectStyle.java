package com.squareup.cash.cdf.cashcard;

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
public final class CashCardCustomizeSelectStyle implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String flow_token;
    public final Integer index;
    public final LinkedHashMap parameters;
    public final String theme_token;

    public CashCardCustomizeSelectStyle(Integer num, String str, String str2, String str3) {
        this.theme_token = str;
        this.client_scenario = str2;
        this.flow_token = str3;
        this.index = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CashCard", "cdf_action", "Customize");
        Countries.putSafe(m, "theme_token", str);
        Countries.putSafe(m, "client_scenario", str2);
        Countries.putSafe(m, "flow_token", str3);
        Countries.putSafe(m, "index", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCardCustomizeSelectStyle)) {
            return false;
        }
        CashCardCustomizeSelectStyle cashCardCustomizeSelectStyle = (CashCardCustomizeSelectStyle) obj;
        return Intrinsics.areEqual(this.theme_token, cashCardCustomizeSelectStyle.theme_token) && this.client_scenario.equals(cashCardCustomizeSelectStyle.client_scenario) && Intrinsics.areEqual(this.flow_token, cashCardCustomizeSelectStyle.flow_token) && this.index.equals(cashCardCustomizeSelectStyle.index);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard Customize SelectStyle";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.theme_token;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.client_scenario);
        String str2 = this.flow_token;
        return this.index.hashCode() + ((m + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashCardCustomizeSelectStyle(theme_token=", this.theme_token, ", client_scenario=", this.client_scenario, ", flow_token=");
        m.append(this.flow_token);
        m.append(", index=");
        m.append(this.index);
        m.append(")");
        return m.toString();
    }
}
