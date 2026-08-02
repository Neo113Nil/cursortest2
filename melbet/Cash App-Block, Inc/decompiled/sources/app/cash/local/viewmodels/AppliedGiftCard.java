package app.cash.local.viewmodels;

import app.cash.local.primitives.GiftCardAccountNumber;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AppliedGiftCard {
    public final String amount;
    public final String gan;
    public final String last4;

    public AppliedGiftCard(String str, String str2, String str3) {
        str.getClass();
        this.gan = str;
        this.last4 = str2;
        this.amount = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppliedGiftCard)) {
            return false;
        }
        AppliedGiftCard appliedGiftCard = (AppliedGiftCard) obj;
        return Intrinsics.areEqual(this.gan, appliedGiftCard.gan) && this.last4.equals(appliedGiftCard.last4) && this.amount.equals(appliedGiftCard.amount);
    }

    public final int hashCode() {
        return this.amount.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.gan.hashCode() * 31, 31, this.last4);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AppliedGiftCard(gan=", GiftCardAccountNumber.m1241toStringimpl(this.gan), ", last4=", this.last4, ", amount="), this.amount, ")");
    }
}
