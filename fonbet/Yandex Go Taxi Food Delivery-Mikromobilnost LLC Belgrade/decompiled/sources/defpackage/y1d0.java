package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class y1d0 {
    public static final y1d0 d = new y1d0(0, null, false);
    public final boolean a;
    public final int b;
    public final String c;

    public y1d0(int i, String str, boolean z) {
        this.a = z;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1d0)) {
            return false;
        }
        y1d0 y1d0Var = (y1d0) obj;
        return this.a == y1d0Var.a && this.b == y1d0Var.b && jl40.l(this.c, y1d0Var.c);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(xvz.p("PlusCounterModel(shouldShowCounter=", this.b, ", counterValue=", ", iconUrl=", this.a), this.c, Extension.C_BRAKE);
    }
}
