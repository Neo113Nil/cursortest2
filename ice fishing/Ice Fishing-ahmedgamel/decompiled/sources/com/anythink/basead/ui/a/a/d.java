package com.anythink.basead.ui.a.a;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class d extends a {

    /* renamed from: e, reason: collision with root package name */
    private int f11200e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f11201f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f11202g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f11203h;
    private Canvas i;

    /* renamed from: j, reason: collision with root package name */
    private RectF f11204j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f11205k;

    /* renamed from: l, reason: collision with root package name */
    private int f11206l;

    /* renamed from: m, reason: collision with root package name */
    private int f11207m;

    /* renamed from: n, reason: collision with root package name */
    private int f11208n;

    /* renamed from: o, reason: collision with root package name */
    private int f11209o;

    /* renamed from: p, reason: collision with root package name */
    private int f11210p;

    /* renamed from: q, reason: collision with root package name */
    private int f11211q;

    public d(View view) {
        super(view);
        if (view == null) {
            return;
        }
        this.f11211q = q.a(view.getContext(), 5.0f);
        this.f11206l = q.a(view.getContext(), 24.0f);
        this.f11209o = q.a(view.getContext(), 30.0f);
        this.f11200e = 20;
        Paint paint = new Paint(1);
        this.f11201f = paint;
        paint.setColor(Color.parseColor("#cfffffff"));
        Paint paint2 = new Paint(1);
        this.f11202g = paint2;
        paint2.setColor(-16777216);
        this.f11202g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint3 = new Paint(1);
        this.f11203h = paint3;
        paint3.setColor(-16777216);
        this.f11201f.setStrokeWidth(this.f11211q);
        this.f11201f.setMaskFilter(new BlurMaskFilter(this.f11200e, BlurMaskFilter.Blur.NORMAL));
        int i = -this.f11211q;
        this.f11207m = i;
        this.f11208n = i - this.f11209o;
    }

    @Override // com.anythink.basead.ui.a.a.a
    public final ValueAnimator e() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(1200L);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.a.a.d.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = d.this.f11193a;
                if (view == null || view.getVisibility() != 0) {
                    return;
                }
                if (d.this.f11205k == null && d.this.i == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d dVar = d.this;
                d.this.f11210p = (int) (((d.this.f11211q * 2) + dVar.f11209o + dVar.f11195c) * floatValue);
                d.this.f11193a.postInvalidate();
            }
        });
        return ofFloat;
    }

    @Override // com.anythink.basead.ui.a.a.a
    public final void f() {
        super.f();
        if (this.f11193a == null || this.f11195c == 0 || this.f11196d == 0) {
            return;
        }
        try {
            int i = (int) (this.f11195c * 0.1d);
            this.f11209o = i;
            this.f11208n = this.f11207m - i;
            RectF rectF = new RectF();
            this.f11204j = rectF;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            int i4 = this.f11195c;
            rectF.right = i4;
            int i6 = this.f11196d;
            rectF.bottom = i6;
            this.f11205k = Bitmap.createBitmap(i4, i6, Bitmap.Config.ARGB_8888);
            this.i = new Canvas(this.f11205k);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public void a(int i, int i4) {
        if (this.f11195c != i || this.f11196d != i4) {
            f();
        }
        super.a(i, i4);
    }

    @Override // com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public void a(Canvas canvas) {
        ValueAnimator valueAnimator;
        super.a(canvas);
        View view = this.f11193a;
        if (view == null || view.getVisibility() != 0 || (valueAnimator = this.f11194b) == null || !valueAnimator.isStarted() || this.f11205k == null || this.i == null) {
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, this.f11195c, this.f11196d, null, 31);
        this.f11205k.eraseColor(0);
        int i = this.f11207m;
        int i4 = this.f11210p;
        canvas.drawLine(i + i4, 0.0f, this.f11208n + i4, this.f11196d, this.f11201f);
        Canvas canvas2 = this.i;
        RectF rectF = this.f11204j;
        int i6 = this.f11206l;
        canvas2.drawRoundRect(rectF, i6, i6, this.f11203h);
        canvas.drawBitmap(this.f11205k, 0.0f, 0.0f, this.f11202g);
        canvas.restoreToCount(saveLayer);
    }
}
