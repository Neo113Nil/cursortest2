package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class g4 implements defpackage.n10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.fo0 oh71FJcDz6S2;

    public /* synthetic */ g4(defpackage.fo0 fo0Var, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = fo0Var;
    }

    @Override // defpackage.n10
    public final java.lang.Object ZpBGe2uQfcn8() {
        int i = this.WDYagTQQm9ns;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.fo0 fo0Var = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.rc0 rc0Var = (defpackage.rc0) fo0Var.getValue();
                if (rc0Var == null) {
                    defpackage.h80.JhCgjQRTAOCT("Required value was null.");
                    defpackage.h7.JhCgjQRTAOCT();
                    break;
                } else {
                    break;
                }
            case 1:
                defpackage.rc0 rc0Var2 = (defpackage.rc0) fo0Var.getValue();
                if (rc0Var2 == null) {
                    defpackage.h80.JhCgjQRTAOCT("Required value was null.");
                    defpackage.h7.JhCgjQRTAOCT();
                    break;
                } else {
                    break;
                }
            case 2:
                java.lang.Boolean bool = (java.lang.Boolean) fo0Var.getValue();
                bool.booleanValue();
                break;
            case 3:
                fo0Var.setValue(gs1Var);
                break;
            case 4:
                ((defpackage.hw) fo0Var.getValue()).getClass();
                fo0Var.setValue(new defpackage.hw());
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                defpackage.rc0 rc0Var3 = (defpackage.rc0) fo0Var.getValue();
                if (rc0Var3 == null) {
                    defpackage.h80.JhCgjQRTAOCT("Required value was null.");
                    defpackage.h7.JhCgjQRTAOCT();
                    break;
                } else {
                    break;
                }
            case 8:
                fo0Var.setValue(java.lang.Boolean.FALSE);
                break;
            default:
                fo0Var.setValue(java.lang.Boolean.FALSE);
                break;
        }
        return gs1Var;
    }
}
