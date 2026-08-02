package defpackage;

/* loaded from: classes2.dex */
public final class tod0 implements uod0 {
    public final String a;
    public final xod0 b;

    public tod0(String str, xod0 xod0Var) {
        this.a = str;
        this.b = xod0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tod0)) {
            return false;
        }
        tod0 tod0Var = (tod0) obj;
        return jl40.l(this.a, tod0Var.a) && jl40.l(this.b, tod0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAction(url=" + this.a + ", qrCodeParams=" + this.b + ')';
    }
}
