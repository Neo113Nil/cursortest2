package com.squareup.cash.cdf.crypto;

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
public final class CryptoDepositRefreshInvoice implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean invoice_ids_match;
    public final LinkedHashMap parameters;

    public CryptoDepositRefreshInvoice(Boolean bool) {
        this.invoice_ids_match = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "Deposit");
        Countries.putSafe(m, "invoice_ids_match", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoDepositRefreshInvoice) && this.invoice_ids_match.equals(((CryptoDepositRefreshInvoice) obj).invoice_ids_match);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Deposit RefreshInvoice";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.invoice_ids_match.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.invoice_ids_match, "CryptoDepositRefreshInvoice(invoice_ids_match=", ")");
    }
}
