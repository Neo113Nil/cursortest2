package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class qo50 {
    public static final po50 Companion = new po50();
    public final dr50 a;
    public final dr50 b;
    public final dr50 c;
    public final dr50 d;

    public /* synthetic */ qo50(int i, dr50 dr50Var, dr50 dr50Var2, dr50 dr50Var3, dr50 dr50Var4) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, oo50.a.getDescriptor());
            throw null;
        }
        this.a = dr50Var;
        this.b = dr50Var2;
        this.c = dr50Var3;
        this.d = dr50Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo50)) {
            return false;
        }
        qo50 qo50Var = (qo50) obj;
        return jl40.l(this.a, qo50Var.a) && jl40.l(this.b, qo50Var.b) && jl40.l(this.c, qo50Var.c) && jl40.l(this.d, qo50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NetworkBackgroundShapeModel(leftTopCorner=" + this.a + ", rightTopCorner=" + this.b + ", leftBottomCorner=" + this.c + ", rightBottomCorner=" + this.d + ')';
    }
}
