package defpackage;

/* loaded from: classes.dex */
public final class e60 {
    public final defpackage.i40 F7NU4MC0GW;
    public final /* synthetic */ int IHQe1A4L2xu;
    public final defpackage.i40 adDC3e2L;
    public final defpackage.i40 oh6vYeIP;
    public final defpackage.i40 r1MBDhnF;
    public final java.io.Serializable xiZrDbcSW0;

    /* JADX WARN: Multi-variable type inference failed */
    public e60(defpackage.e60[] e60VarArr) {
        int i = 0;
        this.IHQe1A4L2xu = 0;
        this.xiZrDbcSW0 = e60VarArr;
        int length = e60VarArr.length;
        defpackage.i40[] i40VarArr = new defpackage.i40[length];
        for (int i2 = 0; i2 < length; i2++) {
            i40VarArr[i2] = ((defpackage.e60[]) this.xiZrDbcSW0)[i2].oh6vYeIP();
        }
        int i3 = 1;
        this.oh6vYeIP = new defpackage.i40(1, new defpackage.zl1(i40VarArr, i));
        int length2 = ((defpackage.e60[]) this.xiZrDbcSW0).length;
        defpackage.i40[] i40VarArr2 = new defpackage.i40[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            i40VarArr2[i4] = ((defpackage.e60[]) this.xiZrDbcSW0)[i4].F7NU4MC0GW();
        }
        this.r1MBDhnF = new defpackage.i40(0, new defpackage.h40(i40VarArr2, i));
        int length3 = ((defpackage.e60[]) this.xiZrDbcSW0).length;
        defpackage.i40[] i40VarArr3 = new defpackage.i40[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            i40VarArr3[i5] = ((defpackage.e60[]) this.xiZrDbcSW0)[i5].r1MBDhnF();
        }
        this.F7NU4MC0GW = new defpackage.i40(1, new defpackage.zl1(i40VarArr3, i3));
        int length4 = ((defpackage.e60[]) this.xiZrDbcSW0).length;
        defpackage.i40[] i40VarArr4 = new defpackage.i40[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            i40VarArr4[i6] = ((defpackage.e60[]) this.xiZrDbcSW0)[i6].IHQe1A4L2xu();
        }
        this.adDC3e2L = new defpackage.i40(0, new defpackage.h40(i40VarArr4, i3));
    }

    public final defpackage.i40 F7NU4MC0GW() {
        int i = this.IHQe1A4L2xu;
        return this.r1MBDhnF;
    }

    public final defpackage.i40 IHQe1A4L2xu() {
        int i = this.IHQe1A4L2xu;
        return this.adDC3e2L;
    }

    public final defpackage.i40 oh6vYeIP() {
        int i = this.IHQe1A4L2xu;
        return this.oh6vYeIP;
    }

    public final defpackage.i40 r1MBDhnF() {
        int i = this.IHQe1A4L2xu;
        return this.F7NU4MC0GW;
    }

    public final java.lang.String toString() {
        int i = this.IHQe1A4L2xu;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.CharSequence) "innermostOf(");
                int i2 = 0;
                for (defpackage.e60 e60Var : (defpackage.e60[]) obj) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((java.lang.CharSequence) ", ");
                    }
                    defpackage.s70.xiZrDbcSW0(sb, e60Var, null);
                }
                sb.append((java.lang.CharSequence) ")");
                return sb.toString();
            default:
                return "RectRulers(" + ((java.lang.String) obj) + ')';
        }
    }

    public e60(java.lang.String str) {
        this.IHQe1A4L2xu = 1;
        this.xiZrDbcSW0 = str;
        this.oh6vYeIP = new defpackage.i40(1, null);
        this.r1MBDhnF = new defpackage.i40(0, null);
        this.F7NU4MC0GW = new defpackage.i40(1, null);
        this.adDC3e2L = new defpackage.i40(0, null);
    }
}
