package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.preorder.summary.solid.sourcedestination.RideTimeAppearanceType;

/* loaded from: classes6.dex */
public final class vqk0 extends pqk0 {
    public final Drawable a;
    public final kdc b;
    public final kdc c;
    public final kdc d;

    public vqk0(Drawable drawable, kdc kdcVar, kdc kdcVar2, kdc kdcVar3) {
        RideTimeAppearanceType rideTimeAppearanceType = RideTimeAppearanceType.PLAIN_TEXT;
        this.a = drawable;
        this.b = kdcVar;
        this.c = kdcVar2;
        this.d = kdcVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqk0)) {
            return false;
        }
        vqk0 vqk0Var = (vqk0) obj;
        return jl40.l(this.a, vqk0Var.a) && jl40.l(this.b, vqk0Var.b) && jl40.l(this.c, vqk0Var.c) && jl40.l(this.d, vqk0Var.d);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        kdc kdcVar = this.b;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.c;
        int hashCode3 = (hashCode2 + (kdcVar2 == null ? 0 : kdcVar2.hashCode())) * 31;
        kdc kdcVar3 = this.d;
        return hashCode3 + (kdcVar3 != null ? kdcVar3.hashCode() : 0);
    }

    public final String toString() {
        return "RideTimeWithBackground(icon=" + this.a + ", backgroundColor=" + this.b + ", textColor=" + this.c + ", iconColor=" + this.d + Extension.C_BRAKE;
    }
}
