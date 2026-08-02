package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R$styleable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.R;

/* loaded from: classes3.dex */
public final class DrawerArrowDrawable extends Drawable {
    public static final float ARROW_HEAD_ANGLE = (float) Math.toRadians(45.0d);
    public final float mArrowHeadLength;
    public final float mArrowShaftLength;
    public final float mBarGap;
    public final float mBarLength;
    public final int mDirection;
    public final float mMaxCutForBarSize;
    public final Paint mPaint;
    public final Path mPath;
    public float mProgress;
    public final int mSize;
    public final boolean mSpin;

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.mPaint = paint;
        this.mPath = new Path();
        this.mDirection = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R$styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, RecyclerView.DECELERATION_RATE);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.mMaxCutForBarSize = (float) (Math.cos(ARROW_HEAD_ANGLE) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.mSpin != z) {
            this.mSpin = z;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, RecyclerView.DECELERATION_RATE));
        if (round != this.mBarGap) {
            this.mBarGap = round;
            invalidateSelf();
        }
        this.mSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.mBarLength = Math.round(obtainStyledAttributes.getDimension(2, RecyclerView.DECELERATION_RATE));
        this.mArrowHeadLength = Math.round(obtainStyledAttributes.getDimension(0, RecyclerView.DECELERATION_RATE));
        this.mArrowShaftLength = obtainStyledAttributes.getDimension(1, RecyclerView.DECELERATION_RATE);
        obtainStyledAttributes.recycle();
    }

    public static float lerp(float f, float f2, float f3) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(f2, f, f3, f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z = false;
        int i = this.mDirection;
        if (i != 0 && (i == 1 || (i == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z = true;
        }
        float f = this.mArrowHeadLength;
        float sqrt = (float) Math.sqrt(f * f * 2.0f);
        float f2 = this.mProgress;
        float f3 = this.mBarLength;
        float lerp = lerp(f3, sqrt, f2);
        float lerp2 = lerp(f3, this.mArrowShaftLength, this.mProgress);
        float f4 = this.mProgress;
        float f5 = this.mMaxCutForBarSize;
        float round = Math.round(lerp(RecyclerView.DECELERATION_RATE, f5, f4));
        float lerp3 = lerp(RecyclerView.DECELERATION_RATE, ARROW_HEAD_ANGLE, this.mProgress);
        float lerp4 = lerp(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.mProgress);
        double d = lerp;
        double d2 = lerp3;
        float round2 = Math.round(Math.cos(d2) * d);
        float round3 = Math.round(Math.sin(d2) * d);
        Path path = this.mPath;
        path.rewind();
        Paint paint = this.mPaint;
        float strokeWidth = paint.getStrokeWidth();
        float f6 = this.mBarGap;
        float lerp5 = lerp(strokeWidth + f6, -f5, this.mProgress);
        float f7 = (-lerp2) / 2.0f;
        path.moveTo(f7 + round, RecyclerView.DECELERATION_RATE);
        path.rLineTo(lerp2 - (round * 2.0f), RecyclerView.DECELERATION_RATE);
        path.moveTo(f7, lerp5);
        path.rLineTo(round2, round3);
        path.moveTo(f7, -lerp5);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        canvas.translate(bounds.centerX(), (paint.getStrokeWidth() * 1.5f) + f6 + ((((int) ((bounds.height() - (3.0f * r4)) - (f6 * 2.0f))) / 4) * 2));
        if (this.mSpin) {
            canvas.rotate(lerp4 * (z ? -1 : 1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.mSize;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.mSize;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.mPaint;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f) {
        if (this.mProgress != f) {
            this.mProgress = f;
            invalidateSelf();
        }
    }
}
