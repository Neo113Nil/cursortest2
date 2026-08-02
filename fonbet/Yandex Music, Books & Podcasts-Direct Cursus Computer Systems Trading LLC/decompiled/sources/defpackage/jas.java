package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class jas extends Drawable {
    public final luq a;
    public final ias b;
    public final RectF c = new RectF();

    public jas(luq luqVar) {
        this.a = luqVar;
        this.b = new ias(luqVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.c;
        rectF.set(bounds);
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        ias iasVar = this.b;
        String str = iasVar.d;
        if (str != null) {
            float f = centerX - iasVar.e;
            luq luqVar = iasVar.a;
            canvas.drawText(str, f + luqVar.d, centerY + iasVar.f + luqVar.e, iasVar.c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        luq luqVar = this.a;
        return (int) (Math.abs(luqVar.e) + luqVar.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (Math.abs(this.a.d) + this.c.width());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
