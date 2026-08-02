package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class gfn extends Drawable {
    public static final /* synthetic */ int h = 0;
    public final pcg a;
    public final hag b;
    public final hag c;
    public final int[] d;
    public final float[] e;
    public final Paint f = new Paint();
    public final RectF g = new RectF();

    public gfn(pcg pcgVar, hag hagVar, hag hagVar2, int[] iArr, float[] fArr) {
        this.a = pcgVar;
        this.b = hagVar;
        this.c = hagVar2;
        this.d = iArr;
        this.e = fArr;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawRect(this.g, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f.setShader(ocg.t(this.a, this.b, this.c, this.d, this.e, rect.width(), rect.height()));
        this.g.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
