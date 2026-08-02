package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes6.dex */
public final class tpd extends won {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public tpd(int i, int i2, int i3, int i4) {
        this.a = i / 2;
        this.b = i2;
        this.c = i3 / 2;
        this.d = i4;
        this.e = i4;
    }

    @Override // defpackage.won
    public final void f(Rect rect, View view, RecyclerView recyclerView, kpn kpnVar) {
        int i;
        int i2 = this.a;
        rect.right = i2;
        rect.left = i2;
        int i3 = this.c;
        rect.bottom = i3;
        rect.top = i3;
        yon layoutManager = recyclerView.getLayoutManager();
        jyr jyrVar = sht.a;
        layoutManager.getClass();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            i = ((StaggeredGridLayoutManager) layoutManager).p;
        } else if (layoutManager instanceof GridLayoutManager) {
            i = ((GridLayoutManager) layoutManager).F;
        } else {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                xq0.q(tlm.j("Unsupported layout manager ", layoutManager.getClass()));
                return;
            }
            i = 1;
        }
        int f0 = yon.f0(view);
        int i4 = f0 % i;
        int i5 = this.b;
        if (i4 == 0) {
            rect.left = i5;
        }
        if (i4 == i - 1) {
            rect.right = i5;
        }
        if (f0 < i) {
            rect.top = this.d;
        }
        if (f0 > layoutManager.a0() - i) {
            rect.bottom = this.e;
        }
    }
}
