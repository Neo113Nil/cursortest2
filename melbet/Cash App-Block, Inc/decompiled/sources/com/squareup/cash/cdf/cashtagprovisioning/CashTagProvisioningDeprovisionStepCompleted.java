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
public final class CashTagProvisioningDeprovisionStepCompleted implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final Long step_duration_ms;
    public final Integer step_number;
    public final String tag_cin;
    public final String tag_theme_token;
    public final Integer total_steps;

    public CashTagProvisioningDeprovisionStepCompleted(Integer num, Integer num2, Long l, String str, String str2, String str3, String str4) {
        this.flow_token = str;
        this.step_number = num;
        this.total_steps = num2;
        this.step_duration_ms = l;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "CashTagProvisioning", "cdf_action", "Deprovision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "step_number", num);
        Countries.putSafe(m, "total_steps", num2);
        Countries.putSafe(m, "step_duration_ms", l);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningDeprovisionStepCompleted)) {
            return false;
        }
        CashTagProvisioningDeprovisionStepCompleted cashTagProvisioningDeprovisionStepCompleted = (CashTagProvisioningDeprovisionStepCompleted) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningDeprovisionStepCompleted.flow_token) && this.step_number.equals(cashTagProvisioningDeprovisionStepCompleted.step_number) && this.total_steps.equals(cashTagProvisioningDeprovisionStepCompleted.total_steps) && this.step_duration_ms.equals(cashTagProvisioningDeprovisionStepCompleted.step_duration_ms) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningDeprovisionStepCompleted.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningDeprovisionStepCompleted.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningDeprovisionStepCompleted.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Deprovision StepCompleted";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.step_duration_ms, CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m((str == null ? 0 : str.hashCode()) * 31, 31, this.step_number), 31, this.total_steps), 961);
        String str2 = this.journey_token;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag_cin;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag_theme_token;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.step_number, "CashTagProvisioningDeprovisionStepCompleted(flow_token=", this.flow_token, ", step_number=", ", total_steps=");
        m.append(this.total_steps);
        m.append(", step_duration_ms=");
        m.append(this.step_duration_ms);
        m.append(", thermal_state=null, journey_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.journey_token, ", tag_cin=", this.tag_cin, ", tag_theme_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.tag_theme_token, ")");
    }
}
