package v0;

import android.animation.TimeInterpolator;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362c {

    /* renamed from: a, reason: collision with root package name */
    public long f4486a;

    /* renamed from: b, reason: collision with root package name */
    public long f4487b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f4488c;

    /* renamed from: d, reason: collision with root package name */
    public int f4489d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f4488c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0360a.f4481b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0362c)) {
            return false;
        }
        C0362c c0362c = (C0362c) obj;
        if (this.f4486a == c0362c.f4486a && this.f4487b == c0362c.f4487b && this.f4489d == c0362c.f4489d && this.e == c0362c.e) {
            return a().getClass().equals(c0362c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4486a;
        long j2 = this.f4487b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f4489d) * 31) + this.e;
    }

    public final String toString() {
        return "\n" + C0362c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4486a + " duration: " + this.f4487b + " interpolator: " + a().getClass() + " repeatCount: " + this.f4489d + " repeatMode: " + this.e + "}\n";
    }
}
