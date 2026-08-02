package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class svq0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof svq0) {
            return jl40.l(this.a, ((svq0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ServiceFeature(value=", this.a, Extension.C_BRAKE);
    }
}
