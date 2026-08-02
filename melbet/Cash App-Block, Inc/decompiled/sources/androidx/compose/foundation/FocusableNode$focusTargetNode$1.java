package androidx.compose.foundation;

import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.FocusInteraction$Unfocus;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.viewinterop.FocusTargetInteropNode;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import com.datadog.android.Datadog$getInstance$1$1;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.arcade.internalflags.InternalArcadeFlags;
import com.squareup.cash.arcade.internalflags.InternalArcadeFlagsHolder;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final /* synthetic */ class FocusableNode$focusTargetNode$1 extends FunctionReferenceImpl implements Function2 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FocusableNode$focusTargetNode$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean isFocused;
        LazyLayoutPinnableItem lazyLayoutPinnableItem;
        boolean isFocused2;
        LazyLayoutPinnableItem lazyLayoutPinnableItem2 = null;
        Object[] objArr = 0;
        switch (this.$r8$classId) {
            case 0:
                FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
                FocusStateImpl focusStateImpl2 = (FocusStateImpl) obj2;
                FocusableNode focusableNode = (FocusableNode) this.receiver;
                if (focusableNode.isAttached() && (isFocused = focusStateImpl2.isFocused()) != focusStateImpl.isFocused()) {
                    Function1 function1 = focusableNode.onFocusChange;
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(isFocused));
                    }
                    FocusableNode.TraverseKey traverseKey = FocusedBoundsObserverNode.TraverseKey;
                    if (isFocused) {
                        JobKt.launch$default(focusableNode.getCoroutineScope(), null, null, new CashApp$onCreate$4$1$1(focusableNode, objArr == true ? 1 : 0, 1), 3);
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        DepthSortedSetKt.observeReads(focusableNode, new ComponentRegistry$Builder$$ExternalSyntheticLambda3(4, ref$ObjectRef, focusableNode));
                        PinnableContainer pinnableContainer = (PinnableContainer) ref$ObjectRef.element;
                        if (pinnableContainer != null) {
                            lazyLayoutPinnableItem = (LazyLayoutPinnableItem) pinnableContainer;
                            lazyLayoutPinnableItem.pin();
                        } else {
                            lazyLayoutPinnableItem = null;
                        }
                        focusableNode.pinnedHandle = lazyLayoutPinnableItem;
                        NodeCoordinator nodeCoordinator = focusableNode.globalLayoutCoordinates;
                        if (nodeCoordinator != null && nodeCoordinator.isAttached() && focusableNode.isAttached()) {
                            DepthSortedSetKt.findNearestAncestor(focusableNode, traverseKey);
                        }
                    } else {
                        LazyLayoutPinnableItem lazyLayoutPinnableItem3 = focusableNode.pinnedHandle;
                        if (lazyLayoutPinnableItem3 != null) {
                            lazyLayoutPinnableItem3.release();
                        }
                        focusableNode.pinnedHandle = null;
                        if (focusableNode.isAttached()) {
                            DepthSortedSetKt.findNearestAncestor(focusableNode, traverseKey);
                        }
                    }
                    DepthSortedSetKt.requireLayoutNode(focusableNode).invalidateSemantics$ui();
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = focusableNode.interactionSource;
                    if (mutableInteractionSourceImpl != null) {
                        FocusInteraction$Focus focusInteraction$Focus = focusableNode.focusedInteraction;
                        if (isFocused) {
                            if (focusInteraction$Focus != null) {
                                focusableNode.emitWithFallback(mutableInteractionSourceImpl, new FocusInteraction$Unfocus(focusInteraction$Focus));
                                focusableNode.focusedInteraction = null;
                            }
                            FocusInteraction$Focus focusInteraction$Focus2 = new FocusInteraction$Focus();
                            focusableNode.emitWithFallback(mutableInteractionSourceImpl, focusInteraction$Focus2);
                            focusableNode.focusedInteraction = focusInteraction$Focus2;
                        } else if (focusInteraction$Focus != null) {
                            focusableNode.emitWithFallback(mutableInteractionSourceImpl, new FocusInteraction$Unfocus(focusInteraction$Focus));
                            focusableNode.focusedInteraction = null;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                FocusStateImpl focusStateImpl3 = (FocusStateImpl) obj;
                FocusStateImpl focusStateImpl4 = (FocusStateImpl) obj2;
                FocusTargetInteropNode focusTargetInteropNode = (FocusTargetInteropNode) this.receiver;
                if (focusTargetInteropNode.isAttached() && (isFocused2 = focusStateImpl4.isFocused()) != focusStateImpl3.isFocused()) {
                    if (isFocused2) {
                        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                        DepthSortedSetKt.observeReads(focusTargetInteropNode, new Datadog$getInstance$1$1(6, ref$ObjectRef2, focusTargetInteropNode));
                        PinnableContainer pinnableContainer2 = (PinnableContainer) ref$ObjectRef2.element;
                        if (pinnableContainer2 != null) {
                            lazyLayoutPinnableItem2 = (LazyLayoutPinnableItem) pinnableContainer2;
                            lazyLayoutPinnableItem2.pin();
                        }
                        focusTargetInteropNode.pinnedHandle = lazyLayoutPinnableItem2;
                    } else {
                        LazyLayoutPinnableItem lazyLayoutPinnableItem4 = focusTargetInteropNode.pinnedHandle;
                        if (lazyLayoutPinnableItem4 != null) {
                            lazyLayoutPinnableItem4.release();
                        }
                        focusTargetInteropNode.pinnedHandle = null;
                    }
                }
                return Unit.INSTANCE;
            default:
                ((InternalArcadeFlagsHolder) this.receiver).getClass();
                InternalArcadeFlagsHolder.mutableFlags.setValue((InternalArcadeFlags) obj);
                Unit unit = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit;
        }
    }
}
