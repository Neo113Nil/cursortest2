package defpackage;

/* loaded from: classes6.dex */
public final class sq4 {
    public final boolean a;
    public final int b;
    public final long c;
    public final boolean d;

    public sq4(wq4 wq4Var) {
        wq4Var.getClass();
        this.a = wq4Var.a;
        this.b = wq4Var.b;
        this.c = wq4Var.c;
        this.d = wq4Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sq4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        sq4 sq4Var = (sq4) obj;
        return this.a == sq4Var.a && this.b == sq4Var.b && this.c == sq4Var.c && this.d == sq4Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + tlm.c(this.c, ((Boolean.hashCode(this.a) * 31) + this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodecInitializationConfig(shouldTryInitCodecsWithRetries=");
        sb.append(this.a);
        sb.append(", retriesCount=");
        sb.append(this.b);
        sb.append(", timeoutMs=");
        sb.append(this.c);
        sb.append(", useIncrementalCodecInitTimeout=");
        return dfi.j(sb, this.d, ')');
    }
}
