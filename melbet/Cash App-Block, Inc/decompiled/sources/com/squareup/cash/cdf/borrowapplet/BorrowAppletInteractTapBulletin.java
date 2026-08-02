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
public final class BorrowAppletInteractTapBulletin implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String identifier;
    public final LinkedHashMap parameters;
    public final String route_url;

    public BorrowAppletInteractTapBulletin(String str, String str2) {
        this.identifier = str;
        this.route_url = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "BorrowApplet", "cdf_action", "Interact");
        Countries.putSafe(m, "identifier", str);
        Countries.putSafe(m, "route_url", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorrowAppletInteractTapBulletin)) {
            return false;
        }
        BorrowAppletInteractTapBulletin borrowAppletInteractTapBulletin = (BorrowAppletInteractTapBulletin) obj;
        return Intrinsics.areEqual(this.identifier, borrowAppletInteractTapBulletin.identifier) && Intrinsics.areEqual(this.route_url, borrowAppletInteractTapBulletin.route_url);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BorrowApplet Interact TapBulletin";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.identifier;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.route_url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("BorrowAppletInteractTapBulletin(identifier=", this.identifier, ", route_url=", this.route_url, ")");
    }
}
