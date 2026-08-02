package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class StylusHandwritingNode extends DelegatingNode implements PointerInputModifierNode, FocusEventModifierNode, FocusRequesterModifierNode {
    public boolean focused;
    public Function0 onHandwritingSlopExceeded;
    public final SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNode;

    public StylusHandwritingNode(Function0 function0) {
        this.onHandwritingSlopExceeded = function0;
        AndroidEdgeEffectOverscrollEffect$pointerInputNode$1 androidEdgeEffectOverscrollEffect$pointerInputNode$1 = new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1(this, 2);
        PointerEvent pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = new SuspendingPointerInputModifierNodeImpl(null, null, null, androidEdgeEffectOverscrollEffect$pointerInputNode$1);
        delegate(suspendingPointerInputModifierNodeImpl);
        this.suspendingPointerInputModifierNode = suspendingPointerInputModifierNodeImpl;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk, reason: not valid java name */
    public final long mo376getTouchBoundsExpansionRZrCHBk() {
        return StylusHandwritingKt.HandwritingBoundsExpansion.m869roundToTouchBoundsExpansionTW6G1oQ(DepthSortedSetKt.requireLayoutNode(this).density);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        this.suspendingPointerInputModifierNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(FocusStateImpl focusStateImpl) {
        this.focused = focusStateImpl.isFocused();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.suspendingPointerInputModifierNode.mo162onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
    }
}
