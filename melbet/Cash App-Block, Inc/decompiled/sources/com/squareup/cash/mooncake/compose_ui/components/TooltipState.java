package com.squareup.cash.mooncake.compose_ui.components;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes6.dex */
public final class TooltipState {
    public final ParcelableSnapshotMutableFloatState _alpha$delegate;
    public StandaloneCoroutine dismissJob;
    public final CoroutineScope scope;

    public TooltipState(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.scope = coroutineScope;
        this._alpha$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    }

    /* renamed from: show-LRDsOJo$default, reason: not valid java name */
    public static void m3659showLRDsOJo$default(TooltipState tooltipState) {
        Duration.Companion companion = Duration.Companion;
        long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
        StandaloneCoroutine standaloneCoroutine = tooltipState.dismissJob;
        Continuation continuation = null;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        JobKt.launch$default(tooltipState.scope, null, null, new ToastKt$Toast$8$1(tooltipState, duration, continuation, 8), 3);
    }
}
