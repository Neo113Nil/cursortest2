package com.squareup.cash.profile.repo.api;

import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CustomerProfileDetails {
    public final GetProfileDetailsResponse customerDetailsProto;
    public final CustomerProfileData customerProfileData;

    public CustomerProfileDetails(CustomerProfileData customerProfileData, GetProfileDetailsResponse getProfileDetailsResponse) {
        customerProfileData.getClass();
        this.customerProfileData = customerProfileData;
        this.customerDetailsProto = getProfileDetailsResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerProfileDetails)) {
            return false;
        }
        CustomerProfileDetails customerProfileDetails = (CustomerProfileDetails) obj;
        return Intrinsics.areEqual(this.customerProfileData, customerProfileDetails.customerProfileData) && Intrinsics.areEqual(this.customerDetailsProto, customerProfileDetails.customerDetailsProto);
    }

    public final int hashCode() {
        int hashCode = this.customerProfileData.hashCode() * 31;
        GetProfileDetailsResponse getProfileDetailsResponse = this.customerDetailsProto;
        return hashCode + (getProfileDetailsResponse == null ? 0 : getProfileDetailsResponse.hashCode());
    }

    public final String toString() {
        return "CustomerProfileDetails(customerProfileData=" + this.customerProfileData + ", customerDetailsProto=" + this.customerDetailsProto + ")";
    }
}
