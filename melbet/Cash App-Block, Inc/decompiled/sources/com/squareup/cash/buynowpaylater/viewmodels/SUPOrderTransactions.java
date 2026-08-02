package com.squareup.cash.buynowpaylater.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SUPOrderTransactions {
    public final String title;
    public final ArrayList transactions;

    public SUPOrderTransactions(String str, ArrayList arrayList) {
        this.title = str;
        this.transactions = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SUPOrderTransactions)) {
            return false;
        }
        SUPOrderTransactions sUPOrderTransactions = (SUPOrderTransactions) obj;
        return Intrinsics.areEqual(this.title, sUPOrderTransactions.title) && this.transactions.equals(sUPOrderTransactions.transactions);
    }

    public final int hashCode() {
        String str = this.title;
        return this.transactions.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(this.transactions, "SUPOrderTransactions(title=", this.title, ", transactions=", ")");
    }
}
