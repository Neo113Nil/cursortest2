package defpackage;

import java.util.Calendar;
import java.util.List;

/* loaded from: classes14.dex */
public final class q48 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Calendar e;
    public final a78 f;
    public final List g;
    public final boolean h;
    public final boolean i;

    public q48(p48 p48Var) {
        this.a = p48Var.a;
        this.b = p48Var.b;
        String str = p48Var.d;
        this.c = str == null ? "" : str;
        this.d = p48Var.c;
        this.e = p48Var.f;
        this.f = p48Var.g;
        this.g = p48Var.h;
        this.h = p48Var.e;
        this.i = p48Var.i;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final bvc0 c() {
        avc0 avc0Var = new avc0();
        avc0Var.b = this.d;
        avc0Var.c = this.f;
        avc0Var.d = this.g;
        avc0Var.a = this.h;
        avc0Var.e = this.i;
        return new bvc0(avc0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q48.class.equals(obj.getClass())) {
            return false;
        }
        q48 q48Var = (q48) obj;
        if (this.h == q48Var.h && this.i == q48Var.i && jl40.l(this.a, q48Var.a) && jl40.l(this.b, q48Var.b) && jl40.l(this.d, q48Var.d)) {
            return jl40.l(this.e, q48Var.e);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.h ? 1 : 0)) * 31;
        Calendar calendar = this.e;
        return hashCode3 + (calendar != null ? calendar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CarData{carName='", this.a, "', carColor='", this.b, "', carNumber='");
        tse0.y(this.d, "', isNumberYellow=", ", isComboOrder=", v, this.h);
        v.append(this.i);
        v.append(", due=");
        v.append(this.e);
        v.append("}");
        return v.toString();
    }
}
