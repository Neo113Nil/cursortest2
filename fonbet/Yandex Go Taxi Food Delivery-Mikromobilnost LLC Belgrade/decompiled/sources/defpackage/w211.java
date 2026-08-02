package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class w211 {
    public final String a;
    public final String b;

    public w211(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w211)) {
            return false;
        }
        w211 w211Var = (w211) obj;
        return jl40.l(this.a, w211Var.a) && jl40.l(this.b, w211Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TransportId(lineId=", this.a, ", threadId=", this.b, Extension.C_BRAKE);
    }
}
