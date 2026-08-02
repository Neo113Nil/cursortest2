package com.squareup.cash.cdf.cashtagprovisioning;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class CashTagProvisioningProvisionCompleted implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String journey_token;
    public final Integer nfc_scan_attempts;
    public final LinkedHashMap parameters;
    public final String tag_cin;
    public final String tag_theme_token;
    public final Long total_duration_ms;
    public final Integer total_steps_completed;

    public CashTagProvisioningProvisionCompleted(Integer num, Integer num2, Long l, String str, String str2, String str3, String str4) {
        this.flow_token = str;
        this.total_duration_ms = l;
        this.total_steps_completed = num;
        this.nfc_scan_attempts = num2;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 13, "CashTagProvisioning", "cdf_action", "Provision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "total_duration_ms", l);
        Countries.putSafe(m, "total_steps_completed", num);
        Countries.putSafe(m, "nfc_scan_attempts", num2);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningProvisionCompleted)) {
            return false;
        }
        CashTagProvisioningProvisionCompleted cashTagProvisioningProvisionCompleted = (CashTagProvisioningProvisionCompleted) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningProvisionCompleted.flow_token) && this.total_duration_ms.equals(cashTagProvisioningProvisionCompleted.total_duration_ms) && this.total_steps_completed.equals(cashTagProvisioningProvisionCompleted.total_steps_completed) && this.nfc_scan_attempts.equals(cashTagProvisioningProvisionCompleted.nfc_scan_attempts) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningProvisionCompleted.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningProvisionCompleted.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningProvisionCompleted.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Provision Completed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.total_duration_ms, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.total_steps_completed), 923521, this.nfc_scan_attempts);
        String str2 = this.journey_token;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.tag_cin;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag_theme_token;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.total_duration_ms, "CashTagProvisioningProvisionCompleted(flow_token=", this.flow_token, ", total_duration_ms=", ", total_steps_completed=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.total_steps_completed, ", nfc_scan_attempts=", this.nfc_scan_attempts, ", split_nfc_sessions=null, use_external_encryption=null, fidesmo_sdk_version=null, journey_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.journey_token, ", thermal_state=null, tag_cin=", this.tag_cin, ", tag_theme_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.tag_theme_token, ")");
    }
}
