package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class w1x implements a2x {
    public static final v1x Companion = new v1x();
    public final String a;
    public final z1x b;

    public /* synthetic */ w1x(int i, String str, z1x z1xVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, u1x.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z1xVar;
    }

    public final z1x a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1x)) {
            return false;
        }
        w1x w1xVar = (w1x) obj;
        return jl40.l(this.a, w1xVar.a) && jl40.l(this.b, w1xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Link(link=" + this.a + ", description=" + this.b + ')';
    }

    public w1x(String str, z1x z1xVar) {
        this.a = str;
        this.b = z1xVar;
    }
}
