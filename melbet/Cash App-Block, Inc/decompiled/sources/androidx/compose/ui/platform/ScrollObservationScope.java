package androidx.compose.ui.platform;

import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ScrollObservationScope implements OwnerScope {
    public final List allScopes;
    public final int semanticsNodeId;
    public Float oldXValue = null;
    public Float oldYValue = null;
    public ScrollAxisRange horizontalScrollAxisRange = null;
    public ScrollAxisRange verticalScrollAxisRange = null;

    public ScrollObservationScope(int i, ArrayList arrayList) {
        this.semanticsNodeId = i;
        this.allScopes = arrayList;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean isValidOwnerScope() {
        return this.allScopes.contains(this);
    }

    public final void setHorizontalScrollAxisRange(ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void setVerticalScrollAxisRange(ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }
}
