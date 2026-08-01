package r;

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

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4942a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f40285a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f40286b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f40287c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f40288d;

    /* renamed from: e, reason: collision with root package name */
    public float f40289e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f40292h;
    public PorterDuffColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f40293j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40290f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40291g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f40294k = PorterDuff.Mode.SRC_IN;

    public C4942a(ColorStateList colorStateList, float f3) {
        this.f40285a = f3;
        Paint paint = new Paint(5);
        this.f40286b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f40292h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f40292h.getDefaultColor()));
        this.f40287c = new RectF();
        this.f40288d = new Rect();
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
        RectF rectF = this.f40287c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f40288d;
        rect2.set(rect);
        if (this.f40290f) {
            rect2.inset((int) Math.ceil(b.a(this.f40289e, this.f40285a, this.f40291g)), (int) Math.ceil(b.b(this.f40289e, this.f40285a, this.f40291g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z3;
        Paint paint = this.f40286b;
        if (this.i == null || paint.getColorFilter() != null) {
            z3 = false;
        } else {
            paint.setColorFilter(this.i);
            z3 = true;
        }
        RectF rectF = this.f40287c;
        float f3 = this.f40285a;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        if (z3) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f40288d, this.f40285a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f40293j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f40292h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f40292h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f40286b;
        boolean z3 = colorForState != paint.getColor();
        if (z3) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f40293j;
        if (colorStateList2 == null || (mode = this.f40294k) == null) {
            return z3;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f40286b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40286b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f40293j = colorStateList;
        this.i = a(colorStateList, this.f40294k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f40294k = mode;
        this.i = a(this.f40293j, mode);
        invalidateSelf();
    }
}
