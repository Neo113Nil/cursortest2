package com.squareup.cash.cdf.cashtagprovisioning;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class CashTagProvisioningDeprovisionFlowDismissed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String journey_token;
    public final Integer nfc_scan_attempts;
    public final LinkedHashMap parameters;
    public final Integer progress_at_dismissal;
    public final Integer step_at_dismissal;
    public final String tag_cin;
    public final String tag_theme_token;
    public final Long total_duration_ms;
    public final Integer total_steps;

    public CashTagProvisioningDeprovisionFlowDismissed(String str, Integer num, Integer num2, Integer num3, Long l, Integer num4, String str2, String str3, String str4) {
        this.flow_token = str;
        this.progress_at_dismissal = num;
        this.step_at_dismissal = num2;
        this.total_steps = num3;
        this.total_duration_ms = l;
        this.nfc_scan_attempts = num4;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 15, "CashTagProvisioning", "cdf_action", "Deprovision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "progress_at_dismissal", num);
        Countries.putSafe(m, "step_at_dismissal", num2);
        Countries.putSafe(m, "total_steps", num3);
        Countries.putSafe(m, "total_duration_ms", l);
        Countries.putSafe(m, "nfc_scan_attempts", num4);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningDeprovisionFlowDismissed)) {
            return false;
        }
        CashTagProvisioningDeprovisionFlowDismissed cashTagProvisioningDeprovisionFlowDismissed = (CashTagProvisioningDeprovisionFlowDismissed) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningDeprovisionFlowDismissed.flow_token) && Intrinsics.areEqual(this.progress_at_dismissal, cashTagProvisioningDeprovisionFlowDismissed.progress_at_dismissal) && Intrinsics.areEqual(this.step_at_dismissal, cashTagProvisioningDeprovisionFlowDismissed.step_at_dismissal) && Intrinsics.areEqual(this.total_steps, cashTagProvisioningDeprovisionFlowDismissed.total_steps) && this.total_duration_ms.equals(cashTagProvisioningDeprovisionFlowDismissed.total_duration_ms) && this.nfc_scan_attempts.equals(cashTagProvisioningDeprovisionFlowDismissed.nfc_scan_attempts) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningDeprovisionFlowDismissed.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningDeprovisionFlowDismissed.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningDeprovisionFlowDismissed.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Deprovision FlowDismissed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.progress_at_dismissal;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.step_at_dismissal;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.total_steps;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.total_duration_ms, (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31, 31), 28629151, this.nfc_scan_attempts);
        String str2 = this.journey_token;
        int hashCode4 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag_cin;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag_theme_token;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.progress_at_dismissal, "CashTagProvisioningDeprovisionFlowDismissed(flow_token=", this.flow_token, ", progress_at_dismissal=", ", step_at_dismissal=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.step_at_dismissal, ", total_steps=", this.total_steps, ", total_duration_ms=");
        m.append(this.total_duration_ms);
        m.append(", nfc_scan_attempts=");
        m.append(this.nfc_scan_attempts);
        m.append(", error_name=null, error_message=null, thermal_state=null, dismissal_reason=null, journey_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.journey_token, ", tag_cin=", this.tag_cin, ", tag_theme_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.tag_theme_token, ")");
    }
}
