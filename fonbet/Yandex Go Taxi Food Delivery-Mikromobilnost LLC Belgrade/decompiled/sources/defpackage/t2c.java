package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class t2c {
    public final String a;
    public final String b;
    public final String c;
    public final s2c d;
    public final List e;
    public final boolean f;
    public final r2c g;

    public t2c(String str, String str2, String str3, s2c s2cVar, List list, boolean z, r2c r2cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = s2cVar;
        this.e = list;
        this.f = z;
        this.g = r2cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2c)) {
            return false;
        }
        t2c t2cVar = (t2c) obj;
        return jl40.l(this.a, t2cVar.a) && jl40.l(this.b, t2cVar.b) && jl40.l(this.c, t2cVar.c) && this.d.equals(t2cVar.d) && jl40.l(this.e, t2cVar.e) && this.f == t2cVar.f && jl40.l(this.g, t2cVar.g);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.c((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
        r2c r2cVar = this.g;
        return e + (r2cVar == null ? 0 : r2cVar.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ClientContext(screen=", this.a, ", orderState=", this.b, ", paymentMethod=");
        v.append(this.c);
        v.append(", selectedTariff=");
        v.append(this.d);
        v.append(", availableTariffs=");
        nzs.p(v, this.e, ", forceHideBadge=", this.f, ", switchState=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
