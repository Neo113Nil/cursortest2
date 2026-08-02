package com.squareup.cash.earnings.backend.api;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class PayerCustomersResult {
    public final ArrayList recentSenders;
    public final ArrayList taggedPayers;

    public PayerCustomersResult(ArrayList arrayList, ArrayList arrayList2) {
        this.taggedPayers = arrayList;
        this.recentSenders = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayerCustomersResult)) {
            return false;
        }
        PayerCustomersResult payerCustomersResult = (PayerCustomersResult) obj;
        return this.taggedPayers.equals(payerCustomersResult.taggedPayers) && this.recentSenders.equals(payerCustomersResult.recentSenders);
    }

    public final int hashCode() {
        return this.recentSenders.hashCode() + (this.taggedPayers.hashCode() * 31);
    }

    public final String toString() {
        return "PayerCustomersResult(taggedPayers=" + this.taggedPayers + ", recentSenders=" + this.recentSenders + ")";
    }
}
