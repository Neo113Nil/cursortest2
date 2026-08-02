package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

/* loaded from: classes6.dex */
public final class vx31 extends RecyclerView.g {
    public final PositionLayoutManager a;
    public lz40 b;
    public ux31 c;

    public vx31(PositionLayoutManager positionLayoutManager) {
        this.a = positionLayoutManager;
    }

    public final void a(lz40 lz40Var) {
        this.b = lz40Var;
        if (lz40Var != null) {
            PositionLayoutManager positionLayoutManager = this.a;
            ux31 ux31Var = new ux31(positionLayoutManager.H1(), positionLayoutManager.L1());
            this.c = ux31Var;
            lz40Var.g(ux31Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        lz40 lz40Var = this.b;
        if (lz40Var == null) {
            return;
        }
        PositionLayoutManager positionLayoutManager = this.a;
        int H1 = positionLayoutManager.H1();
        int L1 = positionLayoutManager.L1();
        ux31 ux31Var = this.c;
        if (ux31Var != null && H1 == ux31Var.a && L1 == ux31Var.b) {
            return;
        }
        ux31 ux31Var2 = new ux31(H1, L1);
        this.c = ux31Var2;
        lz40Var.g(ux31Var2);
    }
}
