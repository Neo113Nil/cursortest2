package defpackage;

/* loaded from: classes2.dex */
public final class xa4 {
    public final boolean a;
    public final String b;

    public xa4(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa4)) {
            return false;
        }
        xa4 xa4Var = (xa4) obj;
        return this.a == xa4Var.a && this.b.equals(xa4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Avatar(empty=");
        sb.append(this.a);
        sb.append(", passportAvatarId=");
        return b64.p(sb, this.b, ')');
    }
}
