package t0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5027K {

    /* renamed from: a, reason: collision with root package name */
    public int f40587a;

    /* renamed from: b, reason: collision with root package name */
    public int f40588b;

    /* renamed from: c, reason: collision with root package name */
    public int f40589c;

    /* renamed from: d, reason: collision with root package name */
    public int f40590d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f40591e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40592f;

    /* renamed from: g, reason: collision with root package name */
    public int f40593g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f40590d;
        if (i >= 0) {
            this.f40590d = -1;
            recyclerView.M(i);
            this.f40592f = false;
            return;
        }
        if (!this.f40592f) {
            this.f40593g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f40591e;
        if (baseInterpolator != null && this.f40589c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i4 = this.f40589c;
        if (i4 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f5333F0.b(this.f40587a, this.f40588b, i4, baseInterpolator);
        int i9 = this.f40593g + 1;
        this.f40593g = i9;
        if (i9 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f40592f = false;
    }
}
