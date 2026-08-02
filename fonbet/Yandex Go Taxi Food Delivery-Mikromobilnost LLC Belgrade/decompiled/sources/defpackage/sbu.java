package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sbu implements tbu {
    public final String a;

    public sbu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbu) && jl40.l(this.a, ((sbu) obj).a);
    }

    @Override // defpackage.tbu
    public final String getServiceName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Unknown(serviceName=", this.a, Extension.C_BRAKE);
    }
}
