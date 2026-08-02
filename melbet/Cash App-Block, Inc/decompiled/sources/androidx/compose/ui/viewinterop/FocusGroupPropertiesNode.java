package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener {
    public ViewTreeObserver attachedViewTreeObserver;
    public View focusedChild;
    public final FocusGroupPropertiesNode$onExit$1 onEnter;
    public final FocusGroupPropertiesNode$onExit$1 onExit;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1] */
    public FocusGroupPropertiesNode() {
        final int i = 1;
        this.onEnter = new Function1(this) { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
            public final /* synthetic */ FocusGroupPropertiesNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                FocusGroupPropertiesNode focusGroupPropertiesNode = this.this$0;
                switch (i2) {
                    case 0:
                        AndroidView_androidKt.access$getEmbeddedView(focusGroupPropertiesNode);
                        break;
                    default:
                        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = (CancelIndicatingFocusBoundaryScope) obj;
                        View access$getEmbeddedView = AndroidView_androidKt.access$getEmbeddedView(focusGroupPropertiesNode);
                        if (!access$getEmbeddedView.isFocused() && !access$getEmbeddedView.hasFocus()) {
                            FocusOwnerImpl focusOwnerImpl = ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusGroupPropertiesNode)).focusOwner;
                            View requireView = DepthSortedSetKt.requireView(focusGroupPropertiesNode);
                            Integer m593toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m593toAndroidFocusDirection3ESFkO8(cancelIndicatingFocusBoundaryScope.requestedFocusDirection);
                            int[] iArr = new int[2];
                            requireView.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            access$getEmbeddedView.getLocationOnScreen(iArr2);
                            FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusOwnerImpl.rootFocusNode);
                            Rect rect = null;
                            androidx.compose.ui.geometry.Rect focusRect = findActiveFocusNode != null ? FocusTraversalKt.focusRect(findActiveFocusNode) : null;
                            if (focusRect != null) {
                                int i3 = (int) focusRect.left;
                                int i4 = iArr[0];
                                int i5 = iArr2[0];
                                int i6 = (int) focusRect.top;
                                int i7 = iArr[1];
                                int i8 = iArr2[1];
                                rect = new Rect((i3 + i4) - i5, (i6 + i7) - i8, (((int) focusRect.right) + i4) - i5, (((int) focusRect.bottom) + i7) - i8);
                            }
                            if (!FocusInteropUtils_androidKt.requestInteropFocus(access$getEmbeddedView, m593toAndroidFocusDirection3ESFkO8, rect)) {
                                cancelIndicatingFocusBoundaryScope.isCanceled = true;
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i2 = 0;
        this.onExit = new Function1(this) { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
            public final /* synthetic */ FocusGroupPropertiesNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                FocusGroupPropertiesNode focusGroupPropertiesNode = this.this$0;
                switch (i22) {
                    case 0:
                        AndroidView_androidKt.access$getEmbeddedView(focusGroupPropertiesNode);
                        break;
                    default:
                        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = (CancelIndicatingFocusBoundaryScope) obj;
                        View access$getEmbeddedView = AndroidView_androidKt.access$getEmbeddedView(focusGroupPropertiesNode);
                        if (!access$getEmbeddedView.isFocused() && !access$getEmbeddedView.hasFocus()) {
                            FocusOwnerImpl focusOwnerImpl = ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusGroupPropertiesNode)).focusOwner;
                            View requireView = DepthSortedSetKt.requireView(focusGroupPropertiesNode);
                            Integer m593toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m593toAndroidFocusDirection3ESFkO8(cancelIndicatingFocusBoundaryScope.requestedFocusDirection);
                            int[] iArr = new int[2];
                            requireView.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            access$getEmbeddedView.getLocationOnScreen(iArr2);
                            FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusOwnerImpl.rootFocusNode);
                            Rect rect = null;
                            androidx.compose.ui.geometry.Rect focusRect = findActiveFocusNode != null ? FocusTraversalKt.focusRect(findActiveFocusNode) : null;
                            if (focusRect != null) {
                                int i3 = (int) focusRect.left;
                                int i4 = iArr[0];
                                int i5 = iArr2[0];
                                int i6 = (int) focusRect.top;
                                int i7 = iArr[1];
                                int i8 = iArr2[1];
                                rect = new Rect((i3 + i4) - i5, (i6 + i7) - i8, (((int) focusRect.right) + i4) - i5, (((int) focusRect.bottom) + i7) - i8);
                            }
                            if (!FocusInteropUtils_androidKt.requestInteropFocus(access$getEmbeddedView, m593toAndroidFocusDirection3ESFkO8, rect)) {
                                cancelIndicatingFocusBoundaryScope.isCanceled = true;
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
        focusProperties.setOnEnter(this.onEnter);
        focusProperties.setOnExit(this.onExit);
    }

    public final FocusTargetNode getFocusTargetOfEmbeddedViewWrapper() {
        boolean z;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = getNode();
        if ((node.getAggregateChildKindSet$ui() & 1024) != 0) {
            boolean z2 = false;
            for (Modifier.Node child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & 1024) != 0) {
                    Modifier.Node node2 = child$ui;
                    MutableVector mutableVector = null;
                    while (node2 != null) {
                        if (node2 instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) node2;
                            if (z2) {
                                return focusTargetNode;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (node2.getKindSet$ui() & 1024) != 0 && (node2 instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node node3 = ((DelegatingNode) node2).delegate; node3 != null; node3 = node3.getChild$ui()) {
                                if ((node3.getKindSet$ui() & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node2 = node3;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                        }
                                        if (node2 != null) {
                                            mutableVector.add(node2);
                                            node2 = null;
                                        }
                                        mutableVector.add(node3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node2 = DepthSortedSetKt.access$pop(mutableVector);
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$1("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        ViewTreeObserver viewTreeObserver = DepthSortedSetKt.requireView(this).getViewTreeObserver();
        this.attachedViewTreeObserver = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        ViewTreeObserver viewTreeObserver = this.attachedViewTreeObserver;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.attachedViewTreeObserver = null;
        DepthSortedSetKt.requireView(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.focusedChild = null;
        super.onDetach();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (DepthSortedSetKt.requireLayoutNode(this).owner == null) {
            return;
        }
        View access$getEmbeddedView = AndroidView_androidKt.access$getEmbeddedView(this);
        FocusOwnerImpl focusOwnerImpl = ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).focusOwner;
        Owner requireOwner = DepthSortedSetKt.requireOwner(this);
        boolean z2 = true;
        if (view != null && !view.equals(requireOwner)) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == access$getEmbeddedView.getParent()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (view2 != null && !view2.equals(requireOwner)) {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == access$getEmbeddedView.getParent()) {
                    break;
                }
            }
        }
        z2 = false;
        if (z && z2) {
            this.focusedChild = view2;
            return;
        }
        if (z2) {
            this.focusedChild = view2;
            FocusTargetNode focusTargetOfEmbeddedViewWrapper = getFocusTargetOfEmbeddedViewWrapper();
            if (focusTargetOfEmbeddedViewWrapper.getFocusState$1().getHasFocus()) {
                return;
            }
            FocusTraversalKt.performRequestFocus(focusTargetOfEmbeddedViewWrapper);
            return;
        }
        if (!z) {
            this.focusedChild = null;
            return;
        }
        this.focusedChild = null;
        if (getFocusTargetOfEmbeddedViewWrapper().getFocusState$1().isFocused()) {
            focusOwnerImpl.m594clearFocusI7lrPNg(8, false, false);
        }
    }
}
