package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class rlu {
    public final float a;
    public final String b;
    public final kdc c;

    public rlu(float f, kdc kdcVar, String str) {
        this.a = f;
        this.b = str;
        this.c = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlu)) {
            return false;
        }
        rlu rluVar = (rlu) obj;
        return Float.compare(this.a, rluVar.a) == 0 && jl40.l(this.b, rluVar.b) && jl40.l(this.c, rluVar.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        kdc kdcVar = this.c;
        return hashCode2 + (kdcVar != null ? kdcVar.hashCode() : 0);
    }

    public final String toString() {
        return "Bar(value=" + this.a + ", label=" + this.b + ", color=" + this.c + Extension.C_BRAKE;
    }
}
