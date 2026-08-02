package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class st80 implements pw80 {
    public static final rt80 Companion = new rt80();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ st80(int i, String str, String str2, String str3, String str4) {
        if (12 != (i & 12)) {
            qje.Z(i, 12, qt80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st80)) {
            return false;
        }
        st80 st80Var = (st80) obj;
        return jl40.l(this.a, st80Var.a) && jl40.l(this.b, st80Var.b) && jl40.l(this.c, st80Var.c) && jl40.l(this.d, st80Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + unr0.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenNativeSharing(trackId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", mimeType=");
        return b64.p(sb, this.d, ')');
    }
}
