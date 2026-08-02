package com.squareup.cash.cashlynxflow.api.v2;

import com.squareup.cash.lynx.api.v1_0.model.GooglePayPaymentToken;
import com.squareup.cash.payments.presenters.UtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken extends UtilsKt {
    public final GooglePayPaymentToken value;

    public AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken(GooglePayPaymentToken googlePayPaymentToken) {
        googlePayPaymentToken.getClass();
        this.value = googlePayPaymentToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken) && Intrinsics.areEqual(this.value, ((AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "GooglePayPaymentToken(value=" + this.value + ")";
    }
}
