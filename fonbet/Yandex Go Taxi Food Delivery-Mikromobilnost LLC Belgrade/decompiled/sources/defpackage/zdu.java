package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zdu {
    public final int a;
    public final odu b;

    public zdu(int i, odu oduVar) {
        this.a = i;
        this.b = oduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdu)) {
            return false;
        }
        zdu zduVar = (zdu) obj;
        return this.a == zduVar.a && jl40.l(this.b, zduVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HeaderGradientDrawableWithConfig(headerHeight=" + this.a + ", headerUiGradientConfig=" + this.b + Extension.C_BRAKE;
    }
}
