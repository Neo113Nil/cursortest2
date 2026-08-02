package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xkg {
    public final rbv a;
    public final zkg b;

    public xkg(jbv jbvVar, zkg zkgVar) {
        this.a = jbvVar;
        this.b = zkgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkg)) {
            return false;
        }
        xkg xkgVar = (xkg) obj;
        return jl40.l(this.a, xkgVar.a) && this.b.equals(xkgVar.b);
    }

    public final int hashCode() {
        rbv rbvVar = this.a;
        return this.b.hashCode() + ((rbvVar == null ? 0 : rbvVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Background(image=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
    }
}
