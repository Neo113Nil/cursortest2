package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class d43 extends m85 {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d43(long j, int i) {
        super(r0);
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            e43.g();
            porterDuffColorFilter = e43.a(c3x.U(j), mi.M(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c3x.U(j), mi.O(i));
        }
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d43)) {
            return false;
        }
        d43 d43Var = (d43) obj;
        return d85.c(this.b, d43Var.b) && this.c == d43Var.c;
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        dfi.q(this.b, ", blendMode=", sb);
        sb.append((Object) lxe.J(this.c));
        sb.append(')');
        return sb.toString();
    }
}
