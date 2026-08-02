package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.unit.LayoutDirection;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ScrollableAreaNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    public BringIntoViewSpec bringIntoViewSpec;
    public boolean enabled;
    public FlingBehavior flingBehavior;
    public MutableInteractionSourceImpl interactionSource;
    public AndroidEdgeEffectOverscrollFactory localOverscrollFactory;
    public AndroidEdgeEffectOverscrollEffect localOverscrollFactoryCreatedOverscrollEffect;
    public Orientation orientation;
    public DelegatingNode overscrollNode;
    public ScrollableNode scrollableNode;
    public boolean shouldReverseDirection;
    public ScrollableState state;
    public boolean useLocalOverscrollFactory;
    public AndroidEdgeEffectOverscrollEffect userProvidedOverscrollEffect;

    public final void attachOverscrollNodeIfNeeded() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            if (delegatableNode.getNode().isAttached()) {
                return;
            }
            delegate(delegatableNode);
            return;
        }
        if (this.useLocalOverscrollFactory) {
            DepthSortedSetKt.observeReads(this, new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 3));
        }
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.useLocalOverscrollFactory ? this.localOverscrollFactoryCreatedOverscrollEffect : this.userProvidedOverscrollEffect;
        if (androidEdgeEffectOverscrollEffect != null) {
            DelegatingNode delegatingNode = androidEdgeEffectOverscrollEffect.node;
            if (delegatingNode.getNode().isAttached()) {
                return;
            }
            delegate(delegatingNode);
            this.overscrollNode = delegatingNode;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        this.shouldReverseDirection = shouldReverseDirection();
        attachOverscrollNodeIfNeeded();
        if (this.scrollableNode == null) {
            ScrollableState scrollableState = this.state;
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.useLocalOverscrollFactory ? this.localOverscrollFactoryCreatedOverscrollEffect : this.userProvidedOverscrollEffect;
            ScrollableNode scrollableNode = new ScrollableNode(androidEdgeEffectOverscrollEffect, this.bringIntoViewSpec, this.flingBehavior, this.orientation, scrollableState, this.interactionSource, this.enabled, this.shouldReverseDirection);
            delegate(scrollableNode);
            this.scrollableNode = scrollableNode;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        DelegatingNode delegatingNode = this.overscrollNode;
        if (delegatingNode != null) {
            undelegate(delegatingNode);
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public final void onLayoutDirectionChange() {
        boolean shouldReverseDirection = shouldReverseDirection();
        if (this.shouldReverseDirection != shouldReverseDirection) {
            this.shouldReverseDirection = shouldReverseDirection;
            ScrollableState scrollableState = this.state;
            Orientation orientation = this.orientation;
            boolean z = this.useLocalOverscrollFactory;
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = z ? this.localOverscrollFactoryCreatedOverscrollEffect : this.userProvidedOverscrollEffect;
            update(androidEdgeEffectOverscrollEffect, this.bringIntoViewSpec, this.flingBehavior, orientation, scrollableState, this.interactionSource, z, this.enabled);
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = (AndroidEdgeEffectOverscrollFactory) DepthSortedSetKt.currentValueOf(this, OverscrollKt.LocalOverscrollFactory);
        if (Intrinsics.areEqual(androidEdgeEffectOverscrollFactory, this.localOverscrollFactory)) {
            return;
        }
        this.localOverscrollFactory = androidEdgeEffectOverscrollFactory;
        this.localOverscrollFactoryCreatedOverscrollEffect = null;
        DelegatingNode delegatingNode = this.overscrollNode;
        if (delegatingNode != null) {
            undelegate(delegatingNode);
        }
        this.overscrollNode = null;
        attachOverscrollNodeIfNeeded();
        ScrollableNode scrollableNode = this.scrollableNode;
        if (scrollableNode != null) {
            ScrollableState scrollableState = this.state;
            Orientation orientation = this.orientation;
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.useLocalOverscrollFactory ? this.localOverscrollFactoryCreatedOverscrollEffect : this.userProvidedOverscrollEffect;
            scrollableNode.update(androidEdgeEffectOverscrollEffect, this.bringIntoViewSpec, this.flingBehavior, orientation, scrollableState, this.interactionSource, this.enabled, this.shouldReverseDirection);
        }
    }

    public final boolean shouldReverseDirection() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        if (isAttached()) {
            layoutDirection = DepthSortedSetKt.requireLayoutNode(this).layoutDirection;
        }
        return layoutDirection != LayoutDirection.Rtl || this.orientation == Orientation.Vertical;
    }

    public final void update(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, BringIntoViewSpec bringIntoViewSpec, FlingBehavior flingBehavior, Orientation orientation, ScrollableState scrollableState, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, boolean z2) {
        boolean z3;
        this.state = scrollableState;
        this.orientation = orientation;
        boolean z4 = true;
        if (this.useLocalOverscrollFactory != z) {
            this.useLocalOverscrollFactory = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (Intrinsics.areEqual(this.userProvidedOverscrollEffect, androidEdgeEffectOverscrollEffect)) {
            z4 = false;
        } else {
            this.userProvidedOverscrollEffect = androidEdgeEffectOverscrollEffect;
        }
        if (z3 || (z4 && !z)) {
            DelegatingNode delegatingNode = this.overscrollNode;
            if (delegatingNode != null) {
                undelegate(delegatingNode);
            }
            this.overscrollNode = null;
            attachOverscrollNodeIfNeeded();
        }
        this.enabled = z2;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSourceImpl;
        this.bringIntoViewSpec = bringIntoViewSpec;
        boolean shouldReverseDirection = shouldReverseDirection();
        this.shouldReverseDirection = shouldReverseDirection;
        ScrollableNode scrollableNode = this.scrollableNode;
        if (scrollableNode != null) {
            scrollableNode.update(this.useLocalOverscrollFactory ? this.localOverscrollFactoryCreatedOverscrollEffect : this.userProvidedOverscrollEffect, bringIntoViewSpec, flingBehavior, orientation, scrollableState, mutableInteractionSourceImpl, z2, shouldReverseDirection);
        }
    }
}
