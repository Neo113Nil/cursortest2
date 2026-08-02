package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;

/* loaded from: classes11.dex */
public final class v1l extends RecyclerView.g {
    public final /* synthetic */ DivPagerView a;

    public v1l(DivPagerView divPagerView) {
        this.a = divPagerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        RecyclerView.Adapter adapter = this.a.getViewPager().getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int K1 = linearLayoutManager.K1();
        int M1 = linearLayoutManager.M1();
        if (K1 >= itemCount - 2 && i > 0) {
            recyclerView.scrollToPosition(2);
        } else {
            if (M1 > 1 || i >= 0) {
                return;
            }
            recyclerView.scrollToPosition(itemCount - 3);
        }
    }
}
