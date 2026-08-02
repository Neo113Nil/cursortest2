package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class st6 {
    public final String a;
    public final String b;

    public st6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st6)) {
            return false;
        }
        st6 st6Var = (st6) obj;
        return this.a.equals(st6Var.a) && jl40.l(this.b, st6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("BulletPointState(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
