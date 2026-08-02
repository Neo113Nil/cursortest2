package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class wn51 {
    public final boolean a;
    public final String b;
    public final String c;

    public wn51(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn51)) {
            return false;
        }
        wn51 wn51Var = (wn51) obj;
        return this.a == wn51Var.a && this.b.equals(wn51Var.b) && jl40.l(this.c, wn51Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(ly3.v("YangoBusinessState(isEnabled=", ", title=", this.b, ", badgeText=", this.a), this.c, Extension.C_BRAKE);
    }
}
