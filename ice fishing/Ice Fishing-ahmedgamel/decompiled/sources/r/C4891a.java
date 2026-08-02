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
public final class C4891a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f40096a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f40097b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f40098c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f40099d;

    /* renamed from: e, reason: collision with root package name */
    public float f40100e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f40103h;
    public PorterDuffColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f40104j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40101f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40102g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f40105k = PorterDuff.Mode.SRC_IN;

    public C4891a(ColorStateList colorStateList, float f2) {
        this.f40096a = f2;
        Paint paint = new Paint(5);
        this.f40097b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f40103h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f40103h.getDefaultColor()));
        this.f40098c = new RectF();
        this.f40099d = new Rect();
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
        RectF rectF = this.f40098c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f40099d;
        rect2.set(rect);
        if (this.f40101f) {
            rect2.inset((int) Math.ceil(b.a(this.f40100e, this.f40096a, this.f40102g)), (int) Math.ceil(b.b(this.f40100e, this.f40096a, this.f40102g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z6;
        Paint paint = this.f40097b;
        if (this.i == null || paint.getColorFilter() != null) {
            z6 = false;
        } else {
            paint.setColorFilter(this.i);
            z6 = true;
        }
        RectF rectF = this.f40098c;
        float f2 = this.f40096a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z6) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f40099d, this.f40096a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f40104j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f40103h;
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
        ColorStateList colorStateList = this.f40103h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f40097b;
        boolean z6 = colorForState != paint.getColor();
        if (z6) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f40104j;
        if (colorStateList2 == null || (mode = this.f40105k) == null) {
            return z6;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f40097b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40097b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f40104j = colorStateList;
        this.i = a(colorStateList, this.f40105k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f40105k = mode;
        this.i = a(this.f40104j, mode);
        invalidateSelf();
    }
}
