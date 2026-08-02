package defpackage;

/* loaded from: classes2.dex */
public final class qw90 {
    public final String a;
    public final i3k0 b;

    public qw90(String str, i3k0 i3k0Var) {
        this.a = str;
        this.b = i3k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw90)) {
            return false;
        }
        qw90 qw90Var = (qw90) obj;
        return this.a.equals(qw90Var.a) && this.b.equals(qw90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubtitleText(__typename=" + this.a + ", richText=" + this.b + ')';
    }
}
