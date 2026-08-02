package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vs01 implements m1j {
    public final CharSequence a;
    public final String b;
    public final String c;
    public final String d;

    public vs01(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs01)) {
            return false;
        }
        vs01 vs01Var = (vs01) obj;
        if (!jl40.l(this.a, vs01Var.a) || !this.b.equals(vs01Var.b) || !jl40.l(this.c, vs01Var.c)) {
            return false;
        }
        g911 g911Var = g911.a;
        return g911Var.equals(g911Var) && jl40.l(this.d, vs01Var.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31) - 677487839) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferRouteItem(text=");
        sb.append((Object) this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", v2Text=");
        sb.append(this.c);
        sb.append(", transportType=");
        sb.append(g911.a);
        sb.append(", id=");
        return oyr.t(sb, this.d, Extension.C_BRAKE);
    }
}
