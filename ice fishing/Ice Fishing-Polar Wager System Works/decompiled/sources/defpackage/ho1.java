package defpackage;

/* loaded from: classes.dex */
public class ho1 extends defpackage.go1 {
    public ho1(defpackage.ro1 ro1Var, android.view.WindowInsets windowInsets) {
        super(ro1Var, windowInsets);
    }

    @Override // defpackage.no1
    public defpackage.dq AARZUJiTa() {
        android.view.DisplayCutout displayCutout;
        displayCutout = this.r1MBDhnF.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new defpackage.dq(displayCutout);
    }

    @Override // defpackage.no1
    public defpackage.ro1 IHQe1A4L2xu() {
        android.view.WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.r1MBDhnF.consumeDisplayCutout();
        return defpackage.ro1.r1MBDhnF(consumeDisplayCutout, null);
    }

    @Override // defpackage.fo1, defpackage.no1
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ho1)) {
            return false;
        }
        defpackage.ho1 ho1Var = (defpackage.ho1) obj;
        return java.util.Objects.equals(this.r1MBDhnF, ho1Var.r1MBDhnF) && java.util.Objects.equals(this.AARZUJiTa, ho1Var.AARZUJiTa) && defpackage.fo1.mAr5m2L7gYDP(this.EXtogiMhuM, ho1Var.EXtogiMhuM);
    }

    @Override // defpackage.no1
    public int hashCode() {
        return this.r1MBDhnF.hashCode();
    }
}
