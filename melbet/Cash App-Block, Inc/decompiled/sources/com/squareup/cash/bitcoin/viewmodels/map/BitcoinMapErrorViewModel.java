package com.squareup.cash.bitcoin.viewmodels.map;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinMapErrorViewModel {
    public final String description;
    public final String negativeActionText;
    public final String positiveActionText;
    public final String title;

    public BitcoinMapErrorViewModel(String str, String str2, String str3, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.description = str2;
        this.positiveActionText = str3;
        this.negativeActionText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinMapErrorViewModel)) {
            return false;
        }
        BitcoinMapErrorViewModel bitcoinMapErrorViewModel = (BitcoinMapErrorViewModel) obj;
        return Intrinsics.areEqual(this.title, bitcoinMapErrorViewModel.title) && Intrinsics.areEqual(this.description, bitcoinMapErrorViewModel.description) && Intrinsics.areEqual(this.positiveActionText, bitcoinMapErrorViewModel.positiveActionText) && Intrinsics.areEqual(this.negativeActionText, bitcoinMapErrorViewModel.negativeActionText);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.positiveActionText);
        String str = this.negativeActionText;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BitcoinMapErrorViewModel(title=", this.title, ", description=", this.description, ", positiveActionText="), this.positiveActionText, ", negativeActionText=", this.negativeActionText, ")");
    }
}
