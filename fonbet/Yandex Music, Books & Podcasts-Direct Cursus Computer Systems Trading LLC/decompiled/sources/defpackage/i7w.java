package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class i7w extends Drawable {
    public final /* synthetic */ int a;
    public final Paint b;
    public final RectF c;
    public final float d;
    public int e;

    public i7w(int i, float f, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                Paint paint = new Paint();
                this.b = paint;
                paint.setColor(i);
                paint.setStrokeWidth(f);
                paint.setStyle(Paint.Style.STROKE);
                paint.setAntiAlias(true);
                this.c = new RectF();
                this.e = 180;
                this.d = 0.2f;
                break;
            default:
                Paint paint2 = new Paint();
                this.b = paint2;
                paint2.setColor(i);
                paint2.setStrokeWidth(f);
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setAntiAlias(true);
                this.c = new RectF();
                this.e = 180;
                this.d = 0.2f;
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                canvas.save();
                Rect bounds = getBounds();
                float min = Math.min(bounds.width(), bounds.height());
                Paint paint = this.b;
                int strokeWidth = (int) ((0.5f - this.d) * (min - paint.getStrokeWidth()));
                if (strokeWidth > 0) {
                    float exactCenterX = bounds.exactCenterX();
                    float exactCenterY = bounds.exactCenterY();
                    canvas.rotate(((System.currentTimeMillis() % 1000) / 1000.0f) * 360.0f, exactCenterX, exactCenterY);
                    float f = strokeWidth;
                    RectF rectF = this.c;
                    rectF.set(exactCenterX - f, exactCenterY - f, exactCenterX + f, exactCenterY + f);
                    canvas.drawArc(rectF, 0.0f, this.e + 10, false, paint);
                }
                canvas.restore();
                break;
            default:
                canvas.save();
                Rect bounds2 = getBounds();
                float min2 = Math.min(bounds2.width(), bounds2.height());
                Paint paint2 = this.b;
                int strokeWidth2 = (int) ((0.5f - this.d) * (min2 - paint2.getStrokeWidth()));
                if (strokeWidth2 > 0) {
                    float exactCenterX2 = bounds2.exactCenterX();
                    float exactCenterY2 = bounds2.exactCenterY();
                    canvas.rotate(((System.currentTimeMillis() % 1000) / 1000.0f) * 360.0f, exactCenterX2, exactCenterY2);
                    float f2 = strokeWidth2;
                    RectF rectF2 = this.c;
                    rectF2.set(exactCenterX2 - f2, exactCenterY2 - f2, exactCenterX2 + f2, exactCenterY2 + f2);
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, 0.0f, this.e + 10, false, paint2);
                } else {
                    canvas2 = canvas;
                }
                canvas2.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        switch (this.a) {
        }
        return this.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int i = this.a;
        Paint paint = this.b;
        switch (i) {
            case 0:
                jyr jyrVar = sht.a;
                paint.getClass();
                if (paint.getAlpha() == 255 && paint.getColorFilter() == null) {
                    break;
                }
                break;
            default:
                paint.getClass();
                if (paint.getAlpha() == 255 && paint.getColorFilter() == null) {
                    break;
                }
                break;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i);
                break;
            default:
                this.b.setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.b.setColorFilter(colorFilter);
                break;
            default:
                this.b.setColorFilter(colorFilter);
                break;
        }
    }
}
