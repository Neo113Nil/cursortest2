package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class tt1 implements android.view.View.OnApplyWindowInsetsListener {
    public defpackage.mw1 ZpBGe2uQfcn8 = null;
    public final /* synthetic */ defpackage.ct0 fWTAfUmVKrZq;
    public final /* synthetic */ android.view.View giKS3J6vZuNy;

    public tt1(android.view.View view, defpackage.ct0 ct0Var) {
        this.giKS3J6vZuNy = view;
        this.fWTAfUmVKrZq = ct0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        defpackage.mw1 fWTAfUmVKrZq = defpackage.mw1.fWTAfUmVKrZq(windowInsets, view);
        int i = android.os.Build.VERSION.SDK_INT;
        defpackage.ct0 ct0Var = this.fWTAfUmVKrZq;
        if (i < 30) {
            defpackage.ut1.ZpBGe2uQfcn8(windowInsets, this.giKS3J6vZuNy);
            if (fWTAfUmVKrZq.equals(this.ZpBGe2uQfcn8)) {
                return ct0Var.ZpBGe2uQfcn8(view, fWTAfUmVKrZq).giKS3J6vZuNy();
            }
        }
        this.ZpBGe2uQfcn8 = fWTAfUmVKrZq;
        defpackage.mw1 ZpBGe2uQfcn8 = ct0Var.ZpBGe2uQfcn8(view, fWTAfUmVKrZq);
        if (i >= 30) {
            return ZpBGe2uQfcn8.giKS3J6vZuNy();
        }
        int i2 = defpackage.zt1.ZpBGe2uQfcn8;
        view.requestApplyInsets();
        return ZpBGe2uQfcn8.giKS3J6vZuNy();
    }
}
