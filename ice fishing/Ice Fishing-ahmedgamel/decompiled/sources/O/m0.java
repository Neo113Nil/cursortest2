package O;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2195a;

    /* renamed from: b, reason: collision with root package name */
    public float f2196b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f2197c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2198d;

    public m0(int i, Interpolator interpolator, long j6) {
        this.f2195a = i;
        this.f2197c = interpolator;
        this.f2198d = j6;
    }

    public long a() {
        return this.f2198d;
    }

    public float b() {
        Interpolator interpolator = this.f2197c;
        return interpolator != null ? interpolator.getInterpolation(this.f2196b) : this.f2196b;
    }

    public int c() {
        return this.f2195a;
    }

    public void d(float f2) {
        this.f2196b = f2;
    }
}
