package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zj0 extends defpackage.bk0 implements java.util.Iterator, defpackage.nb0 {
    public final /* synthetic */ int e6mdH7fiFuta;

    public zj0(defpackage.ck0 ck0Var, int i) {
        this.e6mdH7fiFuta = i;
        ck0Var.getClass();
        this.P05cfTpS5W5L = ck0Var;
        this.oh71FJcDz6S2 = -1;
        this.QiMR8OkAhezm = ck0Var.fNwYGHIYeJcR;
        fWTAfUmVKrZq();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.e6mdH7fiFuta) {
            case 0:
                giKS3J6vZuNy();
                int i = this.WDYagTQQm9ns;
                defpackage.ck0 ck0Var = (defpackage.ck0) this.P05cfTpS5W5L;
                if (i >= ck0Var.GE9mJIPrb8gP) {
                    defpackage.h7.BHfvd2J71qpO();
                    break;
                } else {
                    this.WDYagTQQm9ns = i + 1;
                    this.oh71FJcDz6S2 = i;
                    defpackage.ak0 ak0Var = new defpackage.ak0(ck0Var, i);
                    fWTAfUmVKrZq();
                    break;
                }
            case 1:
                giKS3J6vZuNy();
                int i2 = this.WDYagTQQm9ns;
                defpackage.ck0 ck0Var2 = (defpackage.ck0) this.P05cfTpS5W5L;
                if (i2 >= ck0Var2.GE9mJIPrb8gP) {
                    defpackage.h7.BHfvd2J71qpO();
                    break;
                } else {
                    this.WDYagTQQm9ns = i2 + 1;
                    this.oh71FJcDz6S2 = i2;
                    java.lang.Object obj = ck0Var2.WDYagTQQm9ns[i2];
                    fWTAfUmVKrZq();
                    break;
                }
            default:
                giKS3J6vZuNy();
                int i3 = this.WDYagTQQm9ns;
                defpackage.ck0 ck0Var3 = (defpackage.ck0) this.P05cfTpS5W5L;
                if (i3 >= ck0Var3.GE9mJIPrb8gP) {
                    defpackage.h7.BHfvd2J71qpO();
                    break;
                } else {
                    this.WDYagTQQm9ns = i3 + 1;
                    this.oh71FJcDz6S2 = i3;
                    java.lang.Object[] objArr = ck0Var3.oh71FJcDz6S2;
                    objArr.getClass();
                    java.lang.Object obj2 = objArr[this.oh71FJcDz6S2];
                    fWTAfUmVKrZq();
                    break;
                }
        }
        return null;
    }
}
