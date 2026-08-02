package com.squareup.cash.cdf.cashcard;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class CashCardNullStateSelect implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String analytics_key;
    public final Integer index;
    public final String null_state_token;
    public final LinkedHashMap parameters;

    public CashCardNullStateSelect(Integer num, String str, String str2) {
        this.null_state_token = str;
        this.analytics_key = str2;
        this.index = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CashCard", "cdf_action", "NullState");
        Countries.putSafe(m, "null_state_token", str);
        Countries.putSafe(m, "analytics_key", str2);
        Countries.putSafe(m, "index", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCardNullStateSelect)) {
            return false;
        }
        CashCardNullStateSelect cashCardNullStateSelect = (CashCardNullStateSelect) obj;
        return Intrinsics.areEqual(this.null_state_token, cashCardNullStateSelect.null_state_token) && Intrinsics.areEqual(this.analytics_key, cashCardNullStateSelect.analytics_key) && this.index.equals(cashCardNullStateSelect.index);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard NullState Select";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.null_state_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.analytics_key;
        return this.index.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashCardNullStateSelect(null_state_token=", this.null_state_token, ", analytics_key=", this.analytics_key, ", index="), this.index, ")");
    }
}
