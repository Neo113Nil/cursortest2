package com.squareup.cash.cdf.account;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AccountAuthenticateDismissLockSplashScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer duration;
    public final LinkedHashMap parameters;
    public final SecurityCheckpointState securityCheckpointState;
    public final Integer threshold;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SecurityCheckpointState {
        public static final /* synthetic */ SecurityCheckpointState[] $VALUES;
        public static final SecurityCheckpointState DISABLED;
        public static final SecurityCheckpointState LOCKED;
        public static final SecurityCheckpointState UNLOCKED;

        static {
            SecurityCheckpointState securityCheckpointState = new SecurityCheckpointState("DISABLED", 0);
            DISABLED = securityCheckpointState;
            SecurityCheckpointState securityCheckpointState2 = new SecurityCheckpointState("LOCKED", 1);
            LOCKED = securityCheckpointState2;
            SecurityCheckpointState securityCheckpointState3 = new SecurityCheckpointState("UNLOCKED", 2);
            UNLOCKED = securityCheckpointState3;
            $VALUES = new SecurityCheckpointState[]{securityCheckpointState, securityCheckpointState2, securityCheckpointState3};
        }

        public static SecurityCheckpointState valueOf(String str) {
            return (SecurityCheckpointState) Enum.valueOf(SecurityCheckpointState.class, str);
        }

        public static SecurityCheckpointState[] values() {
            return (SecurityCheckpointState[]) $VALUES.clone();
        }
    }

    public AccountAuthenticateDismissLockSplashScreen(Integer num, Integer num2, SecurityCheckpointState securityCheckpointState) {
        this.threshold = num;
        this.duration = num2;
        this.securityCheckpointState = securityCheckpointState;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Account", "cdf_action", "Authenticate");
        Countries.putSafe(m, "threshold", num);
        Countries.putSafe(m, "duration", num2);
        Countries.putSafe(m, "securityCheckpointState", securityCheckpointState);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAuthenticateDismissLockSplashScreen)) {
            return false;
        }
        AccountAuthenticateDismissLockSplashScreen accountAuthenticateDismissLockSplashScreen = (AccountAuthenticateDismissLockSplashScreen) obj;
        return this.threshold.equals(accountAuthenticateDismissLockSplashScreen.threshold) && this.duration.equals(accountAuthenticateDismissLockSplashScreen.duration) && this.securityCheckpointState == accountAuthenticateDismissLockSplashScreen.securityCheckpointState;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Authenticate DismissLockSplashScreen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.securityCheckpointState.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.threshold.hashCode() * 31, 31, this.duration);
    }

    public final String toString() {
        return "AccountAuthenticateDismissLockSplashScreen(threshold=" + this.threshold + ", duration=" + this.duration + ", securityCheckpointState=" + this.securityCheckpointState + ")";
    }
}
