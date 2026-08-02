package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes3.dex */
public final class l0k extends won {
    public final int a;
    public final int b;
    public final int c;

    public l0k(int i, int i2, int i3, int i4) {
        i2 = (i4 & 4) != 0 ? 0 : i2;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.won
    public final void f(Rect rect, View view, RecyclerView recyclerView, kpn kpnVar) {
        yon layoutManager = recyclerView.getLayoutManager();
        int i = layoutManager instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) layoutManager).p : 1;
        int i2 = this.c;
        int i3 = this.a;
        if (i != 1) {
            int i4 = i3 / 2;
            int i5 = this.b / 2;
            if (i2 == 0) {
                rect.set(i4, i5, i4, i5);
                return;
            } else {
                if (i2 != 1) {
                    return;
                }
                rect.set(i5, i4, i5, i4);
                return;
            }
        }
        qon adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int c = adapter.c();
            int Y = RecyclerView.Y(view);
            if (Y == -1) {
                return;
            }
            boolean z = Y == c - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                if (z) {
                    i3 = 0;
                }
                rect.set(0, 0, 0, i3);
                return;
            }
            if (wyf.N(recyclerView)) {
                z = Y == 0;
            }
            if (z) {
                i3 = 0;
            }
            rect.set(0, 0, i3, 0);
        }
    }
}
