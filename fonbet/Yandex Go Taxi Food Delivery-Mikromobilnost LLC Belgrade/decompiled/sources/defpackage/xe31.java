package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView;

/* loaded from: classes6.dex */
public final class xe31 extends RecyclerView.g {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ VerticalInternalTariffView b;

    public xe31(Runnable runnable, VerticalInternalTariffView verticalInternalTariffView) {
        this.a = runnable;
        this.b = verticalInternalTariffView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        sjp0 sjp0Var;
        if (i == 0) {
            this.a.run();
            VerticalInternalTariffView verticalInternalTariffView = this.b;
            recyclerView2 = verticalInternalTariffView.tariffsInternalView;
            recyclerView2.removeOnScrollListener(this);
            recyclerView3 = verticalInternalTariffView.tariffsInternalView;
            sjp0Var = verticalInternalTariffView.scrollWithoutSelectListener;
            recyclerView3.addOnScrollListener(sjp0Var);
        }
    }
}
