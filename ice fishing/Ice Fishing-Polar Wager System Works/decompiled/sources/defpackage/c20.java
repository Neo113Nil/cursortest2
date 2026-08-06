package defpackage;

/* loaded from: classes.dex */
public abstract class c20 implements java.lang.Cloneable {
    public final defpackage.e20 adDC3e2L;
    public defpackage.e20 xiZrDbcSW0;

    public c20(defpackage.e20 e20Var) {
        this.adDC3e2L = e20Var;
        if (e20Var.AARZUJiTa()) {
            defpackage.db.fnWB2E7cs("Default instance must be immutable.");
            throw null;
        }
        this.xiZrDbcSW0 = e20Var.riuEU0zW4();
    }

    public final defpackage.e20 IHQe1A4L2xu() {
        defpackage.e20 oh6vYeIP = oh6vYeIP();
        oh6vYeIP.getClass();
        if (defpackage.e20.xiZrDbcSW0(oh6vYeIP, true)) {
            return oh6vYeIP;
        }
        throw new defpackage.mk1();
    }

    public final java.lang.Object clone() {
        defpackage.c20 c20Var = (defpackage.c20) this.adDC3e2L.r1MBDhnF(5);
        c20Var.xiZrDbcSW0 = oh6vYeIP();
        return c20Var;
    }

    public final defpackage.e20 oh6vYeIP() {
        boolean AARZUJiTa = this.xiZrDbcSW0.AARZUJiTa();
        defpackage.e20 e20Var = this.xiZrDbcSW0;
        if (!AARZUJiTa) {
            return e20Var;
        }
        e20Var.getClass();
        defpackage.jy0 jy0Var = defpackage.jy0.r1MBDhnF;
        jy0Var.getClass();
        jy0Var.IHQe1A4L2xu(e20Var.getClass()).r1MBDhnF(e20Var);
        e20Var.EXtogiMhuM();
        return this.xiZrDbcSW0;
    }

    public final void r1MBDhnF() {
        if (this.xiZrDbcSW0.AARZUJiTa()) {
            return;
        }
        defpackage.e20 riuEU0zW4 = this.adDC3e2L.riuEU0zW4();
        defpackage.e20 e20Var = this.xiZrDbcSW0;
        defpackage.jy0 jy0Var = defpackage.jy0.r1MBDhnF;
        jy0Var.getClass();
        jy0Var.IHQe1A4L2xu(riuEU0zW4.getClass()).oh6vYeIP(riuEU0zW4, e20Var);
        this.xiZrDbcSW0 = riuEU0zW4;
    }
}
