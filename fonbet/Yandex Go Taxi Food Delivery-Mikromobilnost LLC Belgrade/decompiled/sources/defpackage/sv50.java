package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class sv50 implements xy50 {
    public static final rv50 Companion = new rv50();
    public final String a;
    public final long b;

    public /* synthetic */ sv50(long j, int i, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, qv50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv50)) {
            return false;
        }
        sv50 sv50Var = (sv50) obj;
        return jl40.l(this.a, sv50Var.a) && this.b == sv50Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkIntArgumentModel(type=");
        sb.append(this.a);
        sb.append(", argValue=");
        return b64.o(sb, this.b, ')');
    }
}
