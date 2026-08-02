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
public final class AccountAuthenticateSubmitCredential implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final CredentialType credential_type;
    public final String flow_token;
    public final Integer input_duration_ms;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class CredentialType {
        public static final /* synthetic */ CredentialType[] $VALUES;
        public static final CredentialType PASSCODE;
        public static final CredentialType TOKEN;

        static {
            CredentialType credentialType = new CredentialType("PASSCODE", 0);
            PASSCODE = credentialType;
            CredentialType credentialType2 = new CredentialType("TOKEN", 1);
            TOKEN = credentialType2;
            $VALUES = new CredentialType[]{credentialType, credentialType2};
        }

        public static CredentialType valueOf(String str) {
            return (CredentialType) Enum.valueOf(CredentialType.class, str);
        }

        public static CredentialType[] values() {
            return (CredentialType[]) $VALUES.clone();
        }
    }

    public AccountAuthenticateSubmitCredential(String str, String str2, Integer num, CredentialType credentialType) {
        this.client_scenario = str;
        this.flow_token = str2;
        this.input_duration_ms = num;
        this.credential_type = credentialType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Account", "cdf_action", "Authenticate");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "input_duration_ms", num);
        Countries.putSafe(m, "credential_type", credentialType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAuthenticateSubmitCredential)) {
            return false;
        }
        AccountAuthenticateSubmitCredential accountAuthenticateSubmitCredential = (AccountAuthenticateSubmitCredential) obj;
        return Intrinsics.areEqual(this.client_scenario, accountAuthenticateSubmitCredential.client_scenario) && Intrinsics.areEqual(this.flow_token, accountAuthenticateSubmitCredential.flow_token) && Intrinsics.areEqual(this.input_duration_ms, accountAuthenticateSubmitCredential.input_duration_ms) && this.credential_type == accountAuthenticateSubmitCredential.credential_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Authenticate SubmitCredential";
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
        Integer num = this.input_duration_ms;
        return this.credential_type.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountAuthenticateSubmitCredential(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ", input_duration_ms=");
        m.append(this.input_duration_ms);
        m.append(", credential_type=");
        m.append(this.credential_type);
        m.append(")");
        return m.toString();
    }
}
