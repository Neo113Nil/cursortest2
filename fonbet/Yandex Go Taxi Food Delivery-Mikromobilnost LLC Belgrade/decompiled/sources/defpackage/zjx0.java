package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.preorder.summary.tariffpage.TariffPagerView;

/* loaded from: classes6.dex */
public final class zjx0 extends RecyclerView.g {
    public final /* synthetic */ akx0 a;

    public zjx0(akx0 akx0Var) {
        this.a = akx0Var;
    }

    public final void a(RecyclerView recyclerView, int i) {
        int width = recyclerView.getWidth();
        if (width > 0) {
            akx0 akx0Var = this.a;
            float f = akx0Var.e / width;
            if (xw31.n(recyclerView.getContext())) {
                f = -f;
            }
            if (f < 0.0f) {
                f += 1.0f;
            }
            akx0Var.a.setPageScroll(i, Math.max(0.0f, Math.min(1.0f, f)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        yjx0 tariffPageIndicatorController$lambda$0;
        akx0 akx0Var = this.a;
        if (i == 0 && akx0Var.d == 2) {
            akx0Var.e = 0;
            akx0Var.a.scrollFinished();
        }
        akx0Var.d = i;
        tariffPageIndicatorController$lambda$0 = TariffPagerView.getTariffPageIndicatorController$lambda$0((TariffPagerView) akx0Var.b.b);
        if (tariffPageIndicatorController$lambda$0.b) {
            a(recyclerView, tariffPageIndicatorController$lambda$0.a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        yjx0 tariffPageIndicatorController$lambda$0;
        akx0 akx0Var = this.a;
        akx0Var.e += i;
        tariffPageIndicatorController$lambda$0 = TariffPagerView.getTariffPageIndicatorController$lambda$0((TariffPagerView) akx0Var.b.b);
        if (tariffPageIndicatorController$lambda$0.b) {
            a(recyclerView, tariffPageIndicatorController$lambda$0.a);
        }
    }
}
