package com.gamericefishpro.space.r2;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public c(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        com.gamericefishpro.space.w2.a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && Intrinsics.a(this.d, cVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + com.gamericefishpro.space.m5.a.t(this.c, com.gamericefishpro.space.m5.a.t(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return y0.i(sb, this.d, ')');
    }

    public c(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
