package defpackage;

/* loaded from: classes.dex */
public final class ng0 implements defpackage.yi0 {
    public defpackage.yi0[] IHQe1A4L2xu;

    @Override // defpackage.yi0
    public final defpackage.ty0 IHQe1A4L2xu(java.lang.Class cls) {
        for (defpackage.yi0 yi0Var : this.IHQe1A4L2xu) {
            if (yi0Var.oh6vYeIP(cls)) {
                return yi0Var.IHQe1A4L2xu(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.yi0
    public final boolean oh6vYeIP(java.lang.Class cls) {
        for (defpackage.yi0 yi0Var : this.IHQe1A4L2xu) {
            if (yi0Var.oh6vYeIP(cls)) {
                return true;
            }
        }
        return false;
    }
}
