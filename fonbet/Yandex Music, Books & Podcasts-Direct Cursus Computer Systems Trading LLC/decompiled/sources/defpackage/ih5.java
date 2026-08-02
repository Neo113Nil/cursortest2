package defpackage;

/* loaded from: classes3.dex */
public final class ih5 {
    public final String a;
    public final gh5 b;

    public ih5(String str, gh5 gh5Var) {
        this.a = str;
        this.b = gh5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih5)) {
            return false;
        }
        ih5 ih5Var = (ih5) obj;
        return this.a.equals(ih5Var.a) && this.b.equals(ih5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TitleItem(text=" + this.a + ", color=" + this.b + ")";
    }
}
