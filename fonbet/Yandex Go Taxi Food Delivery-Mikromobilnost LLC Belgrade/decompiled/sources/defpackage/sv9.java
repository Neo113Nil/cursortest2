package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sv9 implements uv9 {
    public final as9 a;
    public final ir9 b;

    public sv9(as9 as9Var, ir9 ir9Var) {
        this.a = as9Var;
        this.b = ir9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv9)) {
            return false;
        }
        sv9 sv9Var = (sv9) obj;
        return jl40.l(this.a, sv9Var.a) && jl40.l(this.b, sv9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowDetails(details=" + this.a + ", discount=" + this.b + Extension.C_BRAKE;
    }
}
