package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g9r implements tb6 {
    public final Context a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final long h;
    public final float i;
    public final long j;

    public g9r(Context context, long j) {
        float min = Math.min(Math.min(fma.c(j), fma.b(j)), 220);
        long m = xv.m(min, min);
        float f = 8;
        float f2 = f / 4;
        float f3 = 2;
        float c = ((fma.c(m) - (f3 * f)) - f2) / f3;
        long m2 = xv.m(c, c);
        float f4 = 14;
        long m3 = xv.m(f4, f4);
        context.getClass();
        this.a = context;
        this.b = j;
        this.c = m;
        this.d = f;
        this.e = 4;
        this.f = f2;
        this.g = c;
        this.h = m2;
        this.i = c / 55.0f;
        this.j = m3;
    }

    @Override // defpackage.tb6
    public final float a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9r)) {
            return false;
        }
        g9r g9rVar = (g9r) obj;
        return Intrinsics.d(this.a, g9rVar.a) && fma.a(this.b, g9rVar.b) && fma.a(this.c, g9rVar.c) && cma.a(this.d, g9rVar.d) && cma.a(this.e, g9rVar.e) && cma.a(this.f, g9rVar.f) && cma.a(this.g, g9rVar.g) && fma.a(this.h, g9rVar.h) && Float.compare(this.i, g9rVar.i) == 0 && fma.a(this.j, g9rVar.j);
    }

    @Override // defpackage.tb6
    public final Context getContext() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + eta.a(tlm.c(this.h, eta.a(eta.a(eta.a(eta.a(tlm.c(this.c, tlm.c(this.b, this.a.hashCode() * 31, 31), 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), 31), this.i, 31);
    }

    public final String toString() {
        String d = fma.d(this.b);
        String d2 = fma.d(this.c);
        String b = cma.b(this.d);
        String b2 = cma.b(this.e);
        String b3 = cma.b(this.f);
        String b4 = cma.b(this.g);
        String d3 = fma.d(this.h);
        String d4 = fma.d(this.j);
        StringBuilder sb = new StringBuilder("SquareConfig(context=");
        sb.append(this.a);
        sb.append(", defaultSize=");
        sb.append(d);
        sb.append(", size=");
        su4.v(sb, d2, ", contentPadding=", b, ", secondaryContentPadding=");
        su4.v(sb, b2, ", itemPadding=", b3, ", coverImageSide=");
        su4.v(sb, b4, ", squareButtonSize=", d3, ", iconScale=");
        sb.append(this.i);
        sb.append(", logoSize=");
        sb.append(d4);
        sb.append(")");
        return sb.toString();
    }
}
