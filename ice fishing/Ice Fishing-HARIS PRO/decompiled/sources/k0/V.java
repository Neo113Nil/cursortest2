package k0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public int f3416a;

    /* renamed from: b, reason: collision with root package name */
    public int f3417b;

    /* renamed from: c, reason: collision with root package name */
    public int f3418c;

    /* renamed from: d, reason: collision with root package name */
    public int f3419d;
    public BaseInterpolator e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3420f;

    /* renamed from: g, reason: collision with root package name */
    public int f3421g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f3419d;
        if (i >= 0) {
            this.f3419d = -1;
            recyclerView.P(i);
            this.f3420f = false;
            return;
        }
        if (!this.f3420f) {
            this.f3421g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.e;
        if (baseInterpolator != null && this.f3418c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f3418c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f2146d0.c(this.f3416a, this.f3417b, i2, baseInterpolator);
        int i3 = this.f3421g + 1;
        this.f3421g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f3420f = false;
    }
}
