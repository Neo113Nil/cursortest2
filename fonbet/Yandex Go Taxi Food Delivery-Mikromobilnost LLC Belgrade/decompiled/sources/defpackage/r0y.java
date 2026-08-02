package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import just.adapter.scroll.ScrollControlGridLayoutManager;

/* loaded from: classes9.dex */
public final class r0y extends RecyclerView.a {
    public static final long[] g = new long[0];
    public final ScrollControlGridLayoutManager a;
    public boolean c;
    public long e;
    public final Rect b = new Rect();
    public int d = -1;
    public long[] f = g;

    public r0y(ScrollControlGridLayoutManager scrollControlGridLayoutManager) {
        this.a = scrollControlGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void a() {
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void b(int i, int i2) {
        if (i2 > 1) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void d(int i, int i2) {
        if (i2 > 1) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void e(int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void f(int i, int i2) {
        if (i2 > 1) {
            h();
        }
    }

    public final void h() {
        this.c = false;
        this.d = -1;
        this.e = 0L;
        this.f = g;
    }
}
