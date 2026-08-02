package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.a;

/* loaded from: classes3.dex */
public abstract class ky6 extends a {
    public static final /* synthetic */ int I = 0;
    public iy6 H;

    public final void C(float f, float f2, float f3, float f4) {
        RectF rectF = this.H.s;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.a, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.H = new iy6(this.H);
        return this;
    }
}
