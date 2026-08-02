package defpackage;

/* loaded from: classes6.dex */
public final class s0r0 {
    public final r0r0 a;

    public s0r0(yyq0 yyq0Var) {
        Object a = yyq0Var.a("SessionPromotionStorage", new ydf(10));
        if (!(a instanceof r0r0)) {
            xby.t(jst.e, "SESSION_STORAGE:FEATURE_DATA_TYPE_INCONSISTENCY", null, "Feature storage with id=SessionPromotionStorage is expected to has type " + qoi0.e(r0r0.class) + " but get " + (a != null ? a.getClass() : null), 6);
            a = new r0r0();
        }
        this.a = (r0r0) a;
    }
}
