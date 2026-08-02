package com.squareup.cash.offers.backend.api;

import com.squareup.cash.observability.backend.api.SpanTracking;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersSpanState {
    public final SpanTracking loadingSpan;
    public final SpanTracking networkSpan;
    public final SpanTracking rootSpan;

    public /* synthetic */ OffersSpanState(SpanTracking spanTracking, int i) {
        this((i & 1) != 0 ? null : spanTracking, null, null);
    }

    public static OffersSpanState copy$default(OffersSpanState offersSpanState, SpanTracking spanTracking, SpanTracking spanTracking2, int i) {
        SpanTracking spanTracking3 = offersSpanState.rootSpan;
        if ((i & 2) != 0) {
            spanTracking = offersSpanState.loadingSpan;
        }
        if ((i & 4) != 0) {
            spanTracking2 = offersSpanState.networkSpan;
        }
        return new OffersSpanState(spanTracking3, spanTracking, spanTracking2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersSpanState)) {
            return false;
        }
        OffersSpanState offersSpanState = (OffersSpanState) obj;
        return Intrinsics.areEqual(this.rootSpan, offersSpanState.rootSpan) && Intrinsics.areEqual(this.loadingSpan, offersSpanState.loadingSpan) && Intrinsics.areEqual(this.networkSpan, offersSpanState.networkSpan);
    }

    public final int hashCode() {
        SpanTracking spanTracking = this.rootSpan;
        int hashCode = (spanTracking == null ? 0 : spanTracking.hashCode()) * 31;
        SpanTracking spanTracking2 = this.loadingSpan;
        int hashCode2 = (hashCode + (spanTracking2 == null ? 0 : spanTracking2.hashCode())) * 31;
        SpanTracking spanTracking3 = this.networkSpan;
        return hashCode2 + (spanTracking3 != null ? spanTracking3.hashCode() : 0);
    }

    public final String toString() {
        return "OffersSpanState(rootSpan=" + this.rootSpan + ", loadingSpan=" + this.loadingSpan + ", networkSpan=" + this.networkSpan + ")";
    }

    public OffersSpanState(SpanTracking spanTracking, SpanTracking spanTracking2, SpanTracking spanTracking3) {
        this.rootSpan = spanTracking;
        this.loadingSpan = spanTracking2;
        this.networkSpan = spanTracking3;
    }
}
