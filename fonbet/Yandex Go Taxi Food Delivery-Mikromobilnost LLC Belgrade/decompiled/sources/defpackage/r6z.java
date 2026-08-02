package defpackage;

/* loaded from: classes9.dex */
public final class r6z {
    public final u1k a;
    public final u1k b;

    public r6z(u1k u1kVar, u1k u1kVar2, int i) {
        u1kVar2 = (i & 2) != 0 ? null : u1kVar2;
        this.a = u1kVar;
        this.b = u1kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6z)) {
            return false;
        }
        r6z r6zVar = (r6z) obj;
        return jl40.l(this.a, r6zVar.a) && jl40.l(this.b, r6zVar.b);
    }

    public final int hashCode() {
        u1k u1kVar = this.a;
        int hashCode = (u1kVar == null ? 0 : Double.hashCode(u1kVar.a)) * 31;
        u1k u1kVar2 = this.b;
        return (hashCode + (u1kVar2 != null ? Double.hashCode(u1kVar2.a) : 0)) * 31;
    }

    public final String toString() {
        return "VerticalPosition(altitude=" + this.a + ", altitudeAccuracy=" + this.b + ", floor=null)";
    }
}
