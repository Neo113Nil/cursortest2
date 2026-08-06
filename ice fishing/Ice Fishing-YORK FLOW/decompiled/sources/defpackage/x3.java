package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements defpackage.y10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.e4 oh71FJcDz6S2;

    public /* synthetic */ x3(defpackage.e4 e4Var, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = e4Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        int i2 = 2;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.e4 e4Var = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.n10 n10Var = (defpackage.n10) obj;
                android.view.View view = e4Var.ZpBGe2uQfcn8;
                android.os.Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                    n10Var.ZpBGe2uQfcn8();
                } else {
                    android.os.Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new defpackage.e(2, n10Var));
                    }
                }
                return gs1Var;
            case 1:
                android.view.ActionMode actionMode = e4Var.P05cfTpS5W5L;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return gs1Var;
            case 2:
                android.view.ActionMode actionMode2 = e4Var.P05cfTpS5W5L;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return gs1Var;
            default:
                e4Var.WDYagTQQm9ns.WDYagTQQm9ns();
                return new defpackage.y0(i2, e4Var);
        }
    }
}
