package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class xmt0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public xmt0(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmt0)) {
            return false;
        }
        xmt0 xmt0Var = (xmt0) obj;
        return this.a == xmt0Var.a && this.b == xmt0Var.b && this.c.equals(xmt0Var.c) && this.d.equals(xmt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.s(this.a, this.b, "MarkedSpan(start=", ", end=", ", open="), this.c, ", close=", this.d, Extension.C_BRAKE);
    }
}
