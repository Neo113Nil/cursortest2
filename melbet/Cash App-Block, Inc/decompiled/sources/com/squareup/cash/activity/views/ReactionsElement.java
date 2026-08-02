package com.squareup.cash.activity.views;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectorInfo;
import app.cash.broadway.ui.Ui;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.overlays.OverlaysKt;
import com.squareup.cash.reactions.viewmodels.ReactionViewEvent;
import com.squareup.cash.reactions.viewmodels.ReactionViewModel;
import com.squareup.cash.reactions.views.ChooseReactionOverlay;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.protos.franklin.common.Reaction;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/activity/views/ReactionsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/squareup/cash/activity/views/ReactionsNode;", "views"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* data */ class ReactionsElement extends ModifierNodeElement {
    public final Function1 onEvent;
    public final ReactionsState reactionsState;

    public ReactionsElement(ReactionsState reactionsState, Function1 function1) {
        reactionsState.getClass();
        function1.getClass();
        this.reactionsState = reactionsState;
        this.onEvent = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        ReactionsState reactionsState = this.reactionsState;
        reactionsState.getClass();
        Function1 function1 = this.onEvent;
        function1.getClass();
        ReactionsNode reactionsNode = new ReactionsNode();
        reactionsNode.reactionsState = reactionsState;
        reactionsNode.onEvent = function1;
        reactionsNode.target = Rect.Zero;
        return reactionsNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionsElement)) {
            return false;
        }
        ReactionsElement reactionsElement = (ReactionsElement) obj;
        return Intrinsics.areEqual(this.reactionsState, reactionsElement.reactionsState) && Intrinsics.areEqual(this.onEvent, reactionsElement.onEvent);
    }

    public final int hashCode() {
        return this.onEvent.hashCode() + (this.reactionsState.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.properties.set(Reflection.factory.getOrCreateKotlinClass(this.reactionsState.getClass()).getSimpleName(), "reactionsState");
    }

    public final String toString() {
        return "ReactionsElement(reactionsState=" + this.reactionsState + ", onEvent=" + this.onEvent + ")";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ReactionsNode reactionsNode = (ReactionsNode) node;
        reactionsNode.getClass();
        ReactionsState reactionsState = this.reactionsState;
        reactionsState.getClass();
        Function1 function1 = this.onEvent;
        function1.getClass();
        reactionsNode.onEvent = function1;
        if (Intrinsics.areEqual(reactionsNode.reactionsState, reactionsState)) {
            return;
        }
        reactionsNode.reactionsState = reactionsState;
        if (reactionsState.equals(ReactionsState.Hidden.INSTANCE)) {
            OverlayLayer.Session session = reactionsNode.overlaySession;
            if (session != null) {
                session.dismiss();
            }
            reactionsNode.overlaySession = null;
            return;
        }
        if (!(reactionsState instanceof ReactionsState.Shown)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        View view = (View) DepthSortedSetKt.currentValueOf(reactionsNode, AndroidCompositionLocals_androidKt.LocalView);
        Context context = (Context) DepthSortedSetKt.currentValueOf(reactionsNode, AndroidCompositionLocals_androidKt.LocalContext);
        Object currentValueOf = DepthSortedSetKt.currentValueOf(reactionsNode, LocalCashVibratorKt.LocalCashVibrator);
        if (currentValueOf == null) {
            a$$ExternalSyntheticBUOutline0.m$3("No CashVibrator found! Has one been provided through LocalCashVibrator?");
            return;
        }
        final ReactionsState.Shown shown = (ReactionsState.Shown) reactionsState;
        Rect rect = reactionsNode.target;
        final Function1 function12 = reactionsNode.onEvent;
        final OverlayLayer.Session show = OverlaysKt.getOverlayLayer(view).show(new ChooseReactionOverlay(context, (RealCashVibrator) currentValueOf, new BalanceFeedKt$$ExternalSyntheticLambda4(26, function12)));
        ((ChooseReactionOverlay) show.getOverlay()).setViewContext(new ChooseReactionOverlay.ViewContext(new android.graphics.Rect((int) rect.left, (int) rect.top, (int) rect.right, (int) rect.bottom)));
        List list = shown.availableReactions;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Reaction(Reaction.Type.EMOJI, (String) it.next(), 28));
        }
        ReactionViewModel.Loaded loaded = new ReactionViewModel.Loaded(arrayList, true, shown.reactionConfig);
        ((ChooseReactionOverlay) show.getOverlay()).setEventReceiver(new Ui.EventReceiver() { // from class: com.squareup.cash.activity.views.ReactionsNode$$ExternalSyntheticLambda1
            @Override // app.cash.broadway.ui.Ui.EventReceiver
            public final void sendEvent(Object obj) {
                ReactionViewEvent reactionViewEvent = (ReactionViewEvent) obj;
                reactionViewEvent.getClass();
                if (reactionViewEvent.equals(ReactionViewEvent.ShowAdditionalEmojis.INSTANCE)) {
                    ((ChooseReactionOverlay) OverlayLayer.Session.this.getOverlay()).setModel(new ReactionViewModel.DisplayAdditional(shown.reactionConfig));
                } else {
                    function12.invoke(reactionViewEvent);
                }
            }
        });
        ((ChooseReactionOverlay) show.getOverlay()).setModel(loaded);
        reactionsNode.overlaySession = show;
    }
}
