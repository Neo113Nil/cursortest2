package defpackage;

import java.util.Calendar;

/* loaded from: classes12.dex */
public final class te7 {
    public final String a;
    public final xe7 b;
    public final Double c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final Calendar h;

    public te7(String str, xe7 xe7Var, Double d, String str2, boolean z, boolean z2, String str3, Calendar calendar) {
        this.a = str;
        this.b = xe7Var;
        this.c = d;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te7)) {
            return false;
        }
        te7 te7Var = (te7) obj;
        return jl40.l(this.a, te7Var.a) && this.b.equals(te7Var.b) && jl40.l(this.c, te7Var.c) && jl40.l(this.d, te7Var.d) && this.e == te7Var.e && this.f == te7Var.f && jl40.l(this.g, te7Var.g) && jl40.l(this.h, te7Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Double d = this.c;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.d;
        int e = unr0.e(unr0.e((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f);
        String str3 = this.g;
        int hashCode3 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        Calendar calendar = this.h;
        return hashCode3 + (calendar != null ? calendar.hashCode() : 0);
    }
}
