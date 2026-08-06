package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class et0 implements android.window.OnBackAnimationCallback {
    public final /* synthetic */ defpackage.dt0 ZpBGe2uQfcn8;

    public et0(defpackage.dt0 dt0Var) {
        this.ZpBGe2uQfcn8 = dt0Var;
    }

    public final void onBackCancelled() {
        defpackage.dt0 dt0Var = this.ZpBGe2uQfcn8;
        defpackage.s81 s81Var = dt0Var.ZpBGe2uQfcn8;
        if (s81Var == null) {
            defpackage.h7.P05cfTpS5W5L("This input is not added to any dispatcher.");
            return;
        }
        if (!dt0Var.giKS3J6vZuNy) {
            s81Var.QiMR8OkAhezm(dt0Var, null);
        }
        defpackage.uq0 uq0Var = (defpackage.uq0) s81Var.oh71FJcDz6S2;
        uq0Var.getClass();
        if (dt0Var.equals(uq0Var.P05cfTpS5W5L) && -1 == uq0Var.QiMR8OkAhezm) {
            defpackage.rq0 rq0Var = uq0Var.oh71FJcDz6S2;
            if (rq0Var == null) {
                rq0Var = uq0Var.fWTAfUmVKrZq(-1);
            }
            uq0Var.oh71FJcDz6S2 = null;
            uq0Var.QiMR8OkAhezm = 0;
            uq0Var.P05cfTpS5W5L = null;
            if (rq0Var != null) {
                rq0Var.ZpBGe2uQfcn8();
            }
            defpackage.gg1 gg1Var = uq0Var.ZpBGe2uQfcn8;
            gg1Var.getClass();
            gg1Var.GE9mJIPrb8gP(null, defpackage.vq0.ZpBGe2uQfcn8);
        }
        dt0Var.giKS3J6vZuNy = false;
    }

    public final void onBackInvoked() {
        this.ZpBGe2uQfcn8.ZpBGe2uQfcn8();
    }

    public final void onBackProgressed(android.window.BackEvent backEvent) {
        backEvent.getClass();
        defpackage.pq0 giKS3J6vZuNy = defpackage.j80.giKS3J6vZuNy(backEvent);
        defpackage.dt0 dt0Var = this.ZpBGe2uQfcn8;
        defpackage.s81 s81Var = dt0Var.ZpBGe2uQfcn8;
        if (s81Var == null) {
            defpackage.h7.P05cfTpS5W5L("This input is not added to any dispatcher.");
            return;
        }
        if (dt0Var.giKS3J6vZuNy) {
            defpackage.uq0 uq0Var = (defpackage.uq0) s81Var.oh71FJcDz6S2;
            uq0Var.getClass();
            if (dt0Var.equals(uq0Var.P05cfTpS5W5L) && -1 == uq0Var.QiMR8OkAhezm) {
                defpackage.rq0 rq0Var = uq0Var.oh71FJcDz6S2;
                if (rq0Var == null) {
                    rq0Var = uq0Var.fWTAfUmVKrZq(-1);
                }
                if (rq0Var != null) {
                    rq0Var.fWTAfUmVKrZq(giKS3J6vZuNy);
                }
                defpackage.gg1 gg1Var = uq0Var.ZpBGe2uQfcn8;
                defpackage.wq0 wq0Var = new defpackage.wq0(giKS3J6vZuNy);
                gg1Var.getClass();
                gg1Var.GE9mJIPrb8gP(null, wq0Var);
            }
        }
    }

    public final void onBackStarted(android.window.BackEvent backEvent) {
        backEvent.getClass();
        defpackage.pq0 giKS3J6vZuNy = defpackage.j80.giKS3J6vZuNy(backEvent);
        defpackage.dt0 dt0Var = this.ZpBGe2uQfcn8;
        defpackage.s81 s81Var = dt0Var.ZpBGe2uQfcn8;
        if (s81Var == null) {
            defpackage.h7.P05cfTpS5W5L("This input is not added to any dispatcher.");
        } else {
            if (dt0Var.giKS3J6vZuNy) {
                return;
            }
            s81Var.QiMR8OkAhezm(dt0Var, giKS3J6vZuNy);
            dt0Var.giKS3J6vZuNy = true;
        }
    }
}
