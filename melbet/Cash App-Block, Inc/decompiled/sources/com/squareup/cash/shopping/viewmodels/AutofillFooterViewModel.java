package com.squareup.cash.shopping.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AutofillFooterViewModel {
    public final String address;
    public final String cardText;
    public final String expiration;

    public AutofillFooterViewModel(String str, String str2, String str3, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        this.cardText = str;
        this.expiration = str2;
        this.address = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillFooterViewModel)) {
            return false;
        }
        AutofillFooterViewModel autofillFooterViewModel = (AutofillFooterViewModel) obj;
        return Intrinsics.areEqual(this.cardText, autofillFooterViewModel.cardText) && Intrinsics.areEqual(this.expiration, autofillFooterViewModel.expiration) && Intrinsics.areEqual(this.address, autofillFooterViewModel.address);
    }

    public final int hashCode() {
        String str = this.cardText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.expiration;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.address;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AutofillFooterViewModel(cardText=", this.cardText, ", expiration=", this.expiration, ", address="), this.address, ")");
    }
}
