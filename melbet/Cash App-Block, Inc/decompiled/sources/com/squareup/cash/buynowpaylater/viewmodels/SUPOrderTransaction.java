package com.squareup.cash.buynowpaylater.viewmodels;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SUPOrderTransaction {
    public final ArrayList rowItems;
    public final String transactionTime;

    public SUPOrderTransaction(String str, ArrayList arrayList) {
        str.getClass();
        this.rowItems = arrayList;
        this.transactionTime = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SUPOrderTransaction)) {
            return false;
        }
        SUPOrderTransaction sUPOrderTransaction = (SUPOrderTransaction) obj;
        return this.rowItems.equals(sUPOrderTransaction.rowItems) && Intrinsics.areEqual(this.transactionTime, sUPOrderTransaction.transactionTime);
    }

    public final int hashCode() {
        return this.transactionTime.hashCode() + (this.rowItems.hashCode() * 31);
    }

    public final String toString() {
        return "SUPOrderTransaction(rowItems=" + this.rowItems + ", transactionTime=" + this.transactionTime + ")";
    }
}
