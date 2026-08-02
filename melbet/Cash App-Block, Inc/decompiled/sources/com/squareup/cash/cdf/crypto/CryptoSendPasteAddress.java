package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CryptoSendPasteAddress implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ContentType content_type;
    public final LinkedHashMap parameters;

    public CryptoSendPasteAddress(ContentType contentType) {
        this.content_type = contentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Crypto", "cdf_action", "Send");
        Countries.putSafe(m, "content_type", contentType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoSendPasteAddress) && this.content_type == ((CryptoSendPasteAddress) obj).content_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Send PasteAddress";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.content_type.hashCode();
    }

    public final String toString() {
        return "CryptoSendPasteAddress(network_type=null, content_type=" + this.content_type + ")";
    }
}
