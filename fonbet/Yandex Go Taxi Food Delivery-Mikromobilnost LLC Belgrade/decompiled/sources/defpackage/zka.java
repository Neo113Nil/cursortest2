package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zka implements ila {
    public final String a;
    public final iga b;

    public zka(String str, iga igaVar) {
        this.a = str;
        this.b = igaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zka)) {
            return false;
        }
        zka zkaVar = (zka) obj;
        return jl40.l(this.a, zkaVar.a) && jl40.l(this.b, zkaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenCancelConfirmation(passId=" + this.a + ", details=" + this.b + Extension.C_BRAKE;
    }
}
