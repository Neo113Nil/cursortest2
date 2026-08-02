package J3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes2.dex */
public final class h extends G3.g {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f1477R = 0;

    /* renamed from: Q, reason: collision with root package name */
    public g f1478Q;

    @Override // G3.g
    public final void e(Canvas canvas) {
        if (this.f1478Q.f1476q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f1478Q.f1476q);
        } else {
            canvas.clipRect(this.f1478Q.f1476q, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }

    @Override // G3.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1478Q = new g(this.f1478Q);
        return this;
    }

    public final void n(float f2, float f9, float f10, float f11) {
        RectF rectF = this.f1478Q.f1476q;
        if (f2 == rectF.left && f9 == rectF.top && f10 == rectF.right && f11 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f9, f10, f11);
        invalidateSelf();
    }
}
