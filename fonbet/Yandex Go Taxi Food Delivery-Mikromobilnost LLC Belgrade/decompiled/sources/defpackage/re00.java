package defpackage;

/* loaded from: classes.dex */
public final class re00 implements pt10 {
    public pt10[] a;

    @Override // defpackage.pt10
    public final t9i0 a(Class cls) {
        for (pt10 pt10Var : this.a) {
            if (pt10Var.b(cls)) {
                return pt10Var.a(cls);
            }
        }
        w511.x("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.pt10
    public final boolean b(Class cls) {
        for (pt10 pt10Var : this.a) {
            if (pt10Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
