package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.dij0;
import defpackage.lys;
import defpackage.xmx0;
import defpackage.xw31;
import defpackage.ymx0;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class k implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lys b;

    public /* synthetic */ k(lys lysVar, int i) {
        this.a = i;
        this.b = lysVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        int i = this.a;
        lys lysVar = this.b;
        switch (i) {
            case 0:
                xmx0 xmx0Var = (xmx0) lysVar;
                View view = (View) xmx0Var.R;
                dij0 dij0Var = xmx0Var.a0;
                if (dij0Var != null && ((ListItemComponent) view).isShown() && xw31.i(view)) {
                    xmx0Var.b0(new TariffRuleV2ViewHolder$onDraw$1(xmx0Var, dij0Var, null));
                    break;
                }
                break;
            default:
                ymx0 ymx0Var = (ymx0) lysVar;
                View view2 = (View) ymx0Var.R;
                dij0 dij0Var2 = ymx0Var.W;
                if (dij0Var2 != null && ((ListItemComponent) view2).isShown() && xw31.i(view2)) {
                    ymx0Var.b0(new TariffRuleViewHolder$onDraw$1(ymx0Var, dij0Var2, null));
                    break;
                }
                break;
        }
    }
}
