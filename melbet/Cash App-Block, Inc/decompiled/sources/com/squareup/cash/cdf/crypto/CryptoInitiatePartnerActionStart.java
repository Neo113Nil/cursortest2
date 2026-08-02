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
public final class CryptoInitiatePartnerActionStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final PartnerType partner;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PartnerActionType {
        public static final /* synthetic */ PartnerActionType[] $VALUES;
        public static final PartnerActionType SELL;

        /* JADX INFO: Fake field, exist only in values array */
        PartnerActionType EF0;

        static {
            PartnerActionType partnerActionType = new PartnerActionType("BUY", 0);
            PartnerActionType partnerActionType2 = new PartnerActionType("SELL", 1);
            SELL = partnerActionType2;
            $VALUES = new PartnerActionType[]{partnerActionType, partnerActionType2, new PartnerActionType("TRANSFER", 2)};
        }

        public static PartnerActionType valueOf(String str) {
            return (PartnerActionType) Enum.valueOf(PartnerActionType.class, str);
        }

        public static PartnerActionType[] values() {
            return (PartnerActionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PartnerType {
        public static final /* synthetic */ PartnerType[] $VALUES;
        public static final PartnerType BITKEY;
        public static final PartnerType UNKNOWN;

        static {
            PartnerType partnerType = new PartnerType("BITKEY", 0);
            BITKEY = partnerType;
            PartnerType partnerType2 = new PartnerType("UNKNOWN", 1);
            UNKNOWN = partnerType2;
            $VALUES = new PartnerType[]{partnerType, partnerType2};
        }

        public static PartnerType valueOf(String str) {
            return (PartnerType) Enum.valueOf(PartnerType.class, str);
        }

        public static PartnerType[] values() {
            return (PartnerType[]) $VALUES.clone();
        }
    }

    public CryptoInitiatePartnerActionStart(PartnerType partnerType) {
        PartnerActionType partnerActionType = PartnerActionType.SELL;
        this.partner = partnerType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Crypto", "cdf_action", "InitiatePartnerAction");
        Countries.putSafe(m, "action", partnerActionType);
        Countries.putSafe(m, "partner", partnerType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoInitiatePartnerActionStart)) {
            return false;
        }
        PartnerActionType partnerActionType = PartnerActionType.SELL;
        return this.partner == ((CryptoInitiatePartnerActionStart) obj).partner;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto InitiatePartnerAction Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = PartnerActionType.SELL.hashCode() * 31;
        PartnerType partnerType = this.partner;
        return hashCode + (partnerType == null ? 0 : partnerType.hashCode());
    }

    public final String toString() {
        return "CryptoInitiatePartnerActionStart(action=" + PartnerActionType.SELL + ", partner=" + this.partner + ")";
    }
}
