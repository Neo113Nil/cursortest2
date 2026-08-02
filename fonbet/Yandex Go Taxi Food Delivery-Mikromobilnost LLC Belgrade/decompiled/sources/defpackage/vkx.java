package defpackage;

/* loaded from: classes10.dex */
public final class vkx {
    public final Float a;
    public rbn b;

    public vkx(Float f, rbn rbnVar) {
        this.a = f;
        this.b = rbnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vkx)) {
            return false;
        }
        vkx vkxVar = (vkx) obj;
        return vkxVar.a.equals(this.a) && jl40.l(vkxVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + oyr.b(0, this.a.hashCode() * 31, 31);
    }
}
