package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class rq00 {
    public final String a;
    public final String b;

    public rq00(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq00)) {
            return false;
        }
        rq00 rq00Var = (rq00) obj;
        return this.a.equals(rq00Var.a) && this.b.equals(rq00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ButtonsTrail(acceptTitle=", this.a, ", declineTitle=", this.b, Extension.C_BRAKE);
    }
}
