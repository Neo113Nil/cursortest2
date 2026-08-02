package com.squareup.cash.crypto.common.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CryptoInsufficientFundsViewModel {
    public final String body;
    public final String negativeButtonText;
    public final String positiveButtonText;

    public CryptoInsufficientFundsViewModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.body = str;
        this.positiveButtonText = str2;
        this.negativeButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoInsufficientFundsViewModel)) {
            return false;
        }
        CryptoInsufficientFundsViewModel cryptoInsufficientFundsViewModel = (CryptoInsufficientFundsViewModel) obj;
        return Intrinsics.areEqual(this.body, cryptoInsufficientFundsViewModel.body) && Intrinsics.areEqual(this.positiveButtonText, cryptoInsufficientFundsViewModel.positiveButtonText) && Intrinsics.areEqual(this.negativeButtonText, cryptoInsufficientFundsViewModel.negativeButtonText);
    }

    public final int hashCode() {
        return this.negativeButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(R.drawable.crypto_common_stablecoin_logo) * 31, 31, this.body), 31, this.positiveButtonText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m("CryptoInsufficientFundsViewModel(iconRes=", R.drawable.crypto_common_stablecoin_logo, ", body=", this.body, ", positiveButtonText="), this.positiveButtonText, ", negativeButtonText=", this.negativeButtonText, ")");
    }
}
