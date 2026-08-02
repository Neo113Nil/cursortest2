package defpackage;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes3.dex */
public final class jy6 extends ky6 {
    @Override // com.google.android.material.shape.a
    public final void g(Canvas canvas) {
        if (this.H.s.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        iy6 iy6Var = this.H;
        if (i >= 26) {
            canvas.clipOutRect(iy6Var.s);
        } else {
            canvas.clipRect(iy6Var.s, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }
}
