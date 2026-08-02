package com.squareup.cash.formview.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FormCashtagViewModel {
    public final String cashtagPrefill;
    public final String cashtagSymbol;
    public final String hint;
    public final boolean isSubmittable;
    public final String previewText;

    public FormCashtagViewModel(String str, String str2, String str3, String str4, boolean z) {
        this.cashtagSymbol = str;
        this.cashtagPrefill = str2;
        this.hint = str3;
        this.isSubmittable = z;
        this.previewText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormCashtagViewModel)) {
            return false;
        }
        FormCashtagViewModel formCashtagViewModel = (FormCashtagViewModel) obj;
        return Intrinsics.areEqual(this.cashtagSymbol, formCashtagViewModel.cashtagSymbol) && Intrinsics.areEqual(this.cashtagPrefill, formCashtagViewModel.cashtagPrefill) && Intrinsics.areEqual(this.hint, formCashtagViewModel.hint) && this.isSubmittable == formCashtagViewModel.isSubmittable && Intrinsics.areEqual(this.previewText, formCashtagViewModel.previewText);
    }

    public final int hashCode() {
        String str = this.cashtagSymbol;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cashtagPrefill;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isSubmittable);
        String str4 = this.previewText;
        return m + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FormCashtagViewModel(cashtagSymbol=", this.cashtagSymbol, ", cashtagPrefill=", this.cashtagPrefill, ", hint=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.hint, ", isSubmittable=", this.isSubmittable, ", previewText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.previewText, ")");
    }
}
