package com.squareup.cash.db2.profile;

import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ExtendedProfileDetails {
    public final String customer_token;
    public final GetProfileDetailsResponse get_profile_details_response;

    public ExtendedProfileDetails(String str, GetProfileDetailsResponse getProfileDetailsResponse) {
        str.getClass();
        getProfileDetailsResponse.getClass();
        this.customer_token = str;
        this.get_profile_details_response = getProfileDetailsResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileDetails)) {
            return false;
        }
        ExtendedProfileDetails extendedProfileDetails = (ExtendedProfileDetails) obj;
        return Intrinsics.areEqual(this.customer_token, extendedProfileDetails.customer_token) && Intrinsics.areEqual(this.get_profile_details_response, extendedProfileDetails.get_profile_details_response);
    }

    public final int hashCode() {
        return this.get_profile_details_response.hashCode() + (this.customer_token.hashCode() * 31);
    }

    public final String toString() {
        return "ExtendedProfileDetails(customer_token=" + this.customer_token + ", get_profile_details_response=" + this.get_profile_details_response + ")";
    }
}
