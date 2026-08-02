package com.squareup.cash.cdf.cashtagprovisioning;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class CashTagProvisioningDeprovisionNfcScanStarted implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final Integer scan_attempt_number;
    public final String tag_cin;
    public final String tag_theme_token;

    public CashTagProvisioningDeprovisionNfcScanStarted(Integer num, String str, String str2, String str3, String str4) {
        this.flow_token = str;
        this.scan_attempt_number = num;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "CashTagProvisioning", "cdf_action", "Deprovision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "scan_attempt_number", num);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningDeprovisionNfcScanStarted)) {
            return false;
        }
        CashTagProvisioningDeprovisionNfcScanStarted cashTagProvisioningDeprovisionNfcScanStarted = (CashTagProvisioningDeprovisionNfcScanStarted) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningDeprovisionNfcScanStarted.flow_token) && this.scan_attempt_number.equals(cashTagProvisioningDeprovisionNfcScanStarted.scan_attempt_number) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningDeprovisionNfcScanStarted.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningDeprovisionNfcScanStarted.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningDeprovisionNfcScanStarted.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Deprovision NfcScanStarted";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((str == null ? 0 : str.hashCode()) * 31, 961, this.scan_attempt_number);
        String str2 = this.journey_token;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag_cin;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag_theme_token;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.scan_attempt_number, "CashTagProvisioningDeprovisionNfcScanStarted(flow_token=", this.flow_token, ", scan_attempt_number=", ", thermal_state=null, journey_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.journey_token, ", tag_cin=", this.tag_cin, ", tag_theme_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.tag_theme_token, ")");
    }
}
