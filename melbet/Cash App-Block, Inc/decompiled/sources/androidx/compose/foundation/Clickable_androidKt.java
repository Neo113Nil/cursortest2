package androidx.compose.foundation;

import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.DepthSortedSetKt;

/* loaded from: classes3.dex */
public abstract class Clickable_androidKt {
    public static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final boolean isComposeRootInScrollableContainer(AbstractClickableNode abstractClickableNode) {
        ViewParent parent = DepthSortedSetKt.requireView(abstractClickableNode).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
