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
public final class CryptoSendShowRestrictionSheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final RestrictionType restriction_type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class RestrictionType {
        public static final /* synthetic */ RestrictionType[] $VALUES;
        public static final RestrictionType FULL;
        public static final RestrictionType PARTIAL;

        static {
            RestrictionType restrictionType = new RestrictionType("PARTIAL", 0);
            PARTIAL = restrictionType;
            RestrictionType restrictionType2 = new RestrictionType("FULL", 1);
            FULL = restrictionType2;
            $VALUES = new RestrictionType[]{restrictionType, restrictionType2};
        }

        public static RestrictionType valueOf(String str) {
            return (RestrictionType) Enum.valueOf(RestrictionType.class, str);
        }

        public static RestrictionType[] values() {
            return (RestrictionType[]) $VALUES.clone();
        }
    }

    public CryptoSendShowRestrictionSheet(RestrictionType restrictionType) {
        this.restriction_type = restrictionType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Crypto", "cdf_action", "Send");
        Countries.putSafe(m, "restriction_type", restrictionType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoSendShowRestrictionSheet) && this.restriction_type == ((CryptoSendShowRestrictionSheet) obj).restriction_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Send ShowRestrictionSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.restriction_type.hashCode() * 31;
    }

    public final String toString() {
        return "CryptoSendShowRestrictionSheet(restriction_type=" + this.restriction_type + ", content_type=null)";
    }
}
