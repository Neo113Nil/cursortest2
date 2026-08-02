package defpackage;

/* loaded from: classes.dex */
public final class yup implements tc6 {
    public final String a;
    public final int b;
    public final gk0 c;
    public final boolean d;

    public yup(String str, int i, gk0 gk0Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = gk0Var;
        this.d = z;
    }

    @Override // defpackage.tc6
    public final lb6 a(czg czgVar, ayg aygVar, ds2 ds2Var) {
        return new gup(czgVar, ds2Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return vz1.r(sb, this.b, '}');
    }
}
