package com.squareup.cash.blockers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class InstrumentDetailRowModel {
    public final String detailText;
    public final boolean hasDialog;
    public final String title;

    public InstrumentDetailRowModel(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.detailText = str2;
        this.hasDialog = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentDetailRowModel)) {
            return false;
        }
        InstrumentDetailRowModel instrumentDetailRowModel = (InstrumentDetailRowModel) obj;
        return Intrinsics.areEqual(this.title, instrumentDetailRowModel.title) && Intrinsics.areEqual(this.detailText, instrumentDetailRowModel.detailText) && this.hasDialog == instrumentDetailRowModel.hasDialog;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasDialog) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.detailText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentDetailRowModel(title=", this.title, ", detailText=", this.detailText, ", hasDialog="), this.hasDialog, ")");
    }
}
