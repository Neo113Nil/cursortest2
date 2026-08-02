package defpackage;

/* loaded from: classes10.dex */
public final class yje {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public yje(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yje)) {
            return false;
        }
        yje yjeVar = (yje) obj;
        return ldc.c(this.a, yjeVar.a) && ldc.c(this.b, yjeVar.b) && ldc.c(this.c, yjeVar.c) && ldc.c(this.d, yjeVar.d) && ldc.c(this.e, yjeVar.e);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.e) + qv10.c(qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        xvz.w(this.a, ", textColor=", sb);
        xvz.w(this.b, ", iconColor=", sb);
        xvz.w(this.c, ", disabledTextColor=", sb);
        xvz.w(this.d, ", disabledIconColor=", sb);
        sb.append((Object) ldc.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
