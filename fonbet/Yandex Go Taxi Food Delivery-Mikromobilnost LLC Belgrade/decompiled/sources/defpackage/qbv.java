package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class qbv implements kbv {
    public final String b;

    public qbv(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbv) && jl40.l(this.b, ((qbv) obj).b);
    }

    @Override // defpackage.kbv
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("Url(url=", this.b, Extension.C_BRAKE);
    }
}
