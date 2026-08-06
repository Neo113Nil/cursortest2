package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class o extends defpackage.lc0 implements defpackage.y10 {
    public final /* synthetic */ defpackage.u QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(defpackage.u uVar, int i) {
        super(1);
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = uVar;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.oh71FJcDz6S2;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.u uVar = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                ((defpackage.gz) uVar.getFocusOwner()).QiMR8OkAhezm(((defpackage.wy) obj).ZpBGe2uQfcn8, false);
                return gs1Var;
            case 1:
                defpackage.n10 n10Var = (defpackage.n10) obj;
                uVar.getUncaughtExceptionHandler$ui();
                android.os.Handler handler = uVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                    n10Var.ZpBGe2uQfcn8();
                } else {
                    android.os.Handler handler2 = uVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new defpackage.e(1, n10Var));
                    }
                }
                return gs1Var;
            default:
                return new defpackage.y2(uVar, uVar.getTextInputService(), (defpackage.sm) obj);
        }
    }
}
