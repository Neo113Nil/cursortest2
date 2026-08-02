package com.squareup.cash.cdf.borrowapplet;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class BorrowAppletViewUpsellCard implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String identifier;
    public final LinkedHashMap parameters;
    public final String route_url;

    public BorrowAppletViewUpsellCard(String str, String str2) {
        this.route_url = str;
        this.identifier = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "BorrowApplet", "cdf_action", "View");
        Countries.putSafe(m, "route_url", str);
        Countries.putSafe(m, "identifier", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorrowAppletViewUpsellCard)) {
            return false;
        }
        BorrowAppletViewUpsellCard borrowAppletViewUpsellCard = (BorrowAppletViewUpsellCard) obj;
        return Intrinsics.areEqual(this.route_url, borrowAppletViewUpsellCard.route_url) && Intrinsics.areEqual(this.identifier, borrowAppletViewUpsellCard.identifier);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BorrowApplet View UpsellCard";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.route_url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.identifier;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("BorrowAppletViewUpsellCard(route_url=", this.route_url, ", identifier=", this.identifier, ")");
    }
}
