package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ufx0 {
    public final String a;
    public final String b;
    public final wu1 c;

    public ufx0(String str, String str2, wu1 wu1Var) {
        this.a = str;
        this.b = str2;
        this.c = wu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufx0)) {
            return false;
        }
        ufx0 ufx0Var = (ufx0) obj;
        return jl40.l(this.a, ufx0Var.a) && jl40.l(this.b, ufx0Var.b) && jl40.l(this.c, ufx0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        wu1 wu1Var = this.c;
        return b + (wu1Var == null ? 0 : wu1Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("TariffEqualsKey(verticalId=", this.a, ", tariffClass=", this.b, ", altOptionGroup=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
