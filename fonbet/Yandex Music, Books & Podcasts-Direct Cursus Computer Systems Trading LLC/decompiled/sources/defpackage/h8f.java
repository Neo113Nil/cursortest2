package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class h8f extends won {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final Paint e;
    public final int f;
    public int g;

    public h8f(float f, float f2, float f3, float f4, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setStrokeWidth(f4);
        this.e = paint;
        this.f = paint.getAlpha();
    }

    @Override // defpackage.won
    public final void f(Rect rect, View view, RecyclerView recyclerView, kpn kpnVar) {
        rect.getClass();
        view.getClass();
        kpnVar.getClass();
        int Y = RecyclerView.Y(view);
        boolean z = Y == 0;
        boolean z2 = Y == 1;
        int b = kpnVar.b();
        boolean z3 = b > 0 && Y == b - 1;
        boolean z4 = z || z2;
        boolean z5 = z || z3;
        pgo pgoVar = (z4 && z5) ? pgo.a : z4 ? pgo.b : z5 ? pgo.d : pgo.c;
        float f = this.c;
        view.setOutlineProvider(new qgo(f, pgoVar));
        view.setClipToOutline(true);
        int i = z ? (int) this.a : 0;
        int i2 = z ? (int) this.b : 0;
        int i3 = this.g;
        if (i3 != 0 && Y == i3 + 1) {
            View childAt = recyclerView.getChildAt(recyclerView.indexOfChild(view) - 1);
            if (this.g == 1) {
                if (childAt != null) {
                    childAt.setOutlineProvider(new qgo(f, pgo.b));
                }
            } else if (childAt != null) {
                childAt.setOutlineProvider(new qgo(f, pgo.c));
            }
        }
        if (z3) {
            this.g = Y;
        }
        rect.set(0, i, 0, i2);
    }

    @Override // defpackage.won
    public final void h(Canvas canvas, RecyclerView recyclerView, kpn kpnVar) {
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
            if (c != -1 && c + 1 < adapter.c() && c > 0) {
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                float translationY = (this.d / 2) + childAt.getTranslationY() + childAt.getBottom();
                int alpha = (int) (childAt.getAlpha() * this.f);
                Paint paint = this.e;
                paint.setAlpha(alpha);
                canvas.drawLine(paddingLeft, translationY, width, translationY, paint);
            }
            i = i2;
        }
    }
}
