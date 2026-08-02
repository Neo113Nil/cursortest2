package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wvz {
    public final float a;
    public final kdc b;
    public final vvz c;
    public final int d;
    public final int e;

    public wvz(float f, kdc kdcVar, vvz vvzVar, int i, int i2) {
        this.a = f;
        this.b = kdcVar;
        this.c = vvzVar;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvz)) {
            return false;
        }
        wvz wvzVar = (wvz) obj;
        return Float.compare(this.a, wvzVar.a) == 0 && jl40.l(this.b, wvzVar.b) && this.c.equals(wvzVar.c) && this.d == wvzVar.d && this.e == wvzVar.e;
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        kdc kdcVar = this.b;
        return Integer.hashCode(this.e) + oyr.b(this.d, (this.c.hashCode() + ((hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoyaltyProgressViewData(progress=");
        sb.append(this.a);
        sb.append(", backgroundArcColor=");
        sb.append(this.b);
        sb.append(", progressArcColor=");
        sb.append(this.c);
        sb.append(", backgroundArcStrokeWidthDp=");
        sb.append(this.d);
        sb.append(", progressArcStrokeWidthDp=");
        return oyr.m(this.e, Extension.C_BRAKE, sb);
    }
}
