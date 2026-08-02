package defpackage;

/* loaded from: classes.dex */
public final class sfk extends xfk {
    public final int a;
    public final kic b;

    public sfk(int i, kic kicVar) {
        this.a = i;
        this.b = kicVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfk)) {
            return false;
        }
        sfk sfkVar = (sfk) obj;
        return this.a == sfkVar.a && jl40.l(this.b, sfkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LinearGradient(angle=" + this.a + ", colormap=" + this.b + ')';
    }
}
