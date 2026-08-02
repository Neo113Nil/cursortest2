package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.preference.PreferenceFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes10.dex */
public final class ule0 extends RecyclerView.d {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ PreferenceFragment w;

    public ule0(PreferenceFragment preferenceFragment) {
        this.w = preferenceFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        if (f(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (f(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.a.setBounds(0, height, width, this.b + height);
                this.a.draw(canvas);
            }
        }
    }

    public final boolean f(View view, RecyclerView recyclerView) {
        x0 childViewHolder = recyclerView.getChildViewHolder(view);
        if (!(childViewHolder instanceof jme0) || !((jme0) childViewHolder).R) {
            return false;
        }
        boolean z = this.c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        x0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
        return (childViewHolder2 instanceof jme0) && ((jme0) childViewHolder2).Q;
    }
}
