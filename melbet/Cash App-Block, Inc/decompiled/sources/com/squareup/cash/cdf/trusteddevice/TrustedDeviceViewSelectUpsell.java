package com.squareup.cash.cdf.trusteddevice;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class TrustedDeviceViewSelectUpsell implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final UpsellType f1108type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class UpsellType {
        public static final /* synthetic */ UpsellType[] $VALUES;
        public static final UpsellType ChangePIN;
        public static final UpsellType EnableMoveMoney;

        static {
            UpsellType upsellType = new UpsellType("EnableMoveMoney", 0);
            EnableMoveMoney = upsellType;
            UpsellType upsellType2 = new UpsellType("ChangePIN", 1);
            ChangePIN = upsellType2;
            $VALUES = new UpsellType[]{upsellType, upsellType2};
        }

        public static UpsellType valueOf(String str) {
            return (UpsellType) Enum.valueOf(UpsellType.class, str);
        }

        public static UpsellType[] values() {
            return (UpsellType[]) $VALUES.clone();
        }
    }

    public TrustedDeviceViewSelectUpsell(UpsellType upsellType) {
        this.f1108type = upsellType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "TrustedDevice", "cdf_action", "View");
        Countries.putSafe(m, "type", upsellType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrustedDeviceViewSelectUpsell) && this.f1108type == ((TrustedDeviceViewSelectUpsell) obj).f1108type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "TrustedDevice View SelectUpsell";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.f1108type.hashCode();
    }

    public final String toString() {
        return "TrustedDeviceViewSelectUpsell(type=" + this.f1108type + ")";
    }
}
