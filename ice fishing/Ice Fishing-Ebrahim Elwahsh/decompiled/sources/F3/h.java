package F3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes2.dex */
public final class h extends C3.g {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f1034R = 0;

    /* renamed from: Q, reason: collision with root package name */
    public C0313g f1035Q;

    @Override // C3.g
    public final void e(Canvas canvas) {
        if (this.f1035Q.f1033q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f1035Q.f1033q);
        } else {
            canvas.clipRect(this.f1035Q.f1033q, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }

    @Override // C3.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1035Q = new C0313g(this.f1035Q);
        return this;
    }

    public final void n(float f6, float f9, float f10, float f11) {
        RectF rectF = this.f1035Q.f1033q;
        if (f6 == rectF.left && f9 == rectF.top && f10 == rectF.right && f11 == rectF.bottom) {
            return;
        }
        rectF.set(f6, f9, f10, f11);
        invalidateSelf();
    }
}
