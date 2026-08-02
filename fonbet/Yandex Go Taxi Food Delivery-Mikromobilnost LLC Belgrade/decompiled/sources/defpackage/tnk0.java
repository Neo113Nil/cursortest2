package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.x;

/* loaded from: classes14.dex */
public final /* synthetic */ class tnk0 implements rqs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;
    public final /* synthetic */ wrs0 c;

    public /* synthetic */ tnk0(x xVar, wrs0 wrs0Var, int i) {
        this.a = i;
        this.b = xVar;
        this.c = wrs0Var;
    }

    @Override // defpackage.rqs0
    public final void a(nqs0 nqs0Var, wss0 wss0Var) {
        int i = this.a;
        wrs0 wrs0Var = this.c;
        x xVar = this.b;
        switch (i) {
            case 0:
                ibk0 a = ijk0.a(nqs0Var);
                if (a != null) {
                    xVar.U.a(a, wrs0Var);
                    break;
                }
                break;
            default:
                ibk0 a2 = ijk0.a(nqs0Var);
                if (a2 != null) {
                    xVar.U.a(a2, wrs0Var);
                    break;
                }
                break;
        }
    }
}
