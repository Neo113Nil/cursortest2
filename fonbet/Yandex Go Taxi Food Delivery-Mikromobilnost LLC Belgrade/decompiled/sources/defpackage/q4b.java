package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class q4b extends RecyclerView.d {
    public final Drawable a;
    public final Drawable b;
    public final Drawable c;
    public final Rect w = new Rect();

    public q4b(Activity activity) {
        Drawable drawable = activity.getDrawable(wwg0.msg_divider_chat_list);
        Objects.requireNonNull(drawable);
        this.a = drawable;
        Drawable drawable2 = activity.getDrawable(wwg0.msg_divider_chat_list_compact_mode);
        Objects.requireNonNull(drawable2);
        this.b = drawable2;
        Drawable drawable3 = activity.getDrawable(wwg0.msg_divider_chat_list_cross_type);
        Objects.requireNonNull(drawable3);
        this.c = drawable3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        Boolean bool = (Boolean) view.getTag(e9h0.chat_list_item_first_non_pinned);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        rect.top = this.c.getIntrinsicHeight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            x0 childViewHolder = recyclerView.getChildViewHolder(childAt);
            Boolean bool = (Boolean) childViewHolder.a.getTag(e9h0.chat_list_skip_decoration);
            if ((bool == null || !bool.booleanValue()) && i2 != 0) {
                Boolean bool2 = (Boolean) childViewHolder.a.getTag(e9h0.chat_list_item_first_non_pinned);
                Drawable drawable = (bool2 == null || !bool2.booleanValue()) ? this.a : childViewHolder instanceof a4b ? this.b : this.c;
                Rect rect = this.w;
                recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                int i3 = rect.top;
                drawable.setBounds(i, i3, width, drawable.getIntrinsicHeight() + i3);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }
}
