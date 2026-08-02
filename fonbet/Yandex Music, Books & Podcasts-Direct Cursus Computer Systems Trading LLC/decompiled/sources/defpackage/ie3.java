package defpackage;

/* loaded from: classes4.dex */
public final class ie3 extends je3 {
    public final String a;
    public final String b;

    public ie3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.je3
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie3)) {
            return false;
        }
        ie3 ie3Var = (ie3) obj;
        return this.a.equals(ie3Var.a) && this.b.equals(ie3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("Text(title=", this.a, ", subtitle=", this.b, ")");
    }
}
