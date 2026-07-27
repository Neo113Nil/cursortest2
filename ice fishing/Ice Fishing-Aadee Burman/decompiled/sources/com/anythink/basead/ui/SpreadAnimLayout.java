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
    private Paint f10380a;

    /* renamed from: b, reason: collision with root package name */
    private ValueAnimator f10381b;

    /* renamed from: c, reason: collision with root package name */
    private a f10382c;

    /* renamed from: d, reason: collision with root package name */
    private RectF f10383d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f10384e;

    /* renamed from: f, reason: collision with root package name */
    private int f10385f;

    /* renamed from: g, reason: collision with root package name */
    private int f10386g;

    /* renamed from: h, reason: collision with root package name */
    private int f10387h;
    private Paint i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10388j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10389k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        RectF f10392a;

        /* renamed from: b, reason: collision with root package name */
        int f10393b;
    }

    public SpreadAnimLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f10388j || !this.f10389k) {
            super.draw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        this.f10380a.setAlpha(this.f10382c.f10393b);
        RectF rectF = this.f10382c.f10392a;
        int i = this.f10385f;
        canvas.drawRoundRect(rectF, i, i, this.f10380a);
        RectF rectF2 = this.f10383d;
        int i6 = this.f10385f;
        canvas.drawRoundRect(rectF2, i6, i6, this.i);
        canvas.restoreToCount(saveLayer);
        super.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
        int i9 = this.f10386g;
        setPadding(i9, i9, i9, i9);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f10388j) {
            if (i == 0) {
                post(new Runnable() { // from class: com.anythink.basead.ui.SpreadAnimLayout.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpreadAnimLayout.this.startSpreadAnimation();
                    }
                });
                return;
            }
            ValueAnimator valueAnimator = this.f10381b;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
        }
    }

    public void setMaxSpreadDistance(int i) {
        this.f10386g = i;
    }

    public void setRoundRadius(int i) {
        this.f10385f = i;
    }

    public void startSpreadAnimation() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f10388j = true;
        if (!this.f10389k) {
            this.f10383d = new RectF(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            this.f10384e = new RectF(this.f10383d);
            a aVar = new a();
            this.f10382c = aVar;
            aVar.f10393b = p.f8473b;
            aVar.f10392a = this.f10384e;
            this.f10386g = Math.min(this.f10386g, Math.min((getWidth() - childAt.getWidth()) / 2, (getHeight() - childAt.getHeight()) / 2));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f10381b = ofFloat;
            ofFloat.setDuration(this.f10387h);
            this.f10381b.setRepeatMode(1);
            this.f10381b.setRepeatCount(-1);
            this.f10381b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f10381b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.SpreadAnimLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    SpreadAnimLayout.this.f10382c.f10393b = (int) ((1.0f - floatValue) * 255.0f);
                    SpreadAnimLayout.this.f10382c.f10392a.set(SpreadAnimLayout.this.f10383d);
                    float f3 = -((int) (SpreadAnimLayout.this.f10386g * floatValue));
                    SpreadAnimLayout.this.f10382c.f10392a.inset(f3, f3);
                    SpreadAnimLayout.this.postInvalidate();
                }
            });
            this.f10389k = true;
        }
        this.f10381b.start();
    }

    public SpreadAnimLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpreadAnimLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10388j = true;
        setWillNotDraw(false);
        int color = getResources().getColor(q.a(context, "color_spread", k.f19633d));
        this.f10386g = getResources().getDimensionPixelSize(q.a(getContext(), "myoffer_spread_max_distance_normal", "dimen"));
        this.f10385f = q.a(context, 4.0f);
        this.f10387h = 1000;
        Paint paint = new Paint();
        this.f10380a = paint;
        paint.setAntiAlias(true);
        this.f10380a.setAlpha(p.f8473b);
        this.f10380a.setColor(color);
        Paint paint2 = new Paint(1);
        this.i = paint2;
        paint2.setColor(-1);
        this.i.setStyle(Paint.Style.FILL);
        this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }
}
