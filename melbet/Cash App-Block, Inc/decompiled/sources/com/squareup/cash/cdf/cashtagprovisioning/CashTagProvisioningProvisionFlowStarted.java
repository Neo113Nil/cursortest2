package com.squareup.cash.cdf.cashtagprovisioning;

import android.os.Build;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class CashTagProvisioningProvisionFlowStarted implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final DeviceType device_type;
    public final String flow_token;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final String tag_cin;
    public final String tag_theme_token;

    public CashTagProvisioningProvisionFlowStarted(String str, DeviceType deviceType, String str2, String str3, String str4) {
        String str5 = Build.MODEL;
        Boolean bool = Boolean.FALSE;
        this.flow_token = str;
        this.device_type = deviceType;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 17, "CashTagProvisioning", "cdf_action", "Provision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "device_type", deviceType);
        Countries.putSafe(m, "phone_model", str5);
        Countries.putSafe(m, "is_incremental_provisioning_enabled", bool);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningProvisionFlowStarted)) {
            return false;
        }
        CashTagProvisioningProvisionFlowStarted cashTagProvisioningProvisionFlowStarted = (CashTagProvisioningProvisionFlowStarted) obj;
        if (!Intrinsics.areEqual(this.flow_token, cashTagProvisioningProvisionFlowStarted.flow_token) || this.device_type != cashTagProvisioningProvisionFlowStarted.device_type) {
            return false;
        }
        String str = Build.MODEL;
        if (!Intrinsics.areEqual(str, str)) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningProvisionFlowStarted.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningProvisionFlowStarted.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningProvisionFlowStarted.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Provision FlowStarted";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeviceType deviceType = this.device_type;
        int hashCode2 = (hashCode + (deviceType == null ? 0 : deviceType.hashCode())) * 31;
        String str2 = Build.MODEL;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(Boolean.FALSE, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 923521);
        String str3 = this.journey_token;
        int hashCode3 = (m + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.tag_cin;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 29791;
        String str5 = this.tag_theme_token;
        return (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 961;
    }

    public final String toString() {
        String str = Build.MODEL;
        Boolean bool = Boolean.FALSE;
        StringBuilder sb = new StringBuilder("CashTagProvisioningProvisionFlowStarted(flow_token=");
        sb.append(this.flow_token);
        sb.append(", device_type=");
        sb.append(this.device_type);
        sb.append(", phone_model=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, str, ", is_incremental_provisioning_enabled=", bool, ", split_nfc_sessions=null, use_external_encryption=null, fidesmo_sdk_version=null, journey_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.journey_token, ", thermal_state=null, tag_cin=", this.tag_cin, ", is_retry=null, retry_number=null, tag_theme_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag_theme_token, ", nfc_indicator_placement=null, placement_source=null)");
    }
}
