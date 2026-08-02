package com.squareup.cash.investing.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingDetailRowContentModel {
    public final boolean isStale;
    public final ArrayList rows;

    public final class Row {
        public final String key;
        public final String value;

        public Row(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.key = str;
            this.value = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.areEqual(this.key, row.key) && Intrinsics.areEqual(this.value, row.value);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.key.hashCode() * 31, 961, this.value);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Row(key=", this.key, ", value=", this.value, ", details=null, showMoreInfo=false)");
        }
    }

    public InvestingDetailRowContentModel(ArrayList arrayList, boolean z) {
        this.rows = arrayList;
        this.isStale = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingDetailRowContentModel)) {
            return false;
        }
        InvestingDetailRowContentModel investingDetailRowContentModel = (InvestingDetailRowContentModel) obj;
        return this.rows.equals(investingDetailRowContentModel.rows) && this.isStale == investingDetailRowContentModel.isStale;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isStale) + (this.rows.hashCode() * 31);
    }

    public final String toString() {
        return "InvestingDetailRowContentModel(rows=" + this.rows + ", isStale=" + this.isStale + ")";
    }
}
