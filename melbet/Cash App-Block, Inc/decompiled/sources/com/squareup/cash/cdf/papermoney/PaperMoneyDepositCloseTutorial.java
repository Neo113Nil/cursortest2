package com.squareup.cash.cdf.papermoney;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositCloseTutorial implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Boolean viewed_all_content;

    public PaperMoneyDepositCloseTutorial(Boolean bool) {
        this.viewed_all_content = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "PaperMoney", "cdf_action", "Deposit");
        Countries.putSafe(m, "viewed_all_content", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaperMoneyDepositCloseTutorial) && this.viewed_all_content.equals(((PaperMoneyDepositCloseTutorial) obj).viewed_all_content);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PaperMoney Deposit CloseTutorial";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.viewed_all_content.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.viewed_all_content, "PaperMoneyDepositCloseTutorial(viewed_all_content=", ")");
    }
}
