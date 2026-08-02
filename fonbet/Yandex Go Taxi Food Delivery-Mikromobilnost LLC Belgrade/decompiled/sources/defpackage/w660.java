package defpackage;

/* loaded from: classes3.dex */
public final class w660 {
    public final b1 a;
    public final t61 b;
    public final yyq0 c;

    public w660(b1 b1Var, t61 t61Var, yyq0 yyq0Var) {
        this.a = b1Var;
        this.b = t61Var;
        this.c = yyq0Var;
    }

    public final v660 a() {
        ydf ydfVar = new ydf(7);
        Object a = this.c.a("NextButtonAnalytics", ydfVar);
        if (!(a instanceof v660)) {
            xby.t(jst.e, "SESSION_STORAGE:FEATURE_DATA_TYPE_INCONSISTENCY", null, "Feature storage with id=NextButtonAnalytics is expected to has type " + qoi0.e(v660.class) + " but get " + (a != null ? a.getClass() : null), 6);
            a = ydfVar.get();
        }
        return (v660) a;
    }
}
