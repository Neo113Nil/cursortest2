package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class fc0 {
    public static final defpackage.sj ZpBGe2uQfcn8;

    static {
        new defpackage.zf0(new defpackage.n8(19));
        new defpackage.zf0(new defpackage.n8(20));
        ZpBGe2uQfcn8 = new defpackage.sj(new defpackage.n8(21));
        new defpackage.zf0(new defpackage.n8(22));
    }

    public static final defpackage.q81 ZpBGe2uQfcn8(defpackage.e30 e30Var) {
        defpackage.sj sjVar = ZpBGe2uQfcn8;
        try {
            defpackage.ci ciVar = (defpackage.ci) e30Var.GE9mJIPrb8gP(sjVar);
            if (ciVar.giKS3J6vZuNy == null) {
                ciVar.giKS3J6vZuNy = ciVar.ZpBGe2uQfcn8.ZpBGe2uQfcn8();
            }
            java.lang.Object obj = ciVar.giKS3J6vZuNy;
            if (obj != null) {
                return (defpackage.q81) obj;
            }
            throw new java.lang.IllegalStateException("Can't retrieve Koin context value. Ensure Koin is properly initialized with startKoin() or KoinApplication.");
        } catch (java.lang.Exception e) {
            defpackage.ci ciVar2 = (defpackage.ci) e30Var.GE9mJIPrb8gP(sjVar);
            java.lang.Object ZpBGe2uQfcn82 = ciVar2.ZpBGe2uQfcn8.ZpBGe2uQfcn8();
            ciVar2.giKS3J6vZuNy = ZpBGe2uQfcn82;
            defpackage.q81 q81Var = (defpackage.q81) ZpBGe2uQfcn82;
            if (q81Var != null) {
                return q81Var;
            }
            defpackage.h7.QiMR8OkAhezm(e, "Can't get Koin scope due to error: ");
            return null;
        }
    }
}
