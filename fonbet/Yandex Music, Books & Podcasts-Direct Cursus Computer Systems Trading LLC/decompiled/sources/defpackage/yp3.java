package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class yp3 {
    public final String a;
    public final String b;

    public yp3(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp3)) {
            return false;
        }
        yp3 yp3Var = (yp3) obj;
        return Intrinsics.d(this.a, yp3Var.a) && this.b.equals(yp3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheKey(path=");
        sb.append(this.a);
        sb.append(", name=");
        return dfi.i(sb, this.b, ')');
    }
}
