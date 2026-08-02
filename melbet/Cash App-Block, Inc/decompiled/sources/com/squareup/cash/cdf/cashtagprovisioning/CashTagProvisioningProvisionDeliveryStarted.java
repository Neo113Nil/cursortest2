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
public final class CashTagProvisioningProvisionDeliveryStarted implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final Integer installed_apps_count;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final String tag_cin;
    public final String tag_theme_token;

    public CashTagProvisioningProvisionDeliveryStarted(Integer num, String str, String str2, String str3, String str4) {
        this.flow_token = str;
        this.installed_apps_count = num;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "CashTagProvisioning", "cdf_action", "Provision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "installed_apps_count", num);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningProvisionDeliveryStarted)) {
            return false;
        }
        CashTagProvisioningProvisionDeliveryStarted cashTagProvisioningProvisionDeliveryStarted = (CashTagProvisioningProvisionDeliveryStarted) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningProvisionDeliveryStarted.flow_token) && this.installed_apps_count.equals(cashTagProvisioningProvisionDeliveryStarted.installed_apps_count) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningProvisionDeliveryStarted.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningProvisionDeliveryStarted.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningProvisionDeliveryStarted.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Provision DeliveryStarted";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((str == null ? 0 : str.hashCode()) * 31, 29791, this.installed_apps_count);
        String str2 = this.journey_token;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag_cin;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag_theme_token;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.installed_apps_count, "CashTagProvisioningProvisionDeliveryStarted(flow_token=", this.flow_token, ", installed_apps_count=", ", available_apps_count=null, thermal_state=null, journey_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.journey_token, ", tag_cin=", this.tag_cin, ", tag_theme_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.tag_theme_token, ")");
    }
}
