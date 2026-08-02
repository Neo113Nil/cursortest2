package defpackage;

/* loaded from: classes6.dex */
public final class unx0 {
    public final xcv0 a;
    public final o7r0 b;
    public final spb0 c;
    public final snx0 d;

    public unx0(yyq0 yyq0Var, xcv0 xcv0Var, o7r0 o7r0Var, spb0 spb0Var) {
        this.a = xcv0Var;
        this.b = o7r0Var;
        this.c = spb0Var;
        Object a = yyq0Var.a("SelectorDataStorage", new ydf(12));
        if (!(a instanceof snx0)) {
            xby.t(jst.e, "SESSION_STORAGE:FEATURE_DATA_TYPE_INCONSISTENCY", null, "Feature storage with id=SelectorDataStorage is expected to has type " + qoi0.e(snx0.class) + " but get " + (a != null ? a.getClass() : null), 6);
            a = new snx0();
        }
        this.d = (snx0) a;
    }
}
