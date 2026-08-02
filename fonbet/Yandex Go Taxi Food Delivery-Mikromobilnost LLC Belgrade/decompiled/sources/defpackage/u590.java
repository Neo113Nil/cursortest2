package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class u590 extends RecyclerView.d {
    public final int a;
    public final int b;
    public final int c;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public u590(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i = (i8 & 1) != 0 ? 0 : i;
        i2 = (i8 & 2) != 0 ? 0 : i2;
        i3 = (i8 & 4) != 0 ? 0 : i3;
        i4 = (i8 & 8) != 0 ? 0 : i4;
        i5 = (i8 & 16) != 0 ? 0 : i5;
        i6 = (i8 & 64) != 0 ? Integer.MIN_VALUE : i6;
        i7 = (i8 & 128) != 0 ? Integer.MIN_VALUE : i7;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.w = i4;
        this.x = i5;
        this.y = i6;
        this.z = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int i;
        boolean z = recyclerView.getLayoutManager() != null && ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition() == 0;
        boolean z2 = recyclerView.getLayoutManager() != null && ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition() == recyclerView.getAdapter().getItemCount() - 1;
        boolean b = tj91.b(recyclerView);
        int i2 = this.c;
        int i3 = this.y;
        int i4 = this.a;
        int i5 = this.z;
        int i6 = this.b;
        int i7 = this.x;
        int i8 = this.w;
        if (b) {
            if (i5 != Integer.MIN_VALUE) {
                i4 = i5;
            }
            if (i3 != Integer.MIN_VALUE) {
                i2 = i3;
            }
            i = z2 ? i4 : 0;
            if (z) {
                i6 = i2;
            }
            rect.set(i, i8, i6, i7);
            return;
        }
        Integer valueOf = Integer.valueOf(i3);
        if (i3 == Integer.MIN_VALUE) {
            valueOf = null;
        }
        if (valueOf != null) {
            i4 = valueOf.intValue();
        }
        Integer valueOf2 = i5 != Integer.MIN_VALUE ? Integer.valueOf(i5) : null;
        if (valueOf2 != null) {
            i2 = valueOf2.intValue();
        }
        i = z ? i4 : 0;
        if (z2) {
            i6 = i2;
        }
        rect.set(i, i8, i6, i7);
    }

    public u590() {
        this(0, 0, 0, 0, 0, 0, 0, 255);
    }
}
