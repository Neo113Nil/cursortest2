package com.squareup.cash.investing.viewmodels.search;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DisclosureModel implements InvestingSearchRow {
    public final String text;

    public DisclosureModel(String str) {
        str.getClass();
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisclosureModel) && Intrinsics.areEqual(this.text, ((DisclosureModel) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureModel(text=", this.text, ")");
    }
}
