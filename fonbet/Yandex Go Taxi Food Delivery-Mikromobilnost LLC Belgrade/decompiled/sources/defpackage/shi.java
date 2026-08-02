package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class shi extends uhi {
    public final jw40 a;

    public shi(jw40 jw40Var) {
        this.a = jw40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof shi) && jl40.l(this.a, ((shi) obj).a);
    }

    public final int hashCode() {
        jw40 jw40Var = this.a;
        if (jw40Var == null) {
            return 0;
        }
        return jw40Var.hashCode();
    }

    public final String toString() {
        return "Failure(alert=" + this.a + Extension.C_BRAKE;
    }
}
