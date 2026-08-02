package com.squareup.cash.cashapplite.cashin;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class CashInAccountInfo {
    public final ArrayList rows;

    public CashInAccountInfo(ArrayList arrayList) {
        this.rows = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashInAccountInfo) && this.rows.equals(((CashInAccountInfo) obj).rows);
    }

    public final int hashCode() {
        return this.rows.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("CashInAccountInfo(rows=", ")", this.rows);
    }
}
