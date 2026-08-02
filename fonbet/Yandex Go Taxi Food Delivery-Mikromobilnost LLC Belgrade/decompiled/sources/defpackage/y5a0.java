package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y5a0 implements c6a0 {
    public final String a;
    public final lea0 b;

    public y5a0(lea0 lea0Var, String str) {
        this.a = str;
        this.b = lea0Var;
    }

    public final String a() {
        return this.a;
    }

    public final lea0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5a0)) {
            return false;
        }
        y5a0 y5a0Var = (y5a0) obj;
        return jl40.l(this.a, y5a0Var.a) && jl40.l(this.b, y5a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RenamePayment(baseName=" + this.a + ", paymentModel=" + this.b + Extension.C_BRAKE;
    }
}
