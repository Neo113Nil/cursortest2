package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class tqu extends RecyclerView.d {
    public final int a;
    public final int b;
    public final int c;

    public tqu(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int b = kVar.b();
        int i = this.c;
        rect.left = (childAdapterPosition == -1 || childAdapterPosition == 0) ? this.a : i / 2;
        rect.right = childAdapterPosition == b + (-1) ? this.b : i / 2;
    }
}
