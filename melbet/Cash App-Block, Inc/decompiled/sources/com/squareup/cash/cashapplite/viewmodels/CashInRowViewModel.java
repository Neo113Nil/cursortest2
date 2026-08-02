package com.squareup.cash.cashapplite.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class CashInRowViewModel {
    public final boolean isCopyable;
    public final String title;
    public final String value;

    public CashInRowViewModel(String str, String str2, boolean z) {
        this.title = str;
        this.value = str2;
        this.isCopyable = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashInRowViewModel)) {
            return false;
        }
        CashInRowViewModel cashInRowViewModel = (CashInRowViewModel) obj;
        return this.title.equals(cashInRowViewModel.title) && this.value.equals(cashInRowViewModel.value) && this.isCopyable == cashInRowViewModel.isCopyable;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isCopyable) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashInRowViewModel(title=", this.title, ", value=", this.value, ", isCopyable="), this.isCopyable, ")");
    }
}
