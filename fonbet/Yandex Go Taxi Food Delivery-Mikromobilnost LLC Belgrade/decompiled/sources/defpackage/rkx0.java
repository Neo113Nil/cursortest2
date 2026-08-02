package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.a;
import ru.yandex.taxi.preorder.summary.tariffpage.TariffPagerView;

/* loaded from: classes6.dex */
public final class rkx0 extends RecyclerView.g {
    public final /* synthetic */ TariffPagerView a;

    public rkx0(TariffPagerView tariffPagerView) {
        this.a = tariffPagerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ckx0 ckx0Var;
        ktg ktgVar;
        gfv0 gfv0Var;
        ktg ktgVar2;
        ktg ktgVar3;
        TariffPagerView tariffPagerView = this.a;
        if (i != 0) {
            ktgVar3 = tariffPagerView.tariffSelectionDebouncer;
            ktgVar3.a();
            return;
        }
        we6 a = wvr.a(recyclerView);
        int i2 = a.b;
        if (i2 != -1) {
            View view = (View) a.c;
            ckx0Var = tariffPagerView.adapter;
            ikx0 ikx0Var = (ikx0) a.S(i2, ckx0Var.w);
            ktgVar = tariffPagerView.tariffSelectionDebouncer;
            ktgVar.a();
            if (view == null || ikx0Var == null) {
                return;
            }
            gfv0Var = tariffPagerView.listener;
            gfv0Var.h(view);
            ktgVar2 = tariffPagerView.tariffSelectionDebouncer;
            y7x0 y7x0Var = new y7x0(4, this, ikx0Var);
            ktgVar2.a();
            ktgVar2.b = y7x0Var;
            ktgVar2.a.postDelayed(y7x0Var, 100L);
        }
    }
}
