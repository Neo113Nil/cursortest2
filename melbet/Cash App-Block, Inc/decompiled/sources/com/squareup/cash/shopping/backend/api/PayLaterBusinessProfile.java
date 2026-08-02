package com.squareup.cash.shopping.backend.api;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PayLaterBusinessProfile {
    public final boolean isActive;
    public final String token;

    public PayLaterBusinessProfile(String str, boolean z) {
        str.getClass();
        this.token = str;
        this.isActive = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayLaterBusinessProfile)) {
            return false;
        }
        PayLaterBusinessProfile payLaterBusinessProfile = (PayLaterBusinessProfile) obj;
        return Intrinsics.areEqual(this.token, payLaterBusinessProfile.token) && this.isActive == payLaterBusinessProfile.isActive;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isActive) + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("PayLaterBusinessProfile(token=", this.token, ", isActive=", ")", this.isActive);
    }
}
