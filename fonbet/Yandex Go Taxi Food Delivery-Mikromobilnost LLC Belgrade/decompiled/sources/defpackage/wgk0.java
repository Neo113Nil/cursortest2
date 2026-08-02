package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wgk0 implements xgk0 {
    public final CharSequence a;
    public final CharSequence b;
    public final lgk0 c;

    public wgk0(CharSequence charSequence, CharSequence charSequence2, lgk0 lgk0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = lgk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgk0)) {
            return false;
        }
        wgk0 wgk0Var = (wgk0) obj;
        return jl40.l(this.a, wgk0Var.a) && jl40.l(this.b, wgk0Var.b) && jl40.l(this.c, wgk0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        lgk0 lgk0Var = this.c;
        return hashCode2 + (lgk0Var != null ? lgk0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "V2(driverName=", ", driverRating=", ", badges=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
