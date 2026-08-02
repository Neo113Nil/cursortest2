package com.squareup.cash.cdf.cashtagprovisioning;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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
public final class CashTagProvisioningProvisionStepCompleted implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final Integer progress_percentage;
    public final Long step_duration_ms;
    public final Integer step_number;
    public final String tag_cin;
    public final String tag_theme_token;
    public final Integer total_steps;

    public CashTagProvisioningProvisionStepCompleted(String str, Integer num, Integer num2, Long l, Integer num3, String str2, String str3, String str4) {
        this.flow_token = str;
        this.step_number = num;
        this.total_steps = num2;
        this.step_duration_ms = l;
        this.progress_percentage = num3;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 11, "CashTagProvisioning", "cdf_action", "Provision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "step_number", num);
        Countries.putSafe(m, "total_steps", num2);
        Countries.putSafe(m, "step_duration_ms", l);
        Countries.putSafe(m, "progress_percentage", num3);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningProvisionStepCompleted)) {
            return false;
        }
        CashTagProvisioningProvisionStepCompleted cashTagProvisioningProvisionStepCompleted = (CashTagProvisioningProvisionStepCompleted) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningProvisionStepCompleted.flow_token) && this.step_number.equals(cashTagProvisioningProvisionStepCompleted.step_number) && this.total_steps.equals(cashTagProvisioningProvisionStepCompleted.total_steps) && this.step_duration_ms.equals(cashTagProvisioningProvisionStepCompleted.step_duration_ms) && this.progress_percentage.equals(cashTagProvisioningProvisionStepCompleted.progress_percentage) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningProvisionStepCompleted.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningProvisionStepCompleted.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningProvisionStepCompleted.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Provision StepCompleted";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.step_duration_ms, CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m((str == null ? 0 : str.hashCode()) * 31, 31, this.step_number), 31, this.total_steps), 31), 961, this.progress_percentage);
        String str2 = this.journey_token;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag_cin;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag_theme_token;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.step_number, "CashTagProvisioningProvisionStepCompleted(flow_token=", this.flow_token, ", step_number=", ", total_steps=");
        m.append(this.total_steps);
        m.append(", step_duration_ms=");
        m.append(this.step_duration_ms);
        m.append(", progress_percentage=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.progress_percentage, ", thermal_state=null, journey_token=", this.journey_token, ", tag_cin=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.tag_cin, ", tag_theme_token=", this.tag_theme_token, ")");
    }
}
