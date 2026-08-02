package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vqi implements xqi {
    public final doe a;
    public final boolean b;

    public vqi(doe doeVar, boolean z) {
        this.a = doeVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqi)) {
            return false;
        }
        vqi vqiVar = (vqi) obj;
        return this.a.equals(vqiVar.a) && this.b == vqiVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnotherOrderPoint(coordinates=" + this.a + ", isActive=" + this.b + Extension.C_BRAKE;
    }
}
