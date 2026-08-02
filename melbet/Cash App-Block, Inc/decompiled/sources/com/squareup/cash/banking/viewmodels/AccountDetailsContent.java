package com.squareup.cash.banking.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountDetailsContent {
    public final String accountLabel;
    public final String accountNumber;
    public final boolean allowAccountCopy;
    public final String routingLabel;
    public final String routingNumber;

    public AccountDetailsContent(String str, String str2, String str3, String str4, boolean z) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
        this.routingNumber = str;
        this.routingLabel = str2;
        this.accountNumber = str3;
        this.accountLabel = str4;
        this.allowAccountCopy = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDetailsContent)) {
            return false;
        }
        AccountDetailsContent accountDetailsContent = (AccountDetailsContent) obj;
        return Intrinsics.areEqual(this.routingNumber, accountDetailsContent.routingNumber) && Intrinsics.areEqual(this.routingLabel, accountDetailsContent.routingLabel) && this.accountNumber.equals(accountDetailsContent.accountNumber) && Intrinsics.areEqual(this.accountLabel, accountDetailsContent.accountLabel) && this.allowAccountCopy == accountDetailsContent.allowAccountCopy;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.allowAccountCopy) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.routingNumber.hashCode() * 31, 31, this.routingLabel), 31, this.accountNumber), 31, this.accountLabel);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountDetailsContent(routingNumber=", this.routingNumber, ", routingLabel=", this.routingLabel, ", accountNumber=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.accountNumber, ", accountLabel=", this.accountLabel, ", allowAccountCopy=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.allowAccountCopy, ")");
    }
}
