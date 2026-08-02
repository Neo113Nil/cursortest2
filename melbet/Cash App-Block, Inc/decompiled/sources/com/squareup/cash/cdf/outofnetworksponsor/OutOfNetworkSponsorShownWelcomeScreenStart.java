package com.squareup.cash.cdf.outofnetworksponsor;

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
public final class OutOfNetworkSponsorShownWelcomeScreenStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String deeplink_payload;
    public final LinkedHashMap parameters;
    public final Inviter who_invited;

    public OutOfNetworkSponsorShownWelcomeScreenStart(String str, Inviter inviter) {
        this.deeplink_payload = str;
        this.who_invited = inviter;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "OutOfNetworkSponsor", "cdf_action", "ShownWelcomeScreen");
        Countries.putSafe(m, "deeplink_payload", str);
        Countries.putSafe(m, "who_invited", inviter);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutOfNetworkSponsorShownWelcomeScreenStart)) {
            return false;
        }
        OutOfNetworkSponsorShownWelcomeScreenStart outOfNetworkSponsorShownWelcomeScreenStart = (OutOfNetworkSponsorShownWelcomeScreenStart) obj;
        return Intrinsics.areEqual(this.deeplink_payload, outOfNetworkSponsorShownWelcomeScreenStart.deeplink_payload) && this.who_invited == outOfNetworkSponsorShownWelcomeScreenStart.who_invited;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "OutOfNetworkSponsor ShownWelcomeScreen Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.deeplink_payload;
        return this.who_invited.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "OutOfNetworkSponsorShownWelcomeScreenStart(deeplink_payload=" + this.deeplink_payload + ", who_invited=" + this.who_invited + ")";
    }
}
