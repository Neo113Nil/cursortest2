package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xha {
    public final String a;
    public final CharSequence b;
    public final wj90 c;

    public xha(String str, CharSequence charSequence, wj90 wj90Var) {
        this.a = str;
        this.b = charSequence;
        this.c = wj90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xha)) {
            return false;
        }
        xha xhaVar = (xha) obj;
        return jl40.l(this.a, xhaVar.a) && jl40.l(this.b, xhaVar.b) && jl40.l(this.c, xhaVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + smw0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "RenewalRowState(iconTag=", this.a, ", body=", ", trailButton=");
        t.append(this.c);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
