package l3;

import android.animation.TimeInterpolator;
import u1.h;

/* renamed from: l3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4663c {

    /* renamed from: a, reason: collision with root package name */
    public long f38909a;

    /* renamed from: b, reason: collision with root package name */
    public long f38910b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f38911c;

    /* renamed from: d, reason: collision with root package name */
    public int f38912d;

    /* renamed from: e, reason: collision with root package name */
    public int f38913e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f38911c;
        return timeInterpolator != null ? timeInterpolator : AbstractC4661a.f38904b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4663c)) {
            return false;
        }
        C4663c c4663c = (C4663c) obj;
        if (this.f38909a == c4663c.f38909a && this.f38910b == c4663c.f38910b && this.f38912d == c4663c.f38912d && this.f38913e == c4663c.f38913e) {
            return a().getClass().equals(c4663c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f38909a;
        long j9 = this.f38910b;
        return ((((a().getClass().hashCode() + (((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j9 >>> 32) ^ j9))) * 31)) * 31) + this.f38912d) * 31) + this.f38913e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C4663c.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f38909a);
        sb.append(" duration: ");
        sb.append(this.f38910b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f38912d);
        sb.append(" repeatMode: ");
        return h.e(this.f38913e, "}\n", sb);
    }
}
