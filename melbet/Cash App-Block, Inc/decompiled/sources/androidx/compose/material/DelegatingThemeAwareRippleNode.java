package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ObserverModifierNode;

/* loaded from: classes3.dex */
public final class DelegatingThemeAwareRippleNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    public final /* synthetic */ int $r8$classId;
    public final boolean bounded;
    public final ColorProducer color;
    public final MutableInteractionSourceImpl interactionSource;
    public final float radius;
    public AndroidRippleNode rippleNode;

    public /* synthetic */ DelegatingThemeAwareRippleNode(MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, float f, ColorProducer colorProducer, int i) {
        this.$r8$classId = i;
        this.interactionSource = mutableInteractionSourceImpl;
        this.bounded = z;
        this.radius = f;
        this.color = colorProducer;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        switch (this.$r8$classId) {
            case 0:
                DepthSortedSetKt.observeReads(this, new DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0(this, 0));
                break;
            default:
                DepthSortedSetKt.observeReads(this, new androidx.compose.material3.DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0(this, 0));
                break;
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        switch (this.$r8$classId) {
            case 0:
                DepthSortedSetKt.observeReads(this, new DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0(this, 0));
                break;
            default:
                DepthSortedSetKt.observeReads(this, new androidx.compose.material3.DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0(this, 0));
                break;
        }
    }
}
