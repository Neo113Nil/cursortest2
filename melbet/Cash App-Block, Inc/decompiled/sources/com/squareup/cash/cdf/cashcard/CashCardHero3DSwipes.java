package com.squareup.cash.cdf.cashcard;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class CashCardHero3DSwipes implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final Integer landed_on_back;
    public final Integer landed_on_front;
    public final LinkedHashMap parameters;

    public CashCardHero3DSwipes(Integer num, Integer num2) {
        this.landed_on_front = num;
        this.landed_on_back = num2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CashCard", "cdf_action", "Hero3D");
        Countries.putSafe(m, "landed_on_front", num);
        Countries.putSafe(m, "landed_on_back", num2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCardHero3DSwipes)) {
            return false;
        }
        CashCardHero3DSwipes cashCardHero3DSwipes = (CashCardHero3DSwipes) obj;
        return this.landed_on_front.equals(cashCardHero3DSwipes.landed_on_front) && this.landed_on_back.equals(cashCardHero3DSwipes.landed_on_back);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard Hero3D Swipes";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.landed_on_back.hashCode() + (this.landed_on_front.hashCode() * 31);
    }

    public final String toString() {
        return "CashCardHero3DSwipes(landed_on_front=" + this.landed_on_front + ", landed_on_back=" + this.landed_on_back + ")";
    }
}
