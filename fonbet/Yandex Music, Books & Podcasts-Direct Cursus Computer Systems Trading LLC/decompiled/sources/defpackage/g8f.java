package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class g8f extends won {
    public final float a;
    public final float b;
    public final float c;
    public final Paint d;
    public final int e;

    public g8f(float f, float f2, float f3, float f4, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setStrokeWidth(f4);
        this.d = paint;
        this.e = paint.getAlpha();
    }

    @Override // defpackage.won
    public final void f(Rect rect, View view, RecyclerView recyclerView, kpn kpnVar) {
        rect.getClass();
        view.getClass();
        kpnVar.getClass();
        int Y = RecyclerView.Y(view);
        boolean z = Y == 0;
        int b = kpnVar.b();
        boolean z2 = b > 0 && Y == b - 1;
        view.setOutlineProvider(new qgo(this.c, (z && z2) ? pgo.a : z ? pgo.b : z2 ? pgo.d : pgo.c));
        view.setClipToOutline(true);
        rect.set(0, z ? (int) this.a : 0, 0, z2 ? (int) this.b : 0);
    }

    @Override // defpackage.won
    public final void h(Canvas canvas, RecyclerView recyclerView, kpn kpnVar) {
        Canvas canvas2;
        canvas.getClass();
        kpnVar.getClass();
        qon adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            }
            int c = recyclerView.a0(childAt).c();
            if (c != -1 && c + 1 < adapter.c()) {
                int paddingLeft = recyclerView.getPaddingLeft();
                float translationY = childAt.getTranslationY() + childAt.getBottom();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int alpha = (int) (childAt.getAlpha() * this.e);
                Paint paint = this.d;
                paint.setAlpha(alpha);
                canvas2 = canvas;
                canvas2.drawLine(paddingLeft, translationY, width, translationY, paint);
            } else {
                canvas2 = canvas;
            }
            i = i2;
            canvas = canvas2;
        }
    }
}
