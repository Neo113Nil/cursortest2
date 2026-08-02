package app.cash.redwood.lazylayout.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/cash/redwood/lazylayout/view/ViewLazyList$linearLayoutManager$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "redwood-lazylayout-view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewLazyList$linearLayoutManager$1 extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new RecyclerView.LayoutParams(-2, -1);
        }
        if (i != 1) {
            return null;
        }
        return new RecyclerView.LayoutParams(-1, -2);
    }
}
