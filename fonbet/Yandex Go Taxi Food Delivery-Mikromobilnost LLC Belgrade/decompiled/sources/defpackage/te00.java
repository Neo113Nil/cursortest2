package defpackage;

/* loaded from: classes.dex */
public final class te00 implements rt10 {
    public rt10[] a;

    @Override // defpackage.rt10
    public final v9i0 a(Class cls) {
        for (rt10 rt10Var : this.a) {
            if (rt10Var.b(cls)) {
                return rt10Var.a(cls);
            }
        }
        w511.x("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.rt10
    public final boolean b(Class cls) {
        for (rt10 rt10Var : this.a) {
            if (rt10Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
