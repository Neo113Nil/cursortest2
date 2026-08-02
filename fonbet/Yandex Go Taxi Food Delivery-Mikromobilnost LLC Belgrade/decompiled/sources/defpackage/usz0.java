package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class usz0 {
    public final rr51 a;
    public final rr51 b;

    public usz0(rr51 rr51Var, rr51 rr51Var2) {
        this.a = rr51Var;
        this.b = rr51Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usz0)) {
            return false;
        }
        usz0 usz0Var = (usz0) obj;
        return jl40.l(this.a, usz0Var.a) && this.b.equals(usz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ToolbarEntity(centerDiv=" + this.a + ", rightDiv=" + this.b + Extension.C_BRAKE;
    }
}
