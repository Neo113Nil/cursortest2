package defpackage;

/* loaded from: classes14.dex */
public final class zb6 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public zb6(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb6)) {
            return false;
        }
        zb6 zb6Var = (zb6) obj;
        return jl40.l(this.a, zb6Var.a) && jl40.l(this.b, zb6Var.b) && jl40.l(this.c, zb6Var.c) && this.d == zb6Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
