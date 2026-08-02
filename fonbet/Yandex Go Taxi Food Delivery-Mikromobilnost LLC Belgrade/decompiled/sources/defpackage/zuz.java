package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class zuz {
    public final zzs a;
    public final String b;

    public zuz(zzs zzsVar, String str) {
        this.a = zzsVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuz)) {
            return false;
        }
        zuz zuzVar = (zuz) obj;
        return jl40.l(this.a, zuzVar.a) && jl40.l(this.b, zuzVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Address(geoPoint=" + this.a + ", zoneName=" + this.b + Extension.C_BRAKE;
    }
}
