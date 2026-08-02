package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ugg0 extends t4z0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final float e;
    public final ldc f;
    public final ldc g;
    public final ldc h;
    public final ldc i;

    public ugg0(String str, String str2, String str3, String str4, float f, ldc ldcVar, ldc ldcVar2, ldc ldcVar3, ldc ldcVar4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = f;
        this.f = ldcVar;
        this.g = ldcVar2;
        this.h = ldcVar3;
        this.i = ldcVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugg0)) {
            return false;
        }
        ugg0 ugg0Var = (ugg0) obj;
        return jl40.l(this.a, ugg0Var.a) && jl40.l(this.b, ugg0Var.b) && jl40.l(this.c, ugg0Var.c) && jl40.l(this.d, ugg0Var.d) && Float.compare(this.e, ugg0Var.e) == 0 && jl40.l(this.f, ugg0Var.f) && jl40.l(this.g, ugg0Var.g) && jl40.l(this.h, ugg0Var.h) && jl40.l(this.i, ugg0Var.i);
    }

    public final int hashCode() {
        int c = g8e.c(this.e, unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        ldc ldcVar = this.f;
        int hashCode = (c + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        ldc ldcVar2 = this.g;
        int hashCode2 = (hashCode + (ldcVar2 == null ? 0 : Long.hashCode(ldcVar2.a))) * 31;
        ldc ldcVar3 = this.h;
        int hashCode3 = (hashCode2 + (ldcVar3 == null ? 0 : Long.hashCode(ldcVar3.a))) * 31;
        ldc ldcVar4 = this.i;
        return hashCode3 + (ldcVar4 != null ? Long.hashCode(ldcVar4.a) : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("QuantityGraphTileFooterState(totalQuantity=", this.a, ", totalCaption=", this.b, ", partQuantity=");
        g8e.D(v, this.c, ", partCaption=", this.d, ", ratio=");
        v.append(this.e);
        v.append(", quantityColor=");
        v.append(this.f);
        v.append(", captionColor=");
        v.append(this.g);
        v.append(", graphColor=");
        v.append(this.h);
        v.append(", graphColorAccent=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
