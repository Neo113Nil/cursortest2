package V0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class h extends S0.g {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f1276y = 0;

    /* renamed from: x, reason: collision with root package name */
    public g f1277x;

    @Override // S0.g
    public final void f(Canvas canvas) {
        if (this.f1277x.f1275q.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f1277x.f1275q);
        super.f(canvas);
        canvas.restore();
    }

    @Override // S0.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1277x = new g(this.f1277x);
        return this;
    }

    public final void s(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f1277x.f1275q;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
