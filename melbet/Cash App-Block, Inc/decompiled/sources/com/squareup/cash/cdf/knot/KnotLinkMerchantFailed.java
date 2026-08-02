package com.squareup.cash.cdf.knot;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class KnotLinkMerchantFailed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.BRAZE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final KnotLinkFailedReason reason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class KnotLinkFailedReason {
        public static final /* synthetic */ KnotLinkFailedReason[] $VALUES;
        public static final KnotLinkFailedReason EXPIRED_SESSION;
        public static final KnotLinkFailedReason INTERNAL_ERROR;
        public static final KnotLinkFailedReason INVALID_CARD_NAME;
        public static final KnotLinkFailedReason INVALID_CLIENT_ID;
        public static final KnotLinkFailedReason INVALID_CUSTOMER_NAME;
        public static final KnotLinkFailedReason INVALID_LOGO_ID;
        public static final KnotLinkFailedReason INVALID_SESSION;
        public static final KnotLinkFailedReason MERCHANT_ID_NOT_FOUND;

        static {
            KnotLinkFailedReason knotLinkFailedReason = new KnotLinkFailedReason("INVALID_SESSION", 0);
            INVALID_SESSION = knotLinkFailedReason;
            KnotLinkFailedReason knotLinkFailedReason2 = new KnotLinkFailedReason("EXPIRED_SESSION", 1);
            EXPIRED_SESSION = knotLinkFailedReason2;
            KnotLinkFailedReason knotLinkFailedReason3 = new KnotLinkFailedReason("INVALID_CLIENT_ID", 2);
            INVALID_CLIENT_ID = knotLinkFailedReason3;
            KnotLinkFailedReason knotLinkFailedReason4 = new KnotLinkFailedReason("INTERNAL_ERROR", 3);
            INTERNAL_ERROR = knotLinkFailedReason4;
            KnotLinkFailedReason knotLinkFailedReason5 = new KnotLinkFailedReason("MERCHANT_ID_NOT_FOUND", 4);
            MERCHANT_ID_NOT_FOUND = knotLinkFailedReason5;
            KnotLinkFailedReason knotLinkFailedReason6 = new KnotLinkFailedReason("INVALID_CARD_NAME", 5);
            INVALID_CARD_NAME = knotLinkFailedReason6;
            KnotLinkFailedReason knotLinkFailedReason7 = new KnotLinkFailedReason("INVALID_CUSTOMER_NAME", 6);
            INVALID_CUSTOMER_NAME = knotLinkFailedReason7;
            KnotLinkFailedReason knotLinkFailedReason8 = new KnotLinkFailedReason("INVALID_LOGO_ID", 7);
            INVALID_LOGO_ID = knotLinkFailedReason8;
            $VALUES = new KnotLinkFailedReason[]{knotLinkFailedReason, knotLinkFailedReason2, knotLinkFailedReason3, knotLinkFailedReason4, knotLinkFailedReason5, knotLinkFailedReason6, knotLinkFailedReason7, knotLinkFailedReason8};
        }

        public static KnotLinkFailedReason valueOf(String str) {
            return (KnotLinkFailedReason) Enum.valueOf(KnotLinkFailedReason.class, str);
        }

        public static KnotLinkFailedReason[] values() {
            return (KnotLinkFailedReason[]) $VALUES.clone();
        }
    }

    public KnotLinkMerchantFailed(KnotLinkFailedReason knotLinkFailedReason) {
        this.reason = knotLinkFailedReason;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Knot", "cdf_action", "LinkMerchant");
        Countries.putSafe(m, "reason", knotLinkFailedReason);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KnotLinkMerchantFailed) && this.reason == ((KnotLinkMerchantFailed) obj).reason;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Knot LinkMerchant Failed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.reason.hashCode();
    }

    public final String toString() {
        return "KnotLinkMerchantFailed(reason=" + this.reason + ")";
    }
}
