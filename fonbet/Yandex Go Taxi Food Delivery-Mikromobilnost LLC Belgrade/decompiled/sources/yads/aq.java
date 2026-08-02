package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.b281;
import defpackage.f981;
import defpackage.hm61;
import defpackage.m810;

/* loaded from: classes7.dex */
public final class aq extends FrameLayout {
    public final f981 a;
    public final int b;
    public final Paint c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(Context context, b281 b281Var) {
        super(context);
        f981 f981Var = new f981();
        this.a = f981Var;
        b281Var.getClass();
        this.b = b281.a(context, 0.5f);
        Paint paint = new Paint();
        this.c = paint;
        int b = m810.b(TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(b);
        paint.setColor(-65536);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.b;
        canvas.drawRect(f, f, getWidth() - this.b, getHeight() - this.b, this.c);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        View view = (View) parent;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        setLeft(0);
        setTop(0);
        setRight(measuredWidth);
        setBottom(measuredHeight);
        super.onLayout(z, 0, 0, measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        hm61 l = this.a.l(i, i2);
        super.onMeasure(l.a, l.b);
    }

    public final void setColor(int i) {
        if (this.c.getColor() != i) {
            this.c.setColor(i);
            requestLayout();
        }
    }
}
