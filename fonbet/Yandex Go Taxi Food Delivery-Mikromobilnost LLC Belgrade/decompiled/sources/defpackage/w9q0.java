package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class w9q0 {
    public final String a;
    public final CharSequence b;
    public final wib c;

    public w9q0(String str, String str2, wib wibVar) {
        this.a = str;
        this.b = str2;
        this.c = wibVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9q0)) {
            return false;
        }
        w9q0 w9q0Var = (w9q0) obj;
        return this.a.equals(w9q0Var.a) && jl40.l(this.b, w9q0Var.b) && this.c.equals(w9q0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "Option(id=", this.a, ", title=", ", action=");
        t.append(this.c);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
