package h3;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2781a;

    /* renamed from: b, reason: collision with root package name */
    public float f2782b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f2783c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2784d;

    public h0(int i10, Interpolator interpolator, long j3) {
        this.f2781a = i10;
        this.f2783c = interpolator;
        this.f2784d = j3;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f2784d;
    }

    public float c() {
        Interpolator interpolator = this.f2783c;
        return interpolator != null ? interpolator.getInterpolation(this.f2782b) : this.f2782b;
    }

    public int d() {
        return this.f2781a;
    }

    public void e(float f10) {
        this.f2782b = f10;
    }
}
