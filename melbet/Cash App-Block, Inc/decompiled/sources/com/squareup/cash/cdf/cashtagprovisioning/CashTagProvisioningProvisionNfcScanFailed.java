package com.squareup.cash.cdf.cashtagprovisioning;

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
public final class CashTagProvisioningProvisionNfcScanFailed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final Long scan_duration_ms;
    public final String tag_cin;
    public final String tag_theme_token;

    public CashTagProvisioningProvisionNfcScanFailed(Long l, String str, String str2, String str3, String str4) {
        NfcScanErrorType nfcScanErrorType = NfcScanErrorType.HARDWARE;
        this.flow_token = str;
        this.scan_duration_ms = l;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 11, "CashTagProvisioning", "cdf_action", "Provision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "error_type", nfcScanErrorType);
        Countries.putSafe(m, "scan_duration_ms", l);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningProvisionNfcScanFailed)) {
            return false;
        }
        CashTagProvisioningProvisionNfcScanFailed cashTagProvisioningProvisionNfcScanFailed = (CashTagProvisioningProvisionNfcScanFailed) obj;
        if (!Intrinsics.areEqual(this.flow_token, cashTagProvisioningProvisionNfcScanFailed.flow_token)) {
            return false;
        }
        NfcScanErrorType nfcScanErrorType = NfcScanErrorType.HARDWARE;
        return this.scan_duration_ms.equals(cashTagProvisioningProvisionNfcScanFailed.scan_duration_ms) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningProvisionNfcScanFailed.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningProvisionNfcScanFailed.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningProvisionNfcScanFailed.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Provision NfcScanFailed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.scan_duration_ms, (NfcScanErrorType.HARDWARE.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 923521);
        String str2 = this.journey_token;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag_cin;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag_theme_token;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        NfcScanErrorType nfcScanErrorType = NfcScanErrorType.HARDWARE;
        StringBuilder sb = new StringBuilder("CashTagProvisioningProvisionNfcScanFailed(flow_token=");
        sb.append(this.flow_token);
        sb.append(", error_type=");
        sb.append(nfcScanErrorType);
        sb.append(", scan_duration_ms=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.scan_duration_ms, ", error_name=null, error_message=null, thermal_state=null, journey_token=", this.journey_token, ", tag_cin=", sb);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag_cin, ", tag_theme_token=", this.tag_theme_token, ")");
    }
}
