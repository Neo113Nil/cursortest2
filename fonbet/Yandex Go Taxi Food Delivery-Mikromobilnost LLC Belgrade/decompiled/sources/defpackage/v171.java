package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class v171 {
    public final oe71 a;
    public final oe71 b;

    public v171(oe71 oe71Var, oe71 oe71Var2) {
        this.a = oe71Var;
        this.b = oe71Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v171.class != obj.getClass()) {
            return false;
        }
        v171 v171Var = (v171) obj;
        return this.a.equals(v171Var.a) && this.b.equals(v171Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        oe71 oe71Var = this.a;
        sb.append(oe71Var);
        oe71 oe71Var2 = this.b;
        if (oe71Var.equals(oe71Var2)) {
            str = "";
        } else {
            str = Extension.FIX_SPACE + oe71Var2;
        }
        return oyr.t(sb, str, "]");
    }
}
