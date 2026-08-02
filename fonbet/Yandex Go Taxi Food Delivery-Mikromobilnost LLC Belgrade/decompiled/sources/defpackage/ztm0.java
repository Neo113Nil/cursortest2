package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ztm0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final ytm0 d;

    public ztm0(String str, CharSequence charSequence, CharSequence charSequence2, ytm0 ytm0Var) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = ytm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztm0)) {
            return false;
        }
        ztm0 ztm0Var = (ztm0) obj;
        return jl40.l(this.a, ztm0Var.a) && jl40.l(this.b, ztm0Var.b) && jl40.l(this.c, ztm0Var.c) && jl40.l(this.d, ztm0Var.d);
    }

    public final int hashCode() {
        int b = smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ytm0 ytm0Var = this.d;
        return b + (ytm0Var == null ? 0 : ytm0Var.hashCode());
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "Item(iconTag=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", trailButton=");
        t.append(this.d);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
