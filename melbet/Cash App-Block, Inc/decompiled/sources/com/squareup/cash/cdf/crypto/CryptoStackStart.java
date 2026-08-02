package com.squareup.cash.cdf.crypto;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CryptoStackStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final Boolean enabled;
    public final EntryPoint entry_point;
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final StackingContentType f1080type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EntryPoint {
        public static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint APPLET;
        public static final EntryPoint INTERSTITIAL;

        static {
            EntryPoint entryPoint = new EntryPoint("APPLET", 0);
            APPLET = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("INTERSTITIAL", 1);
            INTERSTITIAL = entryPoint2;
            $VALUES = new EntryPoint[]{entryPoint, entryPoint2};
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class StackingContentType {
        public static final /* synthetic */ StackingContentType[] $VALUES;
        public static final StackingContentType AUTO_INVEST;
        public static final StackingContentType LEARN_MORE;
        public static final StackingContentType PAID_IN_BITCOIN;
        public static final StackingContentType RECEIVE_P2P_AS_BTC;
        public static final StackingContentType ROUND_UPS;

        static {
            StackingContentType stackingContentType = new StackingContentType("LEARN_MORE", 0);
            LEARN_MORE = stackingContentType;
            StackingContentType stackingContentType2 = new StackingContentType("ROUND_UPS", 1);
            ROUND_UPS = stackingContentType2;
            StackingContentType stackingContentType3 = new StackingContentType("AUTO_INVEST", 2);
            AUTO_INVEST = stackingContentType3;
            StackingContentType stackingContentType4 = new StackingContentType("PAID_IN_BITCOIN", 3);
            PAID_IN_BITCOIN = stackingContentType4;
            StackingContentType stackingContentType5 = new StackingContentType("DEPOSIT_ADDRESS", 4);
            StackingContentType stackingContentType6 = new StackingContentType("GIFTING", 5);
            StackingContentType stackingContentType7 = new StackingContentType("RECEIVE_P2P_AS_BTC", 6);
            RECEIVE_P2P_AS_BTC = stackingContentType7;
            $VALUES = new StackingContentType[]{stackingContentType, stackingContentType2, stackingContentType3, stackingContentType4, stackingContentType5, stackingContentType6, stackingContentType7};
        }

        public static StackingContentType valueOf(String str) {
            return (StackingContentType) Enum.valueOf(StackingContentType.class, str);
        }

        public static StackingContentType[] values() {
            return (StackingContentType[]) $VALUES.clone();
        }
    }

    public CryptoStackStart(StackingContentType stackingContentType, EntryPoint entryPoint, Boolean bool) {
        this.f1080type = stackingContentType;
        this.entry_point = entryPoint;
        this.enabled = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Crypto", "cdf_action", "Stack");
        Countries.putSafe(m, "type", stackingContentType);
        Countries.putSafe(m, "entry_point", entryPoint);
        Countries.putSafe(m, "enabled", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoStackStart)) {
            return false;
        }
        CryptoStackStart cryptoStackStart = (CryptoStackStart) obj;
        return this.f1080type == cryptoStackStart.f1080type && this.entry_point == cryptoStackStart.entry_point && Intrinsics.areEqual(this.enabled, cryptoStackStart.enabled);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Stack Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.f1080type.hashCode() * 31;
        EntryPoint entryPoint = this.entry_point;
        int hashCode2 = (hashCode + (entryPoint == null ? 0 : entryPoint.hashCode())) * 31;
        Boolean bool = this.enabled;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CryptoStackStart(type=");
        sb.append(this.f1080type);
        sb.append(", entry_point=");
        sb.append(this.entry_point);
        sb.append(", enabled=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.enabled, ")");
    }
}
