package defpackage;

/* loaded from: classes3.dex */
public final class ub2 extends pp6 {
    public final String a;
    public final String b;
    public final String c;

    public ub2(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pp6) {
            ub2 ub2Var = (ub2) ((pp6) obj);
            if (this.a.equals(ub2Var.a) && this.b.equals(ub2Var.b) && this.c.equals(ub2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return su4.o(sb, this.c, "}");
    }
}
