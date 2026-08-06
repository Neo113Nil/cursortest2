package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wf0 implements defpackage.k71, defpackage.i71 {
    public final defpackage.zn0 QiMR8OkAhezm;
    public final defpackage.l71 WDYagTQQm9ns;
    public final defpackage.i71 oh71FJcDz6S2;

    public wf0(defpackage.k71 k71Var, java.util.Map map, defpackage.i71 i71Var) {
        defpackage.fNwYGHIYeJcR fnwyghiyejcr = new defpackage.fNwYGHIYeJcR(16, k71Var);
        defpackage.ng1 ng1Var = defpackage.m71.ZpBGe2uQfcn8;
        this.WDYagTQQm9ns = new defpackage.l71(map, fnwyghiyejcr);
        this.oh71FJcDz6S2 = i71Var;
        defpackage.zn0 zn0Var = defpackage.n81.ZpBGe2uQfcn8;
        this.QiMR8OkAhezm = new defpackage.zn0();
    }

    @Override // defpackage.k71
    public final boolean JhCgjQRTAOCT(java.lang.Object obj) {
        return this.WDYagTQQm9ns.JhCgjQRTAOCT(obj);
    }

    @Override // defpackage.k71
    public final java.util.Map WDYagTQQm9ns() {
        defpackage.zn0 zn0Var = this.QiMR8OkAhezm;
        java.lang.Object[] objArr = zn0Var.giKS3J6vZuNy;
        long[] jArr = zn0Var.ZpBGe2uQfcn8;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.oh71FJcDz6S2.fWTAfUmVKrZq(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.WDYagTQQm9ns.WDYagTQQm9ns();
    }

    @Override // defpackage.k71
    public final defpackage.a7 ZpBGe2uQfcn8(java.lang.String str, defpackage.n10 n10Var) {
        return this.WDYagTQQm9ns.ZpBGe2uQfcn8(str, n10Var);
    }

    @Override // defpackage.i71
    public final void fWTAfUmVKrZq(java.lang.Object obj) {
        this.oh71FJcDz6S2.fWTAfUmVKrZq(obj);
    }

    @Override // defpackage.i71
    public final void giKS3J6vZuNy(java.lang.Object obj, defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        int i2;
        e30Var.PS16moFv2oLu(-858296452);
        if ((i & 6) == 0) {
            i2 = (e30Var.P05cfTpS5W5L(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(nhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(this) ? 256 : 128;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 147) != 146)) {
            this.oh71FJcDz6S2.giKS3J6vZuNy(obj, nhVar, e30Var, i2 & 126);
            boolean P05cfTpS5W5L = e30Var.P05cfTpS5W5L(this) | e30Var.P05cfTpS5W5L(obj);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = new defpackage.fWTAfUmVKrZq(19, this, obj);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.nq1.oh71FJcDz6S2(obj, (defpackage.y10) GcLuU6pT9wO9, e30Var);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.n3(this, obj, nhVar, i, 11);
        }
    }

    @Override // defpackage.k71
    public final java.lang.Object oh71FJcDz6S2(java.lang.String str) {
        return this.WDYagTQQm9ns.oh71FJcDz6S2(str);
    }
}
