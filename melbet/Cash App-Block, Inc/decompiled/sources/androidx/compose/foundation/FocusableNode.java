package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.FocusInteraction$Unfocus;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.room.RoomDatabase$closeBarrier$1;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class FocusableNode extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {
    public static final TraverseKey TraverseKey = new TraverseKey();
    public final FocusTargetNode focusTargetNode;
    public FocusInteraction$Focus focusedInteraction;
    public NodeCoordinator globalLayoutCoordinates;
    public MutableInteractionSourceImpl interactionSource;
    public final Function1 onFocusChange;
    public LazyLayoutPinnableItem pinnedHandle;

    public final class TraverseKey {
        public static final TraverseKey INSTANCE = new TraverseKey();
    }

    public FocusableNode(MutableInteractionSourceImpl mutableInteractionSourceImpl, int i, Function1 function1) {
        this.interactionSource = mutableInteractionSourceImpl;
        this.onFocusChange = function1;
        FocusTargetNode focusTargetNode = new FocusTargetNode(i, new FocusableNode$focusTargetNode$1(2, this, FocusableNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0), 10);
        delegate(focusTargetNode);
        this.focusTargetNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        boolean isFocused = this.focusTargetNode.getFocusState$1().isFocused();
        KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.Focused;
        KProperty kProperty = SemanticsPropertiesKt.$$delegatedProperties[4];
        semanticsPropertyReceiver.set(semanticsPropertyKey, Boolean.valueOf(isFocused));
        semanticsPropertyReceiver.set(SemanticsActions.RequestFocus, new AccessibilityAction(null, new RoomDatabase$closeBarrier$1(0, this, FocusableNode.class, "requestFocus", "requestFocus()Z", 0, 1)));
    }

    public final void emitWithFallback(MutableInteractionSourceImpl mutableInteractionSourceImpl, Interaction interaction) {
        if (!isAttached()) {
            mutableInteractionSourceImpl.tryEmit(interaction);
            return;
        }
        Job job = (Job) getCoroutineScope().getCoroutineContext().get(Job.Key.$$INSTANCE);
        JobKt.launch$default(getCoroutineScope(), null, null, new DataStoreImpl$data$1(mutableInteractionSourceImpl, interaction, job != null ? job.invokeOnCompletion(new Recomposer$$ExternalSyntheticLambda4(7, mutableInteractionSourceImpl, interaction)) : null, null, 2), 3);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return TraverseKey;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        this.globalLayoutCoordinates = nodeCoordinator;
        if (this.focusTargetNode.getFocusState$1().isFocused()) {
            boolean isAttached = nodeCoordinator.isAttached();
            TraverseKey traverseKey = FocusedBoundsObserverNode.TraverseKey;
            if (!isAttached) {
                if (isAttached()) {
                    DepthSortedSetKt.findNearestAncestor(this, traverseKey);
                }
            } else {
                NodeCoordinator nodeCoordinator2 = this.globalLayoutCoordinates;
                if (nodeCoordinator2 != null && nodeCoordinator2.isAttached() && isAttached()) {
                    DepthSortedSetKt.findNearestAncestor(this, traverseKey);
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        LazyLayoutPinnableItem lazyLayoutPinnableItem;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        DepthSortedSetKt.observeReads(this, new ComponentRegistry$Builder$$ExternalSyntheticLambda3(4, ref$ObjectRef, this));
        PinnableContainer pinnableContainer = (PinnableContainer) ref$ObjectRef.element;
        if (this.focusTargetNode.getFocusState$1().isFocused()) {
            LazyLayoutPinnableItem lazyLayoutPinnableItem2 = this.pinnedHandle;
            if (lazyLayoutPinnableItem2 != null) {
                lazyLayoutPinnableItem2.release();
            }
            if (pinnableContainer != null) {
                lazyLayoutPinnableItem = (LazyLayoutPinnableItem) pinnableContainer;
                lazyLayoutPinnableItem.pin();
            } else {
                lazyLayoutPinnableItem = null;
            }
            this.pinnedHandle = lazyLayoutPinnableItem;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        LazyLayoutPinnableItem lazyLayoutPinnableItem = this.pinnedHandle;
        if (lazyLayoutPinnableItem != null) {
            lazyLayoutPinnableItem.release();
        }
        this.pinnedHandle = null;
    }

    public final void update(MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        FocusInteraction$Focus focusInteraction$Focus;
        if (Intrinsics.areEqual(this.interactionSource, mutableInteractionSourceImpl)) {
            return;
        }
        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = this.interactionSource;
        if (mutableInteractionSourceImpl2 != null && (focusInteraction$Focus = this.focusedInteraction) != null) {
            mutableInteractionSourceImpl2.tryEmit(new FocusInteraction$Unfocus(focusInteraction$Focus));
        }
        this.focusedInteraction = null;
        this.interactionSource = mutableInteractionSourceImpl;
    }

    public /* synthetic */ FocusableNode(MutableInteractionSourceImpl mutableInteractionSourceImpl, TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2 textFieldDecoratorModifierNode$$ExternalSyntheticLambda2, int i) {
        this(mutableInteractionSourceImpl, 1, (i & 4) != 0 ? null : textFieldDecoratorModifierNode$$ExternalSyntheticLambda2);
    }
}
