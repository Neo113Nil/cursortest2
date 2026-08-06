package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class z20 {
    public int JhCgjQRTAOCT;
    public java.lang.Object WDYagTQQm9ns;
    public final /* synthetic */ int ZpBGe2uQfcn8 = 0;
    public int fWTAfUmVKrZq;
    public int giKS3J6vZuNy;

    public z20(int i, int i2, int i3, defpackage.bn1 bn1Var) {
        this.giKS3J6vZuNy = i;
        this.fWTAfUmVKrZq = i2;
        this.JhCgjQRTAOCT = i3;
        this.WDYagTQQm9ns = bn1Var;
    }

    public java.lang.Object JhCgjQRTAOCT(int i) {
        return ((defpackage.dv0) this.WDYagTQQm9ns).QiMR8OkAhezm[this.JhCgjQRTAOCT + i];
    }

    public defpackage.na1 ZpBGe2uQfcn8(int i) {
        return new defpackage.na1(defpackage.j80.dG7RjM6DqYVL((defpackage.bn1) this.WDYagTQQm9ns, i), i, 1L);
    }

    public int fWTAfUmVKrZq(int i) {
        return ((defpackage.dv0) this.WDYagTQQm9ns).WDYagTQQm9ns[this.fWTAfUmVKrZq + i];
    }

    public int giKS3J6vZuNy() {
        return this.JhCgjQRTAOCT - this.fWTAfUmVKrZq;
    }

    public java.lang.String toString() {
        switch (this.ZpBGe2uQfcn8) {
            case 0:
                return "";
            case 1:
            default:
                return super.toString();
            case 2:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.giKS3J6vZuNy;
                sb.append(i);
                sb.append('-');
                defpackage.bn1 bn1Var = (defpackage.bn1) this.WDYagTQQm9ns;
                sb.append(defpackage.j80.dG7RjM6DqYVL(bn1Var, i));
                sb.append(',');
                int i2 = this.fWTAfUmVKrZq;
                sb.append(i2);
                sb.append('-');
                sb.append(defpackage.j80.dG7RjM6DqYVL(bn1Var, i2));
                sb.append("), prevOffset=");
                return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.JhCgjQRTAOCT, ')');
        }
    }

    public z20(defpackage.dv0 dv0Var) {
        this.WDYagTQQm9ns = dv0Var;
    }

    public /* synthetic */ z20() {
    }
}
