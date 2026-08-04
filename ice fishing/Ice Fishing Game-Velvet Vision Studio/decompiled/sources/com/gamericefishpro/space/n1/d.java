package com.gamericefishpro.space.n1;

import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.u6.f;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        f.f(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.a, dVar.a) == 0 && Float.compare(this.b, dVar.b) == 0 && Float.compare(this.c, dVar.c) == 0 && Float.compare(this.d, dVar.d) == 0 && a4.u(this.e, dVar.e) && a4.u(this.f, dVar.f) && a4.u(this.g, dVar.g) && a4.u(this.h, dVar.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + y0.b(y0.b(y0.b(y0.a(this.d, y0.a(this.c, y0.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = com.gamericefishpro.space.i.a.R(this.a) + ", " + com.gamericefishpro.space.i.a.R(this.b) + ", " + com.gamericefishpro.space.i.a.R(this.c) + ", " + com.gamericefishpro.space.i.a.R(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zU = a4.u(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zU || !a4.u(j2, j3) || !a4.u(j3, j4)) {
            StringBuilder sbL = com.gamericefishpro.space.m5.a.l("RoundRect(rect=", str, ", topLeft=");
            sbL.append((Object) a4.J(j));
            sbL.append(", topRight=");
            sbL.append((Object) a4.J(j2));
            sbL.append(", bottomRight=");
            sbL.append((Object) a4.J(j3));
            sbL.append(", bottomLeft=");
            sbL.append((Object) a4.J(j4));
            sbL.append(')');
            return sbL.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbL2 = com.gamericefishpro.space.m5.a.l("RoundRect(rect=", str, ", radius=");
            sbL2.append(com.gamericefishpro.space.i.a.R(Float.intBitsToFloat(i)));
            sbL2.append(')');
            return sbL2.toString();
        }
        StringBuilder sbL3 = com.gamericefishpro.space.m5.a.l("RoundRect(rect=", str, ", x=");
        sbL3.append(com.gamericefishpro.space.i.a.R(Float.intBitsToFloat(i)));
        sbL3.append(", y=");
        sbL3.append(com.gamericefishpro.space.i.a.R(Float.intBitsToFloat(i2)));
        sbL3.append(')');
        return sbL3.toString();
    }
}
