package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zxi {
    public final int a;
    public final int b;
    public final String c;

    public zxi(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxi)) {
            return false;
        }
        zxi zxiVar = (zxi) obj;
        return this.a == zxiVar.a && this.b == zxiVar.b && jl40.l(this.c, zxiVar.c);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.s(this.a, this.b, "DescriptionState(pointCount=", ", currentPointIndex=", ", description="), this.c, Extension.C_BRAKE);
    }

    public zxi() {
        this(0);
    }

    public /* synthetic */ zxi(int i) {
        this(0, 0, null);
    }
}
