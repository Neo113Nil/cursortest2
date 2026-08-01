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
    private Paint f9995a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f9996b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f9997c;

    /* renamed from: d, reason: collision with root package name */
    private float f9998d;

    /* renamed from: e, reason: collision with root package name */
    private float f9999e;

    /* renamed from: f, reason: collision with root package name */
    private int f10000f;

    /* renamed from: g, reason: collision with root package name */
    private int f10001g;

    /* renamed from: h, reason: collision with root package name */
    private int f10002h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f10003j;

    /* renamed from: k, reason: collision with root package name */
    private int f10004k;

    /* renamed from: l, reason: collision with root package name */
    private RectF f10005l;

    /* renamed from: m, reason: collision with root package name */
    private float f10006m;

    /* renamed from: n, reason: collision with root package name */
    private String f10007n;

    /* renamed from: o, reason: collision with root package name */
    private Rect f10008o;

    /* renamed from: p, reason: collision with root package name */
    private long f10009p;

    /* renamed from: q, reason: collision with root package name */
    private float f10010q;

    /* renamed from: r, reason: collision with root package name */
    private Paint.FontMetrics f10011r;

    /* renamed from: s, reason: collision with root package name */
    private Drawable f10012s;

    public CountDownView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.f9998d = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f9999e = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.f10000f = Color.parseColor("#66000000");
        this.f10001g = Color.parseColor("#CC000000");
        this.f10002h = -1;
        Paint paint = new Paint();
        this.f9995a = paint;
        paint.setAntiAlias(true);
        this.f9995a.setStrokeCap(Paint.Cap.ROUND);
        this.f9995a.setStyle(Paint.Style.STROKE);
        this.f9995a.setStrokeWidth(this.f9998d);
        Paint paint2 = new Paint(this.f9995a);
        this.f9996b = paint2;
        paint2.setColor(this.f10000f);
        this.f9996b.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f9997c = paint3;
        paint3.setAntiAlias(true);
        this.f9997c.setTextSize(this.f9999e);
        this.f9997c.setColor(this.f10002h);
        this.f10005l = new RectF();
        this.f10008o = new Rect();
        this.f10009p = -1L;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10012s != null && TextUtils.equals("0", this.f10007n)) {
            this.f10012s.setBounds(0, 0, getWidth(), getHeight());
            this.f10012s.draw(canvas);
            return;
        }
        canvas.drawCircle(this.f10005l.centerX(), this.f10005l.centerY(), this.f10004k, this.f9996b);
        this.f9995a.setColor(this.f10001g);
        canvas.drawArc(this.f10005l, 0.0f, 360.0f, false, this.f9995a);
        this.f9995a.setColor(this.f10002h);
        canvas.drawArc(this.f10005l, -90.0f, this.f10006m, false, this.f9995a);
        if (TextUtils.isEmpty(this.f10007n)) {
            return;
        }
        Paint paint = this.f9997c;
        String str = this.f10007n;
        paint.getTextBounds(str, 0, str.length(), this.f10008o);
        this.f10010q = this.f9997c.measureText(this.f10007n);
        this.f10011r = this.f9997c.getFontMetrics();
        String str2 = this.f10007n;
        float centerX = this.f10005l.centerX() - (this.f10010q / 2.0f);
        float centerY = this.f10005l.centerY();
        Paint.FontMetrics fontMetrics = this.f10011r;
        float f3 = fontMetrics.bottom;
        canvas.drawText(str2, centerX, (((f3 - fontMetrics.top) / 2.0f) - f3) + centerY, this.f9997c);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i6, int i9, int i10) {
        super.onSizeChanged(i, i6, i9, i10);
        this.i = i;
        this.f10003j = i6;
        a();
    }

    public void refresh(long j6) {
        long j9 = this.f10009p;
        if (j9 >= 0) {
            this.f10006m = ((j6 * 1.0f) / j9) * 360.0f;
            StringBuilder sb = new StringBuilder();
            sb.append((int) Math.ceil((this.f10009p - j6) / 1000.0d));
            this.f10007n = sb.toString();
            postInvalidate();
        }
    }

    public void refreshToEnd() {
        if (this.f10009p > 0) {
            this.f10006m = 360.0f;
            this.f10007n = "0";
            postInvalidate();
        }
    }

    public void setBgColor(int i) {
        this.f10000f = i;
        this.f9996b.setColor(i);
    }

    public void setCountDownEndDrawable(Drawable drawable) {
        this.f10012s = drawable;
        postInvalidate();
    }

    public void setDuration(long j6) {
        this.f10009p = j6;
        StringBuilder sb = new StringBuilder();
        sb.append(j6 / 1000);
        this.f10007n = sb.toString();
    }

    public void setThickInPx(int i) {
        float f3 = i;
        this.f9998d = f3;
        this.f9995a.setStrokeWidth(f3);
        a();
    }

    public void setUnderRingColor(int i) {
        this.f10001g = i;
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9998d = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f9999e = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.f10000f = Color.parseColor("#66000000");
        this.f10001g = Color.parseColor("#CC000000");
        this.f10002h = -1;
        Paint paint = new Paint();
        this.f9995a = paint;
        paint.setAntiAlias(true);
        this.f9995a.setStrokeCap(Paint.Cap.ROUND);
        this.f9995a.setStyle(Paint.Style.STROKE);
        this.f9995a.setStrokeWidth(this.f9998d);
        Paint paint2 = new Paint(this.f9995a);
        this.f9996b = paint2;
        paint2.setColor(this.f10000f);
        this.f9996b.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f9997c = paint3;
        paint3.setAntiAlias(true);
        this.f9997c.setTextSize(this.f9999e);
        this.f9997c.setColor(this.f10002h);
        this.f10005l = new RectF();
        this.f10008o = new Rect();
        this.f10009p = -1L;
    }

    private void a() {
        float f3 = this.f9998d * 0.5f;
        float f9 = 0.0f + f3;
        this.f10005l.set(f9, f9, this.i - f3, this.f10003j - f3);
        this.f10004k = ((int) this.f10005l.width()) >> 1;
    }
}
