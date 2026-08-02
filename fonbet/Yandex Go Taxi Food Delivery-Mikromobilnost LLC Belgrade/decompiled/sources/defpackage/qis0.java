package defpackage;

import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;

/* loaded from: classes12.dex */
public abstract class qis0 implements yo4 {
    @Override // defpackage.yo4
    public final xo4 a(Balloon balloon, float f, boolean z) {
        View b = b(balloon, z);
        b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        b.layout(0, 0, b.getMeasuredWidth(), b.getMeasuredHeight());
        pis0 pis0Var = new pis0(b, c(), f);
        rgr0 f2 = f();
        Paint paint = pis0Var.i;
        if (f2 != null) {
            pis0Var.b = f2;
            float f3 = f2.b;
            PointF pointF = f2.c;
            paint.setShadowLayer(f3, pointF.x, pointF.y, f2.a);
        }
        paint.setColor(z ? e(balloon, z) : d(balloon, z));
        return pis0Var;
    }

    public abstract View b(Balloon balloon, boolean z);

    public abstract vo4 c();

    public abstract int d(Balloon balloon, boolean z);

    public abstract int e(Balloon balloon, boolean z);

    public abstract rgr0 f();
}
