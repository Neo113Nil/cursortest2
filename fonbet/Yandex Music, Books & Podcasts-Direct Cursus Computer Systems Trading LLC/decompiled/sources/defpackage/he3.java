package defpackage;

/* loaded from: classes4.dex */
public final class he3 extends je3 {
    public final String a;
    public final String b;

    public he3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.je3
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he3)) {
            return false;
        }
        he3 he3Var = (he3) obj;
        return this.a.equals(he3Var.a) && this.b.equals(he3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("Chosen(key=", this.a, ", title=", this.b, ")");
    }
}
