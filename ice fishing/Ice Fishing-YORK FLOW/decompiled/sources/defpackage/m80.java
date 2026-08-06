package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class m80 {
    public final defpackage.o50 JhCgjQRTAOCT;
    public final defpackage.o50 WDYagTQQm9ns;
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public final defpackage.o50 fWTAfUmVKrZq;
    public final defpackage.o50 giKS3J6vZuNy;
    public final java.io.Serializable oh71FJcDz6S2;

    /* JADX WARN: Multi-variable type inference failed */
    public m80(defpackage.m80[] m80VarArr) {
        int i = 0;
        this.ZpBGe2uQfcn8 = 0;
        this.oh71FJcDz6S2 = m80VarArr;
        int length = m80VarArr.length;
        defpackage.o50[] o50VarArr = new defpackage.o50[length];
        for (int i2 = 0; i2 < length; i2++) {
            o50VarArr[i2] = ((defpackage.m80[]) this.oh71FJcDz6S2)[i2].giKS3J6vZuNy();
        }
        int i3 = 1;
        this.giKS3J6vZuNy = new defpackage.o50(1, new defpackage.rt1(o50VarArr, i));
        int length2 = ((defpackage.m80[]) this.oh71FJcDz6S2).length;
        defpackage.o50[] o50VarArr2 = new defpackage.o50[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            o50VarArr2[i4] = ((defpackage.m80[]) this.oh71FJcDz6S2)[i4].JhCgjQRTAOCT();
        }
        this.fWTAfUmVKrZq = new defpackage.o50(0, new defpackage.n50(o50VarArr2, i));
        int length3 = ((defpackage.m80[]) this.oh71FJcDz6S2).length;
        defpackage.o50[] o50VarArr3 = new defpackage.o50[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            o50VarArr3[i5] = ((defpackage.m80[]) this.oh71FJcDz6S2)[i5].fWTAfUmVKrZq();
        }
        this.JhCgjQRTAOCT = new defpackage.o50(1, new defpackage.rt1(o50VarArr3, i3));
        int length4 = ((defpackage.m80[]) this.oh71FJcDz6S2).length;
        defpackage.o50[] o50VarArr4 = new defpackage.o50[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            o50VarArr4[i6] = ((defpackage.m80[]) this.oh71FJcDz6S2)[i6].ZpBGe2uQfcn8();
        }
        this.WDYagTQQm9ns = new defpackage.o50(0, new defpackage.n50(o50VarArr4, i3));
    }

    public final defpackage.o50 JhCgjQRTAOCT() {
        int i = this.ZpBGe2uQfcn8;
        return this.fWTAfUmVKrZq;
    }

    public final defpackage.o50 ZpBGe2uQfcn8() {
        int i = this.ZpBGe2uQfcn8;
        return this.WDYagTQQm9ns;
    }

    public final defpackage.o50 fWTAfUmVKrZq() {
        int i = this.ZpBGe2uQfcn8;
        return this.JhCgjQRTAOCT;
    }

    public final defpackage.o50 giKS3J6vZuNy() {
        int i = this.ZpBGe2uQfcn8;
        return this.giKS3J6vZuNy;
    }

    public final java.lang.String toString() {
        int i = this.ZpBGe2uQfcn8;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.CharSequence) "innermostOf(");
                int i2 = 0;
                for (defpackage.m80 m80Var : (defpackage.m80[]) obj) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((java.lang.CharSequence) ", ");
                    }
                    defpackage.v70.GE9mJIPrb8gP(sb, m80Var, null);
                }
                sb.append((java.lang.CharSequence) ")");
                return sb.toString();
            default:
                return "RectRulers(" + ((java.lang.String) obj) + ')';
        }
    }

    public m80(java.lang.String str) {
        this.ZpBGe2uQfcn8 = 1;
        this.oh71FJcDz6S2 = str;
        this.giKS3J6vZuNy = new defpackage.o50(1, null);
        this.fWTAfUmVKrZq = new defpackage.o50(0, null);
        this.JhCgjQRTAOCT = new defpackage.o50(1, null);
        this.WDYagTQQm9ns = new defpackage.o50(0, null);
    }
}
