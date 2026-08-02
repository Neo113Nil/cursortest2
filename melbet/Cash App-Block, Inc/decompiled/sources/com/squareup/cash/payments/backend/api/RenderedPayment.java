package com.squareup.cash.payments.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RenderedPayment {
    public final Money amount;
    public final Money boostAmount;
    public final PaymentHistoryData historyData;
    public final String lendingLoanToken;
    public final Orientation orientation;
    public final Role role;
    public final String theirId;
    public final String token;

    public RenderedPayment(String str, Money money, String str2, Role role, Orientation orientation, PaymentHistoryData paymentHistoryData, Money money2, String str3) {
        str.getClass();
        money.getClass();
        str2.getClass();
        role.getClass();
        orientation.getClass();
        paymentHistoryData.getClass();
        this.token = str;
        this.amount = money;
        this.theirId = str2;
        this.role = role;
        this.orientation = orientation;
        this.historyData = paymentHistoryData;
        this.boostAmount = money2;
        this.lendingLoanToken = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RenderedPayment)) {
            return false;
        }
        RenderedPayment renderedPayment = (RenderedPayment) obj;
        return Intrinsics.areEqual(this.token, renderedPayment.token) && Intrinsics.areEqual(this.amount, renderedPayment.amount) && Intrinsics.areEqual(this.theirId, renderedPayment.theirId) && this.role == renderedPayment.role && this.orientation == renderedPayment.orientation && Intrinsics.areEqual(this.historyData, renderedPayment.historyData) && Intrinsics.areEqual(this.boostAmount, renderedPayment.boostAmount) && Intrinsics.areEqual(this.lendingLoanToken, renderedPayment.lendingLoanToken);
    }

    public final int hashCode() {
        int hashCode = (this.historyData.hashCode() + ((this.orientation.hashCode() + ((this.role.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.amount, this.token.hashCode() * 31, 31), 31, this.theirId)) * 31)) * 31)) * 31;
        Money money = this.boostAmount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.lendingLoanToken;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RenderedPayment(token=" + this.token + ", amount=" + this.amount + ", theirId=" + this.theirId + ", role=" + this.role + ", orientation=" + this.orientation + ", historyData=" + this.historyData + ", boostAmount=" + this.boostAmount + ", lendingLoanToken=" + this.lendingLoanToken + ")";
    }
}
