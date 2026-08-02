package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uzv0 {
    public final String a;

    public uzv0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzv0) && jl40.l(this.a, ((uzv0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("SuperAppFavoritesDeeplink(service=", this.a, Extension.C_BRAKE);
    }

    public uzv0() {
        this(null);
    }
}
