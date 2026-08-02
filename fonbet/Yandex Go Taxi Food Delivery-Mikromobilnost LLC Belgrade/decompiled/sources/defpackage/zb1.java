package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class zb1 {
    public static final zb1 c = new zb1(zzs.f, "");
    public final String a;
    public final zzs b;

    public zb1(zzs zzsVar, String str) {
        this.a = str;
        this.b = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb1)) {
            return false;
        }
        zb1 zb1Var = (zb1) obj;
        return jl40.l(this.a, zb1Var.a) && jl40.l(this.b, zb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdjustmentSelectedPickupPoint(pickupPointId=" + this.a + ", finalSuggestGeoPoint=" + this.b + Extension.C_BRAKE;
    }
}
