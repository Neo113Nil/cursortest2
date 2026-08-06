package defpackage;

/* loaded from: classes.dex */
public class lo1 extends defpackage.ko1 {
    public static final defpackage.ro1 PAEGRtP0bX;

    static {
        android.view.WindowInsets windowInsets;
        windowInsets = android.view.WindowInsets.CONSUMED;
        PAEGRtP0bX = defpackage.ro1.r1MBDhnF(windowInsets, null);
    }

    public lo1(defpackage.ro1 ro1Var, android.view.WindowInsets windowInsets) {
        super(ro1Var, windowInsets);
    }

    @Override // defpackage.jo1, defpackage.fo1, defpackage.no1
    public defpackage.i60 EXtogiMhuM(int i) {
        android.graphics.Insets insets;
        insets = this.r1MBDhnF.getInsets(defpackage.qo1.IHQe1A4L2xu(i));
        return defpackage.i60.r1MBDhnF(insets);
    }

    @Override // defpackage.jo1, defpackage.fo1, defpackage.no1
    public boolean fnWB2E7cs(int i) {
        boolean isVisible;
        isVisible = this.r1MBDhnF.isVisible(defpackage.qo1.IHQe1A4L2xu(i));
        return isVisible;
    }

    @Override // defpackage.jo1, defpackage.fo1, defpackage.no1
    public defpackage.i60 riuEU0zW4(int i) {
        android.graphics.Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.r1MBDhnF.getInsetsIgnoringVisibility(defpackage.qo1.IHQe1A4L2xu(i));
        return defpackage.i60.r1MBDhnF(insetsIgnoringVisibility);
    }

    @Override // defpackage.fo1, defpackage.no1
    public void cnag84Bm(android.view.View view) {
    }
}
