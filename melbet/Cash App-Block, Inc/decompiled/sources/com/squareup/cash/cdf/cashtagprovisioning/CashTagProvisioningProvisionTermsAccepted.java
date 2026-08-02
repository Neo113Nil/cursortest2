package com.squareup.cash.cdf.cashtagprovisioning;

import android.os.Build;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class CashTagProvisioningProvisionTermsAccepted implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final DeviceType device_type;
    public final String flow_token;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final String tag_cin;
    public final String tag_theme_token;

    public CashTagProvisioningProvisionTermsAccepted(String str, DeviceType deviceType, String str2, String str3, String str4) {
        String str5 = Build.MODEL;
        this.flow_token = str;
        this.device_type = deviceType;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "CashTagProvisioning", "cdf_action", "Provision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "device_type", deviceType);
        Countries.putSafe(m, "phone_model", str5);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningProvisionTermsAccepted)) {
            return false;
        }
        CashTagProvisioningProvisionTermsAccepted cashTagProvisioningProvisionTermsAccepted = (CashTagProvisioningProvisionTermsAccepted) obj;
        if (!Intrinsics.areEqual(this.flow_token, cashTagProvisioningProvisionTermsAccepted.flow_token) || this.device_type != cashTagProvisioningProvisionTermsAccepted.device_type) {
            return false;
        }
        String str = Build.MODEL;
        return Intrinsics.areEqual(str, str) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningProvisionTermsAccepted.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningProvisionTermsAccepted.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningProvisionTermsAccepted.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Provision TermsAccepted";
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
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.journey_token;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.tag_cin;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tag_theme_token;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = Build.MODEL;
        StringBuilder sb = new StringBuilder("CashTagProvisioningProvisionTermsAccepted(flow_token=");
        sb.append(this.flow_token);
        sb.append(", device_type=");
        sb.append(this.device_type);
        sb.append(", phone_model=");
        Boxes$$ExternalSyntheticOutline1.m(sb, str, ", journey_token=", this.journey_token, ", thermal_state=null, tag_cin=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag_cin, ", tag_theme_token=", this.tag_theme_token, ")");
    }
}
