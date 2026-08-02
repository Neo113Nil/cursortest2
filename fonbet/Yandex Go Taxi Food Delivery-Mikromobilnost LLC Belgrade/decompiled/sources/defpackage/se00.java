package defpackage;

/* loaded from: classes.dex */
public final class se00 implements qt10 {
    public qt10[] a;

    @Override // defpackage.qt10
    public final u9i0 a(Class cls) {
        for (qt10 qt10Var : this.a) {
            if (qt10Var.b(cls)) {
                return qt10Var.a(cls);
            }
        }
        w511.x("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.qt10
    public final boolean b(Class cls) {
        for (qt10 qt10Var : this.a) {
            if (qt10Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
