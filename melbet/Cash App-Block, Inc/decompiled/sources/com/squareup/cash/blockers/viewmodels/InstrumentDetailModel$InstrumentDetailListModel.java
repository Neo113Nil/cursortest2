package com.squareup.cash.blockers.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzage;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class InstrumentDetailModel$InstrumentDetailListModel extends zzage {
    public final ArrayList detailRows;

    public InstrumentDetailModel$InstrumentDetailListModel(ArrayList arrayList) {
        this.detailRows = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstrumentDetailModel$InstrumentDetailListModel) && this.detailRows.equals(((InstrumentDetailModel$InstrumentDetailListModel) obj).detailRows);
    }

    public final int hashCode() {
        return this.detailRows.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("InstrumentDetailListModel(detailRows=", ")", this.detailRows);
    }
}
