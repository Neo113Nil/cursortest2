package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class z280 {
    public final zzs a;
    public final boolean b;
    public final int c;
    public final float d;

    public z280(zzs zzsVar, boolean z, int i, float f) {
        this.a = zzsVar;
        this.b = z;
        this.c = i;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z280)) {
            return false;
        }
        z280 z280Var = (z280) obj;
        return jl40.l(this.a, z280Var.a) && this.b == z280Var.b && this.c == z280Var.c && Float.compare(this.d, z280Var.d) == 0;
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        return Float.hashCode(this.d) + oyr.b(this.c, unr0.e((zzsVar == null ? 0 : zzsVar.hashCode()) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "OrderOverlayState(geoPoint=" + this.a + ", isVisible=" + this.b + ", carImageHeight=" + this.c + ", sourcePointZIndex=" + this.d + Extension.C_BRAKE;
    }
}
