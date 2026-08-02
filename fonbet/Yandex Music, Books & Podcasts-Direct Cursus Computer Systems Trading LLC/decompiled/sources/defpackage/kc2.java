package defpackage;

/* loaded from: classes3.dex */
public final class kc2 extends zp6 {
    public final String a;
    public final String b;
    public final long c;

    public kc2(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zp6) {
            kc2 kc2Var = (kc2) ((zp6) obj);
            if (this.a.equals(kc2Var.a) && this.b.equals(kc2Var.b) && this.c == kc2Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return hrg.m(this.c, "}", sb);
    }
}
