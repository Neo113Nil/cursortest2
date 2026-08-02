package com.miteksystems.misnap.workflow.view;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.camera.view.ScreenFlashView;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import com.miteksystems.misnap.workflow.R$styleable;
import com.squareup.cash.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class VisualizerView extends View {
    public static final /* synthetic */ int $r8$clinit = 0;
    public float a;
    public float b;
    public float c;
    public int d;
    public int e;
    public final Paint f;
    public float g;
    public float h;
    public boolean i;
    public ValueAnimator j;
    public final ScreenFlashView.AnonymousClass2 k;
    public final DefaultTimeBar$$ExternalSyntheticLambda1 l;
    public boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VisualizerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        this.f = paint;
        this.j = new ValueAnimator();
        this.k = new ScreenFlashView.AnonymousClass2(this, 1);
        this.l = new DefaultTimeBar$$ExternalSyntheticLambda1(this, 11);
        this.m = getResources().getBoolean(R.bool.misnapWorkflowVisualizerViewDefaultForceVisualization);
        context.getColor(R.color.colorVisualizerViewCircle);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.VisualizerView, i, i2);
        try {
            setCircleColor(obtainStyledAttributes.getColor(0, context.getColor(R.color.colorVisualizerViewCircle)));
            this.m = obtainStyledAttributes.getBoolean(1, obtainStyledAttributes.getResources().getBoolean(R.bool.misnapWorkflowVisualizerViewDefaultForceVisualization));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(float f, int i) {
        if (this.j.isRunning()) {
            this.j.cancel();
        }
        ValueAnimator valueAnimator = this.j;
        DefaultTimeBar$$ExternalSyntheticLambda1 defaultTimeBar$$ExternalSyntheticLambda1 = this.l;
        valueAnimator.removeUpdateListener(defaultTimeBar$$ExternalSyntheticLambda1);
        ValueAnimator valueAnimator2 = this.j;
        ScreenFlashView.AnonymousClass2 anonymousClass2 = this.k;
        valueAnimator2.removeListener(anonymousClass2);
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("Radius", this.b, f), PropertyValuesHolder.ofInt("Alpha", this.d, i));
        ofPropertyValuesHolder.setDuration(100L);
        ofPropertyValuesHolder.addUpdateListener(defaultTimeBar$$ExternalSyntheticLambda1);
        ofPropertyValuesHolder.addListener(anonymousClass2);
        ofPropertyValuesHolder.start();
        this.j = ofPropertyValuesHolder;
        this.b = f;
        this.d = i;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.j.isRunning()) {
            this.j.cancel();
        }
        this.j.removeUpdateListener(this.l);
        this.j.removeListener(this.k);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int i = this.e;
        Paint paint = this.f;
        paint.setAlpha(i);
        canvas.drawCircle(this.g, this.h, this.c, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.g = (i3 - i) / 2.0f;
        this.h = (i4 - i2) / 2.0f;
    }

    public final void reset() {
        this.c = RecyclerView.DECELERATION_RATE;
        this.e = 0;
        this.a = RecyclerView.DECELERATION_RATE;
        int width = getWidth();
        int height = getHeight();
        if (width > height) {
            width = height;
        }
        a((width / 2) * 0.05f, 127);
    }

    public final void setCircleColor(int i) {
        this.f.setColor(i);
        postInvalidate();
    }

    public final void setForceVisualization(boolean z) {
        this.m = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VisualizerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VisualizerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VisualizerView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ VisualizerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
