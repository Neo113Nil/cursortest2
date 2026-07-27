package H3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes2.dex */
public final class h extends E3.g {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f1121R = 0;

    /* renamed from: Q, reason: collision with root package name */
    public g f1122Q;

    @Override // E3.g
    public final void e(Canvas canvas) {
        if (this.f1122Q.f1120q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f1122Q.f1120q);
        } else {
            canvas.clipRect(this.f1122Q.f1120q, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }

    @Override // E3.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1122Q = new g(this.f1122Q);
        return this;
    }

    public final void n(float f3, float f9, float f10, float f11) {
        RectF rectF = this.f1122Q.f1120q;
        if (f3 == rectF.left && f9 == rectF.top && f10 == rectF.right && f11 == rectF.bottom) {
            return;
        }
        rectF.set(f3, f9, f10, f11);
        invalidateSelf();
    }
}
