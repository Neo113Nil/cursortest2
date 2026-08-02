package app.cash.local.presenters.brand.checkout;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes3.dex */
public final class CheckoutGiftCardApplyResult$Invalid {
    public final String errorMessage;
    public final String last4;

    public CheckoutGiftCardApplyResult$Invalid(String str, String str2) {
        this.last4 = str;
        this.errorMessage = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutGiftCardApplyResult$Invalid)) {
            return false;
        }
        CheckoutGiftCardApplyResult$Invalid checkoutGiftCardApplyResult$Invalid = (CheckoutGiftCardApplyResult$Invalid) obj;
        return this.last4.equals(checkoutGiftCardApplyResult$Invalid.last4) && this.errorMessage.equals(checkoutGiftCardApplyResult$Invalid.errorMessage);
    }

    public final int hashCode() {
        return this.errorMessage.hashCode() + (this.last4.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Invalid(last4=", this.last4, ", errorMessage=", this.errorMessage, ")");
    }
}
