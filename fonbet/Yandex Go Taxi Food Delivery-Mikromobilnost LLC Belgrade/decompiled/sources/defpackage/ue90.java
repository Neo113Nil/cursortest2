package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.parks.a;
import ru.yandex.taxi.parks.view.ParksContentView;

/* loaded from: classes6.dex */
public final class ue90 extends RecyclerView.g {
    public final /* synthetic */ ParksContentView a;

    public ue90(ParksContentView parksContentView) {
        this.a = parksContentView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        xe90 xe90Var;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            int L1 = linearLayoutManager.L1();
            ParksContentView parksContentView = this.a;
            xe90Var = parksContentView.parkAdapter;
            if (L1 == xe90Var.a.size() - 1) {
                a parksListPresenter = parksContentView.getParksListPresenter();
                if (parksListPresenter.D) {
                    parksListPresenter.Lg();
                }
            }
        }
    }
}
