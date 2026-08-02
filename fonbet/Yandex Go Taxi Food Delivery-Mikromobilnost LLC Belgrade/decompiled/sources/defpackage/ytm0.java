package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ytm0 {
    public final CharSequence a;
    public final wp2 b;
    public final String c;

    public ytm0(CharSequence charSequence, wp2 wp2Var, String str) {
        this.a = charSequence;
        this.b = wp2Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytm0)) {
            return false;
        }
        ytm0 ytm0Var = (ytm0) obj;
        return jl40.l(this.a, ytm0Var.a) && jl40.l(this.b, ytm0Var.b) && this.c.equals(ytm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailButton(text=");
        sb.append((Object) this.a);
        sb.append(", bgColor=");
        sb.append(this.b);
        sb.append(", deeplink=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
