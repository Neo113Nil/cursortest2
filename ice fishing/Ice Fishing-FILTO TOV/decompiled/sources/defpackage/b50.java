package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class b50 {
    public static final lf GWasM1elztuh;

    static {
        new b90(new sb9fmtV8A(11));
        new b90(new sb9fmtV8A(12));
        GWasM1elztuh = new lf(new sb9fmtV8A(13));
        new b90(new sb9fmtV8A(14));
    }

    public static final px0 GWasM1elztuh(qx qxVar) {
        lf lfVar = GWasM1elztuh;
        try {
            vd vdVar = (vd) qxVar.JFJ3QoxA(lfVar);
            if (vdVar.Yi7zF1RB1 == null) {
                vdVar.Yi7zF1RB1 = vdVar.GWasM1elztuh.GWasM1elztuh();
            }
            Object obj = vdVar.Yi7zF1RB1;
            if (obj != null) {
                return (px0) obj;
            }
            throw new IllegalStateException("Can't retrieve Koin context value. Ensure Koin is properly initialized with startKoin() or KoinApplication.");
        } catch (Exception e) {
            vd vdVar2 = (vd) qxVar.JFJ3QoxA(lfVar);
            Object GWasM1elztuh2 = vdVar2.GWasM1elztuh.GWasM1elztuh();
            vdVar2.Yi7zF1RB1 = GWasM1elztuh2;
            px0 px0Var = (px0) GWasM1elztuh2;
            if (px0Var != null) {
                return px0Var;
            }
            o4.EljAMC1QTz(e, "Can't get Koin scope due to error: ");
            return null;
        }
    }
}
