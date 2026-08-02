package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class yer0 extends efr0 {
    public final String a;

    public yer0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yer0) && jl40.l(this.a, ((yer0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenBrowserUrl(url=", this.a, Extension.C_BRAKE);
    }
}
