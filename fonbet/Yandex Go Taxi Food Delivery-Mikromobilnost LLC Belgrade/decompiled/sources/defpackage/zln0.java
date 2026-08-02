package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class zln0 extends RecyclerView.d {
    public final int a;
    public final Paint b;

    public zln0(Context context) {
        this.a = tje.r(mrg0.go_design_m_space, context);
        Paint paint = new Paint();
        paint.setStrokeWidth(tje.x(context, 0.5f));
        paint.setColor(qje.u(context.getTheme(), xng0.line));
        this.b = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView.getChildCount() < 2) {
            return;
        }
        int childCount = recyclerView.getChildCount() - 1;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            float f = this.a;
            canvas.drawLine(f, childAt.getBottom(), childAt.getRight() - f, childAt.getBottom(), this.b);
        }
    }
}
