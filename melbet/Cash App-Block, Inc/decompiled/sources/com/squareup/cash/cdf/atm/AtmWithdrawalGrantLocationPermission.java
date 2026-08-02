package com.squareup.cash.cdf.atm;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AtmWithdrawalGrantLocationPermission implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AndroidLocationAuthorizationStatus android_location_authorization_status;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AndroidLocationAuthorizationStatus {
        public static final /* synthetic */ AndroidLocationAuthorizationStatus[] $VALUES;
        public static final AndroidLocationAuthorizationStatus DENIED;
        public static final AndroidLocationAuthorizationStatus GRANTED;

        static {
            AndroidLocationAuthorizationStatus androidLocationAuthorizationStatus = new AndroidLocationAuthorizationStatus("DENIED", 0);
            DENIED = androidLocationAuthorizationStatus;
            AndroidLocationAuthorizationStatus androidLocationAuthorizationStatus2 = new AndroidLocationAuthorizationStatus("GRANTED", 1);
            GRANTED = androidLocationAuthorizationStatus2;
            $VALUES = new AndroidLocationAuthorizationStatus[]{androidLocationAuthorizationStatus, androidLocationAuthorizationStatus2};
        }

        public static AndroidLocationAuthorizationStatus valueOf(String str) {
            return (AndroidLocationAuthorizationStatus) Enum.valueOf(AndroidLocationAuthorizationStatus.class, str);
        }

        public static AndroidLocationAuthorizationStatus[] values() {
            return (AndroidLocationAuthorizationStatus[]) $VALUES.clone();
        }
    }

    public AtmWithdrawalGrantLocationPermission(AndroidLocationAuthorizationStatus androidLocationAuthorizationStatus) {
        this.android_location_authorization_status = androidLocationAuthorizationStatus;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Atm", "cdf_action", "Withdrawal");
        Countries.putSafe(m, "android_location_authorization_status", androidLocationAuthorizationStatus);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtmWithdrawalGrantLocationPermission) && this.android_location_authorization_status == ((AtmWithdrawalGrantLocationPermission) obj).android_location_authorization_status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Atm Withdrawal GrantLocationPermission";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.android_location_authorization_status.hashCode() * 961;
    }

    public final String toString() {
        return "AtmWithdrawalGrantLocationPermission(android_location_authorization_status=" + this.android_location_authorization_status + ", ios_location_authorization_status=null, ios_precise_location_enabled=null)";
    }
}
