package androidx.compose.foundation.gestures;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ScrollableNode$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScrollableNode f$0;

    public /* synthetic */ ScrollableNode$$ExternalSyntheticLambda0(ScrollableNode scrollableNode, int i) {
        this.$r8$classId = i;
        this.f$0 = scrollableNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ScrollableNode scrollableNode = this.f$0;
        switch (i) {
            case 0:
                return Boolean.valueOf(scrollableNode.isAttached());
            default:
                FocusTargetNode focusTargetNode = scrollableNode.focusTargetModifierNode;
                if (!focusTargetNode.getNode().isAttached()) {
                    return null;
                }
                FocusStateImpl focusState$1 = focusTargetNode.getFocusState$1();
                if (!focusState$1.getHasFocus()) {
                    return null;
                }
                if (focusState$1.isFocused()) {
                    return focusTargetNode.fetchFocusRect$ui(null);
                }
                FocusTargetNode activeFocusTargetNode = ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode)).focusOwner.getActiveFocusTargetNode();
                if (activeFocusTargetNode != null) {
                    return activeFocusTargetNode.fetchFocusRect$ui(DepthSortedSetKt.requireLayoutCoordinates(focusTargetNode));
                }
                return null;
        }
    }
}
