package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zkb implements blb {
    public final String a;

    public zkb(String str) {
        this.a = str;
    }

    @Override // defpackage.blb
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zkb) && jl40.l(this.a, ((zkb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CloseModals(stateKey=", this.a, Extension.C_BRAKE);
    }
}
