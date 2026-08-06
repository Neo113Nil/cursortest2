package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lw0 extends defpackage.kg1 implements android.os.Parcelable, defpackage.xe1, defpackage.dg1, defpackage.fo0 {
    public static final android.os.Parcelable.Creator<defpackage.lw0> CREATOR = new defpackage.K0gkXZrJwRZi(3);
    public defpackage.ue1 oh71FJcDz6S2;

    public lw0(float f) {
        defpackage.me1 GE9mJIPrb8gP = defpackage.te1.GE9mJIPrb8gP();
        defpackage.ue1 ue1Var = new defpackage.ue1(GE9mJIPrb8gP.QiMR8OkAhezm(), f);
        if (!(GE9mJIPrb8gP instanceof defpackage.u30)) {
            ue1Var.giKS3J6vZuNy = new defpackage.ue1(1L, f);
        }
        this.oh71FJcDz6S2 = ue1Var;
    }

    @Override // defpackage.jg1
    public final void JhCgjQRTAOCT(defpackage.lg1 lg1Var) {
        lg1Var.getClass();
        this.oh71FJcDz6S2 = (defpackage.ue1) lg1Var;
    }

    public final float P05cfTpS5W5L() {
        return ((defpackage.ue1) defpackage.te1.ZVVdXbWmyCSK(this.oh71FJcDz6S2, this)).fWTAfUmVKrZq;
    }

    @Override // defpackage.xe1
    public final defpackage.ze1 WDYagTQQm9ns() {
        return defpackage.pa1.Ns0WNyEWdPsk;
    }

    @Override // defpackage.jg1
    public final defpackage.lg1 ZpBGe2uQfcn8() {
        return this.oh71FJcDz6S2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e6mdH7fiFuta(float f) {
        defpackage.me1 GE9mJIPrb8gP;
        defpackage.ue1 ue1Var = (defpackage.ue1) defpackage.te1.P05cfTpS5W5L(this.oh71FJcDz6S2);
        if (ue1Var.fWTAfUmVKrZq == f) {
            return;
        }
        defpackage.ue1 ue1Var2 = this.oh71FJcDz6S2;
        synchronized (defpackage.te1.fWTAfUmVKrZq) {
            GE9mJIPrb8gP = defpackage.te1.GE9mJIPrb8gP();
            ((defpackage.ue1) defpackage.te1.T1fB7bDYiVJQ(ue1Var2, this, GE9mJIPrb8gP, ue1Var)).fWTAfUmVKrZq = f;
        }
        defpackage.te1.gUjdnLbkVAaA(GE9mJIPrb8gP, this);
    }

    @Override // defpackage.dg1
    public final java.lang.Object getValue() {
        return java.lang.Float.valueOf(P05cfTpS5W5L());
    }

    @Override // defpackage.jg1
    public final defpackage.lg1 giKS3J6vZuNy(defpackage.lg1 lg1Var, defpackage.lg1 lg1Var2, defpackage.lg1 lg1Var3) {
        if (((defpackage.ue1) lg1Var2).fWTAfUmVKrZq == ((defpackage.ue1) lg1Var3).fWTAfUmVKrZq) {
            return lg1Var2;
        }
        return null;
    }

    @Override // defpackage.fo0
    public final void setValue(java.lang.Object obj) {
        e6mdH7fiFuta(((java.lang.Number) obj).floatValue());
    }

    public final java.lang.String toString() {
        return "MutableFloatState(value=" + ((defpackage.ue1) defpackage.te1.P05cfTpS5W5L(this.oh71FJcDz6S2)).fWTAfUmVKrZq + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(P05cfTpS5W5L());
    }
}
