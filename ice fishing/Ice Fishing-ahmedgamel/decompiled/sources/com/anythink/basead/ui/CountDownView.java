package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class CountDownView extends CloseImageView {

    /* renamed from: a, reason: collision with root package name */
    private Paint f10781a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f10782b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f10783c;

    /* renamed from: d, reason: collision with root package name */
    private float f10784d;

    /* renamed from: e, reason: collision with root package name */
    private float f10785e;

    /* renamed from: f, reason: collision with root package name */
    private int f10786f;

    /* renamed from: g, reason: collision with root package name */
    private int f10787g;

    /* renamed from: h, reason: collision with root package name */
    private int f10788h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f10789j;

    /* renamed from: k, reason: collision with root package name */
    private int f10790k;

    /* renamed from: l, reason: collision with root package name */
    private RectF f10791l;

    /* renamed from: m, reason: collision with root package name */
    private float f10792m;

    /* renamed from: n, reason: collision with root package name */
    private String f10793n;

    /* renamed from: o, reason: collision with root package name */
    private Rect f10794o;

    /* renamed from: p, reason: collision with root package name */
    private long f10795p;

    /* renamed from: q, reason: collision with root package name */
    private float f10796q;

    /* renamed from: r, reason: collision with root package name */
    private Paint.FontMetrics f10797r;

    /* renamed from: s, reason: collision with root package name */
    private Drawable f10798s;

    public CountDownView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.f10784d = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f10785e = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.f10786f = Color.parseColor("#66000000");
        this.f10787g = Color.parseColor("#CC000000");
        this.f10788h = -1;
        Paint paint = new Paint();
        this.f10781a = paint;
        paint.setAntiAlias(true);
        this.f10781a.setStrokeCap(Paint.Cap.ROUND);
        this.f10781a.setStyle(Paint.Style.STROKE);
        this.f10781a.setStrokeWidth(this.f10784d);
        Paint paint2 = new Paint(this.f10781a);
        this.f10782b = paint2;
        paint2.setColor(this.f10786f);
        this.f10782b.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f10783c = paint3;
        paint3.setAntiAlias(true);
        this.f10783c.setTextSize(this.f10785e);
        this.f10783c.setColor(this.f10788h);
        this.f10791l = new RectF();
        this.f10794o = new Rect();
        this.f10795p = -1L;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10798s != null && TextUtils.equals("0", this.f10793n)) {
            this.f10798s.setBounds(0, 0, getWidth(), getHeight());
            this.f10798s.draw(canvas);
            return;
        }
        canvas.drawCircle(this.f10791l.centerX(), this.f10791l.centerY(), this.f10790k, this.f10782b);
        this.f10781a.setColor(this.f10787g);
        canvas.drawArc(this.f10791l, 0.0f, 360.0f, false, this.f10781a);
        this.f10781a.setColor(this.f10788h);
        canvas.drawArc(this.f10791l, -90.0f, this.f10792m, false, this.f10781a);
        if (TextUtils.isEmpty(this.f10793n)) {
            return;
        }
        Paint paint = this.f10783c;
        String str = this.f10793n;
        paint.getTextBounds(str, 0, str.length(), this.f10794o);
        this.f10796q = this.f10783c.measureText(this.f10793n);
        this.f10797r = this.f10783c.getFontMetrics();
        String str2 = this.f10793n;
        float centerX = this.f10791l.centerX() - (this.f10796q / 2.0f);
        float centerY = this.f10791l.centerY();
        Paint.FontMetrics fontMetrics = this.f10797r;
        float f2 = fontMetrics.bottom;
        canvas.drawText(str2, centerX, (((f2 - fontMetrics.top) / 2.0f) - f2) + centerY, this.f10783c);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i6, int i9) {
        super.onSizeChanged(i, i4, i6, i9);
        this.i = i;
        this.f10789j = i4;
        a();
    }

    public void refresh(long j6) {
        long j9 = this.f10795p;
        if (j9 >= 0) {
            this.f10792m = ((j6 * 1.0f) / j9) * 360.0f;
            StringBuilder sb = new StringBuilder();
            sb.append((int) Math.ceil((this.f10795p - j6) / 1000.0d));
            this.f10793n = sb.toString();
            postInvalidate();
        }
    }

    public void refreshToEnd() {
        if (this.f10795p > 0) {
            this.f10792m = 360.0f;
            this.f10793n = "0";
            postInvalidate();
        }
    }

    public void setBgColor(int i) {
        this.f10786f = i;
        this.f10782b.setColor(i);
    }

    public void setCountDownEndDrawable(Drawable drawable) {
        this.f10798s = drawable;
        postInvalidate();
    }

    public void setDuration(long j6) {
        this.f10795p = j6;
        StringBuilder sb = new StringBuilder();
        sb.append(j6 / 1000);
        this.f10793n = sb.toString();
    }

    public void setThickInPx(int i) {
        float f2 = i;
        this.f10784d = f2;
        this.f10781a.setStrokeWidth(f2);
        a();
    }

    public void setUnderRingColor(int i) {
        this.f10787g = i;
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10784d = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f10785e = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.f10786f = Color.parseColor("#66000000");
        this.f10787g = Color.parseColor("#CC000000");
        this.f10788h = -1;
        Paint paint = new Paint();
        this.f10781a = paint;
        paint.setAntiAlias(true);
        this.f10781a.setStrokeCap(Paint.Cap.ROUND);
        this.f10781a.setStyle(Paint.Style.STROKE);
        this.f10781a.setStrokeWidth(this.f10784d);
        Paint paint2 = new Paint(this.f10781a);
        this.f10782b = paint2;
        paint2.setColor(this.f10786f);
        this.f10782b.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f10783c = paint3;
        paint3.setAntiAlias(true);
        this.f10783c.setTextSize(this.f10785e);
        this.f10783c.setColor(this.f10788h);
        this.f10791l = new RectF();
        this.f10794o = new Rect();
        this.f10795p = -1L;
    }

    private void a() {
        float f2 = this.f10784d * 0.5f;
        float f9 = 0.0f + f2;
        this.f10791l.set(f9, f9, this.i - f2, this.f10789j - f2);
        this.f10790k = ((int) this.f10791l.width()) >> 1;
    }
}
