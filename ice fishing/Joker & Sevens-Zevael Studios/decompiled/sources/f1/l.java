package f1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f2269a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2270b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2271c;

    public l(int i10, long j3) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            a.e();
            porterDuffColorFilter = a.c(d0.s(j3), d0.q(i10));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(d0.s(j3), d0.v(i10));
        }
        this.f2269a = porterDuffColorFilter;
        this.f2270b = j3;
        this.f2271c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return q.c(this.f2270b, lVar.f2270b) && this.f2271c == lVar.f2271c;
    }

    public final int hashCode() {
        int i10 = q.f2284i;
        return Integer.hashCode(this.f2271c) + (Long.hashCode(this.f2270b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        a4.d.q(this.f2270b, sb, ", blendMode=");
        sb.append((Object) d0.w(this.f2271c));
        sb.append(')');
        return sb.toString();
    }
}
