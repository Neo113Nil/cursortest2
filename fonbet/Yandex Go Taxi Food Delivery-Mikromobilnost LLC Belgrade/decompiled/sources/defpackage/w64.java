package defpackage;

/* loaded from: classes10.dex */
public final class w64 {
    public final k590 a;
    public final int b;

    public w64(k590 k590Var, int i) {
        if (k590Var == null) {
            ny61.t("Null packet");
            throw null;
        }
        this.a = k590Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w64) {
            w64 w64Var = (w64) obj;
            if (this.a.equals(w64Var.a) && this.b == w64Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return oyr.m(this.b, "}", sb);
    }
}
