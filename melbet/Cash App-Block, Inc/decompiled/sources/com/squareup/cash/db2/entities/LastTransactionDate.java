package com.squareup.cash.db2.entities;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LastTransactionDate {
    public final Long last_transaction_date;
    public final String user_id;

    public LastTransactionDate(String str, Long l) {
        str.getClass();
        this.user_id = str;
        this.last_transaction_date = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastTransactionDate)) {
            return false;
        }
        LastTransactionDate lastTransactionDate = (LastTransactionDate) obj;
        return Intrinsics.areEqual(this.user_id, lastTransactionDate.user_id) && Intrinsics.areEqual(this.last_transaction_date, lastTransactionDate.last_transaction_date);
    }

    public final int hashCode() {
        int hashCode = this.user_id.hashCode() * 31;
        Long l = this.last_transaction_date;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "LastTransactionDate(user_id=" + this.user_id + ", last_transaction_date=" + this.last_transaction_date + ")";
    }
}
