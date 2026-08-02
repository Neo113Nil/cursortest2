package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yex0 {
    public final au2 a;
    public final wp2 b;
    public final String c;
    public final String d;

    public yex0(au2 au2Var, wp2 wp2Var, String str, String str2) {
        this.a = au2Var;
        this.b = wp2Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yex0) {
            yex0 yex0Var = (yex0) obj;
            if (this.a == yex0Var.a && jl40.l(this.b, yex0Var.b) && Float.compare(0.5f, 0.5f) == 0 && jl40.l(this.c, yex0Var.c) && jl40.l(this.d, yex0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(g8e.c(0.5f, n.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffDetailsButtonUiState(appIcon=");
        sb.append(this.a);
        sb.append(", tintColor=");
        sb.append(this.b);
        sb.append(", alpha=0.5, contentDescription=");
        return g8e.r(sb, this.c, ", clickActionLabel=", this.d, Extension.C_BRAKE);
    }
}
