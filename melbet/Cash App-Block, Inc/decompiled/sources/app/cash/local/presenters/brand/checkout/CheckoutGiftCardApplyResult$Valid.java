package app.cash.local.presenters.brand.checkout;

import app.cash.local.primitives.GiftCardAccountNumber;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class CheckoutGiftCardApplyResult$Valid {
    public final String accountNumber;

    public CheckoutGiftCardApplyResult$Valid(String str) {
        this.accountNumber = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutGiftCardApplyResult$Valid) && this.accountNumber.equals(((CheckoutGiftCardApplyResult$Valid) obj).accountNumber);
    }

    public final int hashCode() {
        return this.accountNumber.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Valid(accountNumber=", GiftCardAccountNumber.m1241toStringimpl(this.accountNumber), ")");
    }
}
