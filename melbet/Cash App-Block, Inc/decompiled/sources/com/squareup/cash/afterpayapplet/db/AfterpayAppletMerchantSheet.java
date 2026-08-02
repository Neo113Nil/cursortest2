package com.squareup.cash.afterpayapplet.db;

import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheetResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterpayAppletMerchantSheet {
    public final Long last_updated_at_ms;
    public final AfterpayMerchantSheetResponse sheet_response;
    public final String token;

    public AfterpayAppletMerchantSheet(String str, Long l, AfterpayMerchantSheetResponse afterpayMerchantSheetResponse) {
        str.getClass();
        afterpayMerchantSheetResponse.getClass();
        this.token = str;
        this.last_updated_at_ms = l;
        this.sheet_response = afterpayMerchantSheetResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletMerchantSheet)) {
            return false;
        }
        AfterpayAppletMerchantSheet afterpayAppletMerchantSheet = (AfterpayAppletMerchantSheet) obj;
        return Intrinsics.areEqual(this.token, afterpayAppletMerchantSheet.token) && Intrinsics.areEqual(this.last_updated_at_ms, afterpayAppletMerchantSheet.last_updated_at_ms) && Intrinsics.areEqual(this.sheet_response, afterpayAppletMerchantSheet.sheet_response);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        Long l = this.last_updated_at_ms;
        return this.sheet_response.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.last_updated_at_ms, "AfterpayAppletMerchantSheet(token=", this.token, ", last_updated_at_ms=", ", sheet_response=");
        m.append(this.sheet_response);
        m.append(")");
        return m.toString();
    }
}
