package com.squareup.cash.cdf.transfers;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class TransfersTapCopyNumber implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final LinkedHashMap parameters;
    public final Section section;

    /* renamed from: type, reason: collision with root package name */
    public final NumberType f1106type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class NumberType {
        public static final /* synthetic */ NumberType[] $VALUES;
        public static final NumberType ACCOUNT;
        public static final NumberType ROUTING;

        static {
            NumberType numberType = new NumberType("ACCOUNT", 0);
            ACCOUNT = numberType;
            NumberType numberType2 = new NumberType("ROUTING", 1);
            ROUTING = numberType2;
            $VALUES = new NumberType[]{numberType, numberType2};
        }

        public static NumberType valueOf(String str) {
            return (NumberType) Enum.valueOf(NumberType.class, str);
        }

        public static NumberType[] values() {
            return (NumberType[]) $VALUES.clone();
        }
    }

    public TransfersTapCopyNumber(Section section, NumberType numberType) {
        this.section = section;
        this.f1106type = numberType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Transfers", "cdf_action", "Tap");
        Countries.putSafe(m, "section", section);
        Countries.putSafe(m, "type", numberType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransfersTapCopyNumber)) {
            return false;
        }
        TransfersTapCopyNumber transfersTapCopyNumber = (TransfersTapCopyNumber) obj;
        return this.section == transfersTapCopyNumber.section && this.f1106type == transfersTapCopyNumber.f1106type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Transfers Tap CopyNumber";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.f1106type.hashCode() + (this.section.hashCode() * 31);
    }

    public final String toString() {
        return "TransfersTapCopyNumber(section=" + this.section + ", type=" + this.f1106type + ")";
    }
}
