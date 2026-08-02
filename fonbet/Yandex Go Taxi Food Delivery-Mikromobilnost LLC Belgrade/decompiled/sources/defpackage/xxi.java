package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xxi extends s151 {
    public final String a;
    public final String b;

    public xxi(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxi)) {
            return false;
        }
        xxi xxiVar = (xxi) obj;
        return jl40.l(this.a, xxiVar.a) && jl40.l(this.b, xxiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DescriptionModel(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
