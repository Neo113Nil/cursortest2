package com.squareup.cash.investing.backend.api.keystats;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingKeyStats$Page {
    public final ArrayList rows;

    public final class Row {
        public final String details;
        public final String key;
        public final String value;

        public Row(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.key = str;
            this.value = str2;
            this.details = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.areEqual(this.key, row.key) && Intrinsics.areEqual(this.value, row.value) && Intrinsics.areEqual(this.details, row.details);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.key.hashCode() * 31, 31, this.value);
            String str = this.details;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Row(key=", this.key, ", value=", this.value, ", details="), this.details, ")");
        }
    }

    public InvestingKeyStats$Page(ArrayList arrayList) {
        this.rows = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestingKeyStats$Page) && this.rows.equals(((InvestingKeyStats$Page) obj).rows);
    }

    public final int hashCode() {
        return this.rows.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("Page(rows=", ")", this.rows);
    }
}
