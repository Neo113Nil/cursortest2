package com.squareup.cash.afterpayapplet.db;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterpayRecentlyViewedMerchant {
    public final Boolean is_merchant_token;
    public final Long last_updated_at_ms;
    public final String token;

    public AfterpayRecentlyViewedMerchant(String str, Long l, Boolean bool) {
        str.getClass();
        this.token = str;
        this.last_updated_at_ms = l;
        this.is_merchant_token = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayRecentlyViewedMerchant)) {
            return false;
        }
        AfterpayRecentlyViewedMerchant afterpayRecentlyViewedMerchant = (AfterpayRecentlyViewedMerchant) obj;
        return Intrinsics.areEqual(this.token, afterpayRecentlyViewedMerchant.token) && Intrinsics.areEqual(this.last_updated_at_ms, afterpayRecentlyViewedMerchant.last_updated_at_ms) && Intrinsics.areEqual(this.is_merchant_token, afterpayRecentlyViewedMerchant.is_merchant_token);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        Long l = this.last_updated_at_ms;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.is_merchant_token;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(RumErrorSource$EnumUnboxingLocalUtility.m(this.last_updated_at_ms, "AfterpayRecentlyViewedMerchant(token=", this.token, ", last_updated_at_ms=", ", is_merchant_token="), this.is_merchant_token, ")");
    }
}
