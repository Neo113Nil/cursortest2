package com.squareup.cash.cashlynxflow.api.v2;

import com.squareup.cash.lynx.api.v1_0.model.ApplePayPaymentToken;
import com.squareup.cash.payments.presenters.UtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$ApplePayPaymentToken extends UtilsKt {
    public final ApplePayPaymentToken value;

    public AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$ApplePayPaymentToken(ApplePayPaymentToken applePayPaymentToken) {
        applePayPaymentToken.getClass();
        this.value = applePayPaymentToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$ApplePayPaymentToken) && Intrinsics.areEqual(this.value, ((AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$ApplePayPaymentToken) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ApplePayPaymentToken(value=" + this.value + ")";
    }
}
