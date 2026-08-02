package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class yu51 {
    public static final yu51 d = new yu51(false, "", "");
    public final boolean a;
    public final String b;
    public final String c;

    public yu51(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu51)) {
            return false;
        }
        yu51 yu51Var = (yu51) obj;
        return this.a == yu51Var.a && this.b.equals(yu51Var.b) && jl40.l(this.c, yu51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(ly3.v("YbSaverWidgetsState(shouldShowPromo=", ", maxInterestRate=", this.b, ", action=", this.a), this.c, Extension.C_BRAKE);
    }
}
