package j3;

import android.animation.TimeInterpolator;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f38547a;

    /* renamed from: b, reason: collision with root package name */
    public long f38548b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f38549c;

    /* renamed from: d, reason: collision with root package name */
    public int f38550d;

    /* renamed from: e, reason: collision with root package name */
    public int f38551e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f38549c;
        return timeInterpolator != null ? timeInterpolator : AbstractC4596a.f38542b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f38547a == cVar.f38547a && this.f38548b == cVar.f38548b && this.f38550d == cVar.f38550d && this.f38551e == cVar.f38551e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f38547a;
        long j10 = this.f38548b;
        return ((((a().getClass().hashCode() + (((((int) (j9 ^ (j9 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f38550d) * 31) + this.f38551e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(c.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f38547a);
        sb.append(" duration: ");
        sb.append(this.f38548b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f38550d);
        sb.append(" repeatMode: ");
        return AbstractC5051n.e(this.f38551e, "}\n", sb);
    }
}
