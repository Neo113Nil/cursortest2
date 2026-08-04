package com.gamericefishpro.space.o1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public k(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            a.e();
            porterDuffColorFilter = a.c(o.y(j), o.v(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(o.y(j), o.B(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.d(this.b, kVar.b) && this.c == kVar.c;
    }

    public final int hashCode() {
        int i = s.h;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        y0.l(this.b, sb, ", blendMode=");
        sb.append((Object) o.C(this.c));
        sb.append(')');
        return sb.toString();
    }
}
