package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pw0 extends defpackage.kg1 implements android.os.Parcelable, defpackage.xe1 {
    public static final android.os.Parcelable.Creator<defpackage.pw0> CREATOR = new defpackage.ow0();
    public defpackage.ye1 QiMR8OkAhezm;
    public final defpackage.ze1 oh71FJcDz6S2;

    public pw0(java.lang.Object obj, defpackage.ze1 ze1Var) {
        this.oh71FJcDz6S2 = ze1Var;
        defpackage.me1 GE9mJIPrb8gP = defpackage.te1.GE9mJIPrb8gP();
        defpackage.ye1 ye1Var = new defpackage.ye1(GE9mJIPrb8gP.QiMR8OkAhezm(), obj);
        if (!(GE9mJIPrb8gP instanceof defpackage.u30)) {
            ye1Var.giKS3J6vZuNy = new defpackage.ye1(1L, obj);
        }
        this.QiMR8OkAhezm = ye1Var;
    }

    @Override // defpackage.jg1
    public final void JhCgjQRTAOCT(defpackage.lg1 lg1Var) {
        lg1Var.getClass();
        this.QiMR8OkAhezm = (defpackage.ye1) lg1Var;
    }

    @Override // defpackage.xe1
    public final defpackage.ze1 WDYagTQQm9ns() {
        return this.oh71FJcDz6S2;
    }

    @Override // defpackage.jg1
    public final defpackage.lg1 ZpBGe2uQfcn8() {
        return this.QiMR8OkAhezm;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.dg1
    public final java.lang.Object getValue() {
        return ((defpackage.ye1) defpackage.te1.ZVVdXbWmyCSK(this.QiMR8OkAhezm, this)).fWTAfUmVKrZq;
    }

    @Override // defpackage.jg1
    public final defpackage.lg1 giKS3J6vZuNy(defpackage.lg1 lg1Var, defpackage.lg1 lg1Var2, defpackage.lg1 lg1Var3) {
        if (this.oh71FJcDz6S2.fWTAfUmVKrZq(((defpackage.ye1) lg1Var2).fWTAfUmVKrZq, ((defpackage.ye1) lg1Var3).fWTAfUmVKrZq)) {
            return lg1Var2;
        }
        return null;
    }

    @Override // defpackage.fo0
    public final void setValue(java.lang.Object obj) {
        defpackage.me1 GE9mJIPrb8gP;
        defpackage.ye1 ye1Var = (defpackage.ye1) defpackage.te1.P05cfTpS5W5L(this.QiMR8OkAhezm);
        if (this.oh71FJcDz6S2.fWTAfUmVKrZq(ye1Var.fWTAfUmVKrZq, obj)) {
            return;
        }
        defpackage.ye1 ye1Var2 = this.QiMR8OkAhezm;
        synchronized (defpackage.te1.fWTAfUmVKrZq) {
            GE9mJIPrb8gP = defpackage.te1.GE9mJIPrb8gP();
            ((defpackage.ye1) defpackage.te1.T1fB7bDYiVJQ(ye1Var2, this, GE9mJIPrb8gP, ye1Var)).fWTAfUmVKrZq = obj;
        }
        defpackage.te1.gUjdnLbkVAaA(GE9mJIPrb8gP, this);
    }

    public final java.lang.String toString() {
        return "MutableState(value=" + ((defpackage.ye1) defpackage.te1.P05cfTpS5W5L(this.QiMR8OkAhezm)).fWTAfUmVKrZq + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        defpackage.jVUAPb5NnIYW jvuapb5nniyw = defpackage.jVUAPb5NnIYW.z16KqenTjq8o;
        defpackage.ze1 ze1Var = this.oh71FJcDz6S2;
        if (defpackage.ma0.QiMR8OkAhezm(ze1Var, jvuapb5nniyw)) {
            i2 = 0;
        } else if (defpackage.ma0.QiMR8OkAhezm(ze1Var, defpackage.pa1.Ns0WNyEWdPsk)) {
            i2 = 1;
        } else {
            if (!defpackage.ma0.QiMR8OkAhezm(ze1Var, defpackage.jVUAPb5NnIYW.GoIRkIe1iwj6)) {
                defpackage.h7.P05cfTpS5W5L("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
