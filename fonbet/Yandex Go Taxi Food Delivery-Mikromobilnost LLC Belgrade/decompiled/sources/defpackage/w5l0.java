package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class w5l0 implements uni {
    public final boolean a;
    public final String b;
    public final tse c;

    public w5l0(boolean z, String str, tse tseVar) {
        this.a = z;
        this.b = str;
        this.c = tseVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5l0)) {
            return false;
        }
        w5l0 w5l0Var = (w5l0) obj;
        return this.a == w5l0Var.a && jl40.l(this.b, w5l0Var.b) && this.c.equals(w5l0Var.c);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(true) * 31, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("RouteListArgs(canChangeOrder=true, shouldShowLocality=", ", metricaLabel=", this.b, ", scope=", this.a);
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
