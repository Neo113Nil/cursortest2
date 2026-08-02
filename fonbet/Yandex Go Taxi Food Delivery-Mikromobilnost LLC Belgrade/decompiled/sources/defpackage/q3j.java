package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.detailed_price.ui.DetailedPriceModalView;

/* loaded from: classes14.dex */
public final class q3j extends RecyclerView.g {
    public final /* synthetic */ DetailedPriceModalView a;

    public q3j(DetailedPriceModalView detailedPriceModalView) {
        this.a = detailedPriceModalView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.a.hideTooltip();
    }
}
