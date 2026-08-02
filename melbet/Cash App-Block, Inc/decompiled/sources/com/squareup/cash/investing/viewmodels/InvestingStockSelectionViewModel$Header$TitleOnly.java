package com.squareup.cash.investing.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingStockSelectionViewModel$Header$TitleOnly {
    public final String title;

    public InvestingStockSelectionViewModel$Header$TitleOnly(String str) {
        str.getClass();
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestingStockSelectionViewModel$Header$TitleOnly) && Intrinsics.areEqual(this.title, ((InvestingStockSelectionViewModel$Header$TitleOnly) obj).title);
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TitleOnly(title=", this.title, ")");
    }
}
