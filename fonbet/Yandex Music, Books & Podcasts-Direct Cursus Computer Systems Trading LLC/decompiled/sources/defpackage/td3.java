package defpackage;

/* loaded from: classes4.dex */
public final class td3 extends zd3 {
    public final String b;
    public final vd3 c;
    public final ud3 d;
    public final ud3 e;

    public td3(String str, vd3 vd3Var, ud3 ud3Var, ud3 ud3Var2) {
        super(48);
        this.b = str;
        this.c = vd3Var;
        this.d = ud3Var;
        this.e = ud3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td3)) {
            return false;
        }
        td3 td3Var = (td3) obj;
        return this.b.equals(td3Var.b) && this.c == td3Var.c && this.d.equals(td3Var.d) && this.e.equals(td3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LikeButton(entityId=" + this.b + ", entityType=" + this.c + ", unlikedState=" + this.d + ", likedState=" + this.e + ")";
    }
}
