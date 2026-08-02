package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vva {
    public final int a;
    public final n4v b;
    public final kdc c;
    public final hwa d;

    public vva(int i, n4v n4vVar, kdc kdcVar, hwa hwaVar) {
        this.a = i;
        this.b = n4vVar;
        this.c = kdcVar;
        this.d = hwaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vva)) {
            return false;
        }
        vva vvaVar = (vva) obj;
        return this.a == vvaVar.a && this.b.equals(vvaVar.b) && jl40.l(this.c, vvaVar.c) && this.d.equals(vvaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.d(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ChargersSurge(percent=" + this.a + ", icon=" + this.b + ", color=" + this.c + ", modal=" + this.d + Extension.C_BRAKE;
    }
}
