package defpackage;

/* loaded from: classes.dex */
public abstract class od {
    public int adDC3e2L;
    public java.lang.Object xiZrDbcSW0;

    public od(int i) {
        this.adDC3e2L = i;
    }

    public abstract defpackage.ro1 AARZUJiTa(defpackage.ro1 ro1Var, java.util.List list);

    public abstract int C0U8sNJm();

    public abstract double DFo87pBq1E5();

    public abstract defpackage.F7NU4MC0GW EXtogiMhuM(defpackage.wn1 wn1Var, defpackage.F7NU4MC0GW f7nu4mc0gw);

    public abstract long EgCjBq0SZwJ();

    public abstract boolean F7NU4MC0GW();

    public abstract float G3OKOH3wZRC();

    public abstract defpackage.ra JlrlGoKF();

    public abstract java.lang.String NHJTzaLwkd();

    public abstract long PAEGRtP0bX();

    public abstract int QQUzIjv3iOC5();

    public abstract long QoRHpC4k();

    public abstract int SH1y5HwkJhh(int i);

    public abstract int SyNS6RMn();

    public abstract long UsuH8pd5P();

    public abstract int V7bD7b8KA();

    public abstract java.lang.String abhbClRa();

    public abstract int cnag84Bm();

    public abstract boolean ez2rX8ReCYw();

    public abstract int fnWB2E7cs();

    public abstract long kNAkVymC();

    public abstract int kd6TUFXn();

    public abstract boolean nBH8hAHy(int i);

    public abstract void oh6vYeIP(int i);

    public abstract int r1MBDhnF();

    public abstract void riuEU0zW4(int i);

    public void v5iciZok() {
        int QQUzIjv3iOC5;
        do {
            QQUzIjv3iOC5 = QQUzIjv3iOC5();
            if (QQUzIjv3iOC5 == 0) {
                return;
            }
            int i = this.adDC3e2L;
            if (i >= 100) {
                throw new defpackage.g80("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.adDC3e2L = i + 1;
            this.adDC3e2L--;
        } while (nBH8hAHy(QQUzIjv3iOC5));
    }

    public void adDC3e2L(defpackage.wn1 wn1Var) {
    }

    public void xiZrDbcSW0(defpackage.wn1 wn1Var) {
    }
}
