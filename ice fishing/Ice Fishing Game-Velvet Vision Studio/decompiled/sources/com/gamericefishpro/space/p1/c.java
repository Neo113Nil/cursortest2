package com.gamericefishpro.space.p1;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public final String a;
    public final long b;
    public final int c;

    public c(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.c == cVar.c && Intrinsics.a(this.a, cVar.a)) {
            return b.a(this.b, cVar.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, c cVar);

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = b.e;
        return y0.b(iHashCode, 31, this.b) + this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" (id=");
        sb.append(this.c);
        sb.append(", model=");
        long j = b.a;
        long j2 = this.b;
        if (b.a(j2, j)) {
            str = "Rgb";
        } else if (b.a(j2, b.b)) {
            str = "Xyz";
        } else if (b.a(j2, b.c)) {
            str = "Lab";
        } else {
            str = b.a(j2, b.d) ? "Cmyk" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
