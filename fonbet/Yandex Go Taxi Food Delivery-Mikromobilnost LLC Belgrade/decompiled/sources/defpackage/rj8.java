package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rj8 {
    public final String a;
    public final int b;

    public rj8(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj8)) {
            return false;
        }
        rj8 rj8Var = (rj8) obj;
        return jl40.l(this.a, rj8Var.a) && this.b == rj8Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "IconRequest(iconUrl=", this.a, ", fallbackRes=", Extension.C_BRAKE);
    }
}
