package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class me1 {
    public int JhCgjQRTAOCT;
    public defpackage.re1 ZpBGe2uQfcn8;
    public boolean fWTAfUmVKrZq;
    public long giKS3J6vZuNy;

    public me1(long j, defpackage.re1 re1Var) {
        int i;
        int numberOfTrailingZeros;
        this.ZpBGe2uQfcn8 = re1Var;
        this.giKS3J6vZuNy = j;
        defpackage.g81 g81Var = defpackage.te1.ZpBGe2uQfcn8;
        if (j != 0) {
            defpackage.re1 JhCgjQRTAOCT = JhCgjQRTAOCT();
            long j2 = JhCgjQRTAOCT.QiMR8OkAhezm;
            long[] jArr = JhCgjQRTAOCT.P05cfTpS5W5L;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = JhCgjQRTAOCT.oh71FJcDz6S2;
                if (j3 != 0) {
                    numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = JhCgjQRTAOCT.WDYagTQQm9ns;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (defpackage.te1.fWTAfUmVKrZq) {
                i = defpackage.te1.oh71FJcDz6S2.ZpBGe2uQfcn8(j);
            }
        } else {
            i = -1;
        }
        this.JhCgjQRTAOCT = i;
    }

    public static void WmetiUbpKU9I(defpackage.me1 me1Var) {
        defpackage.te1.giKS3J6vZuNy.BHfvd2J71qpO(me1Var);
    }

    public void BHfvd2J71qpO(long j) {
        this.giKS3J6vZuNy = j;
    }

    public final defpackage.me1 GE9mJIPrb8gP() {
        defpackage.a7 a7Var = defpackage.te1.giKS3J6vZuNy;
        defpackage.me1 me1Var = (defpackage.me1) a7Var.WDYagTQQm9ns();
        a7Var.BHfvd2J71qpO(this);
        return me1Var;
    }

    public defpackage.re1 JhCgjQRTAOCT() {
        return this.ZpBGe2uQfcn8;
    }

    public abstract void Ns0WNyEWdPsk();

    public int P05cfTpS5W5L() {
        return 0;
    }

    public long QiMR8OkAhezm() {
        return this.giKS3J6vZuNy;
    }

    public final void T1fB7bDYiVJQ() {
        int i = this.JhCgjQRTAOCT;
        if (i >= 0) {
            defpackage.te1.w7APNrr0aGRc(i);
            this.JhCgjQRTAOCT = -1;
        }
    }

    public abstract defpackage.y10 WDYagTQQm9ns();

    public void XntWc4eZSQ8j() {
        T1fB7bDYiVJQ();
    }

    public void ZVVdXbWmyCSK(int i) {
        throw new java.lang.IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public final void ZpBGe2uQfcn8() {
        synchronized (defpackage.te1.fWTAfUmVKrZq) {
            giKS3J6vZuNy();
            XntWc4eZSQ8j();
        }
    }

    public abstract defpackage.y10 e6mdH7fiFuta();

    public abstract void fNwYGHIYeJcR();

    public abstract void fWTAfUmVKrZq();

    public abstract void gUjdnLbkVAaA(defpackage.jg1 jg1Var);

    public void giKS3J6vZuNy() {
        defpackage.te1.JhCgjQRTAOCT = defpackage.te1.JhCgjQRTAOCT.giKS3J6vZuNy(QiMR8OkAhezm());
    }

    public abstract void h3m55N1URyyK();

    public abstract boolean oh71FJcDz6S2();

    public void s0TASMVLSWD5(defpackage.re1 re1Var) {
        this.ZpBGe2uQfcn8 = re1Var;
    }

    public abstract defpackage.me1 w7APNrr0aGRc(defpackage.y10 y10Var);
}
