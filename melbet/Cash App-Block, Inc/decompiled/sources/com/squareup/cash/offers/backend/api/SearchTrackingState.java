package com.squareup.cash.offers.backend.api;

import com.squareup.cash.observability.backend.api.SpanTracking;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SearchTrackingState {
    public final ActionState actionState;
    public final SpanTracking dbTracking;
    public final SpanTracking mapperTracking;
    public final SpanTracking requestTracking;

    public SearchTrackingState(ActionState actionState, SpanTracking spanTracking, SpanTracking spanTracking2, SpanTracking spanTracking3) {
        actionState.getClass();
        this.actionState = actionState;
        this.dbTracking = spanTracking;
        this.requestTracking = spanTracking2;
        this.mapperTracking = spanTracking3;
    }

    public static SearchTrackingState copy$default(SearchTrackingState searchTrackingState, ActionState actionState, SpanTracking spanTracking, SpanTracking spanTracking2, SpanTracking spanTracking3, int i) {
        if ((i & 1) != 0) {
            actionState = searchTrackingState.actionState;
        }
        if ((i & 2) != 0) {
            spanTracking = searchTrackingState.dbTracking;
        }
        if ((i & 4) != 0) {
            spanTracking2 = searchTrackingState.requestTracking;
        }
        if ((i & 8) != 0) {
            spanTracking3 = searchTrackingState.mapperTracking;
        }
        searchTrackingState.getClass();
        actionState.getClass();
        return new SearchTrackingState(actionState, spanTracking, spanTracking2, spanTracking3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTrackingState)) {
            return false;
        }
        SearchTrackingState searchTrackingState = (SearchTrackingState) obj;
        return this.actionState == searchTrackingState.actionState && Intrinsics.areEqual(this.dbTracking, searchTrackingState.dbTracking) && Intrinsics.areEqual(this.requestTracking, searchTrackingState.requestTracking) && Intrinsics.areEqual(this.mapperTracking, searchTrackingState.mapperTracking);
    }

    public final int hashCode() {
        int hashCode = this.actionState.hashCode() * 31;
        SpanTracking spanTracking = this.dbTracking;
        int hashCode2 = (hashCode + (spanTracking == null ? 0 : spanTracking.hashCode())) * 31;
        SpanTracking spanTracking2 = this.requestTracking;
        int hashCode3 = (hashCode2 + (spanTracking2 == null ? 0 : spanTracking2.hashCode())) * 31;
        SpanTracking spanTracking3 = this.mapperTracking;
        return hashCode3 + (spanTracking3 != null ? spanTracking3.hashCode() : 0);
    }

    public final String toString() {
        return "SearchTrackingState(actionState=" + this.actionState + ", dbTracking=" + this.dbTracking + ", requestTracking=" + this.requestTracking + ", mapperTracking=" + this.mapperTracking + ")";
    }
}
