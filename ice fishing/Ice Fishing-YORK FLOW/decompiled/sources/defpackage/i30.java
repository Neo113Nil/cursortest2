package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class i30 {
    public final java.util.ArrayList JhCgjQRTAOCT;
    public final defpackage.gn0 WDYagTQQm9ns;
    public final java.util.ArrayList ZpBGe2uQfcn8;
    public int fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;
    public final defpackage.ti1 oh71FJcDz6S2;

    public i30(int i, java.util.ArrayList arrayList) {
        this.ZpBGe2uQfcn8 = arrayList;
        this.giKS3J6vZuNy = i;
        if (i < 0) {
            defpackage.g11.ZpBGe2uQfcn8("Invalid start index");
        }
        this.JhCgjQRTAOCT = new java.util.ArrayList();
        defpackage.gn0 gn0Var = new defpackage.gn0();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.xb0 xb0Var = (defpackage.xb0) this.ZpBGe2uQfcn8.get(i3);
            int i4 = xb0Var.fWTAfUmVKrZq;
            int i5 = xb0Var.JhCgjQRTAOCT;
            gn0Var.P05cfTpS5W5L(i4, new defpackage.m40(i3, i2, i5));
            i2 += i5;
        }
        this.WDYagTQQm9ns = gn0Var;
        this.oh71FJcDz6S2 = new defpackage.ti1(new defpackage.h30(this));
    }

    public final boolean ZpBGe2uQfcn8(int i, int i2) {
        defpackage.m40 m40Var;
        int i3;
        int i4;
        defpackage.gn0 gn0Var = this.WDYagTQQm9ns;
        defpackage.m40 m40Var2 = (defpackage.m40) gn0Var.giKS3J6vZuNy(i);
        if (m40Var2 == null) {
            return false;
        }
        int i5 = m40Var2.giKS3J6vZuNy;
        int i6 = i2 - m40Var2.fWTAfUmVKrZq;
        m40Var2.fWTAfUmVKrZq = i2;
        if (i6 == 0) {
            return true;
        }
        java.lang.Object[] objArr = gn0Var.fWTAfUmVKrZq;
        long[] jArr = gn0Var.ZpBGe2uQfcn8;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (m40Var = (defpackage.m40) objArr[(i7 << 3) + i9]).giKS3J6vZuNy) >= i5 && m40Var != m40Var2 && (i4 = i3 + i6) >= 0) {
                        m40Var.giKS3J6vZuNy = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
