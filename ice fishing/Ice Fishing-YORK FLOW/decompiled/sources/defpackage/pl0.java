package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class pl0 implements defpackage.y10 {
    public final /* synthetic */ int P05cfTpS5W5L;
    public final /* synthetic */ int QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ pl0(int i, defpackage.ry0 ry0Var, int i2) {
        this.WDYagTQQm9ns = 0;
        this.QiMR8OkAhezm = i;
        this.oh71FJcDz6S2 = ry0Var;
        this.P05cfTpS5W5L = i2;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        int i2 = this.P05cfTpS5W5L;
        int i3 = this.QiMR8OkAhezm;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.qy0.QiMR8OkAhezm((defpackage.qy0) obj, (defpackage.ry0) obj2, defpackage.ok0.CZa7MwI9IzLd((i3 - r11.WDYagTQQm9ns) / 2.0f), defpackage.ok0.CZa7MwI9IzLd((i2 - r11.oh71FJcDz6S2) / 2.0f));
                break;
            case 1:
                defpackage.qy0.QiMR8OkAhezm((defpackage.qy0) obj, (defpackage.ry0) obj2, i3, i2);
                break;
            default:
                defpackage.s2 s2Var = (defpackage.s2) obj2;
                defpackage.dw0 dw0Var = (defpackage.dw0) obj;
                defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
                int JhCgjQRTAOCT = dw0Var.JhCgjQRTAOCT(i3);
                int JhCgjQRTAOCT2 = dw0Var.JhCgjQRTAOCT(i2);
                java.lang.CharSequence charSequence = m2Var.WDYagTQQm9ns;
                if (JhCgjQRTAOCT < 0 || JhCgjQRTAOCT > JhCgjQRTAOCT2 || JhCgjQRTAOCT2 > charSequence.length()) {
                    defpackage.f80.ZpBGe2uQfcn8("start(" + JhCgjQRTAOCT + ") or end(" + JhCgjQRTAOCT2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                android.graphics.Path path = new android.graphics.Path();
                defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
                zm1Var.oh71FJcDz6S2.getSelectionPath(JhCgjQRTAOCT, JhCgjQRTAOCT2, path);
                int i4 = zm1Var.P05cfTpS5W5L;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                defpackage.s2 s2Var2 = new defpackage.s2(path);
                float f = dw0Var.oh71FJcDz6S2;
                long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L);
                android.graphics.Matrix matrix = s2Var2.JhCgjQRTAOCT;
                if (matrix == null) {
                    s2Var2.JhCgjQRTAOCT = new android.graphics.Matrix();
                } else {
                    matrix.reset();
                }
                android.graphics.Matrix matrix2 = s2Var2.JhCgjQRTAOCT;
                matrix2.getClass();
                matrix2.setTranslate(java.lang.Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), java.lang.Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
                android.graphics.Matrix matrix3 = s2Var2.JhCgjQRTAOCT;
                matrix3.getClass();
                path.transform(matrix3);
                defpackage.s2.ZpBGe2uQfcn8(s2Var, s2Var2);
                break;
        }
        return gs1Var;
    }

    public /* synthetic */ pl0(java.lang.Object obj, int i, int i2, int i3) {
        this.WDYagTQQm9ns = i3;
        this.oh71FJcDz6S2 = obj;
        this.QiMR8OkAhezm = i;
        this.P05cfTpS5W5L = i2;
    }
}
