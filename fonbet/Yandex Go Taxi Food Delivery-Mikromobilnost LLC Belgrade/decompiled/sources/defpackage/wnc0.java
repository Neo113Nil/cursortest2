package defpackage;

/* loaded from: classes2.dex */
public final class wnc0 {
    public final vnc0 a;
    public final String b;

    public wnc0(vnc0 vnc0Var, String str) {
        this.a = vnc0Var;
        this.b = str;
    }

    public final vnc0 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnc0)) {
            return false;
        }
        wnc0 wnc0Var = (wnc0) obj;
        return this.a.equals(wnc0Var.a) && this.b.equals(wnc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueLinkProperty(description=");
        sb.append(this.a);
        sb.append(", link=");
        return b64.p(sb, this.b, ')');
    }
}
