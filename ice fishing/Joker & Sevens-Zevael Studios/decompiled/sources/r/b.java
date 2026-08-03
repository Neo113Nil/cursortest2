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

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f5884a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f5885b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f5886c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f5887d;

    /* renamed from: e, reason: collision with root package name */
    public float f5888e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f5891h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f5892i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f5893j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5889f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5890g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f5894k = PorterDuff.Mode.SRC_IN;

    public b(ColorStateList colorStateList, float f10) {
        this.f5884a = f10;
        Paint paint = new Paint(5);
        this.f5885b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f5891h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f5891h.getDefaultColor()));
        this.f5886c = new RectF();
        this.f5887d = new Rect();
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
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = rect.right;
        float f13 = rect.bottom;
        RectF rectF = this.f5886c;
        rectF.set(f10, f11, f12, f13);
        Rect rect2 = this.f5887d;
        rect2.set(rect);
        if (this.f5889f) {
            rect2.inset((int) Math.ceil(c.a(this.f5888e, this.f5884a, this.f5890g)), (int) Math.ceil(c.b(this.f5888e, this.f5884a, this.f5890g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        PorterDuffColorFilter porterDuffColorFilter = this.f5892i;
        Paint paint = this.f5885b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f5892i);
            z10 = true;
        }
        RectF rectF = this.f5886c;
        float f10 = this.f5884a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f5887d, this.f5884a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f5893j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f5891h;
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
        ColorStateList colorStateList = this.f5891h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f5885b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f5893j;
        if (colorStateList2 == null || (mode = this.f5894k) == null) {
            return z10;
        }
        this.f5892i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f5885b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5885b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f5893j = colorStateList;
        this.f5892i = a(colorStateList, this.f5894k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f5894k = mode;
        this.f5892i = a(this.f5893j, mode);
        invalidateSelf();
    }
}
