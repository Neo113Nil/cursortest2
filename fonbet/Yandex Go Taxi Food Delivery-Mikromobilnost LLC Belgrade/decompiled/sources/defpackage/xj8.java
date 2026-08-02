package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xj8 {
    public final int a;
    public final String b;

    public xj8(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj8)) {
            return false;
        }
        xj8 xj8Var = (xj8) obj;
        return this.a == xj8Var.a && jl40.l(this.b, xj8Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.l(this.a, "CardNetworkImage(fallbackIconRes=", ", iconUrl=", this.b, Extension.C_BRAKE);
    }
}
