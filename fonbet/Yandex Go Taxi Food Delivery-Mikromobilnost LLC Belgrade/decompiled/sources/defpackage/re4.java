package defpackage;

/* loaded from: classes10.dex */
public final class re4 extends n750 {
    public final Object a;
    public final long b;

    public re4(long j, Object obj) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re4)) {
            return false;
        }
        re4 re4Var = (re4) obj;
        return jl40.l(this.a, re4Var.a) && this.b == re4Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackHandlerInfo(owner=");
        sb.append(this.a);
        sb.append(", compositeKey=");
        return b64.o(sb, this.b, ')');
    }
}
