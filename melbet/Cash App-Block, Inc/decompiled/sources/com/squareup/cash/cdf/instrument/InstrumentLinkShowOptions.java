package com.squareup.cash.cdf.instrument;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class InstrumentLinkShowOptions implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final OptionSheetType f1094type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class OptionSheetType {
        public static final /* synthetic */ OptionSheetType[] $VALUES;
        public static final OptionSheetType LINK;
        public static final OptionSheetType REPLACE_INSTRUMENT;

        static {
            OptionSheetType optionSheetType = new OptionSheetType("LINK", 0);
            LINK = optionSheetType;
            OptionSheetType optionSheetType2 = new OptionSheetType("REPLACE_INSTRUMENT", 1);
            REPLACE_INSTRUMENT = optionSheetType2;
            $VALUES = new OptionSheetType[]{optionSheetType, optionSheetType2};
        }

        public static OptionSheetType valueOf(String str) {
            return (OptionSheetType) Enum.valueOf(OptionSheetType.class, str);
        }

        public static OptionSheetType[] values() {
            return (OptionSheetType[]) $VALUES.clone();
        }
    }

    public InstrumentLinkShowOptions(OptionSheetType optionSheetType) {
        this.f1094type = optionSheetType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Instrument", "cdf_action", "Link");
        Countries.putSafe(m, "type", optionSheetType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstrumentLinkShowOptions) && this.f1094type == ((InstrumentLinkShowOptions) obj).f1094type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Link ShowOptions";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.f1094type.hashCode() * 31;
    }

    public final String toString() {
        return "InstrumentLinkShowOptions(type=" + this.f1094type + ", entry_point=null)";
    }
}
