package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class b90 {
    public final defpackage.y9 ZpBGe2uQfcn8;

    public b90(defpackage.y9 y9Var) {
        this.ZpBGe2uQfcn8 = y9Var;
    }

    public java.lang.Object ZpBGe2uQfcn8(defpackage.s81 s81Var) {
        java.lang.Iterable iterable;
        defpackage.hu huVar = (defpackage.hu) s81Var.WDYagTQQm9ns;
        defpackage.y9 y9Var = this.ZpBGe2uQfcn8;
        y9Var.toString();
        huVar.getClass();
        defpackage.lg0 lg0Var = defpackage.lg0.e6mdH7fiFuta;
        lg0Var.compareTo(defpackage.lg0.WDYagTQQm9ns);
        try {
            defpackage.jw0 jw0Var = (defpackage.jw0) s81Var.QiMR8OkAhezm;
            if (jw0Var == null) {
                jw0Var = new defpackage.jw0(3, null);
            }
            return y9Var.fWTAfUmVKrZq.QiMR8OkAhezm((defpackage.q81) s81Var.P05cfTpS5W5L, jw0Var);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(e);
            sb.append("\n\t");
            java.lang.StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            int i = 0;
            while (i < stackTrace.length) {
                java.lang.String className = stackTrace[i].getClassName();
                className.getClass();
                if (defpackage.tg1.Jkfc0NcwyPL8(className, "sun.reflect", false)) {
                    break;
                }
                i++;
            }
            if (i == 0) {
                iterable = defpackage.av.WDYagTQQm9ns;
            } else if (i != 1) {
                iterable = java.util.Arrays.asList(defpackage.y7.LCK4GGEwbWAr(stackTrace, 0, i));
                iterable.getClass();
            } else {
                iterable = defpackage.ma0.VFeft99leXEK(stackTrace[0]);
            }
            sb.append(defpackage.hf.m6iZQUu7XjoL(iterable, "\n\t", null, null, null, 62));
            y9Var.toString();
            lg0Var.compareTo(defpackage.lg0.P05cfTpS5W5L);
            throw new defpackage.to("Could not create instance for '" + y9Var + '\'', e);
        }
    }

    public abstract java.lang.Object giKS3J6vZuNy(defpackage.s81 s81Var);
}
