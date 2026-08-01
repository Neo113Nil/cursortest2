package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class CountDownCloseView extends CloseImageView {

    /* renamed from: a, reason: collision with root package name */
    private Paint f9985a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f9986b;

    /* renamed from: c, reason: collision with root package name */
    private float f9987c;

    /* renamed from: d, reason: collision with root package name */
    private int f9988d;

    /* renamed from: e, reason: collision with root package name */
    private int f9989e;

    /* renamed from: f, reason: collision with root package name */
    private int f9990f;

    /* renamed from: g, reason: collision with root package name */
    private int f9991g;

    /* renamed from: h, reason: collision with root package name */
    private int f9992h;
    private RectF i;

    /* renamed from: j, reason: collision with root package name */
    private float f9993j;

    /* renamed from: k, reason: collision with root package name */
    private long f9994k;

    public CountDownCloseView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.f9987c = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f9988d = Color.parseColor("#FF57575A");
        this.f9989e = -1;
        Paint paint = new Paint();
        this.f9985a = paint;
        paint.setAntiAlias(true);
        this.f9985a.setStrokeCap(Paint.Cap.ROUND);
        this.f9985a.setStyle(Paint.Style.STROKE);
        this.f9985a.setStrokeWidth(this.f9987c);
        Paint paint2 = new Paint();
        this.f9986b = paint2;
        paint2.setAntiAlias(true);
        this.f9986b.setColor(this.f9989e);
        this.i = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9993j < 360.0f) {
            this.f9985a.setColor(this.f9988d);
            canvas.drawArc(this.i, 0.0f, 360.0f, false, this.f9985a);
            this.f9985a.setColor(this.f9989e);
            canvas.drawArc(this.i, -90.0f, this.f9993j, false, this.f9985a);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i6, int i9, int i10) {
        super.onSizeChanged(i, i6, i9, i10);
        this.f9990f = i;
        this.f9991g = i6;
        a();
    }

    public void refresh(long j6) {
        long j9 = this.f9994k;
        if (j9 > 0) {
            this.f9993j = ((j6 * 1.0f) / j9) * 360.0f;
            postInvalidate();
        }
    }

    public void setDuration(long j6) {
        this.f9994k = j6;
    }

    public void setThickInPx(int i) {
        float f3 = i;
        this.f9987c = f3;
        this.f9985a.setStrokeWidth(f3);
        a();
    }

    public void setUnderRingColor(int i) {
        this.f9988d = i;
    }

    public CountDownCloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9987c = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f9988d = Color.parseColor("#FF57575A");
        this.f9989e = -1;
        Paint paint = new Paint();
        this.f9985a = paint;
        paint.setAntiAlias(true);
        this.f9985a.setStrokeCap(Paint.Cap.ROUND);
        this.f9985a.setStyle(Paint.Style.STROKE);
        this.f9985a.setStrokeWidth(this.f9987c);
        Paint paint2 = new Paint();
        this.f9986b = paint2;
        paint2.setAntiAlias(true);
        this.f9986b.setColor(this.f9989e);
        this.i = new RectF();
    }

    private void a() {
        float f3 = this.f9987c * 0.5f;
        float f9 = 0.0f + f3;
        this.i.set(f9, f9, this.f9990f - f3, this.f9991g - f3);
        this.f9992h = ((int) this.i.width()) >> 1;
    }
}
