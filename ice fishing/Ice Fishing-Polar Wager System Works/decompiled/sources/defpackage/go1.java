package defpackage;

/* loaded from: classes.dex */
public class go1 extends defpackage.fo1 {
    public defpackage.i60 kd6TUFXn;

    public go1(defpackage.ro1 ro1Var, android.view.WindowInsets windowInsets) {
        super(ro1Var, windowInsets);
        this.kd6TUFXn = null;
    }

    @Override // defpackage.no1
    public void abhbClRa(defpackage.i60 i60Var) {
        this.kd6TUFXn = i60Var;
    }

    @Override // defpackage.no1
    public final defpackage.i60 ez2rX8ReCYw() {
        if (this.kd6TUFXn == null) {
            android.view.WindowInsets windowInsets = this.r1MBDhnF;
            this.kd6TUFXn = defpackage.i60.oh6vYeIP(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.kd6TUFXn;
    }

    @Override // defpackage.no1
    public boolean kd6TUFXn() {
        return this.r1MBDhnF.isConsumed();
    }

    @Override // defpackage.no1
    public defpackage.ro1 oh6vYeIP() {
        return defpackage.ro1.r1MBDhnF(this.r1MBDhnF.consumeStableInsets(), null);
    }

    @Override // defpackage.no1
    public defpackage.ro1 r1MBDhnF() {
        return defpackage.ro1.r1MBDhnF(this.r1MBDhnF.consumeSystemWindowInsets(), null);
    }
}
