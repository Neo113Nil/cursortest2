package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class z0v0 {
    public static final y0v0 Companion = new y0v0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ z0v0(int i, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, x0v0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0v0)) {
            return false;
        }
        z0v0 z0v0Var = (z0v0) obj;
        return jl40.l(this.a, z0v0Var.a) && jl40.l(this.b, z0v0Var.b) && jl40.l(this.c, z0v0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trust3dsInfoDto(status=");
        sb.append(this.a);
        sb.append(", processUrl=");
        sb.append(this.b);
        sb.append(", redirectUrl=");
        return b64.p(sb, this.c, ')');
    }
}
