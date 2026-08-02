package com.squareup.cash.data.db;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaymentHistoryConfig {
    public final List automated_investment_payment_types;
    public final List loyalty_merchant_hidden_payment_types;
    public final String script_url;
    public final String search_url;
    public final List top_level_feed_payment_type_deny_list;

    public PaymentHistoryConfig(String str, String str2, List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.script_url = str;
        this.search_url = str2;
        this.top_level_feed_payment_type_deny_list = list;
        this.loyalty_merchant_hidden_payment_types = list2;
        this.automated_investment_payment_types = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentHistoryConfig)) {
            return false;
        }
        PaymentHistoryConfig paymentHistoryConfig = (PaymentHistoryConfig) obj;
        return this.script_url.equals(paymentHistoryConfig.script_url) && Intrinsics.areEqual(this.search_url, paymentHistoryConfig.search_url) && Intrinsics.areEqual(this.top_level_feed_payment_type_deny_list, paymentHistoryConfig.top_level_feed_payment_type_deny_list) && Intrinsics.areEqual(this.loyalty_merchant_hidden_payment_types, paymentHistoryConfig.loyalty_merchant_hidden_payment_types) && Intrinsics.areEqual(this.automated_investment_payment_types, paymentHistoryConfig.automated_investment_payment_types);
    }

    public final int hashCode() {
        int hashCode = this.script_url.hashCode() * 31;
        String str = this.search_url;
        return this.automated_investment_payment_types.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.top_level_feed_payment_type_deny_list), 31, this.loyalty_merchant_hidden_payment_types);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentHistoryConfig(script_url=", this.script_url, ", search_url=", this.search_url, ", top_level_feed_payment_type_deny_list=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.top_level_feed_payment_type_deny_list, ", loyalty_merchant_hidden_payment_types=", this.loyalty_merchant_hidden_payment_types, ", automated_investment_payment_types=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.automated_investment_payment_types, ")");
    }
}
