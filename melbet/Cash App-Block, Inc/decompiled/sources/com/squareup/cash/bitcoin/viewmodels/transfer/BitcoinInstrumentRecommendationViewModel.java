package com.squareup.cash.bitcoin.viewmodels.transfer;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinInstrumentRecommendationViewModel {
    public final String body;
    public final String primaryButtonText;
    public final String secondaryButtonText;
    public final String title;

    public BitcoinInstrumentRecommendationViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.body = str2;
        this.primaryButtonText = str3;
        this.secondaryButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinInstrumentRecommendationViewModel)) {
            return false;
        }
        BitcoinInstrumentRecommendationViewModel bitcoinInstrumentRecommendationViewModel = (BitcoinInstrumentRecommendationViewModel) obj;
        return Intrinsics.areEqual(this.title, bitcoinInstrumentRecommendationViewModel.title) && Intrinsics.areEqual(this.body, bitcoinInstrumentRecommendationViewModel.body) && Intrinsics.areEqual(this.primaryButtonText, bitcoinInstrumentRecommendationViewModel.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, bitcoinInstrumentRecommendationViewModel.secondaryButtonText);
    }

    public final int hashCode() {
        return this.secondaryButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.primaryButtonText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BitcoinInstrumentRecommendationViewModel(title=", this.title, ", body=", this.body, ", primaryButtonText="), this.primaryButtonText, ", secondaryButtonText=", this.secondaryButtonText, ")");
    }
}
