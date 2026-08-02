package com.squareup.cash.cdf.shifts;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ShiftsTaxFormsDownloadTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String form_token;
    public final String form_type;
    public final String merchant_token;
    public final LinkedHashMap parameters;
    public final String person_token;

    public ShiftsTaxFormsDownloadTap(String str, String str2, String str3, String str4) {
        this.person_token = str;
        this.merchant_token = str2;
        this.form_token = str3;
        this.form_type = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Shifts", "cdf_action", "TaxForms");
        Countries.putSafe(m, "person_token", str);
        Countries.putSafe(m, "employee_token", "");
        Countries.putSafe(m, "merchant_token", str2);
        Countries.putSafe(m, "form_token", str3);
        Countries.putSafe(m, "form_type", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftsTaxFormsDownloadTap)) {
            return false;
        }
        ShiftsTaxFormsDownloadTap shiftsTaxFormsDownloadTap = (ShiftsTaxFormsDownloadTap) obj;
        return this.person_token.equals(shiftsTaxFormsDownloadTap.person_token) && Intrinsics.areEqual(this.merchant_token, shiftsTaxFormsDownloadTap.merchant_token) && Intrinsics.areEqual(this.form_token, shiftsTaxFormsDownloadTap.form_token) && Intrinsics.areEqual(this.form_type, shiftsTaxFormsDownloadTap.form_type);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Shifts TaxForms DownloadTap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.person_token.hashCode() * 961;
        String str = this.merchant_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.form_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.form_type;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShiftsTaxFormsDownloadTap(person_token=", this.person_token, ", employee_token=, merchant_token=", this.merchant_token, ", form_token="), this.form_token, ", form_type=", this.form_type, ")");
    }
}
