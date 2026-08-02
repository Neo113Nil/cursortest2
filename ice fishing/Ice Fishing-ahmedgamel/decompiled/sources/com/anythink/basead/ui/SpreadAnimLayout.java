package com.anythink.basead.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class SpreadAnimLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private Paint f11166a;

    /* renamed from: b, reason: collision with root package name */
    private ValueAnimator f11167b;

    /* renamed from: c, reason: collision with root package name */
    private a f11168c;

    /* renamed from: d, reason: collision with root package name */
    private RectF f11169d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f11170e;

    /* renamed from: f, reason: collision with root package name */
    private int f11171f;

    /* renamed from: g, reason: collision with root package name */
    private int f11172g;

    /* renamed from: h, reason: collision with root package name */
    private int f11173h;
    private Paint i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11174j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11175k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        RectF f11178a;

        /* renamed from: b, reason: collision with root package name */
        int f11179b;
    }

    public SpreadAnimLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f11174j || !this.f11175k) {
            super.draw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        this.f11166a.setAlpha(this.f11168c.f11179b);
        RectF rectF = this.f11168c.f11178a;
        int i = this.f11171f;
        canvas.drawRoundRect(rectF, i, i, this.f11166a);
        RectF rectF2 = this.f11169d;
        int i4 = this.f11171f;
        canvas.drawRoundRect(rectF2, i4, i4, this.i);
        canvas.restoreToCount(saveLayer);
        super.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int i6 = this.f11172g;
        setPadding(i6, i6, i6, i6);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f11174j) {
            if (i == 0) {
                post(new Runnable() { // from class: com.anythink.basead.ui.SpreadAnimLayout.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpreadAnimLayout.this.startSpreadAnimation();
                    }
                });
                return;
            }
            ValueAnimator valueAnimator = this.f11167b;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
        }
    }

    public void setMaxSpreadDistance(int i) {
        this.f11172g = i;
    }

    public void setRoundRadius(int i) {
        this.f11171f = i;
    }

    public void startSpreadAnimation() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f11174j = true;
        if (!this.f11175k) {
            this.f11169d = new RectF(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            this.f11170e = new RectF(this.f11169d);
            a aVar = new a();
            this.f11168c = aVar;
            aVar.f11179b = p.f9259b;
            aVar.f11178a = this.f11170e;
            this.f11172g = Math.min(this.f11172g, Math.min((getWidth() - childAt.getWidth()) / 2, (getHeight() - childAt.getHeight()) / 2));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f11167b = ofFloat;
            ofFloat.setDuration(this.f11173h);
            this.f11167b.setRepeatMode(1);
            this.f11167b.setRepeatCount(-1);
            this.f11167b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f11167b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.SpreadAnimLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    SpreadAnimLayout.this.f11168c.f11179b = (int) ((1.0f - floatValue) * 255.0f);
                    SpreadAnimLayout.this.f11168c.f11178a.set(SpreadAnimLayout.this.f11169d);
                    float f2 = -((int) (SpreadAnimLayout.this.f11172g * floatValue));
                    SpreadAnimLayout.this.f11168c.f11178a.inset(f2, f2);
                    SpreadAnimLayout.this.postInvalidate();
                }
            });
            this.f11175k = true;
        }
        this.f11167b.start();
    }

    public SpreadAnimLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpreadAnimLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11174j = true;
        setWillNotDraw(false);
        int color = getResources().getColor(q.a(context, "color_spread", k.f20420d));
        this.f11172g = getResources().getDimensionPixelSize(q.a(getContext(), "myoffer_spread_max_distance_normal", "dimen"));
        this.f11171f = q.a(context, 4.0f);
        this.f11173h = 1000;
        Paint paint = new Paint();
        this.f11166a = paint;
        paint.setAntiAlias(true);
        this.f11166a.setAlpha(p.f9259b);
        this.f11166a.setColor(color);
        Paint paint2 = new Paint(1);
        this.i = paint2;
        paint2.setColor(-1);
        this.i.setStyle(Paint.Style.FILL);
        this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }
}
