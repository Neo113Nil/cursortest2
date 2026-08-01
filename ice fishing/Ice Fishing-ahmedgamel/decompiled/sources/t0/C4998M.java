package t0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4998M {

    /* renamed from: a, reason: collision with root package name */
    public int f40565a;

    /* renamed from: b, reason: collision with root package name */
    public int f40566b;

    /* renamed from: c, reason: collision with root package name */
    public int f40567c;

    /* renamed from: d, reason: collision with root package name */
    public int f40568d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f40569e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40570f;

    /* renamed from: g, reason: collision with root package name */
    public int f40571g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f40568d;
        if (i >= 0) {
            this.f40568d = -1;
            recyclerView.M(i);
            this.f40570f = false;
            return;
        }
        if (!this.f40570f) {
            this.f40571g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f40569e;
        if (baseInterpolator != null && this.f40567c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i6 = this.f40567c;
        if (i6 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f5221F0.b(this.f40565a, this.f40566b, i6, baseInterpolator);
        int i9 = this.f40571g + 1;
        this.f40571g = i9;
        if (i9 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f40570f = false;
    }
}
