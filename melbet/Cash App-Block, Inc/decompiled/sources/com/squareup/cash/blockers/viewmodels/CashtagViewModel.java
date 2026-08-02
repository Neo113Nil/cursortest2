package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class CashtagViewModel {
    public final String cashtagPrefill;
    public final String cashtagSymbol;
    public final boolean dismissButtonEnabled;
    public final String hint;
    public final String label;
    public final CashtagLookupViewModel lookupViewModel;
    public final String nextButtonText;
    public final String subTitle;
    public final String title;

    public final class CashtagLookupViewModel {
        public final boolean isLoading;
        public final boolean nextButtonEnabled;
        public final String previewText;

        public CashtagLookupViewModel(String str, boolean z, boolean z2) {
            this.isLoading = z;
            this.nextButtonEnabled = z2;
            this.previewText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CashtagLookupViewModel)) {
                return false;
            }
            CashtagLookupViewModel cashtagLookupViewModel = (CashtagLookupViewModel) obj;
            return this.isLoading == cashtagLookupViewModel.isLoading && this.nextButtonEnabled == cashtagLookupViewModel.nextButtonEnabled && Intrinsics.areEqual(this.previewText, cashtagLookupViewModel.previewText);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isLoading) * 31, 31, this.nextButtonEnabled);
            String str = this.previewText;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("CashtagLookupViewModel(isLoading=", ", nextButtonEnabled=", ", previewText=", this.isLoading, this.nextButtonEnabled), this.previewText, ")");
        }
    }

    public CashtagViewModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, CashtagLookupViewModel cashtagLookupViewModel, boolean z) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str4, str6);
        this.nextButtonText = str;
        this.cashtagSymbol = str2;
        this.cashtagPrefill = str3;
        this.hint = str4;
        this.title = str5;
        this.subTitle = str6;
        this.label = str7;
        this.lookupViewModel = cashtagLookupViewModel;
        this.dismissButtonEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashtagViewModel)) {
            return false;
        }
        CashtagViewModel cashtagViewModel = (CashtagViewModel) obj;
        return Intrinsics.areEqual(this.nextButtonText, cashtagViewModel.nextButtonText) && Intrinsics.areEqual(this.cashtagSymbol, cashtagViewModel.cashtagSymbol) && Intrinsics.areEqual(this.cashtagPrefill, cashtagViewModel.cashtagPrefill) && Intrinsics.areEqual(this.hint, cashtagViewModel.hint) && this.title.equals(cashtagViewModel.title) && Intrinsics.areEqual(this.subTitle, cashtagViewModel.subTitle) && Intrinsics.areEqual(this.label, cashtagViewModel.label) && this.lookupViewModel.equals(cashtagViewModel.lookupViewModel) && this.dismissButtonEnabled == cashtagViewModel.dismissButtonEnabled;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.nextButtonText.hashCode() * 31, 31, this.cashtagSymbol);
        String str = this.cashtagPrefill;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.hint), 31, this.title), 31, this.subTitle);
        String str2 = this.label;
        return Boolean.hashCode(this.dismissButtonEnabled) + ((this.lookupViewModel.hashCode() + ((m2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashtagViewModel(nextButtonText=", this.nextButtonText, ", cashtagSymbol=", this.cashtagSymbol, ", cashtagPrefill=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.cashtagPrefill, ", hint=", this.hint, ", title=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.title, ", subTitle=", this.subTitle, ", label=");
        m.append(this.label);
        m.append(", lookupViewModel=");
        m.append(this.lookupViewModel);
        m.append(", dismissButtonEnabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.dismissButtonEnabled, ")");
    }
}
