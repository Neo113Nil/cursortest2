package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class te0 {
    public int JhCgjQRTAOCT;
    public defpackage.te0 WDYagTQQm9ns;
    public final java.lang.Object ZpBGe2uQfcn8;
    public final defpackage.ve0 giKS3J6vZuNy;
    public boolean oh71FJcDz6S2;
    public int fWTAfUmVKrZq = -1;
    public final defpackage.pw0 QiMR8OkAhezm = defpackage.w60.hH0RRJrNssvh(null);

    public te0(java.lang.Object obj, defpackage.ve0 ve0Var) {
        this.ZpBGe2uQfcn8 = obj;
        this.giKS3J6vZuNy = ve0Var;
    }

    public final defpackage.te0 ZpBGe2uQfcn8() {
        if (this.oh71FJcDz6S2) {
            defpackage.h80.fWTAfUmVKrZq("Pin should not be called on an already disposed item ");
        }
        if (this.JhCgjQRTAOCT == 0) {
            this.giKS3J6vZuNy.WDYagTQQm9ns.add(this);
            defpackage.te0 te0Var = (defpackage.te0) this.QiMR8OkAhezm.getValue();
            if (te0Var != null) {
                te0Var.ZpBGe2uQfcn8();
            } else {
                te0Var = null;
            }
            this.WDYagTQQm9ns = te0Var;
        }
        this.JhCgjQRTAOCT++;
        return this;
    }

    public final void giKS3J6vZuNy() {
        if (this.oh71FJcDz6S2) {
            return;
        }
        if (this.JhCgjQRTAOCT <= 0) {
            defpackage.h80.fWTAfUmVKrZq("Release should only be called once");
        }
        int i = this.JhCgjQRTAOCT - 1;
        this.JhCgjQRTAOCT = i;
        if (i == 0) {
            this.giKS3J6vZuNy.WDYagTQQm9ns.remove(this);
            defpackage.te0 te0Var = this.WDYagTQQm9ns;
            if (te0Var != null) {
                te0Var.giKS3J6vZuNy();
            }
            this.WDYagTQQm9ns = null;
        }
    }
}
