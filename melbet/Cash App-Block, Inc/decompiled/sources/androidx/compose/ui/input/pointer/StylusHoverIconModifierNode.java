package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* loaded from: classes.dex */
public final class StylusHoverIconModifierNode extends HoverIconModifierNode {
    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public final void displayIcon(PointerIcon pointerIcon) {
        AndroidComposeView$pointerIconService$1 androidComposeView$pointerIconService$1 = (AndroidComposeView$pointerIconService$1) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalPointerIconService);
        if (androidComposeView$pointerIconService$1 != null) {
            androidComposeView$pointerIconService$1.currentStylusHoverIcon = pointerIcon;
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final /* bridge */ /* synthetic */ Object getTraverseKey() {
        return "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    /* renamed from: isRelevantPointerType-uerMTgs */
    public final boolean mo798isRelevantPointerTypeuerMTgs(int i) {
        return PointerType.m828equalsimpl0(i, 3) || PointerType.m828equalsimpl0(i, 4);
    }
}
