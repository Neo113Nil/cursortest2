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
public final class InstrumentLinkReceiveLinkResult implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final InstrumentLinkFlowEntryPoint entry_point;
    public final LinkedHashMap parameters;
    public final Result result;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class Result {
        public static final /* synthetic */ Result[] $VALUES;
        public static final Result FAILURE;
        public static final Result SUCCESS;

        static {
            Result result = new Result("SUCCESS", 0);
            SUCCESS = result;
            Result result2 = new Result("FAILURE", 1);
            FAILURE = result2;
            $VALUES = new Result[]{result, result2};
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    public InstrumentLinkReceiveLinkResult(InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint, Result result) {
        this.entry_point = instrumentLinkFlowEntryPoint;
        this.result = result;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Instrument", "cdf_action", "Link");
        Countries.putSafe(m, "entry_point", instrumentLinkFlowEntryPoint);
        Countries.putSafe(m, "result", result);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkReceiveLinkResult)) {
            return false;
        }
        InstrumentLinkReceiveLinkResult instrumentLinkReceiveLinkResult = (InstrumentLinkReceiveLinkResult) obj;
        return this.entry_point == instrumentLinkReceiveLinkResult.entry_point && this.result == instrumentLinkReceiveLinkResult.result;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Link ReceiveLinkResult";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint = this.entry_point;
        return (this.result.hashCode() + ((instrumentLinkFlowEntryPoint == null ? 0 : instrumentLinkFlowEntryPoint.hashCode()) * 31)) * 961;
    }

    public final String toString() {
        return "InstrumentLinkReceiveLinkResult(entry_point=" + this.entry_point + ", result=" + this.result + ", treatment=null, variant=null)";
    }
}
