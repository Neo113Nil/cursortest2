package com.squareup.cash.earnings.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CustomerInfo {
    public final String cashtag;
    public final String customerToken;
    public final String displayName;
    public final String profilePhotoUrl;

    public CustomerInfo(String str, String str2, String str3, String str4) {
        str.getClass();
        this.customerToken = str;
        this.displayName = str2;
        this.cashtag = str3;
        this.profilePhotoUrl = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerInfo)) {
            return false;
        }
        CustomerInfo customerInfo = (CustomerInfo) obj;
        return Intrinsics.areEqual(this.customerToken, customerInfo.customerToken) && this.displayName.equals(customerInfo.displayName) && this.cashtag.equals(customerInfo.cashtag) && Intrinsics.areEqual(this.profilePhotoUrl, customerInfo.profilePhotoUrl);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.customerToken.hashCode() * 31, 31, this.displayName), 31, this.cashtag);
        String str = this.profilePhotoUrl;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerInfo(customerToken=", this.customerToken, ", displayName=", this.displayName, ", cashtag="), this.cashtag, ", profilePhotoUrl=", this.profilePhotoUrl, ")");
    }
}
