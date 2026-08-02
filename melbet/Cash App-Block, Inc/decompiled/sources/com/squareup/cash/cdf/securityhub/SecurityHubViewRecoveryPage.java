package com.squareup.cash.cdf.securityhub;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class SecurityHubViewRecoveryPage implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final RecoveryType recovery_type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class RecoveryType {
        public static final /* synthetic */ RecoveryType[] $VALUES;
        public static final RecoveryType HACKED;
        public static final RecoveryType SCAMMED;

        static {
            RecoveryType recoveryType = new RecoveryType("SCAMMED", 0);
            SCAMMED = recoveryType;
            RecoveryType recoveryType2 = new RecoveryType("HACKED", 1);
            HACKED = recoveryType2;
            $VALUES = new RecoveryType[]{recoveryType, recoveryType2};
        }

        public static RecoveryType valueOf(String str) {
            return (RecoveryType) Enum.valueOf(RecoveryType.class, str);
        }

        public static RecoveryType[] values() {
            return (RecoveryType[]) $VALUES.clone();
        }
    }

    public SecurityHubViewRecoveryPage(RecoveryType recoveryType) {
        this.recovery_type = recoveryType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "SecurityHub", "cdf_action", "View");
        Countries.putSafe(m, "recovery_type", recoveryType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SecurityHubViewRecoveryPage) && this.recovery_type == ((SecurityHubViewRecoveryPage) obj).recovery_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SecurityHub View RecoveryPage";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.recovery_type.hashCode();
    }

    public final String toString() {
        return "SecurityHubViewRecoveryPage(recovery_type=" + this.recovery_type + ")";
    }
}
