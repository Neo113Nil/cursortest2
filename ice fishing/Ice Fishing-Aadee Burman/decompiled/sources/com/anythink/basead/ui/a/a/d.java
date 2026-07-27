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
    private int f10414e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f10415f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f10416g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f10417h;
    private Canvas i;

    /* renamed from: j, reason: collision with root package name */
    private RectF f10418j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f10419k;

    /* renamed from: l, reason: collision with root package name */
    private int f10420l;

    /* renamed from: m, reason: collision with root package name */
    private int f10421m;

    /* renamed from: n, reason: collision with root package name */
    private int f10422n;

    /* renamed from: o, reason: collision with root package name */
    private int f10423o;

    /* renamed from: p, reason: collision with root package name */
    private int f10424p;

    /* renamed from: q, reason: collision with root package name */
    private int f10425q;

    public d(View view) {
        super(view);
        if (view == null) {
            return;
        }
        this.f10425q = q.a(view.getContext(), 5.0f);
        this.f10420l = q.a(view.getContext(), 24.0f);
        this.f10423o = q.a(view.getContext(), 30.0f);
        this.f10414e = 20;
        Paint paint = new Paint(1);
        this.f10415f = paint;
        paint.setColor(Color.parseColor("#cfffffff"));
        Paint paint2 = new Paint(1);
        this.f10416g = paint2;
        paint2.setColor(-16777216);
        this.f10416g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint3 = new Paint(1);
        this.f10417h = paint3;
        paint3.setColor(-16777216);
        this.f10415f.setStrokeWidth(this.f10425q);
        this.f10415f.setMaskFilter(new BlurMaskFilter(this.f10414e, BlurMaskFilter.Blur.NORMAL));
        int i = -this.f10425q;
        this.f10421m = i;
        this.f10422n = i - this.f10423o;
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
                View view = d.this.f10407a;
                if (view == null || view.getVisibility() != 0) {
                    return;
                }
                if (d.this.f10419k == null && d.this.i == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d dVar = d.this;
                d.this.f10424p = (int) (((d.this.f10425q * 2) + dVar.f10423o + dVar.f10409c) * floatValue);
                d.this.f10407a.postInvalidate();
            }
        });
        return ofFloat;
    }

    @Override // com.anythink.basead.ui.a.a.a
    public final void f() {
        super.f();
        if (this.f10407a == null || this.f10409c == 0 || this.f10410d == 0) {
            return;
        }
        try {
            int i = (int) (this.f10409c * 0.1d);
            this.f10423o = i;
            this.f10422n = this.f10421m - i;
            RectF rectF = new RectF();
            this.f10418j = rectF;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            int i6 = this.f10409c;
            rectF.right = i6;
            int i9 = this.f10410d;
            rectF.bottom = i9;
            this.f10419k = Bitmap.createBitmap(i6, i9, Bitmap.Config.ARGB_8888);
            this.i = new Canvas(this.f10419k);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public void a(int i, int i6) {
        if (this.f10409c != i || this.f10410d != i6) {
            f();
        }
        super.a(i, i6);
    }

    @Override // com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public void a(Canvas canvas) {
        ValueAnimator valueAnimator;
        super.a(canvas);
        View view = this.f10407a;
        if (view == null || view.getVisibility() != 0 || (valueAnimator = this.f10408b) == null || !valueAnimator.isStarted() || this.f10419k == null || this.i == null) {
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, this.f10409c, this.f10410d, null, 31);
        this.f10419k.eraseColor(0);
        int i = this.f10421m;
        int i6 = this.f10424p;
        canvas.drawLine(i + i6, 0.0f, this.f10422n + i6, this.f10410d, this.f10415f);
        Canvas canvas2 = this.i;
        RectF rectF = this.f10418j;
        int i9 = this.f10420l;
        canvas2.drawRoundRect(rectF, i9, i9, this.f10417h);
        canvas.drawBitmap(this.f10419k, 0.0f, 0.0f, this.f10416g);
        canvas.restoreToCount(saveLayer);
    }
}
