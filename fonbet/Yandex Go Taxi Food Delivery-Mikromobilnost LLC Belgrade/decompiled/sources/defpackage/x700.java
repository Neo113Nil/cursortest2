package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class x700 {
    public final spr a;
    public final List b;
    public final rqy c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final lpt0 h;
    public final k71 i;

    public x700(spr sprVar, List list, rqy rqyVar, boolean z, String str, String str2, String str3, lpt0 lpt0Var, k71 k71Var) {
        this.a = sprVar;
        this.b = list;
        this.c = rqyVar;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = lpt0Var;
        this.i = k71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x700)) {
            return false;
        }
        x700 x700Var = (x700) obj;
        return jl40.l(this.a, x700Var.a) && jl40.l(this.b, x700Var.b) && jl40.l(this.c, x700Var.c) && this.d == x700Var.d && this.e.equals(x700Var.e) && jl40.l(this.f, x700Var.f) && jl40.l(this.g, x700Var.g) && jl40.l(this.h, x700Var.h) && jl40.l(this.i, x700Var.i);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.e((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        lpt0 lpt0Var = this.h;
        int hashCode2 = (hashCode + (lpt0Var == null ? 0 : lpt0Var.hashCode())) * 31;
        k71 k71Var = this.i;
        return hashCode2 + (k71Var != null ? k71Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainModalUiState(floatingTopContent=");
        sb.append(this.a);
        sb.append(", rowButtons=");
        sb.append(this.b);
        sb.append(", listButtons=");
        sb.append(this.c);
        sb.append(", isInteractingWithMap=");
        sb.append(this.d);
        sb.append(", headerTitle=");
        g8e.D(sb, this.e, ", headerImageTag=", this.f, ", currentSourceAddress=");
        sb.append(this.g);
        sb.append(", speedGroupUiState=");
        sb.append(this.h);
        sb.append(", addressShortcuts=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
