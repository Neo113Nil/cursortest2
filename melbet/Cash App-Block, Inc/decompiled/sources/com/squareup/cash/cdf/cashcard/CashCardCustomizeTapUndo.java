package com.squareup.cash.cdf.cashcard;

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
public final class CashCardCustomizeTapUndo implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Boolean undoing_pattern;

    public CashCardCustomizeTapUndo(Boolean bool) {
        this.undoing_pattern = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CashCard", "cdf_action", "Customize");
        Countries.putSafe(m, "undoing_pattern", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashCardCustomizeTapUndo) && this.undoing_pattern.equals(((CashCardCustomizeTapUndo) obj).undoing_pattern);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard Customize TapUndo";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.undoing_pattern.hashCode() * 31;
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.undoing_pattern, "CashCardCustomizeTapUndo(undoing_pattern=", ", undo_method=null)");
    }
}
