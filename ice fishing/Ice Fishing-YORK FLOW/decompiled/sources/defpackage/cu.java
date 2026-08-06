package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class cu {
    public int JhCgjQRTAOCT;
    public int WDYagTQQm9ns;
    public final defpackage.rw0 ZpBGe2uQfcn8;
    public int fWTAfUmVKrZq;
    public int giKS3J6vZuNy;

    public cu(defpackage.l6 l6Var, long j) {
        java.lang.String str = l6Var.oh71FJcDz6S2;
        defpackage.rw0 rw0Var = new defpackage.rw0();
        rw0Var.JhCgjQRTAOCT = str;
        rw0Var.giKS3J6vZuNy = -1;
        rw0Var.fWTAfUmVKrZq = -1;
        this.ZpBGe2uQfcn8 = rw0Var;
        this.giKS3J6vZuNy = defpackage.in1.oh71FJcDz6S2(j);
        this.fWTAfUmVKrZq = defpackage.in1.WDYagTQQm9ns(j);
        this.JhCgjQRTAOCT = -1;
        this.WDYagTQQm9ns = -1;
        int oh71FJcDz6S2 = defpackage.in1.oh71FJcDz6S2(j);
        int WDYagTQQm9ns = defpackage.in1.WDYagTQQm9ns(j);
        if (oh71FJcDz6S2 < 0 || oh71FJcDz6S2 > str.length()) {
            defpackage.h7.h3m55N1URyyK(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(oh71FJcDz6S2, "start (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (WDYagTQQm9ns < 0 || WDYagTQQm9ns > str.length()) {
            defpackage.h7.h3m55N1URyyK(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(WDYagTQQm9ns, "end (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (oh71FJcDz6S2 <= WDYagTQQm9ns) {
            return;
        }
        defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(oh71FJcDz6S2, WDYagTQQm9ns, "Do not set reversed range: ", " > "));
        throw null;
    }

    public final void JhCgjQRTAOCT(int i, int i2, java.lang.String str) {
        defpackage.rw0 rw0Var = this.ZpBGe2uQfcn8;
        if (i < 0 || i > rw0Var.giKS3J6vZuNy()) {
            defpackage.h7.h3m55N1URyyK(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "start (", ") offset is outside of text region "), rw0Var.giKS3J6vZuNy());
            return;
        }
        if (i2 < 0 || i2 > rw0Var.giKS3J6vZuNy()) {
            defpackage.h7.h3m55N1URyyK(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i2, "end (", ") offset is outside of text region "), rw0Var.giKS3J6vZuNy());
            return;
        }
        if (i > i2) {
            defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        rw0Var.Ns0WNyEWdPsk(i, i2, str);
        P05cfTpS5W5L(str.length() + i);
        QiMR8OkAhezm(str.length() + i);
        this.JhCgjQRTAOCT = -1;
        this.WDYagTQQm9ns = -1;
    }

    public final void P05cfTpS5W5L(int i) {
        if (!(i >= 0)) {
            defpackage.f80.ZpBGe2uQfcn8("Cannot set selectionStart to a negative value: " + i);
        }
        this.giKS3J6vZuNy = i;
    }

    public final void QiMR8OkAhezm(int i) {
        if (!(i >= 0)) {
            defpackage.f80.ZpBGe2uQfcn8("Cannot set selectionEnd to a negative value: " + i);
        }
        this.fWTAfUmVKrZq = i;
    }

    public final void WDYagTQQm9ns(int i, int i2) {
        defpackage.rw0 rw0Var = this.ZpBGe2uQfcn8;
        if (i < 0 || i > rw0Var.giKS3J6vZuNy()) {
            defpackage.h7.h3m55N1URyyK(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "start (", ") offset is outside of text region "), rw0Var.giKS3J6vZuNy());
            return;
        }
        if (i2 < 0 || i2 > rw0Var.giKS3J6vZuNy()) {
            defpackage.h7.h3m55N1URyyK(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i2, "end (", ") offset is outside of text region "), rw0Var.giKS3J6vZuNy());
        } else if (i >= i2) {
            defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.JhCgjQRTAOCT = i;
            this.WDYagTQQm9ns = i2;
        }
    }

    public final void ZpBGe2uQfcn8(int i, int i2) {
        long JhCgjQRTAOCT = defpackage.j80.JhCgjQRTAOCT(i, i2);
        this.ZpBGe2uQfcn8.Ns0WNyEWdPsk(i, i2, "");
        long frSwwKIlbUhK = defpackage.nn.frSwwKIlbUhK(defpackage.j80.JhCgjQRTAOCT(this.giKS3J6vZuNy, this.fWTAfUmVKrZq), JhCgjQRTAOCT);
        P05cfTpS5W5L(defpackage.in1.oh71FJcDz6S2(frSwwKIlbUhK));
        QiMR8OkAhezm(defpackage.in1.WDYagTQQm9ns(frSwwKIlbUhK));
        int i3 = this.JhCgjQRTAOCT;
        if (i3 != -1) {
            long frSwwKIlbUhK2 = defpackage.nn.frSwwKIlbUhK(defpackage.j80.JhCgjQRTAOCT(i3, this.WDYagTQQm9ns), JhCgjQRTAOCT);
            if (defpackage.in1.fWTAfUmVKrZq(frSwwKIlbUhK2)) {
                this.JhCgjQRTAOCT = -1;
                this.WDYagTQQm9ns = -1;
            } else {
                this.JhCgjQRTAOCT = defpackage.in1.oh71FJcDz6S2(frSwwKIlbUhK2);
                this.WDYagTQQm9ns = defpackage.in1.WDYagTQQm9ns(frSwwKIlbUhK2);
            }
        }
    }

    public final defpackage.in1 fWTAfUmVKrZq() {
        int i = this.JhCgjQRTAOCT;
        if (i != -1) {
            return new defpackage.in1(defpackage.j80.JhCgjQRTAOCT(i, this.WDYagTQQm9ns));
        }
        return null;
    }

    public final char giKS3J6vZuNy(int i) {
        defpackage.rw0 rw0Var = this.ZpBGe2uQfcn8;
        defpackage.z20 z20Var = (defpackage.z20) rw0Var.WDYagTQQm9ns;
        if (z20Var == null) {
            return ((java.lang.String) rw0Var.JhCgjQRTAOCT).charAt(i);
        }
        if (i < rw0Var.giKS3J6vZuNy) {
            return ((java.lang.String) rw0Var.JhCgjQRTAOCT).charAt(i);
        }
        int giKS3J6vZuNy = z20Var.giKS3J6vZuNy - z20Var.giKS3J6vZuNy();
        int i2 = rw0Var.giKS3J6vZuNy;
        if (i >= giKS3J6vZuNy + i2) {
            return ((java.lang.String) rw0Var.JhCgjQRTAOCT).charAt(i - ((giKS3J6vZuNy - rw0Var.fWTAfUmVKrZq) + i2));
        }
        int i3 = i - i2;
        int i4 = z20Var.fWTAfUmVKrZq;
        char[] cArr = (char[]) z20Var.WDYagTQQm9ns;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + z20Var.JhCgjQRTAOCT];
    }

    public final void oh71FJcDz6S2(int i, int i2) {
        defpackage.rw0 rw0Var = this.ZpBGe2uQfcn8;
        if (i < 0 || i > rw0Var.giKS3J6vZuNy()) {
            defpackage.h7.h3m55N1URyyK(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "start (", ") offset is outside of text region "), rw0Var.giKS3J6vZuNy());
            return;
        }
        if (i2 < 0 || i2 > rw0Var.giKS3J6vZuNy()) {
            defpackage.h7.h3m55N1URyyK(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i2, "end (", ") offset is outside of text region "), rw0Var.giKS3J6vZuNy());
        } else if (i > i2) {
            defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "Do not set reversed range: ", " > "));
        } else {
            P05cfTpS5W5L(i);
            QiMR8OkAhezm(i2);
        }
    }

    public final java.lang.String toString() {
        return this.ZpBGe2uQfcn8.toString();
    }
}
