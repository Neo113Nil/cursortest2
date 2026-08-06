package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class uc1 implements defpackage.bu {
    public final defpackage.l6 ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public uc1(java.lang.String str, int i) {
        this.ZpBGe2uQfcn8 = new defpackage.l6(str);
        this.giKS3J6vZuNy = i;
    }

    @Override // defpackage.bu
    public final void ZpBGe2uQfcn8(defpackage.cu cuVar) {
        int i = cuVar.JhCgjQRTAOCT;
        defpackage.l6 l6Var = this.ZpBGe2uQfcn8;
        if (i != -1) {
            int i2 = cuVar.WDYagTQQm9ns;
            java.lang.String str = l6Var.oh71FJcDz6S2;
            java.lang.String str2 = l6Var.oh71FJcDz6S2;
            cuVar.JhCgjQRTAOCT(i, i2, str);
            if (str2.length() > 0) {
                cuVar.WDYagTQQm9ns(i, str2.length() + i);
            }
        } else {
            int i3 = cuVar.giKS3J6vZuNy;
            int i4 = cuVar.fWTAfUmVKrZq;
            java.lang.String str3 = l6Var.oh71FJcDz6S2;
            java.lang.String str4 = l6Var.oh71FJcDz6S2;
            cuVar.JhCgjQRTAOCT(i3, i4, str3);
            if (str4.length() > 0) {
                cuVar.WDYagTQQm9ns(i3, str4.length() + i3);
            }
        }
        int i5 = cuVar.giKS3J6vZuNy;
        int i6 = cuVar.fWTAfUmVKrZq;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.giKS3J6vZuNy;
        int T1fB7bDYiVJQ = defpackage.j80.T1fB7bDYiVJQ(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - l6Var.oh71FJcDz6S2.length(), 0, cuVar.ZpBGe2uQfcn8.giKS3J6vZuNy());
        cuVar.oh71FJcDz6S2(T1fB7bDYiVJQ, T1fB7bDYiVJQ);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.uc1)) {
            return false;
        }
        defpackage.uc1 uc1Var = (defpackage.uc1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8.oh71FJcDz6S2, uc1Var.ZpBGe2uQfcn8.oh71FJcDz6S2) && this.giKS3J6vZuNy == uc1Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return (this.ZpBGe2uQfcn8.oh71FJcDz6S2.hashCode() * 31) + this.giKS3J6vZuNy;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.ZpBGe2uQfcn8.oh71FJcDz6S2);
        sb.append("', newCursorPosition=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.giKS3J6vZuNy, ')');
    }
}
