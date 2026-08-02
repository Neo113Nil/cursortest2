package defpackage;

/* loaded from: classes15.dex */
public final class ql {
    public final im a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ql(im imVar, String str, String str2, String str3, String str4, int i) {
        str4 = (i & 256) != 0 ? null : str4;
        this.a = imVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql)) {
            return false;
        }
        ql qlVar = (ql) obj;
        return jl40.l(this.a, qlVar.a) && jl40.l(this.b, qlVar.b) && jl40.l(this.c, qlVar.c) && jl40.l(this.d, qlVar.d) && jl40.l(this.e, qlVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.c;
        int e = unr0.e(unr0.e((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, false), 31, false);
        String str3 = this.d;
        int hashCode3 = (e + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.e;
        return (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountModel(uid=");
        sb.append(this.a);
        sb.append(", firstName=");
        sb.append(this.b);
        sb.append(", lastName=null, email=");
        g8e.D(sb, this.c, ", hasPlus=false, isPaid=false, avatarUrl=", this.d, ", status=null, monogram=");
        return oyr.t(sb, this.e, ", monogramColor=null)");
    }
}
