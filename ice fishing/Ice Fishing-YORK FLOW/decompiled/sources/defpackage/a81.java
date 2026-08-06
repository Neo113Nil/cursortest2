package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class a81 {
    public boolean QiMR8OkAhezm;
    public boolean WDYagTQQm9ns;
    public final defpackage.b81 ZpBGe2uQfcn8;
    public final defpackage.l3 giKS3J6vZuNy;
    public android.os.Bundle oh71FJcDz6S2;
    public final defpackage.l21 fWTAfUmVKrZq = new defpackage.l21(16);
    public final java.util.LinkedHashMap JhCgjQRTAOCT = new java.util.LinkedHashMap();
    public boolean P05cfTpS5W5L = true;

    public a81(defpackage.b81 b81Var, defpackage.l3 l3Var) {
        this.ZpBGe2uQfcn8 = b81Var;
        this.giKS3J6vZuNy = l3Var;
    }

    public final void ZpBGe2uQfcn8() {
        defpackage.b81 b81Var = this.ZpBGe2uQfcn8;
        if (b81Var.QiMR8OkAhezm().P05cfTpS5W5L != defpackage.pg0.oh71FJcDz6S2) {
            defpackage.h7.P05cfTpS5W5L("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.WDYagTQQm9ns) {
                defpackage.h7.P05cfTpS5W5L("SavedStateRegistry was already attached.");
                return;
            }
            this.giKS3J6vZuNy.ZpBGe2uQfcn8();
            b81Var.QiMR8OkAhezm().ZpBGe2uQfcn8(new defpackage.mnkwqFSfsWTC(2, this));
            this.WDYagTQQm9ns = true;
        }
    }
}
