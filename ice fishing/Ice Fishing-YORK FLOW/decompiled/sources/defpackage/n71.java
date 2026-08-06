package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class n71 implements defpackage.k71, defpackage.b81 {
    public defpackage.n80 QiMR8OkAhezm;
    public final /* synthetic */ defpackage.l71 WDYagTQQm9ns;
    public defpackage.zg0 oh71FJcDz6S2;

    public n71(defpackage.l71 l71Var) {
        this.WDYagTQQm9ns = l71Var;
        java.lang.Object oh71FJcDz6S2 = l71Var.oh71FJcDz6S2("androidx.savedstate.SavedStateRegistry");
        android.os.Bundle bundle = oh71FJcDz6S2 instanceof android.os.Bundle ? (android.os.Bundle) oh71FJcDz6S2 : null;
        if (bundle != null) {
            P05cfTpS5W5L(bundle);
        }
        l71Var.ZpBGe2uQfcn8("androidx.savedstate.SavedStateRegistry", new defpackage.l3(24, this));
    }

    @Override // defpackage.k71
    public final boolean JhCgjQRTAOCT(java.lang.Object obj) {
        return this.WDYagTQQm9ns.JhCgjQRTAOCT(obj);
    }

    public final defpackage.n80 P05cfTpS5W5L(android.os.Bundle bundle) {
        defpackage.n80 n80Var = this.QiMR8OkAhezm;
        if (n80Var != null) {
            return n80Var;
        }
        defpackage.n80 n80Var2 = new defpackage.n80(new defpackage.a81(this, new defpackage.l3(26, this)), 28);
        this.QiMR8OkAhezm = n80Var2;
        n80Var2.dG7RjM6DqYVL(bundle);
        return n80Var2;
    }

    @Override // defpackage.wg0
    public final defpackage.zg0 QiMR8OkAhezm() {
        defpackage.zg0 zg0Var = this.oh71FJcDz6S2;
        if (zg0Var != null) {
            return zg0Var;
        }
        defpackage.zg0 zg0Var2 = new defpackage.zg0(this, false);
        this.oh71FJcDz6S2 = zg0Var2;
        return zg0Var2;
    }

    @Override // defpackage.k71
    public final java.util.Map WDYagTQQm9ns() {
        return this.WDYagTQQm9ns.WDYagTQQm9ns();
    }

    @Override // defpackage.k71
    public final defpackage.a7 ZpBGe2uQfcn8(java.lang.String str, defpackage.n10 n10Var) {
        return this.WDYagTQQm9ns.ZpBGe2uQfcn8(str, n10Var);
    }

    @Override // defpackage.b81
    public final defpackage.n80 fWTAfUmVKrZq() {
        return (defpackage.n80) P05cfTpS5W5L(null).QiMR8OkAhezm;
    }

    @Override // defpackage.k71
    public final java.lang.Object oh71FJcDz6S2(java.lang.String str) {
        return this.WDYagTQQm9ns.oh71FJcDz6S2(str);
    }
}
