package defpackage;

import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class r0t {
    public final String a;

    public r0t(int i) {
        this.a = UUID.randomUUID().toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0t) && jl40.l(this.a, ((r0t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("GeoResponseId(rawValue=", this.a, Extension.C_BRAKE);
    }

    public r0t() {
        this(0);
    }
}
