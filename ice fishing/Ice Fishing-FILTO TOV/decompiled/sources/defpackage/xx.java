package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xx implements td0 {
    public static final xx Yi7zF1RB1 = new xx(0);
    public final /* synthetic */ int GWasM1elztuh;

    public /* synthetic */ xx(int i) {
        this.GWasM1elztuh = i;
    }

    @Override // defpackage.td0
    public final us0 GWasM1elztuh(Class cls) {
        switch (this.GWasM1elztuh) {
            case 0:
                if (!ay.class.isAssignableFrom(cls)) {
                    o4.mE4lRynR("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (us0) ay.xqGvceK5x(cls.asSubclass(ay.class)).X1lG3V04pd(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.td0
    public final boolean Yi7zF1RB1(Class cls) {
        switch (this.GWasM1elztuh) {
            case 0:
                return ay.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
