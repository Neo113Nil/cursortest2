package defpackage;

/* loaded from: classes.dex */
public final class b20 implements defpackage.yi0 {
    public static final defpackage.b20 oh6vYeIP = new defpackage.b20(0);
    public final /* synthetic */ int IHQe1A4L2xu;

    public /* synthetic */ b20(int i) {
        this.IHQe1A4L2xu = i;
    }

    @Override // defpackage.yi0
    public final defpackage.ty0 IHQe1A4L2xu(java.lang.Class cls) {
        switch (this.IHQe1A4L2xu) {
            case 0:
                if (!defpackage.e20.class.isAssignableFrom(cls)) {
                    defpackage.db.fnWB2E7cs("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (defpackage.ty0) defpackage.e20.F7NU4MC0GW(cls.asSubclass(defpackage.e20.class)).r1MBDhnF(3);
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new java.lang.IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.yi0
    public final boolean oh6vYeIP(java.lang.Class cls) {
        switch (this.IHQe1A4L2xu) {
            case 0:
                return defpackage.e20.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
