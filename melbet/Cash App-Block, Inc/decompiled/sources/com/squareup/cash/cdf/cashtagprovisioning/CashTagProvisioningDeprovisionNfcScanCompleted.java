package com.squareup.cash.cdf.cashtagprovisioning;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class CashTagProvisioningDeprovisionNfcScanCompleted implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final Integer installed_apps_count;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final Long scan_duration_ms;
    public final String tag_cin;
    public final String tag_theme_token;

    public CashTagProvisioningDeprovisionNfcScanCompleted(Integer num, Long l, String str, String str2, String str3, String str4) {
        this.flow_token = str;
        this.scan_duration_ms = l;
        this.tag_cin = str2;
        this.installed_apps_count = num;
        this.journey_token = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "CashTagProvisioning", "cdf_action", "Deprovision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "scan_duration_ms", l);
        Countries.putSafe(m, "tag_cin", str2);
        Countries.putSafe(m, "installed_apps_count", num);
        Countries.putSafe(m, "journey_token", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningDeprovisionNfcScanCompleted)) {
            return false;
        }
        CashTagProvisioningDeprovisionNfcScanCompleted cashTagProvisioningDeprovisionNfcScanCompleted = (CashTagProvisioningDeprovisionNfcScanCompleted) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningDeprovisionNfcScanCompleted.flow_token) && this.scan_duration_ms.equals(cashTagProvisioningDeprovisionNfcScanCompleted.scan_duration_ms) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningDeprovisionNfcScanCompleted.tag_cin) && this.installed_apps_count.equals(cashTagProvisioningDeprovisionNfcScanCompleted.installed_apps_count) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningDeprovisionNfcScanCompleted.journey_token) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningDeprovisionNfcScanCompleted.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Deprovision NfcScanCompleted";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.scan_duration_ms, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.tag_cin;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m((m + (str2 == null ? 0 : str2.hashCode())) * 31, 29791, this.installed_apps_count);
        String str3 = this.journey_token;
        int hashCode = (m2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag_theme_token;
        return hashCode + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.scan_duration_ms, "CashTagProvisioningDeprovisionNfcScanCompleted(flow_token=", this.flow_token, ", scan_duration_ms=", ", tag_cin=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.tag_cin, ", installed_apps_count=", this.installed_apps_count, ", available_apps_count=null, thermal_state=null, journey_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.journey_token, ", tag_theme_token=", this.tag_theme_token, ")");
    }
}
