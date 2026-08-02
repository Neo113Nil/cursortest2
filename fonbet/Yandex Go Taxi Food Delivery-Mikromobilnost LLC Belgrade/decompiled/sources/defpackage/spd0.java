package defpackage;

/* loaded from: classes2.dex */
public final class spd0 {
    public final String a;
    public final xod0 b;

    public spd0(String str, xod0 xod0Var) {
        this.a = str;
        this.b = xod0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spd0)) {
            return false;
        }
        spd0 spd0Var = (spd0) obj;
        return jl40.l(this.a, spd0Var.a) && this.b.equals(spd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlusTarifficatorWebAction(url=" + this.a + ", qrCodeParams=" + this.b + ')';
    }
}
