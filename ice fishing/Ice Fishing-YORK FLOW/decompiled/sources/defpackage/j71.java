package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class j71 implements defpackage.i71 {
    public static final defpackage.n80 e6mdH7fiFuta = new defpackage.n80(29, new defpackage.b7(21, 0), new defpackage.lp0(11));
    public final defpackage.fNwYGHIYeJcR P05cfTpS5W5L;
    public defpackage.k71 QiMR8OkAhezm;
    public final java.util.Map WDYagTQQm9ns;
    public final defpackage.yn0 oh71FJcDz6S2;

    public j71(java.util.Map map) {
        this.WDYagTQQm9ns = map;
        long[] jArr = defpackage.m81.ZpBGe2uQfcn8;
        this.oh71FJcDz6S2 = new defpackage.yn0();
        this.P05cfTpS5W5L = new defpackage.fNwYGHIYeJcR(26, this);
    }

    @Override // defpackage.i71
    public final void fWTAfUmVKrZq(java.lang.Object obj) {
        if (this.oh71FJcDz6S2.Ns0WNyEWdPsk(obj) == null) {
            this.WDYagTQQm9ns.remove(obj);
        }
    }

    @Override // defpackage.i71
    public final void giKS3J6vZuNy(java.lang.Object obj, defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        int i2;
        e30Var.PS16moFv2oLu(533563200);
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
            e30Var.GoIRkIe1iwj6(obj);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
            if (GcLuU6pT9wO9 == pa1Var) {
                defpackage.fNwYGHIYeJcR fnwyghiyejcr = this.P05cfTpS5W5L;
                if (!((java.lang.Boolean) fnwyghiyejcr.P05cfTpS5W5L(obj)).booleanValue()) {
                    defpackage.p81.JhCgjQRTAOCT("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                java.util.Map map = (java.util.Map) this.WDYagTQQm9ns.get(obj);
                defpackage.ng1 ng1Var = defpackage.m71.ZpBGe2uQfcn8;
                defpackage.n71 n71Var = new defpackage.n71(new defpackage.l71(map, fnwyghiyejcr));
                e30Var.EgL5gQQnyJKX(n71Var);
                GcLuU6pT9wO9 = n71Var;
            }
            defpackage.n71 n71Var2 = (defpackage.n71) GcLuU6pT9wO9;
            int i3 = 8;
            defpackage.vx1.JhCgjQRTAOCT(new defpackage.v21[]{defpackage.m71.ZpBGe2uQfcn8.ZpBGe2uQfcn8(n71Var2), defpackage.li0.ZpBGe2uQfcn8.ZpBGe2uQfcn8(n71Var2)}, nhVar, e30Var, (i2 & 112) | 8);
            boolean P05cfTpS5W5L = e30Var.P05cfTpS5W5L(this) | e30Var.P05cfTpS5W5L(obj) | e30Var.P05cfTpS5W5L(n71Var2);
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L || GcLuU6pT9wO92 == pa1Var) {
                GcLuU6pT9wO92 = new defpackage.eSwlWMUpitz8(this, obj, n71Var2, i3);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
            }
            defpackage.nq1.oh71FJcDz6S2(defpackage.gs1.ZpBGe2uQfcn8, (defpackage.y10) GcLuU6pT9wO92, e30Var);
            if (e30Var.oCu53ZX2v4Ju && e30Var.frSwwKIlbUhK.e6mdH7fiFuta == e30Var.dG7RjM6DqYVL) {
                e30Var.dG7RjM6DqYVL = -1;
                e30Var.oCu53ZX2v4Ju = false;
            }
            e30Var.XntWc4eZSQ8j(false);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.n3(this, obj, nhVar, i, 13);
        }
    }
}
