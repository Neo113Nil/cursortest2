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
    public float f40282a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f40283b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f40284c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f40285d;

    /* renamed from: e, reason: collision with root package name */
    public float f40286e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f40289h;
    public PorterDuffColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f40290j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40287f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40288g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f40291k = PorterDuff.Mode.SRC_IN;

    public C4942a(ColorStateList colorStateList, float f3) {
        this.f40282a = f3;
        Paint paint = new Paint(5);
        this.f40283b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f40289h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f40289h.getDefaultColor()));
        this.f40284c = new RectF();
        this.f40285d = new Rect();
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
        RectF rectF = this.f40284c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f40285d;
        rect2.set(rect);
        if (this.f40287f) {
            rect2.inset((int) Math.ceil(b.a(this.f40286e, this.f40282a, this.f40288g)), (int) Math.ceil(b.b(this.f40286e, this.f40282a, this.f40288g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z3;
        Paint paint = this.f40283b;
        if (this.i == null || paint.getColorFilter() != null) {
            z3 = false;
        } else {
            paint.setColorFilter(this.i);
            z3 = true;
        }
        RectF rectF = this.f40284c;
        float f3 = this.f40282a;
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
        outline.setRoundRect(this.f40285d, this.f40282a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f40290j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f40289h;
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
        ColorStateList colorStateList = this.f40289h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f40283b;
        boolean z3 = colorForState != paint.getColor();
        if (z3) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f40290j;
        if (colorStateList2 == null || (mode = this.f40291k) == null) {
            return z3;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f40283b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40283b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f40290j = colorStateList;
        this.i = a(colorStateList, this.f40291k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f40291k = mode;
        this.i = a(this.f40290j, mode);
        invalidateSelf();
    }
}
