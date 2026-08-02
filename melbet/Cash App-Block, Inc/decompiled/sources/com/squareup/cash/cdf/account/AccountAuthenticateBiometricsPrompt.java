package com.squareup.cash.cdf.account;

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
public final class AccountAuthenticateBiometricsPrompt implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final BiometryType supported_biometry_type;

    public AccountAuthenticateBiometricsPrompt(String str, String str2, BiometryType biometryType) {
        this.client_scenario = str;
        this.flow_token = str2;
        this.supported_biometry_type = biometryType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Account", "cdf_action", "Authenticate");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "supported_biometry_type", biometryType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAuthenticateBiometricsPrompt)) {
            return false;
        }
        AccountAuthenticateBiometricsPrompt accountAuthenticateBiometricsPrompt = (AccountAuthenticateBiometricsPrompt) obj;
        return Intrinsics.areEqual(this.client_scenario, accountAuthenticateBiometricsPrompt.client_scenario) && Intrinsics.areEqual(this.flow_token, accountAuthenticateBiometricsPrompt.flow_token) && this.supported_biometry_type == accountAuthenticateBiometricsPrompt.supported_biometry_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Authenticate BiometricsPrompt";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BiometryType biometryType = this.supported_biometry_type;
        return hashCode2 + (biometryType != null ? biometryType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountAuthenticateBiometricsPrompt(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ", supported_biometry_type=");
        m.append(this.supported_biometry_type);
        m.append(")");
        return m.toString();
    }
}
