package O;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2107a;

    /* renamed from: b, reason: collision with root package name */
    public float f2108b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f2109c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2110d;

    public m0(int i, Interpolator interpolator, long j6) {
        this.f2107a = i;
        this.f2109c = interpolator;
        this.f2110d = j6;
    }

    public long a() {
        return this.f2110d;
    }

    public float b() {
        Interpolator interpolator = this.f2109c;
        return interpolator != null ? interpolator.getInterpolation(this.f2108b) : this.f2108b;
    }

    public int c() {
        return this.f2107a;
    }

    public void d(float f3) {
        this.f2108b = f3;
    }
}
