package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xm80 extends ym80 {
    public final int a;
    public final Integer b;
    public final String c;
    public final fm80 d;

    public xm80(int i, Integer num, String str, fm80 fm80Var) {
        this.a = i;
        this.b = num;
        this.c = str;
        this.d = fm80Var;
    }

    @Override // defpackage.ym80
    public final Integer a() {
        return this.b;
    }

    @Override // defpackage.ym80
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm80)) {
            return false;
        }
        xm80 xm80Var = (xm80) obj;
        return this.a == xm80Var.a && jl40.l(this.b, xm80Var.b) && jl40.l(this.c, xm80Var.c) && jl40.l(this.d, xm80Var.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OrganizationsInfoEmpty(page=" + this.a + ", nextPage=" + this.b + ", paginationContext=" + this.c + ", emptyScreenConfig=" + this.d + Extension.C_BRAKE;
    }
}
