package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bu0 extends defpackage.bv0 {
    public static final defpackage.bu0 fWTAfUmVKrZq = new defpackage.bu0(0, 2, 1);

    @Override // defpackage.bv0
    public final void ZpBGe2uQfcn8(defpackage.z20 z20Var, defpackage.e7 e7Var, defpackage.je1 je1Var, defpackage.i41 i41Var, defpackage.cv0 cv0Var) {
        int i;
        defpackage.r90 r90Var = (defpackage.r90) z20Var.JhCgjQRTAOCT(0);
        int fWTAfUmVKrZq2 = je1Var.fWTAfUmVKrZq((defpackage.y20) z20Var.JhCgjQRTAOCT(1));
        if (je1Var.ZVVdXbWmyCSK >= fWTAfUmVKrZq2) {
            defpackage.ej.ZpBGe2uQfcn8("Check failed");
        }
        defpackage.n70.oCu53ZX2v4Ju(je1Var, e7Var, fWTAfUmVKrZq2);
        int i2 = je1Var.ZVVdXbWmyCSK;
        int i3 = je1Var.maCixPsq4ml2;
        while (i3 >= 0 && !je1Var.oCu53ZX2v4Ju(i3)) {
            i3 = je1Var.jjTN4uUnoyEn(je1Var.giKS3J6vZuNy, i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (je1Var.maCixPsq4ml2(i2, i4)) {
                if (je1Var.oCu53ZX2v4Ju(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += je1Var.oCu53ZX2v4Ju(i4) ? 1 : je1Var.giKS3J6vZuNy[(je1Var.s0TASMVLSWD5(i4) * 5) + 1] & 67108863;
                i4 += je1Var.w7APNrr0aGRc(i4);
            }
        }
        while (true) {
            i = je1Var.ZVVdXbWmyCSK;
            if (i >= fWTAfUmVKrZq2) {
                break;
            }
            if (je1Var.maCixPsq4ml2(fWTAfUmVKrZq2, i)) {
                int i6 = je1Var.ZVVdXbWmyCSK;
                if (i6 < je1Var.w7APNrr0aGRc && (je1Var.giKS3J6vZuNy[(je1Var.s0TASMVLSWD5(i6) * 5) + 1] & 1073741824) != 0) {
                    e7Var.JhCgjQRTAOCT(je1Var.qjMheFZ0l9kA(je1Var.ZVVdXbWmyCSK));
                    i5 = 0;
                }
                je1Var.Wc0TdmRSwbbi();
            } else {
                i5 += je1Var.GcLuU6pT9wO9();
            }
        }
        if (i != fWTAfUmVKrZq2) {
            defpackage.ej.ZpBGe2uQfcn8("Check failed");
        }
        r90Var.ZpBGe2uQfcn8 = i5;
    }
}
