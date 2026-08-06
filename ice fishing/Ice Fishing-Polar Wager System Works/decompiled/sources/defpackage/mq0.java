package defpackage;

/* loaded from: classes.dex */
public final class mq0 implements android.window.OnBackAnimationCallback {
    public final /* synthetic */ defpackage.kq0 IHQe1A4L2xu;

    public mq0(defpackage.kq0 kq0Var) {
        this.IHQe1A4L2xu = kq0Var;
    }

    public final void onBackCancelled() {
        defpackage.kq0 kq0Var = this.IHQe1A4L2xu;
        defpackage.y yVar = kq0Var.IHQe1A4L2xu;
        if (yVar == null) {
            defpackage.db.AARZUJiTa("This input is not added to any dispatcher.");
            return;
        }
        if (!kq0Var.oh6vYeIP) {
            yVar.xiZrDbcSW0(kq0Var, null);
        }
        defpackage.ko0 ko0Var = (defpackage.ko0) yVar.xiZrDbcSW0;
        ko0Var.getClass();
        if (kq0Var.equals(ko0Var.EXtogiMhuM) && -1 == ko0Var.AARZUJiTa) {
            defpackage.ho0 ho0Var = ko0Var.xiZrDbcSW0;
            if (ho0Var == null) {
                ho0Var = ko0Var.r1MBDhnF(-1);
            }
            ko0Var.xiZrDbcSW0 = null;
            ko0Var.AARZUJiTa = 0;
            ko0Var.EXtogiMhuM = null;
            if (ho0Var != null) {
                ho0Var.IHQe1A4L2xu();
            }
            defpackage.hc1 hc1Var = ko0Var.IHQe1A4L2xu;
            hc1Var.getClass();
            hc1Var.ez2rX8ReCYw(null, defpackage.lo0.xiZrDbcSW0);
        }
        kq0Var.oh6vYeIP = false;
    }

    public final void onBackInvoked() {
        this.IHQe1A4L2xu.IHQe1A4L2xu();
    }

    public final void onBackProgressed(android.window.BackEvent backEvent) {
        backEvent.getClass();
        defpackage.fo0 oh6vYeIP = defpackage.x80.oh6vYeIP(backEvent);
        defpackage.kq0 kq0Var = this.IHQe1A4L2xu;
        defpackage.y yVar = kq0Var.IHQe1A4L2xu;
        if (yVar == null) {
            defpackage.db.AARZUJiTa("This input is not added to any dispatcher.");
            return;
        }
        if (kq0Var.oh6vYeIP) {
            defpackage.ko0 ko0Var = (defpackage.ko0) yVar.xiZrDbcSW0;
            ko0Var.getClass();
            if (kq0Var.equals(ko0Var.EXtogiMhuM) && -1 == ko0Var.AARZUJiTa) {
                defpackage.ho0 ho0Var = ko0Var.xiZrDbcSW0;
                if (ho0Var == null) {
                    ho0Var = ko0Var.r1MBDhnF(-1);
                }
                if (ho0Var != null) {
                    ho0Var.r1MBDhnF(oh6vYeIP);
                }
                defpackage.hc1 hc1Var = ko0Var.IHQe1A4L2xu;
                defpackage.mo0 mo0Var = new defpackage.mo0(oh6vYeIP);
                hc1Var.getClass();
                hc1Var.ez2rX8ReCYw(null, mo0Var);
            }
        }
    }

    public final void onBackStarted(android.window.BackEvent backEvent) {
        backEvent.getClass();
        defpackage.fo0 oh6vYeIP = defpackage.x80.oh6vYeIP(backEvent);
        defpackage.kq0 kq0Var = this.IHQe1A4L2xu;
        defpackage.y yVar = kq0Var.IHQe1A4L2xu;
        if (yVar == null) {
            defpackage.db.AARZUJiTa("This input is not added to any dispatcher.");
        } else {
            if (kq0Var.oh6vYeIP) {
                return;
            }
            yVar.xiZrDbcSW0(kq0Var, oh6vYeIP);
            kq0Var.oh6vYeIP = true;
        }
    }
}
