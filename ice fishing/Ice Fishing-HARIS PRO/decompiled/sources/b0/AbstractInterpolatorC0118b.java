package b0;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0118b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f2328a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2329b;

    public AbstractInterpolatorC0118b(float[] fArr) {
        this.f2328a = fArr;
        this.f2329b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= RecyclerView.f2111C0) {
            return RecyclerView.f2111C0;
        }
        float[] fArr = this.f2328a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f2329b;
        float f4 = (f2 - (min * f3)) / f3;
        float f5 = fArr[min];
        return ((fArr[min + 1] - f5) * f4) + f5;
    }
}
