package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class x990 implements uni {
    public final u990 A;
    public final boolean B;
    public final String a;
    public final List b;
    public final List c;
    public final v990 w;
    public final String x;
    public final w990 y;
    public final String z;

    public x990(String str, List list, List list2, v990 v990Var, String str2, w990 w990Var, String str3, u990 u990Var, boolean z) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.w = v990Var;
        this.x = str2;
        this.y = w990Var;
        this.z = str3;
        this.A = u990Var;
        this.B = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x990)) {
            return false;
        }
        x990 x990Var = (x990) obj;
        return jl40.l(this.a, x990Var.a) && jl40.l(this.b, x990Var.b) && jl40.l(this.c, x990Var.c) && jl40.l(this.w, x990Var.w) && jl40.l(this.x, x990Var.x) && jl40.l(this.y, x990Var.y) && jl40.l(this.z, x990Var.z) && jl40.l(this.A, x990Var.A) && this.B == x990Var.B;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        v990 v990Var = this.w;
        int hashCode4 = (hashCode3 + (v990Var == null ? 0 : v990Var.hashCode())) * 31;
        String str = this.x;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        w990 w990Var = this.y;
        int b = unr0.b((hashCode5 + (w990Var == null ? 0 : w990Var.hashCode())) * 31, 31, this.z);
        u990 u990Var = this.A;
        return Boolean.hashCode(this.B) + ((b + (u990Var != null ? u990Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = xvz.r("PaidInsuranceArgs(title=", this.a, ", description=", this.b, ", descriptionAt=");
        r.append(this.c);
        r.append(", toggle=");
        r.append(this.w);
        r.append(", imageUrl=");
        r.append(this.x);
        r.append(", infoButton=");
        r.append(this.y);
        r.append(", buttonTitle=");
        r.append(this.z);
        r.append(", button=");
        r.append(this.A);
        r.append(", isInsuranceEnabledInitial=");
        return x4e.i(r, this.B, Extension.C_BRAKE);
    }
}
