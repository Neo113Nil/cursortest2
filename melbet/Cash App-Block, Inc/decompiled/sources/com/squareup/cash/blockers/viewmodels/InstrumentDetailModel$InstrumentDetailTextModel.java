package com.squareup.cash.blockers.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzage;

/* loaded from: classes4.dex */
public final class InstrumentDetailModel$InstrumentDetailTextModel extends zzage {
    public final boolean hasDialog;
    public final String text;

    public InstrumentDetailModel$InstrumentDetailTextModel(String str, boolean z) {
        this.text = str;
        this.hasDialog = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentDetailModel$InstrumentDetailTextModel)) {
            return false;
        }
        InstrumentDetailModel$InstrumentDetailTextModel instrumentDetailModel$InstrumentDetailTextModel = (InstrumentDetailModel$InstrumentDetailTextModel) obj;
        return this.text.equals(instrumentDetailModel$InstrumentDetailTextModel.text) && this.hasDialog == instrumentDetailModel$InstrumentDetailTextModel.hasDialog;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasDialog) + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("InstrumentDetailTextModel(text=", this.text, ", hasDialog=", ")", this.hasDialog);
    }
}
