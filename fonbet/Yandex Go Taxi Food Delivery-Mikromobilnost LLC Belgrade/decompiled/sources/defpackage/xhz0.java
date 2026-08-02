package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xhz0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xhz0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhz0)) {
            return false;
        }
        xhz0 xhz0Var = (xhz0) obj;
        return this.a.equals(xhz0Var.a) && this.b.equals(xhz0Var.b) && this.c.equals(xhz0Var.c) && this.d.equals(xhz0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("TipsSuggestTexts(title=", this.a, ", text=", this.b, ", acceptText="), this.c, ", denyText=", this.d, Extension.C_BRAKE);
    }
}
