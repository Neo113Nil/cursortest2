package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mu0 extends defpackage.bv0 {
    public static final defpackage.mu0 fWTAfUmVKrZq = new defpackage.mu0(1, 0, 2);

    @Override // defpackage.bv0
    public final void ZpBGe2uQfcn8(defpackage.z20 z20Var, defpackage.e7 e7Var, defpackage.je1 je1Var, defpackage.i41 i41Var, defpackage.cv0 cv0Var) {
        int[] iArr;
        defpackage.y20 y20Var;
        int fWTAfUmVKrZq2;
        int fWTAfUmVKrZq3 = z20Var.fWTAfUmVKrZq(0);
        if (je1Var.gUjdnLbkVAaA != 0) {
            defpackage.ej.ZpBGe2uQfcn8("Cannot move a group while inserting");
        }
        if (fWTAfUmVKrZq3 < 0) {
            defpackage.ej.ZpBGe2uQfcn8("Parameter offset is out of bounds");
        }
        if (fWTAfUmVKrZq3 == 0) {
            return;
        }
        int i = je1Var.ZVVdXbWmyCSK;
        int i2 = je1Var.maCixPsq4ml2;
        int i3 = je1Var.w7APNrr0aGRc;
        int i4 = i;
        while (true) {
            iArr = je1Var.giKS3J6vZuNy;
            if (fWTAfUmVKrZq3 <= 0) {
                break;
            }
            i4 += iArr[(je1Var.s0TASMVLSWD5(i4) * 5) + 3];
            if (i4 > i3) {
                defpackage.ej.ZpBGe2uQfcn8("Parameter offset is out of bounds");
            }
            fWTAfUmVKrZq3--;
        }
        int i5 = iArr[(je1Var.s0TASMVLSWD5(i4) * 5) + 3];
        int QiMR8OkAhezm = je1Var.QiMR8OkAhezm(je1Var.giKS3J6vZuNy, je1Var.s0TASMVLSWD5(je1Var.ZVVdXbWmyCSK));
        int QiMR8OkAhezm2 = je1Var.QiMR8OkAhezm(je1Var.giKS3J6vZuNy, je1Var.s0TASMVLSWD5(i4));
        int i6 = i4 + i5;
        int QiMR8OkAhezm3 = je1Var.QiMR8OkAhezm(je1Var.giKS3J6vZuNy, je1Var.s0TASMVLSWD5(i6));
        int i7 = QiMR8OkAhezm3 - QiMR8OkAhezm2;
        je1Var.VFeft99leXEK(i7, java.lang.Math.max(je1Var.ZVVdXbWmyCSK - 1, 0));
        je1Var.IJ0hOnjhPOri(i5);
        int[] iArr2 = je1Var.giKS3J6vZuNy;
        int s0TASMVLSWD5 = je1Var.s0TASMVLSWD5(i6) * 5;
        defpackage.y7.cCeDCHgnx5OL(iArr2, iArr2, je1Var.s0TASMVLSWD5(i) * 5, s0TASMVLSWD5, (i5 * 5) + s0TASMVLSWD5);
        if (i7 > 0) {
            java.lang.Object[] objArr = je1Var.fWTAfUmVKrZq;
            int P05cfTpS5W5L = je1Var.P05cfTpS5W5L(QiMR8OkAhezm2 + i7);
            java.lang.System.arraycopy(objArr, P05cfTpS5W5L, objArr, QiMR8OkAhezm, je1Var.P05cfTpS5W5L(QiMR8OkAhezm3 + i7) - P05cfTpS5W5L);
        }
        int i8 = QiMR8OkAhezm2 + i7;
        int i9 = i8 - QiMR8OkAhezm;
        int i10 = je1Var.Ns0WNyEWdPsk;
        int i11 = je1Var.fNwYGHIYeJcR;
        int length = je1Var.fWTAfUmVKrZq.length;
        int i12 = je1Var.h3m55N1URyyK;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int s0TASMVLSWD52 = je1Var.s0TASMVLSWD5(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(s0TASMVLSWD52 * 5) + 4] = defpackage.je1.e6mdH7fiFuta(defpackage.je1.e6mdH7fiFuta(je1Var.QiMR8OkAhezm(iArr2, s0TASMVLSWD52) - i15, i12 < s0TASMVLSWD52 ? 0 : i10, i11, length), je1Var.Ns0WNyEWdPsk, je1Var.fNwYGHIYeJcR, je1Var.fWTAfUmVKrZq.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int XntWc4eZSQ8j = je1Var.XntWc4eZSQ8j();
        int ZpBGe2uQfcn8 = defpackage.ie1.ZpBGe2uQfcn8(je1Var.JhCgjQRTAOCT, i6, XntWc4eZSQ8j);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (ZpBGe2uQfcn8 >= 0) {
            while (ZpBGe2uQfcn8 < je1Var.JhCgjQRTAOCT.size() && (fWTAfUmVKrZq2 = je1Var.fWTAfUmVKrZq((y20Var = (defpackage.y20) je1Var.JhCgjQRTAOCT.get(ZpBGe2uQfcn8)))) >= i6 && fWTAfUmVKrZq2 < i16) {
                arrayList.add(y20Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            defpackage.y20 y20Var2 = (defpackage.y20) arrayList.get(i18);
            int fWTAfUmVKrZq4 = je1Var.fWTAfUmVKrZq(y20Var2) + i17;
            if (fWTAfUmVKrZq4 >= je1Var.QiMR8OkAhezm) {
                y20Var2.ZpBGe2uQfcn8 = -(XntWc4eZSQ8j - fWTAfUmVKrZq4);
            } else {
                y20Var2.ZpBGe2uQfcn8 = fWTAfUmVKrZq4;
            }
            je1Var.JhCgjQRTAOCT.add(defpackage.ie1.ZpBGe2uQfcn8(je1Var.JhCgjQRTAOCT, fWTAfUmVKrZq4, XntWc4eZSQ8j), y20Var2);
        }
        if (je1Var.IBvW5fLsPuHy(i6, i5)) {
            defpackage.ej.ZpBGe2uQfcn8("Unexpectedly removed anchors");
        }
        je1Var.h3m55N1URyyK(i2, je1Var.w7APNrr0aGRc, i);
        if (i7 > 0) {
            je1Var.BXaznwstz2U0(i8, i7, i6 - 1);
        }
    }
}
