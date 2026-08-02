package com.squareup.cash.cdf.crypto;

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
public final class CryptoDepositCreateInvoice implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long amount_in_sats;
    public final Boolean note_included;
    public final LinkedHashMap parameters;

    public CryptoDepositCreateInvoice(Boolean bool, Long l) {
        this.amount_in_sats = l;
        this.note_included = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Crypto", "cdf_action", "Deposit");
        Countries.putSafe(m, "amount_in_sats", l);
        Countries.putSafe(m, "note_included", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoDepositCreateInvoice)) {
            return false;
        }
        CryptoDepositCreateInvoice cryptoDepositCreateInvoice = (CryptoDepositCreateInvoice) obj;
        return Intrinsics.areEqual(this.amount_in_sats, cryptoDepositCreateInvoice.amount_in_sats) && this.note_included.equals(cryptoDepositCreateInvoice.note_included);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Deposit CreateInvoice";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Long l = this.amount_in_sats;
        return this.note_included.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "CryptoDepositCreateInvoice(amount_in_sats=" + this.amount_in_sats + ", note_included=" + this.note_included + ")";
    }
}
