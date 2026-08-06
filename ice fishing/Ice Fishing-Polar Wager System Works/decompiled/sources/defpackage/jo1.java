package defpackage;

/* loaded from: classes.dex */
public class jo1 extends defpackage.io1 {
    public static final defpackage.ro1 V7bD7b8KA;

    static {
        android.view.WindowInsets windowInsets;
        windowInsets = android.view.WindowInsets.CONSUMED;
        V7bD7b8KA = defpackage.ro1.r1MBDhnF(windowInsets, null);
    }

    public jo1(defpackage.ro1 ro1Var, android.view.WindowInsets windowInsets) {
        super(ro1Var, windowInsets);
    }

    @Override // defpackage.fo1, defpackage.no1
    public defpackage.i60 EXtogiMhuM(int i) {
        android.graphics.Insets insets;
        insets = this.r1MBDhnF.getInsets(defpackage.po1.IHQe1A4L2xu(i));
        return defpackage.i60.r1MBDhnF(insets);
    }

    @Override // defpackage.fo1, defpackage.no1
    public boolean fnWB2E7cs(int i) {
        boolean isVisible;
        isVisible = this.r1MBDhnF.isVisible(defpackage.po1.IHQe1A4L2xu(i));
        return isVisible;
    }

    @Override // defpackage.fo1, defpackage.no1
    public defpackage.i60 riuEU0zW4(int i) {
        android.graphics.Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.r1MBDhnF.getInsetsIgnoringVisibility(defpackage.po1.IHQe1A4L2xu(i));
        return defpackage.i60.r1MBDhnF(insetsIgnoringVisibility);
    }

    @Override // defpackage.fo1, defpackage.no1
    public final void F7NU4MC0GW(android.view.View view) {
    }
}
