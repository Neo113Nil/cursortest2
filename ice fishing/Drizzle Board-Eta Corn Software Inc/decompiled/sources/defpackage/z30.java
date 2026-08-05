package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class z30 extends Drawable {
    public final RectF MdtA4re8;
    public final Paint NCTxEWno;
    public ColorStateList Qr9iLBAD;
    public float VgvYg0wo;
    public ColorStateList eVhOlqcC;
    public PorterDuffColorFilter jb9XjC4I;
    public float qoPGr6Ce;
    public final Rect wxUZMvaN;
    public boolean P7K7Inc8 = false;
    public boolean b2ZJblxo = true;
    public PorterDuff.Mode k3x7lurq = PorterDuff.Mode.SRC_IN;

    public z30(ColorStateList colorStateList, float f) {
        this.qoPGr6Ce = f;
        Paint paint = new Paint(5);
        this.NCTxEWno = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.Qr9iLBAD = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.Qr9iLBAD.getDefaultColor()));
        this.MdtA4re8 = new RectF();
        this.wxUZMvaN = new Rect();
    }

    public final void NCTxEWno(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.MdtA4re8;
        rectF.set(f, f2, f3, f4);
        Rect rect2 = this.wxUZMvaN;
        rect2.set(rect);
        if (this.P7K7Inc8) {
            rect2.inset((int) Math.ceil(a40.qoPGr6Ce(this.VgvYg0wo, this.qoPGr6Ce, this.b2ZJblxo)), (int) Math.ceil(a40.NCTxEWno(this.VgvYg0wo, this.qoPGr6Ce, this.b2ZJblxo)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.jb9XjC4I;
        Paint paint = this.NCTxEWno;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.jb9XjC4I);
            z = true;
        }
        RectF rectF = this.MdtA4re8;
        float f = this.qoPGr6Ce;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.wxUZMvaN, this.qoPGr6Ce);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.eVhOlqcC;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.Qr9iLBAD;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        NCTxEWno(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.Qr9iLBAD;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.NCTxEWno;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.eVhOlqcC;
        if (colorStateList2 == null || (mode = this.k3x7lurq) == null) {
            return z;
        }
        this.jb9XjC4I = qoPGr6Ce(colorStateList2, mode);
        return true;
    }

    public final PorterDuffColorFilter qoPGr6Ce(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.NCTxEWno.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.NCTxEWno.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.eVhOlqcC = colorStateList;
        this.jb9XjC4I = qoPGr6Ce(colorStateList, this.k3x7lurq);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.k3x7lurq = mode;
        this.jb9XjC4I = qoPGr6Ce(this.eVhOlqcC, mode);
        invalidateSelf();
    }
}
