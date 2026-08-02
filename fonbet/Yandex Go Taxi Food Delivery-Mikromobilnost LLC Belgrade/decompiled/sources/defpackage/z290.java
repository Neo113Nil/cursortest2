package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class z290 {
    public final Integer a;
    public final String b;
    public final t2v0 c;
    public final String d;
    public final String e;
    public final boolean f;

    public z290(Integer num, String str, t2v0 t2v0Var, String str2, String str3, boolean z) {
        this.a = num;
        this.b = str;
        this.c = t2v0Var;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z290)) {
            return false;
        }
        z290 z290Var = (z290) obj;
        return jl40.l(this.a, z290Var.a) && jl40.l(this.b, z290Var.b) && jl40.l(this.c, z290Var.c) && jl40.l(this.d, z290Var.d) && jl40.l(this.e, z290Var.e) && this.f == z290Var.f;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Boolean.hashCode(this.f) + unr0.b(unr0.b((this.c.hashCode() + unr0.b((num == null ? 0 : num.hashCode()) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverviewIncidentsUiState(iconRes=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitleState=");
        sb.append(this.c);
        sb.append(", approveButtonText=");
        sb.append(this.d);
        sb.append(", declineButtonText=");
        return nnm.i(this.e, ", showSmallCamera=", Extension.C_BRAKE, sb, this.f);
    }
}
