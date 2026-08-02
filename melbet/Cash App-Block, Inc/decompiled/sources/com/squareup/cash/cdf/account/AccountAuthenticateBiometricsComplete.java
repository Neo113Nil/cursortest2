package com.squareup.cash.cdf.account;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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
public final class AccountAuthenticateBiometricsComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer attempt_count;
    public final BiometryType biometry_type_used;
    public final String client_scenario;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final BiometricAuthenticationResult result;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BiometricAuthenticationResult {
        public static final /* synthetic */ BiometricAuthenticationResult[] $VALUES;
        public static final BiometricAuthenticationResult AUTHENTICATION_FAILED;
        public static final BiometricAuthenticationResult AUTHENTICATION_TIMEOUT;
        public static final BiometricAuthenticationResult BIOMETRY_LOCKOUT;
        public static final BiometricAuthenticationResult SUCCESS;
        public static final BiometricAuthenticationResult SYSTEM_CANCELED;
        public static final BiometricAuthenticationResult UNKNOWN_FAILURE;
        public static final BiometricAuthenticationResult USER_CANCELED;
        public static final BiometricAuthenticationResult USER_FALLBACK;

        /* JADX INFO: Fake field, exist only in values array */
        BiometricAuthenticationResult EF0;

        static {
            BiometricAuthenticationResult biometricAuthenticationResult = new BiometricAuthenticationResult("APP_CANCELED", 0);
            BiometricAuthenticationResult biometricAuthenticationResult2 = new BiometricAuthenticationResult("SYSTEM_CANCELED", 1);
            SYSTEM_CANCELED = biometricAuthenticationResult2;
            BiometricAuthenticationResult biometricAuthenticationResult3 = new BiometricAuthenticationResult("USER_CANCELED", 2);
            USER_CANCELED = biometricAuthenticationResult3;
            BiometricAuthenticationResult biometricAuthenticationResult4 = new BiometricAuthenticationResult("BIOMETRY_LOCKOUT", 3);
            BIOMETRY_LOCKOUT = biometricAuthenticationResult4;
            BiometricAuthenticationResult biometricAuthenticationResult5 = new BiometricAuthenticationResult("AUTHENTICATION_FAILED", 4);
            AUTHENTICATION_FAILED = biometricAuthenticationResult5;
            BiometricAuthenticationResult biometricAuthenticationResult6 = new BiometricAuthenticationResult("USER_FALLBACK", 5);
            USER_FALLBACK = biometricAuthenticationResult6;
            BiometricAuthenticationResult biometricAuthenticationResult7 = new BiometricAuthenticationResult("SUCCESS", 6);
            SUCCESS = biometricAuthenticationResult7;
            BiometricAuthenticationResult biometricAuthenticationResult8 = new BiometricAuthenticationResult("AUTHENTICATION_TIMEOUT", 7);
            AUTHENTICATION_TIMEOUT = biometricAuthenticationResult8;
            BiometricAuthenticationResult biometricAuthenticationResult9 = new BiometricAuthenticationResult("INVALID_BIOMETRIC_STATE", 8);
            BiometricAuthenticationResult biometricAuthenticationResult10 = new BiometricAuthenticationResult("UNKNOWN_FAILURE", 9);
            UNKNOWN_FAILURE = biometricAuthenticationResult10;
            $VALUES = new BiometricAuthenticationResult[]{biometricAuthenticationResult, biometricAuthenticationResult2, biometricAuthenticationResult3, biometricAuthenticationResult4, biometricAuthenticationResult5, biometricAuthenticationResult6, biometricAuthenticationResult7, biometricAuthenticationResult8, biometricAuthenticationResult9, biometricAuthenticationResult10};
        }

        public static BiometricAuthenticationResult valueOf(String str) {
            return (BiometricAuthenticationResult) Enum.valueOf(BiometricAuthenticationResult.class, str);
        }

        public static BiometricAuthenticationResult[] values() {
            return (BiometricAuthenticationResult[]) $VALUES.clone();
        }
    }

    public AccountAuthenticateBiometricsComplete(String str, String str2, BiometryType biometryType, BiometricAuthenticationResult biometricAuthenticationResult, Integer num) {
        this.client_scenario = str;
        this.flow_token = str2;
        this.biometry_type_used = biometryType;
        this.result = biometricAuthenticationResult;
        this.attempt_count = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Account", "cdf_action", "Authenticate");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "biometry_type_used", biometryType);
        Countries.putSafe(m, "result", biometricAuthenticationResult);
        Countries.putSafe(m, "attempt_count", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAuthenticateBiometricsComplete)) {
            return false;
        }
        AccountAuthenticateBiometricsComplete accountAuthenticateBiometricsComplete = (AccountAuthenticateBiometricsComplete) obj;
        return Intrinsics.areEqual(this.client_scenario, accountAuthenticateBiometricsComplete.client_scenario) && Intrinsics.areEqual(this.flow_token, accountAuthenticateBiometricsComplete.flow_token) && this.biometry_type_used == accountAuthenticateBiometricsComplete.biometry_type_used && this.result == accountAuthenticateBiometricsComplete.result && this.attempt_count.equals(accountAuthenticateBiometricsComplete.attempt_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Authenticate BiometricsComplete";
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
        BiometryType biometryType = this.biometry_type_used;
        return CameraState$Type$EnumUnboxingLocalUtility.m((this.result.hashCode() + ((hashCode2 + (biometryType != null ? biometryType.hashCode() : 0)) * 31)) * 31, 31, this.attempt_count);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountAuthenticateBiometricsComplete(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ", biometry_type_used=");
        m.append(this.biometry_type_used);
        m.append(", result=");
        m.append(this.result);
        m.append(", attempt_count=");
        return NavAction$$ExternalSyntheticOutline0.m(m, this.attempt_count, ", additional_info=null)");
    }
}
