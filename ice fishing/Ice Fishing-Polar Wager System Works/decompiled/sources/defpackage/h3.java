package defpackage;

/* loaded from: classes.dex */
public final class h3 extends android.text.TextPaint {
    public defpackage.yn AARZUJiTa;
    public defpackage.z91 EXtogiMhuM;
    public defpackage.c91 F7NU4MC0GW;
    public defpackage.r2 IHQe1A4L2xu;
    public defpackage.ae adDC3e2L;
    public defpackage.ff1 oh6vYeIP;
    public int r1MBDhnF;
    public defpackage.w70 riuEU0zW4;
    public defpackage.h1 xiZrDbcSW0;

    public final void AARZUJiTa(defpackage.ff1 ff1Var) {
        if (ff1Var == null || defpackage.x70.QoRHpC4k(this.oh6vYeIP, ff1Var)) {
            return;
        }
        this.oh6vYeIP = ff1Var;
        int i = ff1Var.IHQe1A4L2xu;
        setUnderlineText((i | 1) == i);
        int i2 = this.oh6vYeIP.IHQe1A4L2xu;
        setStrikeThruText((i2 | 2) == i2);
    }

    public final void F7NU4MC0GW(long j) {
        defpackage.ae aeVar = this.adDC3e2L;
        if ((aeVar == null ? false : defpackage.ae.r1MBDhnF(aeVar.IHQe1A4L2xu, j)) || j == 16) {
            return;
        }
        this.adDC3e2L = new defpackage.ae(j);
        setColor(defpackage.w70.yIx6ChFVk(j));
        this.AARZUJiTa = null;
        this.xiZrDbcSW0 = null;
        this.EXtogiMhuM = null;
        setShader(null);
    }

    public final defpackage.r2 IHQe1A4L2xu() {
        defpackage.r2 r2Var = this.IHQe1A4L2xu;
        if (r2Var != null) {
            return r2Var;
        }
        defpackage.r2 r2Var2 = new defpackage.r2(this);
        this.IHQe1A4L2xu = r2Var2;
        return r2Var2;
    }

    public final void adDC3e2L(defpackage.w70 w70Var) {
        if (w70Var == null || defpackage.x70.QoRHpC4k(this.riuEU0zW4, w70Var)) {
            return;
        }
        this.riuEU0zW4 = w70Var;
        if (w70Var.equals(defpackage.nv.WLpAkxCo)) {
            setStyle(android.graphics.Paint.Style.FILL);
            return;
        }
        if (!(w70Var instanceof defpackage.zc1)) {
            defpackage.db.F7NU4MC0GW();
            return;
        }
        IHQe1A4L2xu().SH1y5HwkJhh(1);
        defpackage.r2 IHQe1A4L2xu = IHQe1A4L2xu();
        ((android.graphics.Paint) IHQe1A4L2xu.oh6vYeIP).setStrokeWidth(((defpackage.zc1) w70Var).WLpAkxCo);
        ((android.graphics.Paint) IHQe1A4L2xu().oh6vYeIP).setStrokeMiter(4.0f);
        IHQe1A4L2xu().riuEU0zW4();
        IHQe1A4L2xu().EXtogiMhuM(0);
        ((android.graphics.Paint) IHQe1A4L2xu().oh6vYeIP).setPathEffect(null);
    }

    public final void oh6vYeIP(int i) {
        if (i == this.r1MBDhnF) {
            return;
        }
        IHQe1A4L2xu().F7NU4MC0GW(i);
        this.r1MBDhnF = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if ((r1 == null ? false : defpackage.z91.IHQe1A4L2xu(r1.IHQe1A4L2xu, r5)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r1MBDhnF(final defpackage.h1 h1Var, final long j, float f) {
        if (h1Var == null) {
            this.AARZUJiTa = null;
            this.xiZrDbcSW0 = null;
            this.EXtogiMhuM = null;
            setShader(null);
            return;
        }
        if (h1Var instanceof defpackage.kb1) {
            F7NU4MC0GW(defpackage.s70.yIx6ChFVk(((defpackage.kb1) h1Var).D2vUnMij, f));
            return;
        }
        if (!(h1Var instanceof defpackage.a91)) {
            defpackage.db.F7NU4MC0GW();
            return;
        }
        if (defpackage.x70.QoRHpC4k(this.xiZrDbcSW0, h1Var)) {
            defpackage.z91 z91Var = this.EXtogiMhuM;
        }
        if (j != 9205357640488583168L) {
            this.xiZrDbcSW0 = h1Var;
            this.EXtogiMhuM = new defpackage.z91(j);
            this.AARZUJiTa = defpackage.c80.QoRHpC4k(new defpackage.vz() { // from class: g3
                @Override // defpackage.vz
                public final java.lang.Object IHQe1A4L2xu() {
                    return ((defpackage.a91) defpackage.h1.this).hkbnNdmy(j);
                }
            });
        }
        defpackage.r2 IHQe1A4L2xu = IHQe1A4L2xu();
        defpackage.yn ynVar = this.AARZUJiTa;
        IHQe1A4L2xu.AARZUJiTa(ynVar != null ? (android.graphics.Shader) ynVar.getValue() : null);
        this.adDC3e2L = null;
        defpackage.h1.mAr5m2L7gYDP(this, f);
    }

    public final void xiZrDbcSW0(defpackage.c91 c91Var) {
        if (c91Var == null || defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, c91Var)) {
            return;
        }
        this.F7NU4MC0GW = c91Var;
        if (c91Var.equals(defpackage.c91.F7NU4MC0GW)) {
            clearShadowLayer();
            return;
        }
        defpackage.c91 c91Var2 = this.F7NU4MC0GW;
        float f = c91Var2.r1MBDhnF;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, java.lang.Float.intBitsToFloat((int) (c91Var2.oh6vYeIP >> 32)), java.lang.Float.intBitsToFloat((int) (this.F7NU4MC0GW.oh6vYeIP & 4294967295L)), defpackage.w70.yIx6ChFVk(this.F7NU4MC0GW.IHQe1A4L2xu));
    }
}
