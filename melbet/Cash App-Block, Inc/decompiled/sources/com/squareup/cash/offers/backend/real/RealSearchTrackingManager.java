package com.squareup.cash.offers.backend.real;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.offers.backend.api.ActionState;
import com.squareup.cash.offers.backend.api.SearchTrackingState;
import com.squareup.cash.offers.backend.api.TrackingAction;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealSearchTrackingManager {
    public SpanTracking mapAndRequestSpan;
    public SpanTracking nullStateSpan;
    public final RealObservabilityManager observabilityManager;
    public final ParcelableSnapshotMutableState searchState$delegate;
    public final Map transitions;

    public RealSearchTrackingManager(RealObservabilityManager realObservabilityManager) {
        this.observabilityManager = realObservabilityManager;
        ActionState actionState = ActionState.INITIAL;
        this.searchState$delegate = Updater.mutableStateOf$default(new SearchTrackingState(actionState, null, null, null));
        ActionState actionState2 = ActionState.START_TRACKING_DONE;
        ActionState actionState3 = ActionState.END_TRACKING_DONE;
        Pair pair = new Pair(actionState, CollectionsKt__CollectionsKt.listOf((Object[]) new ActionState[]{actionState2, actionState3}));
        ActionState actionState4 = ActionState.START_API_DONE;
        ActionState actionState5 = ActionState.START_MAPPING_DONE;
        Pair pair2 = new Pair(actionState2, CollectionsKt__CollectionsKt.listOf((Object[]) new ActionState[]{actionState4, actionState3, actionState5}));
        ActionState actionState6 = ActionState.END_API_DONE;
        Pair pair3 = new Pair(actionState4, CollectionsKt__CollectionsKt.listOf((Object[]) new ActionState[]{actionState6, actionState3, actionState5}));
        ActionState actionState7 = ActionState.START_DB_DONE;
        Pair pair4 = new Pair(actionState6, CollectionsKt__CollectionsKt.listOf((Object[]) new ActionState[]{actionState7, actionState3}));
        ActionState actionState8 = ActionState.END_DB_DONE;
        this.transitions = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, new Pair(actionState7, CollectionsKt__CollectionsKt.listOf((Object[]) new ActionState[]{actionState8, actionState3})), new Pair(actionState8, CollectionsKt__CollectionsKt.listOf((Object[]) new ActionState[]{actionState5, actionState3})), new Pair(actionState5, CollectionsKt__CollectionsJVMKt.listOf(actionState3)), new Pair(actionState3, CollectionsKt__CollectionsJVMKt.listOf(actionState)));
    }

    public final SearchTrackingState getSearchState() {
        return (SearchTrackingState) this.searchState$delegate.getValue();
    }

    public final void handleOperation(List list, ActionState actionState, Function0 function0) {
        if (!list.contains(getSearchState().actionState)) {
            terminateTracking();
            Timber.Forest.e("Invalid state: expected " + list + " but was " + getSearchState().actionState, new Object[0]);
            return;
        }
        function0.invoke();
        List list2 = (List) this.transitions.get(getSearchState().actionState);
        if (list2 == null) {
            list2 = EmptyList.INSTANCE;
        }
        if (list2.contains(actionState)) {
            this.searchState$delegate.setValue(SearchTrackingState.copy$default(getSearchState(), actionState, null, null, null, 14));
            return;
        }
        terminateTracking();
        Timber.Forest.e("Invalid transition to " + actionState, new Object[0]);
    }

    public final void onAction(TrackingAction trackingAction) {
        trackingAction.getClass();
        if (trackingAction instanceof TrackingAction.StartTracking) {
            terminateTracking();
            handleOperation(CollectionsKt__CollectionsJVMKt.listOf(ActionState.INITIAL), ActionState.START_TRACKING_DONE, new UtilsKt$$ExternalSyntheticLambda0(21, this, trackingAction));
        } else if (trackingAction.equals(TrackingAction.EndTracking.INSTANCE)) {
            handleOperation(CollectionsKt__CollectionsJVMKt.listOf(ActionState.END_TRACKING_DONE), ActionState.INITIAL, new WandScene$ring$3(0, this, RealSearchTrackingManager.class, "endTracking", "endTracking()V", 0, 23));
        } else if (trackingAction.equals(TrackingAction.TerminateTracking.INSTANCE)) {
            terminateTracking();
        } else if (trackingAction.equals(TrackingAction.StartApi.INSTANCE)) {
            handleOperation(CollectionsKt__CollectionsJVMKt.listOf(ActionState.START_TRACKING_DONE), ActionState.START_API_DONE, new WandScene$ring$3(0, this, RealSearchTrackingManager.class, "initiateApi", "initiateApi()V", 0, 24));
        } else if (trackingAction.equals(TrackingAction.EndApi.INSTANCE)) {
            handleOperation(CollectionsKt__CollectionsJVMKt.listOf(ActionState.START_API_DONE), ActionState.END_API_DONE, new WandScene$ring$3(0, this, RealSearchTrackingManager.class, "terminateApi", "terminateApi()V", 0, 25));
        } else if (trackingAction.equals(TrackingAction.StartDb.INSTANCE)) {
            handleOperation(CollectionsKt__CollectionsJVMKt.listOf(ActionState.END_API_DONE), ActionState.START_DB_DONE, new WandScene$ring$3(0, this, RealSearchTrackingManager.class, "initiateDb", "initiateDb()V", 0, 26));
        } else if (trackingAction.equals(TrackingAction.EndDb.INSTANCE)) {
            handleOperation(CollectionsKt__CollectionsJVMKt.listOf(ActionState.START_DB_DONE), ActionState.END_DB_DONE, new WandScene$ring$3(0, this, RealSearchTrackingManager.class, "terminateDb", "terminateDb()V", 0, 27));
        } else if (trackingAction.equals(TrackingAction.StartMapping.INSTANCE)) {
            handleOperation(CollectionsKt__CollectionsKt.listOf((Object[]) new ActionState[]{ActionState.END_DB_DONE, ActionState.START_API_DONE, ActionState.START_TRACKING_DONE}), ActionState.START_MAPPING_DONE, new WandScene$ring$3(0, this, RealSearchTrackingManager.class, "trackMapping", "trackMapping()V", 0, 28));
        } else {
            if (!trackingAction.equals(TrackingAction.EndMapping.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            handleOperation(CollectionsKt__CollectionsJVMKt.listOf(ActionState.START_MAPPING_DONE), ActionState.END_TRACKING_DONE, new WandScene$ring$3(0, this, RealSearchTrackingManager.class, "terminateMapping", "terminateMapping()V", 0, 29));
        }
        getSearchState();
    }

    public final void terminateTracking() {
        this.nullStateSpan = null;
        this.mapAndRequestSpan = null;
        SearchTrackingState searchState = getSearchState();
        ActionState actionState = ActionState.INITIAL;
        searchState.getClass();
        this.searchState$delegate.setValue(new SearchTrackingState(actionState, null, null, null));
    }
}
