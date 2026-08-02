package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class t8m0 extends e9m0 {
    public final String c;
    public final rr51 d;

    public t8m0(rr51 rr51Var, String str) {
        super(str, 2);
        this.c = str;
        this.d = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8m0)) {
            return false;
        }
        t8m0 t8m0Var = (t8m0) obj;
        return jl40.l(this.c, t8m0Var.c) && this.d.equals(t8m0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Div(id=" + this.c + ", divData=" + this.d + Extension.C_BRAKE;
    }
}
