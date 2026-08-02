package com.squareup.cash.family.familyhub.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BadgeName {
    public final String firstName;
    public final String fullName;
    public final boolean isBusiness;
    public final boolean isVerified;

    public BadgeName(String str, String str2, boolean z, boolean z2) {
        this.firstName = str;
        this.fullName = str2;
        this.isBusiness = z;
        this.isVerified = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeName)) {
            return false;
        }
        BadgeName badgeName = (BadgeName) obj;
        return Intrinsics.areEqual(this.firstName, badgeName.firstName) && Intrinsics.areEqual(this.fullName, badgeName.fullName) && this.isBusiness == badgeName.isBusiness && this.isVerified == badgeName.isVerified;
    }

    public final int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fullName;
        return Boolean.hashCode(this.isVerified) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isBusiness);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BadgeName(firstName=", this.firstName, ", fullName=", this.fullName, ", isBusiness="), this.isBusiness, ", isVerified=", this.isVerified, ")");
    }
}
