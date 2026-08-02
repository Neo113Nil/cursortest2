package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s1i {
    public final l2i a;
    public final qai b;

    public s1i(l2i l2iVar, qai qaiVar) {
        this.a = l2iVar;
        this.b = qaiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1i)) {
            return false;
        }
        s1i s1iVar = (s1i) obj;
        return jl40.l(this.a, s1iVar.a) && this.b.equals(s1iVar.b);
    }

    public final int hashCode() {
        l2i l2iVar = this.a;
        return this.b.hashCode() + ((l2iVar == null ? 0 : l2iVar.hashCode()) * 31);
    }

    public final String toString() {
        return "DeliveryCostDetails(screen=" + this.a + ", formListItem=" + this.b + Extension.C_BRAKE;
    }
}
