package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class sjp0 extends RecyclerView.g {
    public final boolean a;
    public final rjp0 b;
    public int c;

    public sjp0(boolean z, rjp0 rjp0Var) {
        this.a = z;
        this.b = rjp0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        if (i != 0 || (i2 = this.c) == 0) {
            return;
        }
        boolean z = true;
        if (!this.a ? i2 <= 0 : i2 >= 0) {
            z = false;
        }
        this.b.a(z);
        this.c = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.c += i;
    }
}
