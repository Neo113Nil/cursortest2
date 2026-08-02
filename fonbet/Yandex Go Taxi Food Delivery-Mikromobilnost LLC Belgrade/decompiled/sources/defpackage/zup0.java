package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.places.impl.ui.search.SearchModalView;
import com.yandex.go.places.impl.ui.search.f;

/* loaded from: classes13.dex */
public final class zup0 extends RecyclerView.g {
    public final /* synthetic */ SearchModalView a;

    public zup0(SearchModalView searchModalView) {
        this.a = searchModalView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        SearchModalView searchModalView = this.a;
        searchModalView.processRecyclerViewScrollState();
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            f presenter = searchModalView.getPresenter();
            int K1 = ((LinearLayoutManager) layoutManager).K1();
            nwp0 nwp0Var = presenter.E.d;
            kwp0 kwp0Var = nwp0Var instanceof kwp0 ? (kwp0) nwp0Var : null;
            if (kwp0Var != null) {
                kwp0Var.c = K1;
            }
        }
    }
}
