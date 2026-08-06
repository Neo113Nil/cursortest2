package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ci1 implements defpackage.it1 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public java.lang.Object oh71FJcDz6S2;

    public ci1(defpackage.g6 g6Var, float f, float f2) {
        this.WDYagTQQm9ns = 3;
        int giKS3J6vZuNy = g6Var.giKS3J6vZuNy();
        defpackage.qx[] qxVarArr = new defpackage.qx[giKS3J6vZuNy];
        for (int i = 0; i < giKS3J6vZuNy; i++) {
            qxVarArr[i] = new defpackage.qx(f, f2, g6Var.ZpBGe2uQfcn8(i));
        }
        this.oh71FJcDz6S2 = qxVarArr;
    }

    public defpackage.mx JhCgjQRTAOCT(int i) {
        switch (this.WDYagTQQm9ns) {
            case 3:
                return ((defpackage.qx[]) this.oh71FJcDz6S2)[i];
            case 4:
                return (defpackage.qx) this.oh71FJcDz6S2;
            default:
                return (defpackage.mx) this.oh71FJcDz6S2;
        }
    }

    @Override // defpackage.ft1
    public defpackage.g6 T1fB7bDYiVJQ(long j, defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        return ((defpackage.s81) this.oh71FJcDz6S2).T1fB7bDYiVJQ(j, g6Var, g6Var2, g6Var3);
    }

    @Override // defpackage.ft1
    public defpackage.g6 XntWc4eZSQ8j(defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        return ((defpackage.s81) this.oh71FJcDz6S2).XntWc4eZSQ8j(g6Var, g6Var2, g6Var3);
    }

    @Override // defpackage.it1, defpackage.ft1
    public boolean ZpBGe2uQfcn8() {
        ((defpackage.s81) this.oh71FJcDz6S2).getClass();
        return false;
    }

    @Override // defpackage.ft1
    public defpackage.g6 fNwYGHIYeJcR(long j, defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        return ((defpackage.s81) this.oh71FJcDz6S2).fNwYGHIYeJcR(j, g6Var, g6Var2, g6Var3);
    }

    public long fWTAfUmVKrZq(long j) {
        defpackage.so soVar = (defpackage.so) this.oh71FJcDz6S2;
        soVar.getClass();
        if (defpackage.jt1.giKS3J6vZuNy(j) <= 0.0f || defpackage.jt1.fWTAfUmVKrZq(j) <= 0.0f) {
            defpackage.e80.giKS3J6vZuNy("maximumVelocity should be a positive value. You specified=" + ((java.lang.Object) defpackage.jt1.oh71FJcDz6S2(j)));
        }
        return defpackage.q70.oh71FJcDz6S2(soVar.ZpBGe2uQfcn8.giKS3J6vZuNy(defpackage.jt1.giKS3J6vZuNy(j)), soVar.giKS3J6vZuNy.giKS3J6vZuNy(defpackage.jt1.fWTAfUmVKrZq(j)));
    }

    @Override // defpackage.ft1
    public long giKS3J6vZuNy(defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        return ((defpackage.s81) this.oh71FJcDz6S2).giKS3J6vZuNy(g6Var, g6Var2, g6Var3);
    }

    public ci1(int i) {
        this.WDYagTQQm9ns = i;
        switch (i) {
            case 7:
                this.oh71FJcDz6S2 = new defpackage.so();
                break;
        }
    }

    public ci1(float f, float f2, defpackage.g6 g6Var) {
        defpackage.ci1 ci1Var;
        this.WDYagTQQm9ns = 6;
        int i = defpackage.gt1.ZpBGe2uQfcn8;
        if (g6Var != null) {
            ci1Var = new defpackage.ci1(g6Var, f, f2);
        } else {
            ci1Var = new defpackage.ci1(f, f2);
        }
        this.oh71FJcDz6S2 = new defpackage.s81(ci1Var);
    }

    public /* synthetic */ ci1(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }

    public ci1(float f, float f2) {
        this.WDYagTQQm9ns = 4;
        this.oh71FJcDz6S2 = new defpackage.qx(f, f2, 0.01f);
    }
}
