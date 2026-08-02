package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DreamLightsDrawable extends Drawable {
    public final Drawable darkeningDrawable;
    public int eyeAlpha;
    public Paint leftEyePaint;
    public Paint rightEyePaint;
    public static final PointF RIGHT_EYE = new PointF(0.825f, 0.44285715f);
    public static final PointF LEFT_EYE = new PointF(0.586f, 0.53015876f);

    public DreamLightsDrawable(Context context) {
        context.getClass();
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.styled_card_background, null);
        drawableCompat.getClass();
        Drawable mutate = drawableCompat.mutate();
        mutate.setTint(-16777216);
        mutate.setAlpha(0);
        this.darkeningDrawable = mutate;
    }

    public static Paint createEyePaint(int i, int i2, PointF pointF, float f) {
        Paint paint = new Paint();
        paint.setShader(new RadialGradient(pointF.x * i, i2 * pointF.y, f, new int[]{-1, 0}, (float[]) null, Shader.TileMode.CLAMP));
        return paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Paint paint = this.leftEyePaint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leftEyePaint");
            throw null;
        }
        paint.setAlpha(this.eyeAlpha);
        Paint paint2 = this.rightEyePaint;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightEyePaint");
            throw null;
        }
        paint2.setAlpha(this.eyeAlpha);
        int i = this.eyeAlpha / 2;
        Drawable drawable = this.darkeningDrawable;
        drawable.setAlpha(i);
        drawable.draw(canvas);
        Paint paint3 = this.leftEyePaint;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leftEyePaint");
            throw null;
        }
        canvas.drawPaint(paint3);
        Paint paint4 = this.rightEyePaint;
        if (paint4 != null) {
            canvas.drawPaint(paint4);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("rightEyePaint");
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.darkeningDrawable.setBounds(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        float f = i5 * 0.1f;
        this.leftEyePaint = createEyePaint(i5, i6, LEFT_EYE, f);
        this.rightEyePaint = createEyePaint(i5, i6, RIGHT_EYE, f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
