package com.squareup.cash.reactions.treehouse;

import android.content.Context;
import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.broadway.ui.Ui;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.R;
import com.squareup.cash.db2.ReactionConfig;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.overlays.OverlaysKt;
import com.squareup.cash.reactions.real.RealSharedReactionState;
import com.squareup.cash.reactions.viewmodels.ReactionViewEvent;
import com.squareup.cash.reactions.viewmodels.ReactionViewModel;
import com.squareup.cash.reactions.views.ChooseReactionOverlay;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.util.android.coroutines.ViewKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.ReadonlyStateFlow;

/* loaded from: classes7.dex */
public final class ReactionDialogAnchorBinding implements Widget, Ui.EventReceiver {
    public final UnleashContext children;
    public final Context context;
    public boolean expanded;
    public boolean isVisible;
    public PageFetcher$generateNewPagingSource$3 onDismiss;
    public GraphLoop$processingQueue$1 onSelect;
    public OverlayLayer.Session reactionOverlaySession;
    public final RealSharedReactionState sharedReactionState;
    public boolean showExtendedPicker;
    public final PassThroughLayout value;
    public final RealCashVibrator vibrator;
    public List availableReactions = EmptyList.INSTANCE;
    public Modifier modifier = Modifier.Companion.$$INSTANCE;

    public ReactionDialogAnchorBinding(Context context, RealCashVibrator realCashVibrator, RealSharedReactionState realSharedReactionState) {
        this.context = context;
        this.vibrator = realCashVibrator;
        this.sharedReactionState = realSharedReactionState;
        PassThroughLayout passThroughLayout = new PassThroughLayout(context);
        passThroughLayout.setTag(R.id.redwoodWidget, this);
        this.value = passThroughLayout;
        this.children = new UnleashContext(passThroughLayout);
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.broadway.ui.Ui.EventReceiver
    public final void sendEvent(Object obj) {
        ReactionViewEvent reactionViewEvent = (ReactionViewEvent) obj;
        reactionViewEvent.getClass();
        if (reactionViewEvent.equals(ReactionViewEvent.ShowAdditionalEmojis.INSTANCE)) {
            this.expanded = true;
            updateModel();
            return;
        }
        if (reactionViewEvent instanceof ReactionViewEvent.SubmitReaction) {
            GraphLoop$processingQueue$1 graphLoop$processingQueue$1 = this.onSelect;
            if (graphLoop$processingQueue$1 != null) {
                graphLoop$processingQueue$1.invoke(((ReactionViewEvent.SubmitReaction) reactionViewEvent).reaction);
                return;
            }
            return;
        }
        if (reactionViewEvent.equals(ReactionViewEvent.ViewCloseRequested.INSTANCE)) {
            PageFetcher$generateNewPagingSource$3 pageFetcher$generateNewPagingSource$3 = this.onDismiss;
            if (pageFetcher$generateNewPagingSource$3 != null) {
                pageFetcher$generateNewPagingSource$3.invoke();
                return;
            }
            return;
        }
        if (reactionViewEvent.equals(ReactionViewEvent.ViewClosed.INSTANCE) || reactionViewEvent.equals(ReactionViewEvent.ViewInitialized.INSTANCE)) {
            return;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }

    public final void updateModel() {
        ReactionViewModel loaded;
        boolean z = this.isVisible;
        OverlayLayer.Session session = this.reactionOverlaySession;
        Continuation continuation = null;
        if (!z) {
            if (session != null) {
                session.dismiss();
            }
            this.reactionOverlaySession = null;
            return;
        }
        PassThroughLayout passThroughLayout = this.value;
        if (session == null) {
            OverlayLayer overlayLayer = OverlaysKt.getOverlayLayer(passThroughLayout);
            ChooseReactionOverlay chooseReactionOverlay = new ChooseReactionOverlay(this.context, this.vibrator, new BottomSheet$$ExternalSyntheticLambda2(this, 15));
            chooseReactionOverlay.setEventReceiver(this);
            session = overlayLayer.show(chooseReactionOverlay);
            this.reactionOverlaySession = session;
        }
        OverlayLayer.Session session2 = session;
        boolean z2 = this.expanded;
        RealSharedReactionState realSharedReactionState = this.sharedReactionState;
        if (z2) {
            ReadonlyStateFlow readonlyStateFlow = realSharedReactionState.reactionConfig;
            if (readonlyStateFlow == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reactionConfig");
                throw null;
            }
            loaded = new ReactionViewModel.DisplayAdditional((ReactionConfig) readonlyStateFlow.$$delegate_0.getValue());
        } else {
            List list = this.availableReactions;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Reaction(Reaction.Type.EMOJI, (String) it.next(), 28));
            }
            boolean z3 = this.showExtendedPicker;
            ReadonlyStateFlow readonlyStateFlow2 = realSharedReactionState.reactionConfig;
            if (readonlyStateFlow2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reactionConfig");
                throw null;
            }
            loaded = new ReactionViewModel.Loaded(arrayList, z3, (ReactionConfig) readonlyStateFlow2.$$delegate_0.getValue());
        }
        ViewKt.whileAttachedOnce$default(passThroughLayout, new AndroidFileSaver$save$2(session2, this, loaded, continuation, 21));
    }
}
