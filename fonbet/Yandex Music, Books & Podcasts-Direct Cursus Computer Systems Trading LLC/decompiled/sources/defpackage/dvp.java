package defpackage;

/* loaded from: classes.dex */
public final class dvp implements tc6 {
    public final int a;
    public final hk0 b;
    public final hk0 c;
    public final hk0 d;
    public final boolean e;

    public dvp(String str, int i, hk0 hk0Var, hk0 hk0Var2, hk0 hk0Var3, boolean z) {
        this.a = i;
        this.b = hk0Var;
        this.c = hk0Var2;
        this.d = hk0Var3;
        this.e = z;
    }

    @Override // defpackage.tc6
    public final lb6 a(czg czgVar, ayg aygVar, ds2 ds2Var) {
        return new sat(ds2Var, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
