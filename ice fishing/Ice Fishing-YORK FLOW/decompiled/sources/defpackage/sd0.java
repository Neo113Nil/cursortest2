package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sd0 implements defpackage.wk0 {
    public final /* synthetic */ int JhCgjQRTAOCT;
    public final /* synthetic */ defpackage.wk0 WDYagTQQm9ns;
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public final /* synthetic */ defpackage.xd0 fWTAfUmVKrZq;
    public final /* synthetic */ defpackage.wk0 giKS3J6vZuNy;

    public /* synthetic */ sd0(defpackage.wk0 wk0Var, defpackage.xd0 xd0Var, int i, defpackage.wk0 wk0Var2, int i2) {
        this.ZpBGe2uQfcn8 = i2;
        this.fWTAfUmVKrZq = xd0Var;
        this.JhCgjQRTAOCT = i;
        this.WDYagTQQm9ns = wk0Var2;
        this.giKS3J6vZuNy = wk0Var;
    }

    @Override // defpackage.wk0
    public final defpackage.y10 JhCgjQRTAOCT() {
        switch (this.ZpBGe2uQfcn8) {
        }
        return this.giKS3J6vZuNy.JhCgjQRTAOCT();
    }

    @Override // defpackage.wk0
    public final int WDYagTQQm9ns() {
        switch (this.ZpBGe2uQfcn8) {
        }
        return this.giKS3J6vZuNy.WDYagTQQm9ns();
    }

    @Override // defpackage.wk0
    public final java.util.Map ZpBGe2uQfcn8() {
        switch (this.ZpBGe2uQfcn8) {
        }
        return this.giKS3J6vZuNy.ZpBGe2uQfcn8();
    }

    @Override // defpackage.wk0
    public final int fWTAfUmVKrZq() {
        switch (this.ZpBGe2uQfcn8) {
        }
        return this.giKS3J6vZuNy.fWTAfUmVKrZq();
    }

    @Override // defpackage.wk0
    public final void giKS3J6vZuNy() {
        int i;
        int i2 = this.ZpBGe2uQfcn8;
        defpackage.wk0 wk0Var = this.WDYagTQQm9ns;
        int i3 = this.JhCgjQRTAOCT;
        defpackage.xd0 xd0Var = this.fWTAfUmVKrZq;
        switch (i2) {
            case 0:
                xd0Var.e6mdH7fiFuta = i3;
                wk0Var.giKS3J6vZuNy();
                defpackage.ho0 ho0Var = xd0Var.WmetiUbpKU9I;
                defpackage.yn0 yn0Var = xd0Var.XntWc4eZSQ8j;
                long[] jArr = yn0Var.ZpBGe2uQfcn8;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    java.lang.Object obj = yn0Var.giKS3J6vZuNy[i8];
                                    defpackage.oh1 oh1Var = (defpackage.oh1) yn0Var.fWTAfUmVKrZq[i8];
                                    int e6mdH7fiFuta = ho0Var.e6mdH7fiFuta(obj);
                                    if (e6mdH7fiFuta < 0 || e6mdH7fiFuta >= xd0Var.e6mdH7fiFuta) {
                                        if (e6mdH7fiFuta >= 0) {
                                            java.lang.Object obj2 = defpackage.h0.WmetiUbpKU9I;
                                            i = i5;
                                            java.lang.Object[] objArr = ho0Var.WDYagTQQm9ns;
                                            java.lang.Object obj3 = objArr[e6mdH7fiFuta];
                                            objArr[e6mdH7fiFuta] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (xd0Var.gUjdnLbkVAaA.giKS3J6vZuNy(obj)) {
                                            oh1Var.ZpBGe2uQfcn8();
                                        }
                                        yn0Var.fNwYGHIYeJcR(i8);
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                    }
                                }
                                i = i5;
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 != i5) {
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                xd0Var.QiMR8OkAhezm(xd0Var.P05cfTpS5W5L);
                break;
            default:
                xd0Var.P05cfTpS5W5L = i3;
                wk0Var.giKS3J6vZuNy();
                if (xd0Var.WDYagTQQm9ns.fNwYGHIYeJcR == null) {
                    xd0Var.QiMR8OkAhezm(xd0Var.P05cfTpS5W5L);
                    break;
                }
                break;
        }
    }
}
