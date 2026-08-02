package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class sn4 implements m1j {
    public final CharSequence a;
    public final CharSequence b;
    public final h911 c;
    public final h911 d;
    public final String e;

    public sn4(CharSequence charSequence, String str, h911 h911Var, h911 h911Var2, String str2) {
        this.a = charSequence;
        this.b = str;
        this.c = h911Var;
        this.d = h911Var2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn4)) {
            return false;
        }
        sn4 sn4Var = (sn4) obj;
        return this.a.equals(sn4Var.a) && jl40.l(this.b, sn4Var.b) && this.c.equals(sn4Var.c) && this.d.equals(sn4Var.d) && jl40.l(this.e, sn4Var.e);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "BadgeWithSubtitleItem(badge=", ", subtitle=", ", prevTransportType=");
        r.append(this.c);
        r.append(", transportType=");
        r.append(this.d);
        r.append(", id=");
        return oyr.t(r, this.e, Extension.C_BRAKE);
    }
}
