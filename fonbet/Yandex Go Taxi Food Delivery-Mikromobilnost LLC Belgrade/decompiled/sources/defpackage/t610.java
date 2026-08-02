package defpackage;

/* loaded from: classes9.dex */
public final class t610 {
    public final String a;
    public final d6w b;

    public t610(String str, d6w d6wVar) {
        this.a = str;
        this.b = d6wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t610)) {
            return false;
        }
        t610 t610Var = (t610) obj;
        return this.a.equals(t610Var.a) && this.b.equals(t610Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
