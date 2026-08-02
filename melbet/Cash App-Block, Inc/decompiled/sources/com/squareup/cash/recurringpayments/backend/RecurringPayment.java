package com.squareup.cash.recurringpayments.backend;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecurringPayment {
    public final Money amount;
    public final String editUrl;
    public final String initiatorNote;
    public final boolean isCanceled;
    public final String scheduleDescription;
    public final String timeToPaymentDescription;
    public final String token;

    public RecurringPayment(String str, Money money, String str2, String str3, String str4, String str5, boolean z) {
        str2.getClass();
        this.token = str;
        this.amount = money;
        this.scheduleDescription = str2;
        this.timeToPaymentDescription = str3;
        this.initiatorNote = str4;
        this.editUrl = str5;
        this.isCanceled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringPayment)) {
            return false;
        }
        RecurringPayment recurringPayment = (RecurringPayment) obj;
        return this.token.equals(recurringPayment.token) && this.amount.equals(recurringPayment.amount) && Intrinsics.areEqual(this.scheduleDescription, recurringPayment.scheduleDescription) && Intrinsics.areEqual(this.timeToPaymentDescription, recurringPayment.timeToPaymentDescription) && Intrinsics.areEqual(this.initiatorNote, recurringPayment.initiatorNote) && Intrinsics.areEqual(this.editUrl, recurringPayment.editUrl) && this.isCanceled == recurringPayment.isCanceled;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.amount, this.token.hashCode() * 31, 31), 31, this.scheduleDescription);
        String str = this.timeToPaymentDescription;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.initiatorNote;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.editUrl;
        return Boolean.hashCode(this.isCanceled) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecurringPayment(token=");
        sb.append(this.token);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", scheduleDescription=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.scheduleDescription, ", timeToPaymentDescription=", this.timeToPaymentDescription, ", initiatorNote=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.initiatorNote, ", editUrl=", this.editUrl, ", isCanceled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isCanceled, ")");
    }
}
