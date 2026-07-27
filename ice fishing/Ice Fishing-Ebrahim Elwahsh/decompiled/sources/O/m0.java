package O;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2293a;

    /* renamed from: b, reason: collision with root package name */
    public float f2294b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f2295c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2296d;

    public m0(int i, Interpolator interpolator, long j9) {
        this.f2293a = i;
        this.f2295c = interpolator;
        this.f2296d = j9;
    }

    public long a() {
        return this.f2296d;
    }

    public float b() {
        Interpolator interpolator = this.f2295c;
        return interpolator != null ? interpolator.getInterpolation(this.f2294b) : this.f2294b;
    }

    public int c() {
        return this.f2293a;
    }

    public void d(float f6) {
        this.f2294b = f6;
    }
}
