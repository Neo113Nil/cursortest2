package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class yq50 implements dr50 {
    public static final xq50 Companion = new xq50();
    public final String a;
    public final int b;

    public /* synthetic */ yq50(int i, String str, int i2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, wq50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq50)) {
            return false;
        }
        yq50 yq50Var = (yq50) obj;
        return jl40.l(this.a, yq50Var.a) && this.b == yq50Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkCornerFixModel(type=");
        sb.append(this.a);
        sb.append(", value=");
        return oyr.s(sb, this.b, ')');
    }
}
