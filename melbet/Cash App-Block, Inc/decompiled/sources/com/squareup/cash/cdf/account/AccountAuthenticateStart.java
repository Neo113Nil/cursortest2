package com.squareup.cash.cdf.account;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class AccountAuthenticateStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean authentication_token_exists;
    public final String client_scenario;
    public final BiometryState current_biometry_state;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final BiometryType supported_biometry_type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BiometryState {
        public static final /* synthetic */ BiometryState[] $VALUES;
        public static final BiometryState ENABLED;
        public static final BiometryState NOT_ENROLLED;
        public static final BiometryState NOT_SUPPORTED;
        public static final BiometryState OS_UPDATE_REQUIRED;

        static {
            BiometryState biometryState = new BiometryState("NOT_ENROLLED", 0);
            NOT_ENROLLED = biometryState;
            BiometryState biometryState2 = new BiometryState("NOT_SUPPORTED", 1);
            NOT_SUPPORTED = biometryState2;
            BiometryState biometryState3 = new BiometryState("NO_DEVICE_CREDENTIALS", 2);
            BiometryState biometryState4 = new BiometryState("NOT_AUTHORIZED", 3);
            BiometryState biometryState5 = new BiometryState("TOO_MANY_ATTEMPTS", 4);
            BiometryState biometryState6 = new BiometryState("UNREQUESTED", 5);
            BiometryState biometryState7 = new BiometryState("OS_UPDATE_REQUIRED", 6);
            OS_UPDATE_REQUIRED = biometryState7;
            BiometryState biometryState8 = new BiometryState("ENABLED", 7);
            ENABLED = biometryState8;
            $VALUES = new BiometryState[]{biometryState, biometryState2, biometryState3, biometryState4, biometryState5, biometryState6, biometryState7, biometryState8, new BiometryState("DISABLED", 8)};
        }

        public static BiometryState valueOf(String str) {
            return (BiometryState) Enum.valueOf(BiometryState.class, str);
        }

        public static BiometryState[] values() {
            return (BiometryState[]) $VALUES.clone();
        }
    }

    public AccountAuthenticateStart(String str, String str2, BiometryType biometryType, BiometryState biometryState, Boolean bool) {
        this.client_scenario = str;
        this.flow_token = str2;
        this.supported_biometry_type = biometryType;
        this.current_biometry_state = biometryState;
        this.authentication_token_exists = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Account", "cdf_action", "Authenticate");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "supported_biometry_type", biometryType);
        Countries.putSafe(m, "current_biometry_state", biometryState);
        Countries.putSafe(m, "authentication_token_exists", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAuthenticateStart)) {
            return false;
        }
        AccountAuthenticateStart accountAuthenticateStart = (AccountAuthenticateStart) obj;
        return Intrinsics.areEqual(this.client_scenario, accountAuthenticateStart.client_scenario) && Intrinsics.areEqual(this.flow_token, accountAuthenticateStart.flow_token) && this.supported_biometry_type == accountAuthenticateStart.supported_biometry_type && this.current_biometry_state == accountAuthenticateStart.current_biometry_state && this.authentication_token_exists.equals(accountAuthenticateStart.authentication_token_exists);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Authenticate Start";
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
        return this.authentication_token_exists.hashCode() + ((this.current_biometry_state.hashCode() + ((hashCode2 + (biometryType != null ? biometryType.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountAuthenticateStart(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ", supported_biometry_type=");
        m.append(this.supported_biometry_type);
        m.append(", current_biometry_state=");
        m.append(this.current_biometry_state);
        m.append(", authentication_token_exists=");
        return Thread$State$EnumUnboxingLocalUtility.m(m, this.authentication_token_exists, ")");
    }
}
