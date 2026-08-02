package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ve4 {
    public final Long a;
    public final String b;
    public final String c;
    public final ue4 d;
    public final String e;
    public final etq f;

    public ve4(Long l, String str, String str2, ue4 ue4Var, String str3, etq etqVar) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = ue4Var;
        this.e = str3;
        this.f = etqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve4)) {
            return false;
        }
        ve4 ve4Var = (ve4) obj;
        return Intrinsics.d(this.a, ve4Var.a) && Intrinsics.d(this.b, ve4Var.b) && Intrinsics.d(this.c, ve4Var.c) && this.d == ve4Var.d && this.e.equals(ve4Var.e) && this.f == ve4Var.f;
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.f.hashCode() + k5r.c((this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "ChartItem(value=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", titleType=" + this.d + ", cover=" + this.e + ", coverType=" + this.f + ")";
    }
}
