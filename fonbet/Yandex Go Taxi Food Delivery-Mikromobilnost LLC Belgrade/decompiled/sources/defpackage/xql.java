package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class xql extends RecyclerView.d {
    public final Drawable a;
    public final Rect b = new Rect();

    public xql(Drawable drawable) {
        this.a = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt.getTag(ifh0.should_skip_divider) != Boolean.TRUE) {
                Rect rect = this.b;
                recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                int round = Math.round(childAt.getTranslationY()) + rect.top;
                int alpha = (int) (childAt.getAlpha() * 255.0f);
                Drawable drawable = this.a;
                drawable.setAlpha(alpha);
                drawable.setBounds(0, round, recyclerView.getRight(), drawable.getIntrinsicHeight() + round);
                drawable.draw(canvas);
            }
        }
    }
}
