package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class og implements defpackage.bu {
    public final defpackage.l6 ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public og(java.lang.String str, int i) {
        this(new defpackage.l6(str), i);
    }

    @Override // defpackage.bu
    public final void ZpBGe2uQfcn8(defpackage.cu cuVar) {
        int i = cuVar.JhCgjQRTAOCT;
        defpackage.l6 l6Var = this.ZpBGe2uQfcn8;
        if (i != -1) {
            cuVar.JhCgjQRTAOCT(i, cuVar.WDYagTQQm9ns, l6Var.oh71FJcDz6S2);
        } else {
            cuVar.JhCgjQRTAOCT(cuVar.giKS3J6vZuNy, cuVar.fWTAfUmVKrZq, l6Var.oh71FJcDz6S2);
        }
        int i2 = cuVar.giKS3J6vZuNy;
        int i3 = cuVar.fWTAfUmVKrZq;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.giKS3J6vZuNy;
        int T1fB7bDYiVJQ = defpackage.j80.T1fB7bDYiVJQ(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - l6Var.oh71FJcDz6S2.length(), 0, cuVar.ZpBGe2uQfcn8.giKS3J6vZuNy());
        cuVar.oh71FJcDz6S2(T1fB7bDYiVJQ, T1fB7bDYiVJQ);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.og)) {
            return false;
        }
        defpackage.og ogVar = (defpackage.og) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8.oh71FJcDz6S2, ogVar.ZpBGe2uQfcn8.oh71FJcDz6S2) && this.giKS3J6vZuNy == ogVar.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return (this.ZpBGe2uQfcn8.oh71FJcDz6S2.hashCode() * 31) + this.giKS3J6vZuNy;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CommitTextCommand(text='");
        sb.append(this.ZpBGe2uQfcn8.oh71FJcDz6S2);
        sb.append("', newCursorPosition=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.giKS3J6vZuNy, ')');
    }

    public og(defpackage.l6 l6Var, int i) {
        this.ZpBGe2uQfcn8 = l6Var;
        this.giKS3J6vZuNy = i;
    }
}
