package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.f;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.v;

/* loaded from: classes14.dex */
public final /* synthetic */ class rdk0 implements w7i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wrs0 b;
    public final /* synthetic */ ibk0 c;
    public final /* synthetic */ qpk0 w;

    public /* synthetic */ rdk0(wrs0 wrs0Var, ibk0 ibk0Var, qpk0 qpk0Var, int i) {
        this.a = i;
        this.b = wrs0Var;
        this.c = ibk0Var;
        this.w = qpk0Var;
    }

    @Override // defpackage.w7i0
    public final void h(float f, boolean z) {
        int i = this.a;
        qpk0 qpk0Var = this.w;
        ibk0 ibk0Var = this.c;
        wrs0 wrs0Var = this.b;
        switch (i) {
            case 0:
                f fVar = (f) qpk0Var;
                int b = m810.b(f);
                if (z) {
                    wrs0Var.getExtras().put("rating", Integer.valueOf(b));
                    if (ibk0Var instanceof kak0) {
                        ibk0Var = ((kak0) ibk0Var).b(b);
                    }
                    fVar.S.a(ibk0Var, wrs0Var);
                    break;
                }
                break;
            default:
                v vVar = (v) qpk0Var;
                int b2 = m810.b(f);
                if (z) {
                    wrs0Var.getExtras().put("rating", Integer.valueOf(b2));
                    vVar.S.a(ibk0Var instanceof kak0 ? ((kak0) ibk0Var).b(b2) : ibk0Var, wrs0Var);
                    if (!(ibk0Var instanceof jak0)) {
                        vVar.R.startSelectionAnimation(b2);
                        break;
                    }
                }
                break;
        }
    }
}
