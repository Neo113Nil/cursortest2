package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ru.yandex.taxi.design.DotsIndicatorComponent;
import ru.yandex.taxi.preorder.summary.tariffpage.TariffPagerView;

/* loaded from: classes6.dex */
public final class qkx0 implements jkx0 {
    public final /* synthetic */ TariffPagerView a;

    public qkx0(TariffPagerView tariffPagerView) {
        this.a = tariffPagerView;
    }

    @Override // defpackage.jkx0
    public final void Ad(int i) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        DotsIndicatorComponent dotsIndicatorComponent;
        TariffPagerView tariffPagerView = this.a;
        recyclerView = tariffPagerView.tariffPager;
        int scrollState = recyclerView.getScrollState();
        if (scrollState == 1 || scrollState == 2) {
            jst.e.getClass();
            return;
        }
        recyclerView2 = tariffPagerView.tariffPager;
        recyclerView2.scrollToPosition(i);
        recyclerView3 = tariffPagerView.tariffPager;
        recyclerView3.post(new okx0(tariffPagerView, 1));
        dotsIndicatorComponent = tariffPagerView.dotsIndicatorComponent;
        dotsIndicatorComponent.setPageScroll(i, 0.0f);
    }

    @Override // defpackage.jkx0
    public final void C7(sgx0 sgx0Var) {
        gfv0 gfv0Var;
        gfv0Var = this.a.listener;
        gfv0Var.e(sgx0Var);
    }

    @Override // defpackage.jkx0
    public final void Ud(List list) {
        DotsIndicatorComponent dotsIndicatorComponent;
        ckx0 ckx0Var;
        gfv0 gfv0Var;
        DotsIndicatorComponent dotsIndicatorComponent2;
        boolean showDotsIndicator;
        DotsIndicatorComponent dotsIndicatorComponent3;
        int size = list.size();
        TariffPagerView tariffPagerView = this.a;
        if (size > 1) {
            dotsIndicatorComponent2 = tariffPagerView.dotsIndicatorComponent;
            showDotsIndicator = tariffPagerView.getShowDotsIndicator();
            dotsIndicatorComponent2.setVisibility(showDotsIndicator ? 0 : 8);
            dotsIndicatorComponent3 = tariffPagerView.dotsIndicatorComponent;
            dotsIndicatorComponent3.setDotsCount(list.size());
        } else {
            dotsIndicatorComponent = tariffPagerView.dotsIndicatorComponent;
            dotsIndicatorComponent.setVisibility(8);
        }
        ckx0Var = tariffPagerView.adapter;
        List list2 = ckx0Var.w;
        ckx0Var.w = list;
        kp50.f(new lds0(list2, list, new aub(18)), true).b(ckx0Var);
        gfv0Var = tariffPagerView.listener;
        gfv0Var.c();
    }
}
