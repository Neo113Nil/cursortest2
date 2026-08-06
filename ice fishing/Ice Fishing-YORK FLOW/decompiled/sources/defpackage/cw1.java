package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class cw1 extends defpackage.bw1 {
    public cw1(defpackage.mw1 mw1Var, android.view.WindowInsets windowInsets) {
        super(mw1Var, windowInsets);
    }

    @Override // defpackage.jw1
    public defpackage.vq QiMR8OkAhezm() {
        android.view.DisplayCutout displayCutout;
        displayCutout = this.fWTAfUmVKrZq.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new defpackage.vq(displayCutout);
    }

    @Override // defpackage.jw1
    public defpackage.mw1 ZpBGe2uQfcn8() {
        android.view.WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.fWTAfUmVKrZq.consumeDisplayCutout();
        return defpackage.mw1.fWTAfUmVKrZq(consumeDisplayCutout, null);
    }

    @Override // defpackage.aw1, defpackage.jw1
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cw1)) {
            return false;
        }
        defpackage.cw1 cw1Var = (defpackage.cw1) obj;
        return java.util.Objects.equals(this.fWTAfUmVKrZq, cw1Var.fWTAfUmVKrZq) && java.util.Objects.equals(this.QiMR8OkAhezm, cw1Var.QiMR8OkAhezm) && defpackage.aw1.GcLuU6pT9wO9(this.P05cfTpS5W5L, cw1Var.P05cfTpS5W5L);
    }

    @Override // defpackage.jw1
    public int hashCode() {
        return this.fWTAfUmVKrZq.hashCode();
    }
}
