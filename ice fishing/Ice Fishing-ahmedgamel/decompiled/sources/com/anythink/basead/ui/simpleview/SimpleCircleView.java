package com.anythink.basead.ui.simpleview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class SimpleCircleView extends View {

    /* renamed from: a, reason: collision with root package name */
    ValueAnimator f12052a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f12053b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12054c;

    /* renamed from: d, reason: collision with root package name */
    private final float f12055d;

    /* renamed from: e, reason: collision with root package name */
    private final float f12056e;

    /* renamed from: com.anythink.basead.ui.simpleview.SimpleCircleView$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SimpleCircleView.this.setScaleX(0.1f);
            SimpleCircleView.this.setScaleY(0.1f);
            SimpleCircleView.this.f12052a = ValueAnimator.ofFloat(0.1f, Math.max((SimpleCircleView.this.getWidth() <= 0 || SimpleCircleView.this.getHeight() <= 0) ? 3.0f : (float) (Math.hypot(SimpleCircleView.this.getWidth() / 2, SimpleCircleView.this.getHeight() / 2) / (Math.min(SimpleCircleView.this.getWidth(), SimpleCircleView.this.getHeight()) / 2)), 3.0f));
            SimpleCircleView.this.f12052a.setDuration(500L);
            SimpleCircleView.this.f12052a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.simpleview.SimpleCircleView.1.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    try {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        SimpleCircleView.this.setScaleX(floatValue);
                        SimpleCircleView.this.setScaleY(floatValue);
                    } catch (Throwable unused) {
                        SimpleCircleView.this.setScaleX(3.0f);
                        SimpleCircleView.this.setScaleY(3.0f);
                    }
                }
            });
            SimpleCircleView.this.f12052a.start();
        }
    }

    public SimpleCircleView(Context context) {
        this(context, null);
    }

    private void a() {
        Paint paint = new Paint();
        this.f12053b = paint;
        paint.setColor(1711276032);
        this.f12053b.setAntiAlias(true);
        post(new AnonymousClass1());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f12052a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.drawCircle(width, height, Math.min(width, height), this.f12053b);
    }

    public SimpleCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12054c = 500L;
        this.f12055d = 0.1f;
        this.f12056e = 3.0f;
        Paint paint = new Paint();
        this.f12053b = paint;
        paint.setColor(1711276032);
        this.f12053b.setAntiAlias(true);
        post(new AnonymousClass1());
    }
}
