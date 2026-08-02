package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class vr51 extends RecyclerView.d {
    public Drawable a;

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        Drawable drawable = this.a;
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
            drawable.draw(canvas);
        }
    }
}
