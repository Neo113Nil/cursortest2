package androidx.compose.ui.node;

import android.os.SystemClock;
import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.IndicationModifier;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.modifier.EmptyMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.GraphicsLayerOwnerLayer;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import androidx.datastore.core.SimpleActor;
import coil3.Extras;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.List;
import kotlin.Function;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class BackwardsCompatNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode, PointerInputModifierNode, ModifierLocalModifierNode, ParentDataModifierNode, LayoutAwareModifierNode, GlobalPositionAwareModifierNode, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, OwnerScope, BuildDrawCacheParams {
    public Modifier.Element element;
    public HashSet readValues;

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(FocusProperties focusProperties) {
        Modifier.Element element = this.element;
        InlineClassHelperKt.throwIllegalStateException("applyFocusProperties called on wrong node");
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m((Object) element);
        throw null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Modifier.Element element = this.element;
        element.getClass();
        SemanticsConfiguration semanticsConfiguration = ((SemanticsModifier) element).getSemanticsConfiguration();
        semanticsPropertyReceiver.getClass();
        SemanticsConfiguration semanticsConfiguration2 = (SemanticsConfiguration) semanticsPropertyReceiver;
        MutableScatterMap mutableScatterMap = semanticsConfiguration2.props;
        if (semanticsConfiguration.isMergingSemanticsOfDescendants) {
            semanticsConfiguration2.isMergingSemanticsOfDescendants = true;
        }
        if (semanticsConfiguration.isClearingSemantics) {
            semanticsConfiguration2.isClearingSemantics = true;
        }
        MutableScatterMap mutableScatterMap2 = semanticsConfiguration.props;
        Object[] objArr = mutableScatterMap2.keys;
        Object[] objArr2 = mutableScatterMap2.values;
        long[] jArr = mutableScatterMap2.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        if (!mutableScatterMap.contains(semanticsPropertyKey)) {
                            mutableScatterMap.set(semanticsPropertyKey, obj2);
                        } else if (obj2 instanceof AccessibilityAction) {
                            Object obj3 = mutableScatterMap.get(semanticsPropertyKey);
                            obj3.getClass();
                            AccessibilityAction accessibilityAction = (AccessibilityAction) obj3;
                            String str = accessibilityAction.label;
                            if (str == null) {
                                str = ((AccessibilityAction) obj2).label;
                            }
                            Function function = accessibilityAction.action;
                            if (function == null) {
                                function = ((AccessibilityAction) obj2).action;
                            }
                            mutableScatterMap.set(semanticsPropertyKey, new AccessibilityAction(str, function));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        Modifier.Element element = this.element;
        element.getClass();
        ((IndicationModifier) ((DrawModifier) element)).draw(layoutNodeDrawScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final Object getCurrent(Extras.Key key) {
        NodeChain nodeChain;
        this.readValues.add(key);
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = getNode().getParent$ui();
        LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(this);
        while (requireLayoutNode != null) {
            if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 32) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 32) != 0) {
                        DelegatingNode delegatingNode = parent$ui;
                        ?? r3 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode.getProvidedValues().contains$ui(key)) {
                                    return modifierLocalModifierNode.getProvidedValues().get$ui(key);
                                }
                            } else if ((delegatingNode.getKindSet$ui() & 32) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node = delegatingNode.delegate;
                                int i = 0;
                                delegatingNode = delegatingNode;
                                r3 = r3;
                                while (node != null) {
                                    if ((node.getKindSet$ui() & 32) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            delegatingNode = node;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r3.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r3.add(node);
                                        }
                                    }
                                    node = node.getChild$ui();
                                    delegatingNode = delegatingNode;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = DepthSortedSetKt.access$pop(r3);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
        }
        return ((Function0) key.f61default).invoke();
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final Density getDensity() {
        return DepthSortedSetKt.requireLayoutNode(this).density;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final LayoutDirection getLayoutDirection() {
        return DepthSortedSetKt.requireLayoutNode(this).layoutDirection;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final BundleKt getProvidedValues() {
        return EmptyMap.INSTANCE;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public final long mo587getSizeNHjbRc() {
        return Countries.m3991toSizeozmzZPI(DepthSortedSetKt.m864requireCoordinator64DMado(this, 128).measuredSize);
    }

    public final void initializeModifier(boolean z) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("initializeModifier called on unattached node");
        }
        Modifier.Element element = this.element;
        getKindSet$ui();
        if ((getKindSet$ui() & 4) != 0 && !z) {
            DepthSortedSetKt.m864requireCoordinator64DMado(this, 2).invalidateLayer();
        }
        if ((getKindSet$ui() & 2) != 0) {
            if (BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                NodeCoordinator coordinator$ui = getCoordinator$ui();
                coordinator$ui.getClass();
                ((LayoutModifierNodeCoordinator) coordinator$ui).setLayoutModifierNode$ui(this);
                OwnedLayer ownedLayer = coordinator$ui.layer;
                if (ownedLayer != null) {
                    ((GraphicsLayerOwnerLayer) ownedLayer).invalidate();
                }
            }
            if (!z) {
                DepthSortedSetKt.m864requireCoordinator64DMado(this, 2).invalidateLayer();
                DepthSortedSetKt.requireLayoutNode(this).invalidateMeasurements$ui();
            }
        }
        if (element instanceof RemeasurementModifier) {
            ((RemeasurementModifier) element).onRemeasurementAvailable(DepthSortedSetKt.requireLayoutNode(this));
        }
        getKindSet$ui();
        getKindSet$ui();
        if ((getKindSet$ui() & 256) != 0 && (element instanceof TextFieldMagnifierNodeImpl28) && BackwardsCompatNodeKt.access$isChainUpdate(this)) {
            DepthSortedSetKt.requireLayoutNode(this).invalidateMeasurements$ui();
        }
        if ((getKindSet$ui() & 16) != 0 && (element instanceof PointerInteropFilter)) {
            ((PointerInteropFilter) element).pointerInputFilter.scope = getCoordinator$ui();
        }
        if ((getKindSet$ui() & 8) != 0) {
            ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).onSemanticsChange();
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void interceptOutOfBoundsChildEvents() {
        Modifier.Element element = this.element;
        element.getClass();
        ((PointerInteropFilter) element).pointerInputFilter.getClass();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Modifier.Element element = this.element;
        element.getClass();
        return RulerKt.maxHeight((LayoutModifier) element, (LookaheadCapablePlaceable) intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Modifier.Element element = this.element;
        element.getClass();
        return RulerKt.maxWidth((LayoutModifier) element, (LookaheadCapablePlaceable) intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Modifier.Element element = this.element;
        element.getClass();
        return ((LayoutModifier) element).mo351measure3p2s80s(measureScope, measurable, j);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Modifier.Element element = this.element;
        element.getClass();
        return RulerKt.minHeight((LayoutModifier) element, (LookaheadCapablePlaceable) intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Modifier.Element element = this.element;
        element.getClass();
        return RulerKt.minWidth((LayoutModifier) element, (LookaheadCapablePlaceable) intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(Density density, Object obj) {
        Modifier.Element element = this.element;
        element.getClass();
        return ((ParentDataModifier) element).modifyParentData(density, obj);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        initializeModifier(true);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        Modifier.Element element = this.element;
        element.getClass();
        SimpleActor simpleActor = ((PointerInteropFilter) element).pointerInputFilter;
        PointerInteropFilter.DispatchToViewState dispatchToViewState = (PointerInteropFilter.DispatchToViewState) simpleActor.consumeMessage;
        PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) simpleActor.remainingMessages;
        if (dispatchToViewState == PointerInteropFilter.DispatchToViewState.Dispatching) {
            PointerEventKt.emptyCancelMotionEventScope(SystemClock.uptimeMillis(), new PointerInteropFilter$pointerInputFilter$1$onCancel$1(pointerInteropFilter, 0));
            simpleActor.consumeMessage = PointerInteropFilter.DispatchToViewState.Unknown;
            pointerInteropFilter.disallowIntercept = false;
            simpleActor.messageQueue = null;
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        if (this.element instanceof PointerInteropFilter) {
            onCancelPointerInput();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        unInitializeModifier();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(FocusStateImpl focusStateImpl) {
        Modifier.Element element = this.element;
        InlineClassHelperKt.throwIllegalStateException("onFocusEvent called on wrong node");
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m((Object) element);
        throw null;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        Modifier.Element element = this.element;
        element.getClass();
        ((TextFieldMagnifierNodeImpl28) element).onGloballyPositioned(nodeCoordinator);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void onMeasureResultChanged() {
        DepthSortedSetKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(LayoutCoordinates layoutCoordinates) {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0127 A[ORIG_RETURN, RETURN] */
    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        Modifier.Element element = this.element;
        element.getClass();
        SimpleActor simpleActor = ((PointerInteropFilter) element).pointerInputFilter;
        PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) simpleActor.remainingMessages;
        List list = pointerEvent.changes;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i);
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!((PointerInputChange) list.get(i2)).isConsumed()) {
                }
            }
            z2 = true;
            if (!pointerInteropFilter.disallowIntercept) {
                int size3 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size3) {
                        PointerInputChange pointerInputChange2 = (PointerInputChange) list.get(i3);
                        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            break;
                        } else {
                            i3++;
                        }
                    } else if (!z2) {
                        z3 = false;
                    }
                }
            }
            z3 = true;
            if (((PointerInteropFilter.DispatchToViewState) simpleActor.consumeMessage) != PointerInteropFilter.DispatchToViewState.NotDispatching) {
                if (pointerEventPass == PointerEventPass.Initial && z3) {
                    simpleActor.messageQueue = pointerEvent;
                    simpleActor.dispatchToView(pointerEvent, !z || pointerInteropFilter.disallowIntercept);
                }
                if (pointerEventPass == PointerEventPass.Main && z && pointerEvent == ((PointerEvent) simpleActor.messageQueue) && pointerInteropFilter.disallowIntercept) {
                    int size4 = list2.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((PointerInputChange) list.get(i4)).consume();
                    }
                }
                if (pointerEventPass == PointerEventPass.Final && !z3 && pointerEvent != ((PointerEvent) simpleActor.messageQueue)) {
                    simpleActor.dispatchToView(pointerEvent, true);
                }
            }
            if (pointerEventPass != PointerEventPass.Final) {
                int size5 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        simpleActor.consumeMessage = PointerInteropFilter.DispatchToViewState.Unknown;
                        ((PointerInteropFilter) simpleActor.remainingMessages).disallowIntercept = false;
                        simpleActor.messageQueue = null;
                        break;
                    } else if (!PointerEventKt.changedToUpIgnoreConsumed((PointerInputChange) list.get(i5))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (pointerEvent == ((PointerEvent) simpleActor.messageQueue) && z) {
                    int size6 = list2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size6) {
                            break;
                        }
                        if (!((PointerInputChange) list.get(i6)).isConsumed()) {
                            i6++;
                        } else if (!pointerInteropFilter.disallowIntercept) {
                            simpleActor.stopDispatching(pointerEvent);
                            return;
                        }
                    }
                    int size7 = list2.size();
                    for (int i7 = 0; i7 < size7; i7++) {
                        ((PointerInputChange) list.get(i7)).consume();
                    }
                    return;
                }
                return;
            }
            return;
        }
        z2 = false;
        if (!pointerInteropFilter.disallowIntercept) {
        }
        z3 = true;
        if (((PointerInteropFilter.DispatchToViewState) simpleActor.consumeMessage) != PointerInteropFilter.DispatchToViewState.NotDispatching) {
        }
        if (pointerEventPass != PointerEventPass.Final) {
        }
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public final void mo197onRemeasuredozmzZPI(long j) {
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final boolean sharePointerInputWithSiblings() {
        Modifier.Element element = this.element;
        element.getClass();
        ((PointerInteropFilter) element).pointerInputFilter.getClass();
        return true;
    }

    public final String toString() {
        return this.element.toString();
    }

    public final void unInitializeModifier() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("unInitializeModifier called on unattached node");
        }
        getKindSet$ui();
        if ((getKindSet$ui() & 8) != 0) {
            ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).onSemanticsChange();
        }
    }
}
