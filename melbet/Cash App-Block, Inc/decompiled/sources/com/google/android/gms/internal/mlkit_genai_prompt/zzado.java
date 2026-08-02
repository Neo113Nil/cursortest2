package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.modifiers.SelectionController$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import coil3.memory.RealStrongMemoryCache$cache$1;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.benefits.applets.presenters.BankingBenefitsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public abstract class zzado {
    public static Applet bankingBenefitsApplet(LifecycleOwner lifecycleOwner, BankingBenefitsAppletTilePresenter$Factory$Impl bankingBenefitsAppletTilePresenter$Factory$Impl, UnleashContext unleashContext) {
        return new Applet(AppletId.BANKING_BENEFITS, StateFlowKt.mapState(((SyncValueReader) unleashContext.userId).getSingleValue(AndroidSyncValueSpecs.CashGreen, new BenefitsHubViewKt$$ExternalSyntheticLambda2(2)), new BenefitsHubViewKt$$ExternalSyntheticLambda2(3)), new BadgeKt$$ExternalSyntheticLambda2(21, bankingBenefitsAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$longPressDragObserver$1, java.lang.Object] */
    public static final Modifier makeSelectionModifier(final long j, final SelectionController$$ExternalSyntheticLambda0 selectionController$$ExternalSyntheticLambda0, final SelectionRegistrar selectionRegistrar) {
        final ?? r0 = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$longPressDragObserver$1
            public long lastPosition = 0;
            public long dragTotalDistance = 0;
            public SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustmentMode = SelectionAdjustment$Companion.None;

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
                SelectionManager$$ExternalSyntheticLambda0 selectionManager$$ExternalSyntheticLambda0;
                long j2 = j;
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (!SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2) || (selectionManager$$ExternalSyntheticLambda0 = ((SelectionRegistrarImpl) selectionRegistrar2).onSelectionUpdateEndCallback) == null) {
                    return;
                }
                selectionManager$$ExternalSyntheticLambda0.invoke();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public final void mo365onDownk4lQ0M() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public final void mo366onDragk4lQ0M(long j2) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) selectionController$$ExternalSyntheticLambda0.invoke();
                if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
                    return;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar2, j)) {
                    long m626plusMKHz9U = Offset.m626plusMKHz9U(this.dragTotalDistance, j2);
                    this.dragTotalDistance = m626plusMKHz9U;
                    long m626plusMKHz9U2 = Offset.m626plusMKHz9U(this.lastPosition, m626plusMKHz9U);
                    if (((SelectionRegistrarImpl) selectionRegistrar2).m446notifySelectionUpdatenjBpvok(layoutCoordinates, m626plusMKHz9U2, this.lastPosition, this.selectionAdjustmentMode, true)) {
                        this.lastPosition = m626plusMKHz9U2;
                        this.dragTotalDistance = 0L;
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public final void mo367onStart3MmeM6k(long j2, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0) {
                this.selectionAdjustmentMode = selectionAdjustment$Companion$$ExternalSyntheticLambda0;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) selectionController$$ExternalSyntheticLambda0.invoke();
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (layoutCoordinates != null) {
                    if (!layoutCoordinates.isAttached()) {
                        return;
                    }
                    SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda02 = this.selectionAdjustmentMode;
                    ScoreUiFactory$$ExternalSyntheticLambda0 scoreUiFactory$$ExternalSyntheticLambda0 = ((SelectionRegistrarImpl) selectionRegistrar2).onSelectionUpdateStartCallback;
                    if (scoreUiFactory$$ExternalSyntheticLambda0 != null) {
                        scoreUiFactory$$ExternalSyntheticLambda0.invoke(Boolean.TRUE, layoutCoordinates, new Offset(j2), selectionAdjustment$Companion$$ExternalSyntheticLambda02);
                    }
                    this.lastPosition = j2;
                }
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar2, j)) {
                    this.dragTotalDistance = 0L;
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                SelectionManager$$ExternalSyntheticLambda0 selectionManager$$ExternalSyntheticLambda0;
                long j2 = j;
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (!SelectionRegistrarKt.hasSelection(selectionRegistrar2, j2) || (selectionManager$$ExternalSyntheticLambda0 = ((SelectionRegistrarImpl) selectionRegistrar2).onSelectionUpdateEndCallback) == null) {
                    return;
                }
                selectionManager$$ExternalSyntheticLambda0.invoke();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onUp() {
            }
        };
        final RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = new RealStrongMemoryCache$cache$1();
        realStrongMemoryCache$cache$1.map = selectionController$$ExternalSyntheticLambda0;
        realStrongMemoryCache$cache$1.this$0 = selectionRegistrar;
        realStrongMemoryCache$cache$1.size = j;
        realStrongMemoryCache$cache$1.maxSize = 0L;
        return SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion.$$INSTANCE, realStrongMemoryCache$cache$1, r0, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object awaitSelectionGestures = SimpleLayoutKt.awaitSelectionGestures(pointerInputScope, RealStrongMemoryCache$cache$1.this, r0, continuation);
                return awaitSelectionGestures == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitSelectionGestures : Unit.INSTANCE;
            }
        });
    }

    public static ExoPlayerImpl provideExoPlayer$real(Context context) {
        ExoPlayerImpl build = new ExoPlayer.Builder(context).build();
        build.setPlayWhenReady(true);
        return build;
    }
}
