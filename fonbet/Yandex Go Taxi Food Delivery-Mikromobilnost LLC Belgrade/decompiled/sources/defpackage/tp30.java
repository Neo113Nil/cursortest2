package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tp30 implements up30 {
    public final String a;

    public tp30(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tp30) && jl40.l(this.a, ((tp30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("StartDeeplinkActivity(deeplink=", this.a, Extension.C_BRAKE);
    }
}
