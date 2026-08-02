package com.squareup.cash.cdf.cashapppay;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CashAppPayAppVerificationFailed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String app_package_name;
    public final LinkedHashMap parameters;
    public final String signature;

    public CashAppPayAppVerificationFailed(String str, String str2) {
        this.app_package_name = str;
        this.signature = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CashAppPay", "cdf_action", "AppVerification");
        Countries.putSafe(m, "app_package_name", str);
        Countries.putSafe(m, "signature", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppPayAppVerificationFailed)) {
            return false;
        }
        CashAppPayAppVerificationFailed cashAppPayAppVerificationFailed = (CashAppPayAppVerificationFailed) obj;
        return Intrinsics.areEqual(this.app_package_name, cashAppPayAppVerificationFailed.app_package_name) && Intrinsics.areEqual(this.signature, cashAppPayAppVerificationFailed.signature);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashAppPay AppVerification Failed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.app_package_name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.signature;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CashAppPayAppVerificationFailed(app_package_name=", this.app_package_name, ", signature=", this.signature, ")");
    }
}
