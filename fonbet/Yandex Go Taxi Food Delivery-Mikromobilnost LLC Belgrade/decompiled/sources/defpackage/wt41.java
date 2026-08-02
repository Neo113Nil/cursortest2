package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class wt41 extends jm91 {
    public final String b;

    public wt41(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt41) && jl40.l(this.b, ((wt41) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("LoadEsiaUrl(esiaUrl=", this.b, Extension.C_BRAKE);
    }
}
