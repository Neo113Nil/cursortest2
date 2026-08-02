package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class sd40 implements td40 {
    public final String a;

    public sd40(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd40) && jl40.l(this.a, ((sd40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("StartDeeplinkActivity(deeplink=", this.a, Extension.C_BRAKE);
    }
}
