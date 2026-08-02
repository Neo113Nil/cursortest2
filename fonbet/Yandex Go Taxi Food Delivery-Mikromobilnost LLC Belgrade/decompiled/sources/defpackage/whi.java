package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class whi {
    public final String a;
    public final String b;

    public whi(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whi)) {
            return false;
        }
        whi whiVar = (whi) obj;
        return jl40.l(this.a, whiVar.a) && jl40.l(this.b, whiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DisableReason(code=", this.a, ", message=", this.b, Extension.C_BRAKE);
    }

    public whi() {
        this("", "");
    }
}
