package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class d4 extends defpackage.mi1 implements defpackage.y10 {
    public int GE9mJIPrb8gP;
    public final /* synthetic */ defpackage.jk1 Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta;
    public final /* synthetic */ java.lang.Object fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(defpackage.jk1 jk1Var, java.lang.Object obj, defpackage.kl klVar, int i) {
        super(1, klVar);
        this.e6mdH7fiFuta = i;
        this.Ns0WNyEWdPsk = jk1Var;
        this.fNwYGHIYeJcR = obj;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj2 = this.fNwYGHIYeJcR;
        defpackage.jk1 jk1Var = this.Ns0WNyEWdPsk;
        defpackage.kl klVar = (defpackage.kl) obj;
        switch (i) {
            case 0:
                return new defpackage.d4((defpackage.e4) jk1Var, (defpackage.bk1) obj2, klVar, 0).s0TASMVLSWD5(gs1Var);
            default:
                return new defpackage.d4((defpackage.r9) jk1Var, (defpackage.q9) obj2, klVar, 1).s0TASMVLSWD5(gs1Var);
        }
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        android.os.Handler handler;
        defpackage.a4 a4Var;
        int i = this.e6mdH7fiFuta;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        defpackage.jk1 jk1Var = this.Ns0WNyEWdPsk;
        java.lang.Object obj2 = this.fNwYGHIYeJcR;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        switch (i) {
            case 0:
                defpackage.e4 e4Var = (defpackage.e4) jk1Var;
                defpackage.hf1 hf1Var = e4Var.WDYagTQQm9ns;
                android.view.View view = e4Var.ZpBGe2uQfcn8;
                int i2 = this.GE9mJIPrb8gP;
                try {
                    if (i2 == 0) {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        defpackage.b4 b4Var = new defpackage.b4();
                        defpackage.bk1 bk1Var = (defpackage.bk1) obj2;
                        defpackage.a4 a4Var2 = new defpackage.a4(b4Var, new defpackage.y3(e4Var, bk1Var, 0), new defpackage.y3(e4Var, bk1Var, 1), view);
                        defpackage.y10 y10Var = e4Var.giKS3J6vZuNy;
                        if (y10Var != null && (a4Var = (defpackage.a4) y10Var.P05cfTpS5W5L(a4Var2)) != null) {
                            a4Var2 = a4Var;
                        }
                        android.os.Looper myLooper = android.os.Looper.myLooper();
                        android.os.Handler handler2 = view.getHandler();
                        if (myLooper == (handler2 != null ? handler2.getLooper() : null)) {
                            android.view.ActionMode startActionMode = view.startActionMode(new defpackage.sx(a4Var2), 1);
                            if (startActionMode != null) {
                                e4Var.P05cfTpS5W5L = startActionMode;
                            }
                            return gs1Var;
                        }
                        defpackage.c4 c4Var = e4Var.e6mdH7fiFuta;
                        if (c4Var == null) {
                            c4Var = new defpackage.c4(e4Var, a4Var2, b4Var, 0);
                            e4Var.e6mdH7fiFuta = c4Var;
                        }
                        view.post(c4Var);
                        this.GE9mJIPrb8gP = 1;
                        defpackage.dc dcVar = b4Var.ZpBGe2uQfcn8;
                        dcVar.getClass();
                        java.lang.Object Mearx7yMn90V = defpackage.dc.Mearx7yMn90V(dcVar, this);
                        if (Mearx7yMn90V != tmVar) {
                            Mearx7yMn90V = gs1Var;
                        }
                        if (Mearx7yMn90V == tmVar) {
                            return tmVar;
                        }
                    } else {
                        if (i2 != 1) {
                            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.b80.KrtOTfE6jiS2(obj);
                    }
                    if (android.os.Looper.myLooper() != (handler != null ? handler.getLooper() : null)) {
                        java.lang.Runnable runnable = e4Var.GE9mJIPrb8gP;
                        if (runnable == null) {
                            runnable = new defpackage.gUjdnLbkVAaA(3, e4Var);
                            e4Var.GE9mJIPrb8gP = runnable;
                        }
                        view.post(runnable);
                    } else {
                        android.view.ActionMode actionMode = e4Var.P05cfTpS5W5L;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    defpackage.c4 c4Var2 = e4Var.e6mdH7fiFuta;
                    if (c4Var2 != null) {
                        view.removeCallbacks(c4Var2);
                    }
                    e4Var.P05cfTpS5W5L = null;
                    return gs1Var;
                } finally {
                    hf1Var.ZpBGe2uQfcn8();
                    android.os.Looper myLooper2 = android.os.Looper.myLooper();
                    handler = view.getHandler();
                    if (myLooper2 != (handler != null ? handler.getLooper() : null)) {
                        java.lang.Runnable runnable2 = e4Var.GE9mJIPrb8gP;
                        if (runnable2 == null) {
                            runnable2 = new defpackage.gUjdnLbkVAaA(3, e4Var);
                            e4Var.GE9mJIPrb8gP = runnable2;
                        }
                        view.post(runnable2);
                    } else {
                        android.view.ActionMode actionMode2 = e4Var.P05cfTpS5W5L;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    defpackage.c4 c4Var3 = e4Var.e6mdH7fiFuta;
                    if (c4Var3 != null) {
                        view.removeCallbacks(c4Var3);
                    }
                    e4Var.P05cfTpS5W5L = null;
                }
            default:
                defpackage.q9 q9Var = (defpackage.q9) obj2;
                defpackage.pw0 pw0Var = ((defpackage.r9) jk1Var).fWTAfUmVKrZq;
                int i3 = this.GE9mJIPrb8gP;
                try {
                    if (i3 == 0) {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        pw0Var.setValue(q9Var);
                        this.GE9mJIPrb8gP = 1;
                        defpackage.dc dcVar2 = q9Var.giKS3J6vZuNy;
                        dcVar2.getClass();
                        java.lang.Object Mearx7yMn90V2 = defpackage.dc.Mearx7yMn90V(dcVar2, this);
                        if (Mearx7yMn90V2 != tmVar) {
                            Mearx7yMn90V2 = gs1Var;
                        }
                        if (Mearx7yMn90V2 == tmVar) {
                            return tmVar;
                        }
                    } else {
                        if (i3 != 1) {
                            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.b80.KrtOTfE6jiS2(obj);
                    }
                    return gs1Var;
                } finally {
                    pw0Var.setValue(null);
                }
        }
    }
}
