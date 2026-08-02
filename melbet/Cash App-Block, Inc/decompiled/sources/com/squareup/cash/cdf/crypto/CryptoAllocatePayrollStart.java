package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CryptoAllocatePayrollStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer current_allocation_bps;
    public final LinkedHashMap parameters;
    public final AllocatePayrollStateType state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class AllocatePayrollStateType {
        public static final /* synthetic */ AllocatePayrollStateType[] $VALUES;
        public static final AllocatePayrollStateType CARD_NOT_ACTIVATED;
        public static final AllocatePayrollStateType ENROLLED;
        public static final AllocatePayrollStateType NO_CARD;
        public static final AllocatePayrollStateType UNENROLLED;

        static {
            AllocatePayrollStateType allocatePayrollStateType = new AllocatePayrollStateType("NO_CARD", 0);
            NO_CARD = allocatePayrollStateType;
            AllocatePayrollStateType allocatePayrollStateType2 = new AllocatePayrollStateType("CARD_NOT_ACTIVATED", 1);
            CARD_NOT_ACTIVATED = allocatePayrollStateType2;
            AllocatePayrollStateType allocatePayrollStateType3 = new AllocatePayrollStateType("UNENROLLED", 2);
            UNENROLLED = allocatePayrollStateType3;
            AllocatePayrollStateType allocatePayrollStateType4 = new AllocatePayrollStateType("ENROLLED", 3);
            ENROLLED = allocatePayrollStateType4;
            $VALUES = new AllocatePayrollStateType[]{allocatePayrollStateType, allocatePayrollStateType2, allocatePayrollStateType3, allocatePayrollStateType4};
        }

        public static AllocatePayrollStateType valueOf(String str) {
            return (AllocatePayrollStateType) Enum.valueOf(AllocatePayrollStateType.class, str);
        }

        public static AllocatePayrollStateType[] values() {
            return (AllocatePayrollStateType[]) $VALUES.clone();
        }
    }

    public CryptoAllocatePayrollStart(Integer num, AllocatePayrollStateType allocatePayrollStateType) {
        this.current_allocation_bps = num;
        this.state = allocatePayrollStateType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Crypto", "cdf_action", "AllocatePayroll");
        Countries.putSafe(m, "current_allocation_bps", num);
        Countries.putSafe(m, "state", allocatePayrollStateType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoAllocatePayrollStart)) {
            return false;
        }
        CryptoAllocatePayrollStart cryptoAllocatePayrollStart = (CryptoAllocatePayrollStart) obj;
        return this.current_allocation_bps.equals(cryptoAllocatePayrollStart.current_allocation_bps) && this.state == cryptoAllocatePayrollStart.state;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto AllocatePayroll Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.state.hashCode() + (this.current_allocation_bps.hashCode() * 31);
    }

    public final String toString() {
        return "CryptoAllocatePayrollStart(current_allocation_bps=" + this.current_allocation_bps + ", state=" + this.state + ")";
    }
}
