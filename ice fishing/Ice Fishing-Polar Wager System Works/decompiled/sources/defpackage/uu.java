package defpackage;

/* loaded from: classes.dex */
public final class uu {
    public static volatile defpackage.uu IHQe1A4L2xu;
    public static final defpackage.uu oh6vYeIP;

    static {
        defpackage.uu uuVar = new defpackage.uu();
        java.util.Map map = java.util.Collections.EMPTY_MAP;
        oh6vYeIP = uuVar;
    }

    public static defpackage.uu IHQe1A4L2xu() {
        defpackage.uu uuVar;
        defpackage.jy0 jy0Var = defpackage.jy0.r1MBDhnF;
        defpackage.uu uuVar2 = IHQe1A4L2xu;
        if (uuVar2 != null) {
            return uuVar2;
        }
        synchronized (defpackage.uu.class) {
            try {
                uuVar = IHQe1A4L2xu;
                if (uuVar == null) {
                    java.lang.Class cls = defpackage.tu.IHQe1A4L2xu;
                    defpackage.uu uuVar3 = null;
                    if (cls != null) {
                        try {
                            uuVar3 = (defpackage.uu) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    uuVar = uuVar3 != null ? uuVar3 : oh6vYeIP;
                    IHQe1A4L2xu = uuVar;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return uuVar;
    }
}
