package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class tlu {
    public final float a;
    public final int b;
    public final kdc c;
    public final slu d;

    public tlu(float f, int i, kdc kdcVar, slu sluVar) {
        this.a = f;
        this.b = i;
        this.c = kdcVar;
        this.d = sluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlu)) {
            return false;
        }
        tlu tluVar = (tlu) obj;
        return Float.compare(this.a, tluVar.a) == 0 && this.b == tluVar.b && jl40.l(this.c, tluVar.c) && jl40.l(this.d, tluVar.d);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Float.hashCode(this.a) * 31, 31);
        kdc kdcVar = this.c;
        int hashCode = (b + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        slu sluVar = this.d;
        return hashCode + (sluVar != null ? sluVar.hashCode() : 0);
    }

    public final String toString() {
        return "CurrentValue(value=" + this.a + ", barIndex=" + this.b + ", color=" + this.c + ", bubble=" + this.d + Extension.C_BRAKE;
    }
}
