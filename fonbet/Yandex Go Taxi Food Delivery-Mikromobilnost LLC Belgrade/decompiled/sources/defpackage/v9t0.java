package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v9t0 implements x9t0 {
    public final String a;

    public v9t0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9t0) && jl40.l(this.a, ((v9t0) obj).a);
    }

    @Override // defpackage.x9t0
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Unhandled(uri=", this.a, Extension.C_BRAKE);
    }
}
