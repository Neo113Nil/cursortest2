package defpackage;

/* loaded from: classes.dex */
public final class gm1 implements android.view.View.OnApplyWindowInsetsListener {
    public defpackage.ro1 IHQe1A4L2xu = null;
    public final /* synthetic */ android.view.View oh6vYeIP;
    public final /* synthetic */ defpackage.jq0 r1MBDhnF;

    public gm1(android.view.View view, defpackage.jq0 jq0Var) {
        this.oh6vYeIP = view;
        this.r1MBDhnF = jq0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        defpackage.ro1 r1MBDhnF = defpackage.ro1.r1MBDhnF(windowInsets, view);
        int i = android.os.Build.VERSION.SDK_INT;
        defpackage.jq0 jq0Var = this.r1MBDhnF;
        if (i < 30) {
            defpackage.hm1.IHQe1A4L2xu(windowInsets, this.oh6vYeIP);
            if (r1MBDhnF.equals(this.IHQe1A4L2xu)) {
                return jq0Var.IHQe1A4L2xu(view, r1MBDhnF).oh6vYeIP();
            }
        }
        this.IHQe1A4L2xu = r1MBDhnF;
        defpackage.ro1 IHQe1A4L2xu = jq0Var.IHQe1A4L2xu(view, r1MBDhnF);
        if (i >= 30) {
            return IHQe1A4L2xu.oh6vYeIP();
        }
        int i2 = defpackage.mm1.IHQe1A4L2xu;
        view.requestApplyInsets();
        return IHQe1A4L2xu.oh6vYeIP();
    }
}
