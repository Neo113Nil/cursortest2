package n3;

import android.animation.TimeInterpolator;
import w.AbstractC5128c;

/* renamed from: n3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4772c {

    /* renamed from: a, reason: collision with root package name */
    public long f39647a;

    /* renamed from: b, reason: collision with root package name */
    public long f39648b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f39649c;

    /* renamed from: d, reason: collision with root package name */
    public int f39650d;

    /* renamed from: e, reason: collision with root package name */
    public int f39651e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f39649c;
        return timeInterpolator != null ? timeInterpolator : AbstractC4770a.f39642b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4772c)) {
            return false;
        }
        C4772c c4772c = (C4772c) obj;
        if (this.f39647a == c4772c.f39647a && this.f39648b == c4772c.f39648b && this.f39650d == c4772c.f39650d && this.f39651e == c4772c.f39651e) {
            return a().getClass().equals(c4772c.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f39647a;
        long j9 = this.f39648b;
        return ((((a().getClass().hashCode() + (((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j9 >>> 32) ^ j9))) * 31)) * 31) + this.f39650d) * 31) + this.f39651e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C4772c.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f39647a);
        sb.append(" duration: ");
        sb.append(this.f39648b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f39650d);
        sb.append(" repeatMode: ");
        return AbstractC5128c.e(this.f39651e, "}\n", sb);
    }
}
