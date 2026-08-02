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
public final class OutOfNetworkSponsorShownWelcomeScreenExit implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String deeplink_payload;
    public final LinkedHashMap parameters;
    public final Inviter who_invited;

    public OutOfNetworkSponsorShownWelcomeScreenExit(String str, Inviter inviter) {
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
        if (!(obj instanceof OutOfNetworkSponsorShownWelcomeScreenExit)) {
            return false;
        }
        OutOfNetworkSponsorShownWelcomeScreenExit outOfNetworkSponsorShownWelcomeScreenExit = (OutOfNetworkSponsorShownWelcomeScreenExit) obj;
        return Intrinsics.areEqual(this.deeplink_payload, outOfNetworkSponsorShownWelcomeScreenExit.deeplink_payload) && this.who_invited == outOfNetworkSponsorShownWelcomeScreenExit.who_invited;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "OutOfNetworkSponsor ShownWelcomeScreen Exit";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.deeplink_payload;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Inviter inviter = this.who_invited;
        return hashCode + (inviter != null ? inviter.hashCode() : 0);
    }

    public final String toString() {
        return "OutOfNetworkSponsorShownWelcomeScreenExit(deeplink_payload=" + this.deeplink_payload + ", who_invited=" + this.who_invited + ")";
    }
}
