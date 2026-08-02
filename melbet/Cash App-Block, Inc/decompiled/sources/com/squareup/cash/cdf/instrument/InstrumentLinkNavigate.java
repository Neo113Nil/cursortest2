package com.squareup.cash.cdf.instrument;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.InstrumentLinkFlowEntryPoint;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class InstrumentLinkNavigate implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final InstrumentLinkFlowEntryPoint entry_point;
    public final LinkedHashMap parameters;
    public final Value value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class Value {
        public static final /* synthetic */ Value[] $VALUES;
        public static final Value BACK;
        public static final Value NEXT;
        public static final Value SKIP;

        static {
            Value value = new Value("SKIP", 0);
            SKIP = value;
            Value value2 = new Value("NEXT", 1);
            NEXT = value2;
            Value value3 = new Value("SCAN", 2);
            Value value4 = new Value("BACK", 3);
            BACK = value4;
            $VALUES = new Value[]{value, value2, value3, value4};
        }

        public static Value valueOf(String str) {
            return (Value) Enum.valueOf(Value.class, str);
        }

        public static Value[] values() {
            return (Value[]) $VALUES.clone();
        }
    }

    public InstrumentLinkNavigate(InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint, Value value) {
        this.entry_point = instrumentLinkFlowEntryPoint;
        this.value = value;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "Instrument", "cdf_action", "Link");
        Countries.putSafe(m, "entry_point", instrumentLinkFlowEntryPoint);
        Countries.putSafe(m, "value", value);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkNavigate)) {
            return false;
        }
        InstrumentLinkNavigate instrumentLinkNavigate = (InstrumentLinkNavigate) obj;
        return this.entry_point == instrumentLinkNavigate.entry_point && this.value == instrumentLinkNavigate.value;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Link Navigate";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint = this.entry_point;
        return (this.value.hashCode() + ((instrumentLinkFlowEntryPoint == null ? 0 : instrumentLinkFlowEntryPoint.hashCode()) * 28629151)) * 31;
    }

    public final String toString() {
        return "InstrumentLinkNavigate(client_scenario=null, entry_point=" + this.entry_point + ", flow_token=null, rate_plan=null, source=null, treatment=null, value=" + this.value + ", variant=null)";
    }
}
