package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qbm0 {
    public final int a;
    public final int b;
    public final String c;

    public qbm0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbm0)) {
            return false;
        }
        qbm0 qbm0Var = (qbm0) obj;
        return this.a == qbm0Var.a && this.b == qbm0Var.b && jl40.l(this.c, qbm0Var.c);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.s(this.a, this.b, "SwappedInfo(fromIndex=", ", toIndex=", ", shelfId="), this.c, Extension.C_BRAKE);
    }
}
