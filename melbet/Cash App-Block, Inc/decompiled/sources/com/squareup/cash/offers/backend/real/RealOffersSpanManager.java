package com.squareup.cash.offers.backend.real;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.offers.backend.api.OffersSpanAction;
import com.squareup.cash.offers.backend.api.OffersSpanState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class RealOffersSpanManager {
    public final RealObservabilityManager observabilityManager;
    public OffersSpanState spanState = new OffersSpanState(null, 7);

    public RealOffersSpanManager(RealObservabilityManager realObservabilityManager) {
        this.observabilityManager = realObservabilityManager;
    }

    public final void onAction(OffersSpanAction offersSpanAction) {
        offersSpanAction.getClass();
        if (offersSpanAction instanceof OffersSpanAction.StartRootSpan) {
            this.spanState = new OffersSpanState(RealObservabilityManager.startTrackingRootSpan$default(this.observabilityManager, ((OffersSpanAction.StartRootSpan) offersSpanAction).operationName, null, 12), 6);
            return;
        }
        if (offersSpanAction.equals(OffersSpanAction.EndRootSpan.INSTANCE)) {
            SpanTracking spanTracking = this.spanState.rootSpan;
            if (spanTracking != null) {
                SpanTracking.spanEnded$default(spanTracking, null, 3);
            }
            this.spanState = new OffersSpanState(null, 7);
            return;
        }
        if (offersSpanAction instanceof OffersSpanAction.StartLoading) {
            OffersSpanState offersSpanState = this.spanState;
            SpanTracking spanTracking2 = offersSpanState.rootSpan;
            if (spanTracking2 != null && offersSpanState.loadingSpan == null) {
                OffersSpanAction.StartLoading startLoading = (OffersSpanAction.StartLoading) offersSpanAction;
                this.spanState = OffersSpanState.copy$default(offersSpanState, SpanTracking.childSpanStarted$default(spanTracking2, null, startLoading.operationName, Thread$State$EnumUnboxingLocalUtility.m("full_screen_loading", String.valueOf(startLoading.isFullscreen)), 8), null, 5);
                return;
            }
            return;
        }
        if (offersSpanAction.equals(OffersSpanAction.EndLoading.INSTANCE)) {
            SpanTracking spanTracking3 = this.spanState.loadingSpan;
            if (spanTracking3 != null) {
                SpanTracking.spanEnded$default(spanTracking3, null, 3);
                return;
            }
            return;
        }
        if (offersSpanAction instanceof OffersSpanAction.StartNetworking) {
            OffersSpanState offersSpanState2 = this.spanState;
            SpanTracking spanTracking4 = offersSpanState2.loadingSpan;
            if (spanTracking4 != null && offersSpanState2.networkSpan == null) {
                this.spanState = OffersSpanState.copy$default(offersSpanState2, null, SpanTracking.childSpanStarted$default(spanTracking4, null, ((OffersSpanAction.StartNetworking) offersSpanAction).operationName, null, 12), 3);
                return;
            }
            return;
        }
        if (!offersSpanAction.equals(OffersSpanAction.EndNetworking.INSTANCE)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        SpanTracking spanTracking5 = this.spanState.networkSpan;
        if (spanTracking5 != null) {
            SpanTracking.spanEnded$default(spanTracking5, null, 3);
        }
    }
}
