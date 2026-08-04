package com.gamericefishpro.space.bb;

import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final v a;
    public final int b;
    public final int c;

    public l(int i, int i2, Class cls) {
        this(v.a(cls), i, i2);
    }

    public static l a(Class cls) {
        return new l(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.a) && this.b == lVar.b && this.c == lVar.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = com.gamericefishpro.space.ng.e.DIRECT_TAG;
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(com.gamericefishpro.space.m5.a.g(i2, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return y0.j(sb, str2, "}");
    }

    public l(v vVar, int i, int i2) {
        this.a = vVar;
        this.b = i;
        this.c = i2;
    }
}
