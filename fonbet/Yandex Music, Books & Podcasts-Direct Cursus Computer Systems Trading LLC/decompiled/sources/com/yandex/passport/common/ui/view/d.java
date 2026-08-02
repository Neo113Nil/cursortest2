package com.yandex.passport.common.ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import defpackage.hr2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class d extends View {
    public static final /* synthetic */ int d = 0;
    public float a;
    public final Paint b;
    public final float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context) {
        super(context);
        context.getClass();
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(8.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.b = paint;
        this.c = 270.0f;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.c);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new hr2(18, this));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, CameraProperty.ROTATION, 0.0f, 360.0f);
        ofFloat2.setDuration(2000L);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(1);
        ofFloat2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final int getColor() {
        return this.b.getColor();
    }

    public final int getColorResource() {
        throw new UnsupportedOperationException("Property does not have a getter");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float min = Integer.min(getWidth(), getHeight());
        Paint paint = this.b;
        float strokeWidth = (min - paint.getStrokeWidth()) / 2;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.drawArc(width - strokeWidth, height - strokeWidth, width + strokeWidth, height + strokeWidth, -90.0f, this.a, false, paint);
    }

    public final void setColor(int i) {
        this.b.setColor(i);
        invalidate();
    }

    public final void setColorResource(int i) {
        setColor(getContext().getResources().getColor(i));
        invalidate();
    }
}
