package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class wql extends RecyclerView.d {
    public final Drawable a;

    public wql(Context context) {
        this.a = context.getDrawable(gxg0.plus_logs_debug_panel_divider_horizontal);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int childCount = recyclerView.getChildCount() - 1;
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            i++;
            View childAt2 = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            int childAdapterPosition2 = recyclerView.getChildAdapterPosition(childAt2);
            if (childAdapterPosition != -1 && childAdapterPosition2 != -1 && adapter.getItemViewType(childAdapterPosition) == adapter.getItemViewType(childAdapterPosition2)) {
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                drawable.draw(canvas);
            }
        }
    }
}
