package defpackage;

/* loaded from: classes2.dex */
public final class zgd0 {
    public final long a;
    public final String b;
    public final boolean c;
    public final String d;

    public zgd0(long j, String str, String str2, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgd0)) {
            return false;
        }
        zgd0 zgd0Var = (zgd0) obj;
        return this.a == zgd0Var.a && jl40.l(this.b, zgd0Var.b) && this.c == zgd0Var.c && jl40.l(this.d, zgd0Var.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int e = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayUserState(id=");
        sb.append(this.a);
        sb.append(", login=");
        sb.append(this.b);
        sb.append(", hasPlus=");
        sb.append(this.c);
        sb.append(", avatarUrl=");
        return b64.p(sb, this.d, ')');
    }
}
