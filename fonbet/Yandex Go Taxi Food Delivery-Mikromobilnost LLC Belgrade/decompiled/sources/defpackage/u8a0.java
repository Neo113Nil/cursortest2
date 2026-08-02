package defpackage;

/* loaded from: classes12.dex */
public final class u8a0 {
    public final String a;
    public final int b;

    public u8a0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8a0)) {
            return false;
        }
        u8a0 u8a0Var = (u8a0) obj;
        return jl40.l(this.a, u8a0Var.a) && this.b == u8a0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
