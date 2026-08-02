package com.squareup.cash.cdf.cashtagprovisioning;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
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
public final class CashTagProvisioningProvisionEligibilityResult implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final EligibilityDecision decision;
    public final String denial_reason;
    public final String flow_token;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final Long response_duration_ms;
    public final String tag_cin;
    public final String tag_theme_token;

    public CashTagProvisioningProvisionEligibilityResult(String str, EligibilityDecision eligibilityDecision, String str2, Long l, String str3, String str4, String str5) {
        this.flow_token = str;
        this.decision = eligibilityDecision;
        this.denial_reason = str2;
        this.response_duration_ms = l;
        this.journey_token = str3;
        this.tag_cin = str4;
        this.tag_theme_token = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "CashTagProvisioning", "cdf_action", "Provision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "decision", eligibilityDecision);
        Countries.putSafe(m, "denial_reason", str2);
        Countries.putSafe(m, "response_duration_ms", l);
        Countries.putSafe(m, "journey_token", str3);
        Countries.putSafe(m, "tag_cin", str4);
        Countries.putSafe(m, "tag_theme_token", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningProvisionEligibilityResult)) {
            return false;
        }
        CashTagProvisioningProvisionEligibilityResult cashTagProvisioningProvisionEligibilityResult = (CashTagProvisioningProvisionEligibilityResult) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningProvisionEligibilityResult.flow_token) && this.decision == cashTagProvisioningProvisionEligibilityResult.decision && Intrinsics.areEqual(this.denial_reason, cashTagProvisioningProvisionEligibilityResult.denial_reason) && this.response_duration_ms.equals(cashTagProvisioningProvisionEligibilityResult.response_duration_ms) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningProvisionEligibilityResult.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningProvisionEligibilityResult.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningProvisionEligibilityResult.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Provision EligibilityResult";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (this.decision.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.denial_reason;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.response_duration_ms, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 961);
        String str3 = this.journey_token;
        int hashCode2 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag_cin;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tag_theme_token;
        return hashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashTagProvisioningProvisionEligibilityResult(flow_token=");
        sb.append(this.flow_token);
        sb.append(", decision=");
        sb.append(this.decision);
        sb.append(", denial_reason=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.response_duration_ms, this.denial_reason, ", response_duration_ms=", ", thermal_state=null, journey_token=", sb);
        Boxes$$ExternalSyntheticOutline1.m(sb, this.journey_token, ", tag_cin=", this.tag_cin, ", tag_theme_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag_theme_token, ")");
    }
}
