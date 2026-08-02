package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class tkf implements z7l0 {
    public final String a;

    public tkf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkf) && jl40.l(this.a, ((tkf) obj).a);
    }

    @Override // defpackage.z7l0
    public final String getType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CustomRoutePointType(type=", this.a, Extension.C_BRAKE);
    }
}
