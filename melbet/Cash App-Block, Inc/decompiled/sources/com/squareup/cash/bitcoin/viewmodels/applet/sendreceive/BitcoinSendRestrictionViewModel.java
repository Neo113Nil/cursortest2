package com.squareup.cash.bitcoin.viewmodels.applet.sendreceive;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinSendRestrictionViewModel {
    public final String doneButtonText;
    public final String learnMoreButtonText;
    public final String subtitle;
    public final String title;

    public BitcoinSendRestrictionViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.subtitle = str2;
        this.learnMoreButtonText = str3;
        this.doneButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinSendRestrictionViewModel)) {
            return false;
        }
        BitcoinSendRestrictionViewModel bitcoinSendRestrictionViewModel = (BitcoinSendRestrictionViewModel) obj;
        return Intrinsics.areEqual(this.title, bitcoinSendRestrictionViewModel.title) && Intrinsics.areEqual(this.subtitle, bitcoinSendRestrictionViewModel.subtitle) && Intrinsics.areEqual(this.learnMoreButtonText, bitcoinSendRestrictionViewModel.learnMoreButtonText) && Intrinsics.areEqual(this.doneButtonText, bitcoinSendRestrictionViewModel.doneButtonText);
    }

    public final int hashCode() {
        return this.doneButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.learnMoreButtonText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BitcoinSendRestrictionViewModel(title=", this.title, ", subtitle=", this.subtitle, ", learnMoreButtonText="), this.learnMoreButtonText, ", doneButtonText=", this.doneButtonText, ")");
    }
}
