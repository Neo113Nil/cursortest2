package androidx.compose.ui.node;

import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.ui.layout.Measurable;

/* loaded from: classes.dex */
public interface AlignmentLinesOwner extends Measurable {
    void forEachChildAlignmentLinesOwner(BoundsAnimation$animate$1 boundsAnimation$animate$1);

    LookaheadAlignmentLines getAlignmentLines();

    InnerNodeCoordinator getInnerCoordinator();

    AlignmentLinesOwner getParentAlignmentLinesOwner();

    int getPlaceOrder();

    void layoutChildren();

    void requestLayout();

    void requestMeasure();
}
