package defpackage;

/* loaded from: classes.dex */
public final class geo implements cje {
    public final boolean a;
    public final float b;
    public final long c;

    public geo(float f, long j, boolean z) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.cje
    public final sv7 b(uoi uoiVar) {
        pw7 pw7Var = new pw7(3, this);
        return new sw7(uoiVar, this.a, this.b, pw7Var, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof geo)) {
            return false;
        }
        geo geoVar = (geo) obj;
        if (this.a == geoVar.a && cma.a(this.b, geoVar.b)) {
            return d85.c(this.c, geoVar.c);
        }
        return false;
    }

    @Override // defpackage.cje
    public final int hashCode() {
        int a = eta.a(Boolean.hashCode(this.a) * 31, this.b, 961);
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.c) + a;
    }
}
