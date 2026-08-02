package com.squareup.cash.arcade.theme;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ObserverModifierNode;

/* loaded from: classes.dex */
public final class RippleNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    public final RippleAlpha alpha;
    public final boolean bounded;
    public final ColorProducer color;
    public final MutableInteractionSourceImpl interactionSource;
    public final float radius;
    public AndroidRippleNode rippleNode;

    public RippleNode(MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, float f, ColorProducer colorProducer, RippleAlpha rippleAlpha) {
        mutableInteractionSourceImpl.getClass();
        colorProducer.getClass();
        this.interactionSource = mutableInteractionSourceImpl;
        this.bounded = z;
        this.radius = f;
        this.color = colorProducer;
        this.alpha = rippleAlpha;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        DepthSortedSetKt.observeReads(this, new RippleNode$$ExternalSyntheticLambda0(this, 0));
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        DepthSortedSetKt.observeReads(this, new RippleNode$$ExternalSyntheticLambda0(this, 0));
    }
}
