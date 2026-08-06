package defpackage;

/* loaded from: classes.dex */
public final class ge1 extends defpackage.lj0 implements defpackage.wv0, defpackage.qn, defpackage.vv0 {
    public defpackage.ov0 C0U8sNJm;
    public java.lang.Object EgCjBq0SZwJ;
    public final defpackage.xl0 NHJTzaLwkd;
    public defpackage.ov0 PAEGRtP0bX = defpackage.ee1.IHQe1A4L2xu;
    public final defpackage.xl0 QQUzIjv3iOC5;
    public defpackage.xb1 V7bD7b8KA;
    public final defpackage.xl0 abhbClRa;
    public java.lang.Object fnWB2E7cs;
    public androidx.compose.ui.input.pointer.PointerInputEventHandler kNAkVymC;

    public ge1(java.lang.Object obj, java.lang.Object obj2, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler) {
        this.EgCjBq0SZwJ = obj;
        this.fnWB2E7cs = obj2;
        this.kNAkVymC = pointerInputEventHandler;
        defpackage.xl0 xl0Var = new defpackage.xl0(new defpackage.fe1[16]);
        this.abhbClRa = xl0Var;
        this.NHJTzaLwkd = xl0Var;
        this.QQUzIjv3iOC5 = new defpackage.xl0(new defpackage.fe1[16]);
    }

    @Override // defpackage.vv0
    public final void AsxAYCCkb3Hi() {
        defpackage.ov0 ov0Var = this.C0U8sNJm;
        if (ov0Var == null) {
            return;
        }
        java.util.List list = ov0Var.IHQe1A4L2xu;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.sv0) list.get(i)).F7NU4MC0GW) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    defpackage.sv0 sv0Var = (defpackage.sv0) list.get(i2);
                    long j = sv0Var.IHQe1A4L2xu;
                    long j2 = sv0Var.r1MBDhnF;
                    long j3 = sv0Var.oh6vYeIP;
                    float f = sv0Var.adDC3e2L;
                    boolean z = sv0Var.F7NU4MC0GW;
                    arrayList.add(new defpackage.sv0(j, j3, j2, false, f, j3, j2, z, z, sv0Var.riuEU0zW4, 0L, 1.0f, 0L));
                }
                defpackage.ov0 ov0Var2 = new defpackage.ov0(arrayList, null);
                this.PAEGRtP0bX = ov0Var2;
                UVjEelCZ(ov0Var2, defpackage.pv0.adDC3e2L);
                UVjEelCZ(ov0Var2, defpackage.pv0.xiZrDbcSW0);
                UVjEelCZ(ov0Var2, defpackage.pv0.AARZUJiTa);
                this.C0U8sNJm = null;
                return;
            }
        }
    }

    @Override // defpackage.vv0
    public final void C0U8sNJm(defpackage.ov0 ov0Var, defpackage.pv0 pv0Var, long j) {
        if (pv0Var == defpackage.pv0.adDC3e2L) {
            this.PAEGRtP0bX = ov0Var;
        }
        defpackage.ej ejVar = null;
        if (this.V7bD7b8KA == null) {
            this.V7bD7b8KA = defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.ExFEDwBK(this, ejVar, 14), 1);
        }
        UVjEelCZ(ov0Var, pv0Var);
        java.util.List list = ov0Var.IHQe1A4L2xu;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ov0Var = null;
                break;
            } else if (!defpackage.s70.DFo87pBq1E5((defpackage.sv0) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.C0U8sNJm = ov0Var;
    }

    @Override // defpackage.qn
    public final float EXtogiMhuM() {
        return defpackage.w70.D2vUnMij(this).UsuH8pd5P.EXtogiMhuM();
    }

    public final void H6IrRhrpWoH() {
        defpackage.xb1 xb1Var = this.V7bD7b8KA;
        if (xb1Var != null) {
            xb1Var.v5iciZok(new defpackage.pj0("Pointer input was reset", 2));
            this.V7bD7b8KA = null;
        }
    }

    @Override // defpackage.kn, defpackage.vv0
    public final void IHQe1A4L2xu() {
        H6IrRhrpWoH();
    }

    @Override // defpackage.vv0
    public final void TFRaUu83X3E() {
        H6IrRhrpWoH();
    }

    public final void UVjEelCZ(defpackage.ov0 ov0Var, defpackage.pv0 pv0Var) {
        defpackage.bb bbVar;
        defpackage.bb bbVar2;
        synchronized (this.NHJTzaLwkd) {
            defpackage.xl0 xl0Var = this.QQUzIjv3iOC5;
            xl0Var.r1MBDhnF(xl0Var.AARZUJiTa, this.abhbClRa);
        }
        try {
            int ordinal = pv0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    defpackage.xl0 xl0Var2 = this.QQUzIjv3iOC5;
                    int i = xl0Var2.AARZUJiTa - 1;
                    java.lang.Object[] objArr = xl0Var2.adDC3e2L;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            defpackage.fe1 fe1Var = (defpackage.fe1) objArr[i];
                            if (pv0Var == fe1Var.EXtogiMhuM && (bbVar2 = fe1Var.AARZUJiTa) != null) {
                                fe1Var.AARZUJiTa = null;
                                bbVar2.SH1y5HwkJhh(ov0Var);
                            }
                            i--;
                        }
                    }
                    this.QQUzIjv3iOC5.AARZUJiTa();
                }
                if (ordinal != 2) {
                    throw new defpackage.cf();
                }
            }
            defpackage.xl0 xl0Var3 = this.QQUzIjv3iOC5;
            java.lang.Object[] objArr2 = xl0Var3.adDC3e2L;
            int i2 = xl0Var3.AARZUJiTa;
            for (int i3 = 0; i3 < i2; i3++) {
                defpackage.fe1 fe1Var2 = (defpackage.fe1) objArr2[i3];
                if (pv0Var == fe1Var2.EXtogiMhuM && (bbVar = fe1Var2.AARZUJiTa) != null) {
                    fe1Var2.AARZUJiTa = null;
                    bbVar.SH1y5HwkJhh(ov0Var);
                }
            }
            this.QQUzIjv3iOC5.AARZUJiTa();
        } catch (java.lang.Throwable th) {
            this.QQUzIjv3iOC5.AARZUJiTa();
            throw th;
        }
    }

    @Override // defpackage.qn
    public final float oh6vYeIP() {
        return defpackage.w70.D2vUnMij(this).UsuH8pd5P.oh6vYeIP();
    }

    @Override // defpackage.lj0
    public final void yUiIS9dG7NYk() {
        H6IrRhrpWoH();
    }
}
