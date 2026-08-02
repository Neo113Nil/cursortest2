package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class w1u {
    public final String a;
    public final boolean b;
    public final String c;
    public final dj40 d;
    public final String e;
    public final w211 f;
    public final ArrayList g;
    public final kdc h;
    public final boolean i;
    public final String j;

    public w1u(String str, boolean z, String str2, dj40 dj40Var, String str3, w211 w211Var, ArrayList arrayList, kdc kdcVar, boolean z2, String str4) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = dj40Var;
        this.e = str3;
        this.f = w211Var;
        this.g = arrayList;
        this.h = kdcVar;
        this.i = z2;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1u)) {
            return false;
        }
        w1u w1uVar = (w1u) obj;
        return jl40.l(this.a, w1uVar.a) && this.b == w1uVar.b && this.c.equals(w1uVar.c) && this.d.equals(w1uVar.d) && jl40.l(this.e, w1uVar.e) && this.f.equals(w1uVar.f) && this.g.equals(w1uVar.g) && this.h.equals(w1uVar.h) && this.i == w1uVar.i && jl40.l(this.j, w1uVar.j);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d.a);
        String str = this.e;
        int e = unr0.e(smw0.d(this.h, ly3.b((this.f.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.g), 31), 31, this.i);
        String str2 = this.j;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("GroundThread(lineName=", this.a, ", isAeroExpress=", ", lineDestination=", this.b);
        l.append(this.c);
        l.append(", types=");
        l.append(this.d);
        l.append(", alternativeDepartureStopId=");
        l.append(this.e);
        l.append(", transportId=");
        l.append(this.f);
        l.append(", alerts=");
        l.append(this.g);
        l.append(", color=");
        l.append(this.h);
        l.append(", isRecommended=");
        return n.m(", lineId=", this.j, Extension.C_BRAKE, l, this.i);
    }
}
