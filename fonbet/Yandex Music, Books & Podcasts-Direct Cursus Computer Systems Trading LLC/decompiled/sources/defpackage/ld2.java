package defpackage;

/* loaded from: classes3.dex */
public final class ld2 {
    public final String a;
    public final String b;

    public ld2(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            jj4.j("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ld2)) {
            return false;
        }
        ld2 ld2Var = (ld2) obj;
        return this.a.equals(ld2Var.a) && this.b.equals(ld2Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return su4.o(sb, this.b, "}");
    }
}
