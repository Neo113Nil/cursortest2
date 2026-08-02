package defpackage;

/* loaded from: classes2.dex */
public final class uld0 extends lu91 {
    public final String c;
    public final String d;
    public final Integer e;
    public final boolean f;
    public final boolean g;

    public uld0(String str, String str2, Integer num, boolean z, boolean z2) {
        this.c = str;
        this.d = str2;
        this.e = num;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uld0)) {
            return false;
        }
        uld0 uld0Var = (uld0) obj;
        return jl40.l(this.c, uld0Var.c) && jl40.l(this.d, uld0Var.d) && jl40.l(this.e, uld0Var.e) && this.f == uld0Var.f && this.g == uld0Var.g;
    }

    public final int hashCode() {
        int b = unr0.b(this.c.hashCode() * 31, 31, this.d);
        Integer num = this.e;
        return Boolean.hashCode(this.g) + unr0.e((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Styled(placeholderId=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", color=");
        sb.append(this.e);
        sb.append(", isBold=");
        sb.append(this.f);
        sb.append(", isItalic=");
        return unr0.u(sb, this.g, ')');
    }
}
