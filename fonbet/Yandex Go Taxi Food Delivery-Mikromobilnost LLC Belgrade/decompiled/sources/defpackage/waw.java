package defpackage;

/* loaded from: classes14.dex */
public final class waw {
    public final vaw a;
    public final vaw b;

    public waw(vaw vawVar, vaw vawVar2) {
        this.a = vawVar;
        this.b = vawVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof waw)) {
            return false;
        }
        waw wawVar = (waw) obj;
        return jl40.l(this.a, wawVar.a) && jl40.l(this.b, wawVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
