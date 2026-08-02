package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z77 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final s9e g;
    public final ArrayList h;

    public z77(String str, String str2, String str3, String str4, String str5, String str6, s9e s9eVar, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = s9eVar;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z77)) {
            return false;
        }
        z77 z77Var = (z77) obj;
        return jl40.l(this.a, z77Var.a) && jl40.l(this.b, z77Var.b) && jl40.l(this.c, z77Var.c) && jl40.l(this.d, z77Var.d) && jl40.l(this.e, z77Var.e) && jl40.l(this.f, z77Var.f) && jl40.l(this.g, z77Var.g) && this.h.equals(z77Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("C2CEditRoutePoint(serverPointId=", this.a, ", entrance=", this.b, ", floor=");
        g8e.D(v, this.c, ", apartment=", this.d, ", doorPhone=");
        g8e.D(v, this.e, ", comment=", this.f, ", contact=");
        v.append(this.g);
        v.append(", photoCommentItems=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
