package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yj0 implements defpackage.k51 {
    public boolean QiMR8OkAhezm;
    public boolean oh71FJcDz6S2;
    public boolean WDYagTQQm9ns = true;
    public final defpackage.yn0 P05cfTpS5W5L = new defpackage.yn0();

    public final void ZpBGe2uQfcn8() {
        defpackage.yn0 yn0Var = this.P05cfTpS5W5L;
        java.lang.Object[] objArr = yn0Var.fWTAfUmVKrZq;
        long[] jArr = yn0Var.ZpBGe2uQfcn8;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            java.lang.Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof defpackage.sn0) {
                                defpackage.sn0 sn0Var = (defpackage.sn0) obj;
                                java.lang.Object[] objArr2 = sn0Var.ZpBGe2uQfcn8;
                                int i4 = sn0Var.giKS3J6vZuNy;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    java.lang.Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        yn0Var.ZpBGe2uQfcn8();
    }
}
