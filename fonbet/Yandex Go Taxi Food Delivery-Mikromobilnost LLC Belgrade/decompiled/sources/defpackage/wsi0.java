package defpackage;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class wsi0 extends vpl {
    public final Div2View a;
    public final plk b;
    public final cpk c;

    public wsi0(Div2View div2View, plk plkVar, cpk cpkVar) {
        this.a = div2View;
        this.b = plkVar;
        this.c = cpkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(View view) {
        if (view instanceof ssi0) {
            ((ssi0) view).release();
        }
        Object tag = view.getTag(ngh0.div_releasable_list);
        pnt0 pnt0Var = tag instanceof pnt0 ? (pnt0) tag : null;
        qnt0 e = pnt0Var != null ? afb1.e(pnt0Var) : null;
        if (e == null) {
            return;
        }
        Iterator it = e.iterator();
        while (true) {
            rnt0 rnt0Var = (rnt0) it;
            if (!rnt0Var.hasNext()) {
                return;
            } else {
                ((ssi0) rnt0Var.next()).release();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vpl
    public final void a(msk mskVar) {
        View view = (View) mskVar;
        m3k div = mskVar.getDiv();
        egk d = div != null ? div.d() : null;
        aw5 bindingContext = mskVar.getBindingContext();
        rvo rvoVar = bindingContext != null ? bindingContext.b : null;
        if (d != null && rvoVar != null) {
            this.c.e(this.a, rvoVar, view, d);
        }
        i(view);
    }

    @Override // defpackage.vpl
    public final void b(View view) {
        i(view);
    }

    @Override // defpackage.vpl
    public final void c(DivCustomWrapper divCustomWrapper) {
        rvo rvoVar;
        j2k div = divCustomWrapper.getDiv();
        if (div == null) {
            return;
        }
        clk clkVar = div.c;
        aw5 bindingContext = divCustomWrapper.getBindingContext();
        if (bindingContext == null || (rvoVar = bindingContext.b) == null) {
            return;
        }
        i(divCustomWrapper);
        View customView = divCustomWrapper.getCustomView();
        if (customView != null) {
            this.c.e(this.a, rvoVar, customView, clkVar);
            this.b.release(customView, clkVar);
        }
    }

    @Override // defpackage.vpl
    public final void e(DivPagerView divPagerView) {
        a(divPagerView);
        divPagerView.getViewPager().setAdapter(null);
    }

    @Override // defpackage.vpl
    public final void f(DivRecyclerView divRecyclerView) {
        a(divRecyclerView);
        divRecyclerView.setAdapter(null);
    }
}
