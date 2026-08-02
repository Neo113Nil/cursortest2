package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CryptoSendSubmitAmount implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "Send");

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CryptoSendSubmitAmount);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Send SubmitAmount";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "CryptoSendSubmitAmount(source=null)";
    }
}
