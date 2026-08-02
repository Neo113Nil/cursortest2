package t0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4995K {

    /* renamed from: a, reason: collision with root package name */
    public int f40615a;

    /* renamed from: b, reason: collision with root package name */
    public int f40616b;

    /* renamed from: c, reason: collision with root package name */
    public int f40617c;

    /* renamed from: d, reason: collision with root package name */
    public int f40618d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f40619e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40620f;

    /* renamed from: g, reason: collision with root package name */
    public int f40621g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f40618d;
        if (i >= 0) {
            this.f40618d = -1;
            recyclerView.M(i);
            this.f40620f = false;
            return;
        }
        if (!this.f40620f) {
            this.f40621g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f40619e;
        if (baseInterpolator != null && this.f40617c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i4 = this.f40617c;
        if (i4 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f5179A0.b(this.f40615a, this.f40616b, i4, baseInterpolator);
        int i6 = this.f40621g + 1;
        this.f40621g = i6;
        if (i6 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f40620f = false;
    }
}
