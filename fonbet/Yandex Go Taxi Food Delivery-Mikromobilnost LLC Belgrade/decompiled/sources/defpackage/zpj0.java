package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.tariffcard.ui.model.VisibilityChangeOrigin;

/* loaded from: classes14.dex */
public final class zpj0 extends RecyclerView.g {
    public final LinearLayoutManager a;
    public final ekj0 b;
    public boolean c;
    public volatile String d;

    public zpj0(LinearLayoutManager linearLayoutManager, ekj0 ekj0Var) {
        this.a = linearLayoutManager;
        this.b = ekj0Var;
    }

    public final void a(VisibilityChangeOrigin visibilityChangeOrigin) {
        if (this.c) {
            ekj0 ekj0Var = this.b;
            int L1 = this.a.L1();
            ekj0Var.a.a(this.d, L1, visibilityChangeOrigin);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (i2 == 0) {
            a(VisibilityChangeOrigin.SYSTEM);
        } else {
            a(VisibilityChangeOrigin.USER);
        }
    }
}
