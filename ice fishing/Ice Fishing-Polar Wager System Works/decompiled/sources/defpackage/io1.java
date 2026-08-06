package defpackage;

/* loaded from: classes.dex */
public class io1 extends defpackage.ho1 {
    public defpackage.i60 EgCjBq0SZwJ;
    public defpackage.i60 fnWB2E7cs;
    public defpackage.i60 kNAkVymC;

    public io1(defpackage.ro1 ro1Var, android.view.WindowInsets windowInsets) {
        super(ro1Var, windowInsets);
        this.EgCjBq0SZwJ = null;
        this.fnWB2E7cs = null;
        this.kNAkVymC = null;
    }

    @Override // defpackage.fo1, defpackage.no1
    public defpackage.ro1 G3OKOH3wZRC(int i, int i2, int i3, int i4) {
        android.view.WindowInsets inset;
        inset = this.r1MBDhnF.inset(i, i2, i3, i4);
        return defpackage.ro1.r1MBDhnF(inset, null);
    }

    @Override // defpackage.no1
    public defpackage.i60 JlrlGoKF() {
        android.graphics.Insets systemGestureInsets;
        if (this.EgCjBq0SZwJ == null) {
            systemGestureInsets = this.r1MBDhnF.getSystemGestureInsets();
            this.EgCjBq0SZwJ = defpackage.i60.r1MBDhnF(systemGestureInsets);
        }
        return this.EgCjBq0SZwJ;
    }

    @Override // defpackage.no1
    public defpackage.i60 SH1y5HwkJhh() {
        android.graphics.Insets mandatorySystemGestureInsets;
        if (this.fnWB2E7cs == null) {
            mandatorySystemGestureInsets = this.r1MBDhnF.getMandatorySystemGestureInsets();
            this.fnWB2E7cs = defpackage.i60.r1MBDhnF(mandatorySystemGestureInsets);
        }
        return this.fnWB2E7cs;
    }

    @Override // defpackage.no1
    public defpackage.i60 SyNS6RMn() {
        android.graphics.Insets tappableElementInsets;
        if (this.kNAkVymC == null) {
            tappableElementInsets = this.r1MBDhnF.getTappableElementInsets();
            this.kNAkVymC = defpackage.i60.r1MBDhnF(tappableElementInsets);
        }
        return this.kNAkVymC;
    }

    @Override // defpackage.go1, defpackage.no1
    public void abhbClRa(defpackage.i60 i60Var) {
    }
}
