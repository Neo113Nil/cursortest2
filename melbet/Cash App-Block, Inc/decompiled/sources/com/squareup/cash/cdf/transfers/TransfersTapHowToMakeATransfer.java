package com.squareup.cash.cdf.transfers;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class TransfersTapHowToMakeATransfer implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final LinkedHashMap parameters;
    public final Section section;

    public TransfersTapHowToMakeATransfer(Section section) {
        this.section = section;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Transfers", "cdf_action", "Tap");
        Countries.putSafe(m, "section", section);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransfersTapHowToMakeATransfer) && this.section == ((TransfersTapHowToMakeATransfer) obj).section;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Transfers Tap HowToMakeATransfer";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.section.hashCode();
    }

    public final String toString() {
        return "TransfersTapHowToMakeATransfer(section=" + this.section + ")";
    }
}
