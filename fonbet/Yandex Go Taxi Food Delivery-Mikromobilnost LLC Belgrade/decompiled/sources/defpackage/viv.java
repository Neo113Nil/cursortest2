package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class viv {
    public final String a;
    public final String b;

    public viv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof viv)) {
            return false;
        }
        viv vivVar = (viv) obj;
        return jl40.l(this.a, vivVar.a) && jl40.l(this.b, vivVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return unr0.p("InAppCallInfo(title=", this.a, ", forwardingId=", this.b, Extension.C_BRAKE);
    }
}
