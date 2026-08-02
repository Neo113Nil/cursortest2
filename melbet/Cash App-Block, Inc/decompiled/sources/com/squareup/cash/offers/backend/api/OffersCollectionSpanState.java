package com.squareup.cash.offers.backend.api;

import com.squareup.cash.observability.backend.api.SpanTracking;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersCollectionSpanState {
    public final SpanTracking collectionSpan;
    public final SpanTracking loadingSpan;
    public final SpanTracking networkSpan;

    public OffersCollectionSpanState(SpanTracking spanTracking, SpanTracking spanTracking2, SpanTracking spanTracking3) {
        this.collectionSpan = spanTracking;
        this.loadingSpan = spanTracking2;
        this.networkSpan = spanTracking3;
    }

    public static OffersCollectionSpanState copy$default(OffersCollectionSpanState offersCollectionSpanState, SpanTracking spanTracking, SpanTracking spanTracking2, SpanTracking spanTracking3, int i) {
        if ((i & 1) != 0) {
            spanTracking = offersCollectionSpanState.collectionSpan;
        }
        if ((i & 2) != 0) {
            spanTracking2 = offersCollectionSpanState.loadingSpan;
        }
        if ((i & 4) != 0) {
            spanTracking3 = offersCollectionSpanState.networkSpan;
        }
        return new OffersCollectionSpanState(spanTracking, spanTracking2, spanTracking3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersCollectionSpanState)) {
            return false;
        }
        OffersCollectionSpanState offersCollectionSpanState = (OffersCollectionSpanState) obj;
        return Intrinsics.areEqual(this.collectionSpan, offersCollectionSpanState.collectionSpan) && Intrinsics.areEqual(this.loadingSpan, offersCollectionSpanState.loadingSpan) && Intrinsics.areEqual(this.networkSpan, offersCollectionSpanState.networkSpan);
    }

    public final int hashCode() {
        SpanTracking spanTracking = this.collectionSpan;
        int hashCode = (spanTracking == null ? 0 : spanTracking.hashCode()) * 31;
        SpanTracking spanTracking2 = this.loadingSpan;
        int hashCode2 = (hashCode + (spanTracking2 == null ? 0 : spanTracking2.hashCode())) * 31;
        SpanTracking spanTracking3 = this.networkSpan;
        return hashCode2 + (spanTracking3 != null ? spanTracking3.hashCode() : 0);
    }

    public final String toString() {
        return "OffersCollectionSpanState(collectionSpan=" + this.collectionSpan + ", loadingSpan=" + this.loadingSpan + ", networkSpan=" + this.networkSpan + ")";
    }
}
