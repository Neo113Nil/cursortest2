package com.squareup.cash.invitations;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InviteContactsHeaderViewModel {
    public final String cashCustomerContactsText;
    public final String headerText;
    public final boolean showReferralRules;

    public InviteContactsHeaderViewModel(String str, String str2, boolean z) {
        this.headerText = str;
        this.cashCustomerContactsText = str2;
        this.showReferralRules = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteContactsHeaderViewModel)) {
            return false;
        }
        InviteContactsHeaderViewModel inviteContactsHeaderViewModel = (InviteContactsHeaderViewModel) obj;
        return Intrinsics.areEqual(this.headerText, inviteContactsHeaderViewModel.headerText) && Intrinsics.areEqual(this.cashCustomerContactsText, inviteContactsHeaderViewModel.cashCustomerContactsText) && this.showReferralRules == inviteContactsHeaderViewModel.showReferralRules;
    }

    public final int hashCode() {
        String str = this.headerText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cashCustomerContactsText;
        return Boolean.hashCode(this.showReferralRules) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InviteContactsHeaderViewModel(headerText=", this.headerText, ", cashCustomerContactsText=", this.cashCustomerContactsText, ", showReferralRules="), this.showReferralRules, ")");
    }
}
