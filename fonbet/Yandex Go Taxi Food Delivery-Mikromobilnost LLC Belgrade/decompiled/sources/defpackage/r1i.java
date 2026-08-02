package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class r1i {
    public final j2i a;
    public final qai b;

    public r1i(j2i j2iVar, qai qaiVar) {
        this.a = j2iVar;
        this.b = qaiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1i)) {
            return false;
        }
        r1i r1iVar = (r1i) obj;
        return jl40.l(this.a, r1iVar.a) && this.b.equals(r1iVar.b);
    }

    public final int hashCode() {
        j2i j2iVar = this.a;
        return this.b.hashCode() + ((j2iVar == null ? 0 : j2iVar.hashCode()) * 31);
    }

    public final String toString() {
        return "DeliveryCostDetails(screen=" + this.a + ", formListItem=" + this.b + Extension.C_BRAKE;
    }
}
