package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zpb {
    public final kdc a;
    public final kdc b;

    public zpb(kdc kdcVar, kdc kdcVar2) {
        this.a = kdcVar;
        this.b = kdcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpb)) {
            return false;
        }
        zpb zpbVar = (zpb) obj;
        return jl40.l(this.a, zpbVar.a) && this.b.equals(zpbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChipColors(deselected=" + this.a + ", selected=" + this.b + Extension.C_BRAKE;
    }
}
