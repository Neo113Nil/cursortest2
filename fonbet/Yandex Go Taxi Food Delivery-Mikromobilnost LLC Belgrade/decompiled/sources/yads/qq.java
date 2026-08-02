package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import defpackage.b281;
import defpackage.m810;
import defpackage.sj71;

/* loaded from: classes6.dex */
public final class qq extends View {
    public final float a;
    public final float b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public float f;

    public qq(Context context) {
        super(context);
        this.a = b281.a(context, 34.0f);
        float b = m810.b(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.b = b;
        float b2 = m810.b(TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics()));
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(b);
        paint2.setAntiAlias(true);
        this.d = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setTextSize(b2);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.e = paint3;
        this.f = 40.0f;
        paint2.setColor(sj71.a(40.0f, -65536));
        paint.setColor(sj71.a(this.f, -1));
        paint3.setColor(sj71.a(this.f, -65536));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.a / 2.0f;
        canvas.drawCircle(f, f, f, this.c);
        canvas.drawCircle(f, f, f - (this.b / 2.0f), this.d);
        float f2 = this.a / 2.0f;
        canvas.drawText("!", f2, f2 - ((this.e.ascent() + this.e.descent()) / 2.0f), this.e);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = (int) this.a;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        float f = z ? 0.0f : 40.0f;
        this.f = f;
        this.d.setColor(sj71.a(f, -65536));
        this.c.setColor(sj71.a(this.f, -1));
        this.e.setColor(sj71.a(this.f, -65536));
        invalidate();
    }
}
