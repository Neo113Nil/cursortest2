package com.squareup.cash.cdf.cashcard;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CashCardCustomizeTapDraw implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_pattern;
    public final CustomizeMode new_mode;
    public final LinkedHashMap parameters;

    public CashCardCustomizeTapDraw(CustomizeMode customizeMode, Boolean bool) {
        this.new_mode = customizeMode;
        this.is_pattern = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CashCard", "cdf_action", "Customize");
        Countries.putSafe(m, "new_mode", customizeMode);
        Countries.putSafe(m, "is_pattern", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCardCustomizeTapDraw)) {
            return false;
        }
        CashCardCustomizeTapDraw cashCardCustomizeTapDraw = (CashCardCustomizeTapDraw) obj;
        return this.new_mode == cashCardCustomizeTapDraw.new_mode && this.is_pattern.equals(cashCardCustomizeTapDraw.is_pattern);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard Customize TapDraw";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.is_pattern.hashCode() + (this.new_mode.hashCode() * 31);
    }

    public final String toString() {
        return "CashCardCustomizeTapDraw(new_mode=" + this.new_mode + ", is_pattern=" + this.is_pattern + ")";
    }
}
