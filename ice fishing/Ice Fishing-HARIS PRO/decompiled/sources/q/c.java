package q;

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

/* loaded from: classes.dex */
public final class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f4224a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f4225b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f4226c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4227d;
    public float e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f4230h;
    public PorterDuffColorFilter i;
    public ColorStateList j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4228f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4229g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f4231k = PorterDuff.Mode.SRC_IN;

    public c(ColorStateList colorStateList, float f2) {
        this.f4224a = f2;
        Paint paint = new Paint(5);
        this.f4225b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f4230h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f4230h.getDefaultColor()));
        this.f4226c = new RectF();
        this.f4227d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f4226c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f4227d;
        rect2.set(rect);
        if (this.f4228f) {
            rect2.inset((int) Math.ceil(d.a(this.e, this.f4224a, this.f4229g)), (int) Math.ceil(d.b(this.e, this.f4224a, this.f4229g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.f4225b;
        if (this.i == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.i);
            z2 = true;
        }
        RectF rectF = this.f4226c;
        float f2 = this.f4224a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f4227d, this.f4224a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f4230h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f4230h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f4225b;
        boolean z2 = colorForState != paint.getColor();
        if (z2) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.f4231k) == null) {
            return z2;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f4225b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4225b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(colorStateList, this.f4231k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f4231k = mode;
        this.i = a(this.j, mode);
        invalidateSelf();
    }
}
