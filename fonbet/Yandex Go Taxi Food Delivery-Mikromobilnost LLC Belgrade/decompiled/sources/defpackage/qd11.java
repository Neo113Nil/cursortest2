package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class qd11 {
    public static final pd11 Companion = new pd11();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ qd11(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, od11.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd11)) {
            return false;
        }
        qd11 qd11Var = (qd11) obj;
        return jl40.l(this.a, qd11Var.a) && jl40.l(this.b, qd11Var.b) && jl40.l(this.c, qd11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Location(lat=");
        sb.append(this.a);
        sb.append(", lon=");
        sb.append(this.b);
        sb.append(", accuracy=");
        return b64.p(sb, this.c, ')');
    }

    public qd11(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
