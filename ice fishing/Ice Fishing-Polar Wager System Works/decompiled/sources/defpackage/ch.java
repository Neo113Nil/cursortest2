package defpackage;

/* loaded from: classes.dex */
public final class ch {
    public int AARZUJiTa;
    public final defpackage.t10 IHQe1A4L2xu;
    public int JlrlGoKF;
    public defpackage.pb oh6vYeIP;
    public boolean r1MBDhnF;
    public int xiZrDbcSW0;
    public final defpackage.k70 F7NU4MC0GW = new defpackage.k70();
    public boolean adDC3e2L = true;
    public final java.util.ArrayList EXtogiMhuM = new java.util.ArrayList();
    public int riuEU0zW4 = -1;
    public int SH1y5HwkJhh = -1;
    public int ez2rX8ReCYw = -1;

    public ch(defpackage.t10 t10Var, defpackage.pb pbVar) {
        this.IHQe1A4L2xu = t10Var;
        this.oh6vYeIP = pbVar;
    }

    public final void F7NU4MC0GW(boolean z) {
        defpackage.ea1 ea1Var = this.IHQe1A4L2xu.SiPhmbmu;
        int i = z ? ea1Var.riuEU0zW4 : ea1Var.AARZUJiTa;
        int i2 = i - this.xiZrDbcSW0;
        if (i2 < 0) {
            defpackage.dh.IHQe1A4L2xu("Tried to seek backward");
        }
        if (i2 > 0) {
            defpackage.is0 is0Var = this.oh6vYeIP.C0U8sNJm;
            is0Var.p4kuH6PDtgom(defpackage.ar0.r1MBDhnF);
            is0Var.EXtogiMhuM[is0Var.riuEU0zW4 - is0Var.xiZrDbcSW0[is0Var.AARZUJiTa - 1].IHQe1A4L2xu] = i2;
            this.xiZrDbcSW0 = i;
        }
    }

    public final void IHQe1A4L2xu() {
        r1MBDhnF();
        java.util.ArrayList arrayList = this.EXtogiMhuM;
        if (arrayList.isEmpty()) {
            this.AARZUJiTa++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void adDC3e2L(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                defpackage.dh.IHQe1A4L2xu("Invalid remove index " + i);
            }
            if (this.riuEU0zW4 == i) {
                this.JlrlGoKF += i2;
                return;
            }
            r1MBDhnF();
            this.riuEU0zW4 = i;
            this.JlrlGoKF = i2;
        }
    }

    public final void oh6vYeIP() {
        int i = this.AARZUJiTa;
        if (i > 0) {
            defpackage.is0 is0Var = this.oh6vYeIP.C0U8sNJm;
            is0Var.p4kuH6PDtgom(defpackage.es0.r1MBDhnF);
            is0Var.EXtogiMhuM[is0Var.riuEU0zW4 - is0Var.xiZrDbcSW0[is0Var.AARZUJiTa - 1].IHQe1A4L2xu] = i;
            this.AARZUJiTa = 0;
        }
        java.util.ArrayList arrayList = this.EXtogiMhuM;
        if (arrayList.isEmpty()) {
            return;
        }
        defpackage.pb pbVar = this.oh6vYeIP;
        int size = arrayList.size();
        java.lang.Object[] objArr = new java.lang.Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        pbVar.getClass();
        if (size != 0) {
            defpackage.is0 is0Var2 = pbVar.C0U8sNJm;
            is0Var2.p4kuH6PDtgom(defpackage.hr0.r1MBDhnF);
            defpackage.c80.SiPhmbmu(is0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void r1MBDhnF() {
        int i = this.JlrlGoKF;
        if (i > 0) {
            int i2 = this.riuEU0zW4;
            if (i2 >= 0) {
                oh6vYeIP();
                defpackage.is0 is0Var = this.oh6vYeIP.C0U8sNJm;
                is0Var.p4kuH6PDtgom(defpackage.wr0.r1MBDhnF);
                int i3 = is0Var.riuEU0zW4 - is0Var.xiZrDbcSW0[is0Var.AARZUJiTa - 1].IHQe1A4L2xu;
                int[] iArr = is0Var.EXtogiMhuM;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.riuEU0zW4 = -1;
            } else {
                int i4 = this.ez2rX8ReCYw;
                int i5 = this.SH1y5HwkJhh;
                oh6vYeIP();
                defpackage.is0 is0Var2 = this.oh6vYeIP.C0U8sNJm;
                is0Var2.p4kuH6PDtgom(defpackage.sr0.r1MBDhnF);
                int i6 = is0Var2.riuEU0zW4 - is0Var2.xiZrDbcSW0[is0Var2.AARZUJiTa - 1].IHQe1A4L2xu;
                int[] iArr2 = is0Var2.EXtogiMhuM;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.SH1y5HwkJhh = -1;
                this.ez2rX8ReCYw = -1;
            }
            this.JlrlGoKF = 0;
        }
    }
}
