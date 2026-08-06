package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ch0 extends defpackage.iu1 {
    public final defpackage.gn0 giKS3J6vZuNy;

    public ch0() {
        defpackage.gn0 gn0Var = defpackage.k90.ZpBGe2uQfcn8;
        this.giKS3J6vZuNy = new defpackage.gn0();
    }

    @Override // defpackage.iu1
    public final void JhCgjQRTAOCT() {
        defpackage.gn0 gn0Var = this.giKS3J6vZuNy;
        int[] iArr = gn0Var.giKS3J6vZuNy;
        java.lang.Object[] objArr = gn0Var.fWTAfUmVKrZq;
        long[] jArr = gn0Var.ZpBGe2uQfcn8;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        defpackage.sn0 sn0Var = (defpackage.sn0) objArr[i4];
                        java.lang.Object[] objArr2 = sn0Var.ZpBGe2uQfcn8;
                        int i6 = sn0Var.giKS3J6vZuNy;
                        for (int i7 = 0; i7 < i6; i7++) {
                            defpackage.bh0 bh0Var = (defpackage.bh0) objArr2[i7];
                            defpackage.fd fdVar = bh0Var.JhCgjQRTAOCT;
                            if (fdVar != null) {
                                fdVar.cancel();
                            }
                            bh0Var.JhCgjQRTAOCT = null;
                            defpackage.yj0 yj0Var = (defpackage.yj0) bh0Var.ZpBGe2uQfcn8.oh71FJcDz6S2;
                            yj0Var.oh71FJcDz6S2 = true;
                            yj0Var.WDYagTQQm9ns = false;
                            yj0Var.ZpBGe2uQfcn8();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
