package O;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public final int f772a;

    /* renamed from: b, reason: collision with root package name */
    public float f773b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f774c;

    /* renamed from: d, reason: collision with root package name */
    public final long f775d;

    public W(int i, Interpolator interpolator, long j) {
        this.f772a = i;
        this.f774c = interpolator;
        this.f775d = j;
    }

    public long a() {
        return this.f775d;
    }

    public float b() {
        Interpolator interpolator = this.f774c;
        return interpolator != null ? interpolator.getInterpolation(this.f773b) : this.f773b;
    }

    public int c() {
        return this.f772a;
    }

    public void d(float f2) {
        this.f773b = f2;
    }
}
