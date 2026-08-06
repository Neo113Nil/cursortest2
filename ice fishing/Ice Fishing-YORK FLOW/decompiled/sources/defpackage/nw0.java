package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class nw0 extends defpackage.kg1 implements android.os.Parcelable, defpackage.xe1, defpackage.dg1, defpackage.fo0 {
    public static final android.os.Parcelable.Creator<defpackage.nw0> CREATOR = new defpackage.K0gkXZrJwRZi(5);
    public defpackage.we1 oh71FJcDz6S2;

    public nw0(long j) {
        defpackage.me1 GE9mJIPrb8gP = defpackage.te1.GE9mJIPrb8gP();
        defpackage.we1 we1Var = new defpackage.we1(GE9mJIPrb8gP.QiMR8OkAhezm(), j);
        if (!(GE9mJIPrb8gP instanceof defpackage.u30)) {
            we1Var.giKS3J6vZuNy = new defpackage.we1(1L, j);
        }
        this.oh71FJcDz6S2 = we1Var;
    }

    @Override // defpackage.jg1
    public final void JhCgjQRTAOCT(defpackage.lg1 lg1Var) {
        lg1Var.getClass();
        this.oh71FJcDz6S2 = (defpackage.we1) lg1Var;
    }

    public final long P05cfTpS5W5L() {
        return ((defpackage.we1) defpackage.te1.ZVVdXbWmyCSK(this.oh71FJcDz6S2, this)).fWTAfUmVKrZq;
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

    public final void e6mdH7fiFuta(long j) {
        defpackage.me1 GE9mJIPrb8gP;
        defpackage.we1 we1Var = (defpackage.we1) defpackage.te1.P05cfTpS5W5L(this.oh71FJcDz6S2);
        if (we1Var.fWTAfUmVKrZq != j) {
            defpackage.we1 we1Var2 = this.oh71FJcDz6S2;
            synchronized (defpackage.te1.fWTAfUmVKrZq) {
                GE9mJIPrb8gP = defpackage.te1.GE9mJIPrb8gP();
                ((defpackage.we1) defpackage.te1.T1fB7bDYiVJQ(we1Var2, this, GE9mJIPrb8gP, we1Var)).fWTAfUmVKrZq = j;
            }
            defpackage.te1.gUjdnLbkVAaA(GE9mJIPrb8gP, this);
        }
    }

    @Override // defpackage.dg1
    public final java.lang.Object getValue() {
        return java.lang.Long.valueOf(P05cfTpS5W5L());
    }

    @Override // defpackage.jg1
    public final defpackage.lg1 giKS3J6vZuNy(defpackage.lg1 lg1Var, defpackage.lg1 lg1Var2, defpackage.lg1 lg1Var3) {
        if (((defpackage.we1) lg1Var2).fWTAfUmVKrZq == ((defpackage.we1) lg1Var3).fWTAfUmVKrZq) {
            return lg1Var2;
        }
        return null;
    }

    @Override // defpackage.fo0
    public final void setValue(java.lang.Object obj) {
        e6mdH7fiFuta(((java.lang.Number) obj).longValue());
    }

    public final java.lang.String toString() {
        return "MutableLongState(value=" + ((defpackage.we1) defpackage.te1.P05cfTpS5W5L(this.oh71FJcDz6S2)).fWTAfUmVKrZq + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(P05cfTpS5W5L());
    }
}
