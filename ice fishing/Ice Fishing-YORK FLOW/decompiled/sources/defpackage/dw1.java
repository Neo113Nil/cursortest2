package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class dw1 extends defpackage.cw1 {
    public defpackage.v80 BHfvd2J71qpO;
    public defpackage.v80 ZVVdXbWmyCSK;
    public defpackage.v80 w7APNrr0aGRc;

    public dw1(defpackage.mw1 mw1Var, android.view.WindowInsets windowInsets) {
        super(mw1Var, windowInsets);
        this.BHfvd2J71qpO = null;
        this.ZVVdXbWmyCSK = null;
        this.w7APNrr0aGRc = null;
    }

    @Override // defpackage.jw1
    public defpackage.v80 GE9mJIPrb8gP() {
        android.graphics.Insets mandatorySystemGestureInsets;
        if (this.ZVVdXbWmyCSK == null) {
            mandatorySystemGestureInsets = this.fWTAfUmVKrZq.getMandatorySystemGestureInsets();
            this.ZVVdXbWmyCSK = defpackage.v80.fWTAfUmVKrZq(mandatorySystemGestureInsets);
        }
        return this.ZVVdXbWmyCSK;
    }

    @Override // defpackage.aw1, defpackage.jw1
    public defpackage.mw1 WmetiUbpKU9I(int i, int i2, int i3, int i4) {
        android.view.WindowInsets inset;
        inset = this.fWTAfUmVKrZq.inset(i, i2, i3, i4);
        return defpackage.mw1.fWTAfUmVKrZq(inset, null);
    }

    @Override // defpackage.jw1
    public defpackage.v80 fNwYGHIYeJcR() {
        android.graphics.Insets systemGestureInsets;
        if (this.BHfvd2J71qpO == null) {
            systemGestureInsets = this.fWTAfUmVKrZq.getSystemGestureInsets();
            this.BHfvd2J71qpO = defpackage.v80.fWTAfUmVKrZq(systemGestureInsets);
        }
        return this.BHfvd2J71qpO;
    }

    @Override // defpackage.jw1
    public defpackage.v80 gUjdnLbkVAaA() {
        android.graphics.Insets tappableElementInsets;
        if (this.w7APNrr0aGRc == null) {
            tappableElementInsets = this.fWTAfUmVKrZq.getTappableElementInsets();
            this.w7APNrr0aGRc = defpackage.v80.fWTAfUmVKrZq(tappableElementInsets);
        }
        return this.w7APNrr0aGRc;
    }

    @Override // defpackage.bw1, defpackage.jw1
    public void VFeft99leXEK(defpackage.v80 v80Var) {
    }
}
