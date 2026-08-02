package defpackage;

/* loaded from: classes2.dex */
public final class zga0 {
    public final String a;
    public final i3k0 b;

    public zga0(String str, i3k0 i3k0Var) {
        this.a = str;
        this.b = i3k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zga0)) {
            return false;
        }
        zga0 zga0Var = (zga0) obj;
        return this.a.equals(zga0Var.a) && this.b.equals(zga0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdditionalTitle(__typename=" + this.a + ", richText=" + this.b + ')';
    }
}
