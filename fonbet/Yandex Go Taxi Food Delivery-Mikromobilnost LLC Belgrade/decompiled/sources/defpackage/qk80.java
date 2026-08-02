package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes13.dex */
public final class qk80 extends RecyclerView.d {
    public final i3y a;
    public final Paint b;

    public qk80(Context context) {
        qd00 qd00Var = new qd00(context, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = a.b(lazyThreadSafetyMode, qd00Var);
        i3y b = a.b(lazyThreadSafetyMode, new qd00(context, 8));
        Paint paint = new Paint();
        paint.setStrokeWidth(((Number) b.getValue()).floatValue());
        paint.setColor(qje.t(xng0.line, context));
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
            i3y i3yVar = this.a;
            canvas.drawLine(((Number) i3yVar.getValue()).floatValue(), childAt.getBottom(), childAt.getRight() - ((Number) i3yVar.getValue()).floatValue(), childAt.getBottom(), this.b);
        }
    }
}
