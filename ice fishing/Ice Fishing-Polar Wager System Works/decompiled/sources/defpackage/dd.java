package defpackage;

/* loaded from: classes.dex */
public class dd extends defpackage.ln implements defpackage.vv0, defpackage.n90, defpackage.d71, defpackage.ui1, defpackage.lh, defpackage.dq0, defpackage.q50 {
    public static final defpackage.ad1 lpprD5VAS = new defpackage.ad1(7);
    public final defpackage.jy C0U8sNJm;
    public defpackage.l40 D2vUnMij;
    public boolean NHJTzaLwkd;
    public boolean PAEGRtP0bX;
    public defpackage.vz QQUzIjv3iOC5;
    public long SiPhmbmu;
    public defpackage.f50 UsuH8pd5P;
    public defpackage.sv0 Uv8CGu3G;
    public defpackage.f50 V7bD7b8KA;
    public defpackage.F7NU4MC0GW XZx205DYe;
    public defpackage.l21 abhbClRa;
    public final defpackage.bl0 frpfPPIgqM9O;
    public final defpackage.ad1 hyxIchWRW;
    public defpackage.zk0 kNAkVymC;
    public defpackage.xb1 mAr5m2L7gYDP;
    public defpackage.kn nBH8hAHy;
    public defpackage.px0 p4kuH6PDtgom;
    public defpackage.px0 v5iciZok;
    public boolean wll2JLbTBC2;
    public defpackage.zk0 yIx6ChFVk;

    public dd(defpackage.zk0 zk0Var, defpackage.f50 f50Var, boolean z, boolean z2, defpackage.l21 l21Var, defpackage.vz vzVar) {
        this.kNAkVymC = zk0Var;
        this.V7bD7b8KA = f50Var;
        this.PAEGRtP0bX = z;
        this.abhbClRa = l21Var;
        this.NHJTzaLwkd = z2;
        this.QQUzIjv3iOC5 = vzVar;
        this.C0U8sNJm = new defpackage.jy(zk0Var, new defpackage.xiZrDbcSW0(1, this, defpackage.dd.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 0));
        int i = defpackage.tf0.IHQe1A4L2xu;
        this.frpfPPIgqM9O = new defpackage.bl0(6);
        this.SiPhmbmu = 0L;
        defpackage.zk0 zk0Var2 = this.kNAkVymC;
        this.yIx6ChFVk = zk0Var2;
        this.wll2JLbTBC2 = zk0Var2 == null;
        this.hyxIchWRW = lpprD5VAS;
    }

    @Override // defpackage.vv0
    public final void AsxAYCCkb3Hi() {
        defpackage.l40 l40Var;
        defpackage.zk0 zk0Var = this.kNAkVymC;
        if (zk0Var != null && (l40Var = this.D2vUnMij) != null) {
            zk0Var.oh6vYeIP(new defpackage.m40(l40Var));
        }
        this.D2vUnMij = null;
        if (this.Uv8CGu3G != null) {
            this.Uv8CGu3G = null;
            fzubgBFo(false);
        }
    }

    @Override // defpackage.vv0
    public final void C0U8sNJm(defpackage.ov0 ov0Var, defpackage.pv0 pv0Var, long j) {
        char c = ' ';
        long j2 = 4294967295L;
        long j3 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.SiPhmbmu = (java.lang.Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (java.lang.Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L);
        jjT5JLZla8();
        boolean z = this.NHJTzaLwkd;
        defpackage.pv0 pv0Var2 = defpackage.pv0.xiZrDbcSW0;
        defpackage.ej ejVar = null;
        int i = 1;
        int i2 = 0;
        if (z && pv0Var == pv0Var2) {
            int i3 = ov0Var.r1MBDhnF;
            if (i3 == 4) {
                defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.JlrlGoKF(this, ejVar, i2), 3);
            } else if (i3 == 5) {
                defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.JlrlGoKF(this, ejVar, i), 3);
            }
        }
        if (pv0Var != pv0Var2) {
            if (pv0Var != defpackage.pv0.AARZUJiTa || this.Uv8CGu3G == null) {
                return;
            }
            java.util.List list = ov0Var.IHQe1A4L2xu;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                defpackage.sv0 sv0Var = (defpackage.sv0) list.get(i4);
                if (sv0Var.oh6vYeIP() && sv0Var != this.Uv8CGu3G) {
                    this.Uv8CGu3G = null;
                    fzubgBFo(false);
                    return;
                }
            }
            return;
        }
        defpackage.sv0 sv0Var2 = this.Uv8CGu3G;
        if (sv0Var2 == null) {
            if (defpackage.xe1.r1MBDhnF(ov0Var, true)) {
                defpackage.sv0 sv0Var3 = (defpackage.sv0) ov0Var.IHQe1A4L2xu.get(0);
                sv0Var3.IHQe1A4L2xu();
                this.Uv8CGu3G = sv0Var3;
                if (this.NHJTzaLwkd) {
                    XkvoyZRg(sv0Var3.r1MBDhnF, false);
                    return;
                }
                return;
            }
            return;
        }
        java.util.List list2 = ov0Var.IHQe1A4L2xu;
        int size2 = list2.size();
        int i5 = 0;
        while (i5 < size2) {
            defpackage.sv0 sv0Var4 = (defpackage.sv0) list2.get(i5);
            if (((sv0Var4.oh6vYeIP() || !sv0Var4.EXtogiMhuM || sv0Var4.F7NU4MC0GW) ? 0 : i) == 0) {
                long hkbnNdmy = defpackage.w70.D2vUnMij(this).UsuH8pd5P.hkbnNdmy(((defpackage.pm1) defpackage.mj1.abhbClRa(this, defpackage.ph.fnWB2E7cs)).r1MBDhnF());
                long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (hkbnNdmy >> c)) - ((int) (j >> c))) / 2.0f) << c) | (java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (hkbnNdmy & j2)) - ((int) (j & j2))) / 2.0f) & j2);
                int size3 = list2.size();
                int i6 = 0;
                while (i6 < size3) {
                    defpackage.sv0 sv0Var5 = (defpackage.sv0) list2.get(i6);
                    if (!sv0Var5.oh6vYeIP()) {
                        int i7 = sv0Var5.riuEU0zW4 == i ? i : i2;
                        long j4 = sv0Var5.r1MBDhnF;
                        char c2 = c;
                        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j4 >> c2));
                        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j4 & j2));
                        float f = i7;
                        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (floatToRawIntBits >> c2)) * f;
                        long j5 = j2;
                        float f2 = ((int) (j >> c2)) + intBitsToFloat3;
                        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (floatToRawIntBits & j5)) * f;
                        if (!((intBitsToFloat > f2) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & j5)) + intBitsToFloat4))) {
                            i6++;
                            j2 = j5;
                            c = ' ';
                            i = 1;
                            i2 = 0;
                        }
                    }
                    this.Uv8CGu3G = null;
                    fzubgBFo(false);
                    return;
                }
                return;
            }
            i5++;
            j2 = j2;
            c = ' ';
            i = 1;
        }
        ((defpackage.sv0) list2.get(0)).IHQe1A4L2xu();
        if (this.NHJTzaLwkd) {
            xp7x2U2iUl(sv0Var2.r1MBDhnF, false);
            this.QQUzIjv3iOC5.IHQe1A4L2xu();
        }
        this.Uv8CGu3G = null;
    }

    @Override // defpackage.lj0
    public final void JX5fKip1C6() {
        nBH8hAHy();
        if (!this.wll2JLbTBC2) {
            jjT5JLZla8();
        }
        if (this.NHJTzaLwkd) {
            UVjEelCZ(this.C0U8sNJm);
        }
    }

    @Override // defpackage.ui1
    public final java.lang.Object JlrlGoKF() {
        return this.hyxIchWRW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r3.nBH8hAHy == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void LoQIcHWpPq(defpackage.zk0 zk0Var, defpackage.f50 f50Var, boolean z, boolean z2, defpackage.l21 l21Var, defpackage.vz vzVar) {
        boolean z3;
        defpackage.kn knVar;
        boolean z4 = true;
        if (defpackage.x70.QoRHpC4k(this.yIx6ChFVk, zk0Var)) {
            z3 = false;
        } else {
            uLnPvzwk();
            this.yIx6ChFVk = zk0Var;
            this.kNAkVymC = zk0Var;
            z3 = true;
        }
        if (!defpackage.x70.QoRHpC4k(this.V7bD7b8KA, f50Var)) {
            this.V7bD7b8KA = f50Var;
            z3 = true;
        }
        if (this.PAEGRtP0bX != z) {
            this.PAEGRtP0bX = z;
            if (z) {
                nBH8hAHy();
            }
            z3 = true;
        }
        boolean z5 = this.NHJTzaLwkd;
        defpackage.jy jyVar = this.C0U8sNJm;
        if (z5 != z2) {
            if (z2) {
                UVjEelCZ(jyVar);
            } else {
                H6IrRhrpWoH(jyVar);
                uLnPvzwk();
            }
            defpackage.x80.C0U8sNJm(this);
            this.NHJTzaLwkd = z2;
        }
        if (!defpackage.x70.QoRHpC4k(this.abhbClRa, l21Var)) {
            this.abhbClRa = l21Var;
            defpackage.x80.C0U8sNJm(this);
        }
        this.QQUzIjv3iOC5 = vzVar;
        boolean z6 = this.wll2JLbTBC2;
        defpackage.zk0 zk0Var2 = this.yIx6ChFVk;
        if (z6 != (zk0Var2 == null)) {
            boolean z7 = zk0Var2 == null;
            this.wll2JLbTBC2 = z7;
            if (!z7) {
            }
        }
        z4 = z3;
        if (z4 && ((knVar = this.nBH8hAHy) != null || !this.wll2JLbTBC2)) {
            if (knVar != null) {
                H6IrRhrpWoH(knVar);
            }
            this.nBH8hAHy = null;
            jjT5JLZla8();
        }
        jyVar.fzubgBFo(this.kNAkVymC);
    }

    @Override // defpackage.d71
    public final boolean QUKZkWRtw6() {
        return true;
    }

    public final void XkvoyZRg(long j, boolean z) {
        defpackage.zk0 zk0Var = this.kNAkVymC;
        if (zk0Var != null) {
            defpackage.px0 px0Var = new defpackage.px0(j);
            defpackage.nz0 nz0Var = new defpackage.nz0();
            defpackage.f70.D2vUnMij(this, defpackage.q51.fnWB2E7cs, new defpackage.DFo87pBq1E5(3, nz0Var));
            if (!nz0Var.adDC3e2L) {
                int i = defpackage.ed.oh6vYeIP;
                if (!this.adDC3e2L.kd6TUFXn) {
                    defpackage.x50.oh6vYeIP("Cannot get View because the Modifier node is not currently attached.");
                }
                android.view.ViewParent parent = ((android.view.View) defpackage.pa0.IHQe1A4L2xu(defpackage.w70.D2vUnMij(this))).getParent();
                while (parent != null && (parent instanceof android.view.ViewGroup)) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
                if (z) {
                    this.p4kuH6PDtgom = px0Var;
                } else {
                    this.v5iciZok = px0Var;
                }
                defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.riuEU0zW4(zk0Var, px0Var, (defpackage.ej) null), 3);
                return;
            }
            this.mAr5m2L7gYDP = defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.SH1y5HwkJhh(zk0Var, px0Var, z, this, null), 3);
        }
    }

    @Override // defpackage.lj0
    public final boolean ZNF7fheNE() {
        return false;
    }

    @Override // defpackage.q50
    public final void abhbClRa(defpackage.p2 p2Var, defpackage.pv0 pv0Var) {
        java.util.ArrayList arrayList = (java.util.ArrayList) p2Var.oh6vYeIP;
        jjT5JLZla8();
        if (this.NHJTzaLwkd) {
            int i = 0;
            if (this.XZx205DYe == null) {
                this.XZx205DYe = new defpackage.F7NU4MC0GW(i, this);
            }
            defpackage.F7NU4MC0GW f7nu4mc0gw = this.XZx205DYe;
            if (f7nu4mc0gw != null) {
                defpackage.vz vzVar = this.QQUzIjv3iOC5;
                defpackage.dd ddVar = (defpackage.dd) f7nu4mc0gw.xiZrDbcSW0;
                if (pv0Var != defpackage.pv0.xiZrDbcSW0) {
                    if (pv0Var != defpackage.pv0.AARZUJiTa || ((defpackage.h50) f7nu4mc0gw.AARZUJiTa) == null) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        defpackage.h50 h50Var = (defpackage.h50) arrayList.get(i);
                        if (h50Var.riuEU0zW4 && h50Var != ((defpackage.h50) f7nu4mc0gw.AARZUJiTa)) {
                            f7nu4mc0gw.QQUzIjv3iOC5();
                            return;
                        }
                        i++;
                    }
                    return;
                }
                defpackage.h50 h50Var2 = (defpackage.h50) f7nu4mc0gw.AARZUJiTa;
                if (h50Var2 == null) {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        defpackage.h50 h50Var3 = (defpackage.h50) arrayList.get(i2);
                        if (!h50Var3.EXtogiMhuM && h50Var3.F7NU4MC0GW) {
                            defpackage.h50 h50Var4 = (defpackage.h50) arrayList.get(0);
                            f7nu4mc0gw.AARZUJiTa = h50Var4;
                            ddVar.XkvoyZRg(h50Var4.r1MBDhnF, true);
                            h50Var4.riuEU0zW4 = true;
                            return;
                        }
                    }
                    return;
                }
                long j = h50Var2.r1MBDhnF;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    defpackage.h50 h50Var5 = (defpackage.h50) arrayList.get(i3);
                    if (h50Var5.EXtogiMhuM && h50Var5.F7NU4MC0GW) {
                        if (java.lang.Math.abs(defpackage.gq0.r1MBDhnF(defpackage.gq0.F7NU4MC0GW(((defpackage.h50) arrayList.get(0)).r1MBDhnF, j))) > ((defpackage.pm1) defpackage.mj1.abhbClRa(ddVar, defpackage.ph.fnWB2E7cs)).oh6vYeIP()) {
                            f7nu4mc0gw.QQUzIjv3iOC5();
                            return;
                        }
                        return;
                    }
                }
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    defpackage.h50 h50Var6 = (defpackage.h50) arrayList.get(i4);
                    if (h50Var6.riuEU0zW4 || !h50Var6.EXtogiMhuM || h50Var6.F7NU4MC0GW) {
                        int size5 = arrayList.size();
                        while (i < size5) {
                            if (((defpackage.h50) arrayList.get(i)).riuEU0zW4) {
                                f7nu4mc0gw.QQUzIjv3iOC5();
                                return;
                            }
                            i++;
                        }
                        return;
                    }
                }
                ((defpackage.h50) arrayList.get(0)).riuEU0zW4 = true;
                ddVar.xp7x2U2iUl(j, true);
                vzVar.IHQe1A4L2xu();
                f7nu4mc0gw.AARZUJiTa = null;
            }
        }
    }

    public final void fzubgBFo(boolean z) {
        defpackage.zk0 zk0Var = this.kNAkVymC;
        if (zk0Var != null) {
            defpackage.xb1 xb1Var = this.mAr5m2L7gYDP;
            defpackage.ej ejVar = null;
            if (xb1Var == null || !xb1Var.oh6vYeIP()) {
                defpackage.px0 px0Var = z ? this.p4kuH6PDtgom : this.v5iciZok;
                if (px0Var != null) {
                    defpackage.ox0 ox0Var = new defpackage.ox0(px0Var);
                    defpackage.u80 u80Var = (defpackage.u80) ((defpackage.dj) dOmtpLcqqI1y()).adDC3e2L.cnag84Bm(defpackage.n.lpprD5VAS);
                    defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.AARZUJiTa(zk0Var, ox0Var, u80Var != null ? u80Var.kNAkVymC(new defpackage.r1MBDhnF(0, zk0Var, ox0Var)) : null, ejVar, 0), 3);
                }
            } else {
                defpackage.xb1 xb1Var2 = this.mAr5m2L7gYDP;
                if (xb1Var2 != null) {
                    xb1Var2.F7NU4MC0GW(null);
                }
            }
            if (z) {
                this.p4kuH6PDtgom = null;
            } else {
                this.v5iciZok = null;
            }
        }
    }

    public final void jjT5JLZla8() {
        if (this.nBH8hAHy != null) {
            return;
        }
        defpackage.f50 f50Var = this.PAEGRtP0bX ? this.UsuH8pd5P : this.V7bD7b8KA;
        if (f50Var != null) {
            if (this.kNAkVymC == null) {
                this.kNAkVymC = new defpackage.zk0();
            }
            this.C0U8sNJm.fzubgBFo(this.kNAkVymC);
            defpackage.zk0 zk0Var = this.kNAkVymC;
            zk0Var.getClass();
            defpackage.kn IHQe1A4L2xu = f50Var.IHQe1A4L2xu(zk0Var);
            UVjEelCZ(IHQe1A4L2xu);
            this.nBH8hAHy = IHQe1A4L2xu;
        }
    }

    @Override // defpackage.q50
    public final void kNAkVymC() {
        defpackage.F7NU4MC0GW f7nu4mc0gw = this.XZx205DYe;
        if (f7nu4mc0gw != null) {
            f7nu4mc0gw.QQUzIjv3iOC5();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mAr5m2L7gYDP(android.view.KeyEvent keyEvent) {
        boolean z;
        int i;
        java.lang.Object obj;
        jjT5JLZla8();
        long oh6vYeIP = defpackage.c80.oh6vYeIP(keyEvent.getKeyCode());
        boolean z2 = this.NHJTzaLwkd;
        int i2 = 3;
        defpackage.bl0 bl0Var = this.frpfPPIgqM9O;
        defpackage.ej ejVar = null;
        int i3 = 1;
        if (z2) {
            int i4 = 2;
            if (defpackage.s70.nBH8hAHy(keyEvent) == 2 && defpackage.x70.D2vUnMij(keyEvent)) {
                if (!bl0Var.oh6vYeIP(oh6vYeIP)) {
                    defpackage.px0 px0Var = new defpackage.px0(this.SiPhmbmu);
                    bl0Var.xiZrDbcSW0(oh6vYeIP, px0Var);
                    if (this.kNAkVymC == null) {
                        return true;
                    }
                    defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.ez2rX8ReCYw(this, px0Var, ejVar, i4), 3);
                    return true;
                }
                return false;
            }
        }
        if (this.NHJTzaLwkd && defpackage.s70.nBH8hAHy(keyEvent) == 1 && defpackage.x70.D2vUnMij(keyEvent)) {
            bl0Var.getClass();
            int hashCode = java.lang.Long.hashCode(oh6vYeIP) * (-862048943);
            int i5 = hashCode ^ (hashCode << 16);
            int i6 = i5 & 127;
            int i7 = bl0Var.F7NU4MC0GW;
            int i8 = (i5 >>> 7) & i7;
            int i9 = 0;
            loop0: while (true) {
                long[] jArr = bl0Var.IHQe1A4L2xu;
                int i10 = i8 >> 3;
                int i11 = (i8 & 7) << 3;
                z = i3;
                long j = (((-i11) >> 63) & (jArr[i10 + i3] << (64 - i11))) | (jArr[i10] >>> i11);
                long j2 = (i6 * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j4 == 0) {
                        break;
                    }
                    i = (i8 + (java.lang.Long.numberOfTrailingZeros(j4) >> 3)) & i7;
                    long j5 = j3;
                    if (bl0Var.oh6vYeIP[i] == oh6vYeIP) {
                        break loop0;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                i9 += 8;
                i8 = (i8 + i9) & i7;
                i3 = z ? 1 : 0;
            }
            if (i >= 0) {
                bl0Var.adDC3e2L--;
                long[] jArr2 = bl0Var.IHQe1A4L2xu;
                int i12 = bl0Var.F7NU4MC0GW;
                int i13 = i >> 3;
                int i14 = (i & 7) << 3;
                long j6 = (jArr2[i13] & (~(255 << i14))) | (254 << i14);
                jArr2[i13] = j6;
                jArr2[(((i - 7) & i12) + (i12 & 7)) >> 3] = j6;
                java.lang.Object[] objArr = bl0Var.r1MBDhnF;
                obj = objArr[i];
                objArr[i] = null;
            } else {
                obj = null;
            }
            defpackage.px0 px0Var2 = (defpackage.px0) obj;
            if (px0Var2 != null) {
                if (this.kNAkVymC != null) {
                    defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.ez2rX8ReCYw(this, px0Var2, ejVar, i2), 3);
                }
                this.QQUzIjv3iOC5.IHQe1A4L2xu();
            }
            if (px0Var2 != null) {
                return z;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dq0
    public final void nBH8hAHy() {
        if (this.PAEGRtP0bX) {
            defpackage.f70.V7bD7b8KA(this, new defpackage.oh6vYeIP(this, 0));
        }
    }

    public final void uLnPvzwk() {
        defpackage.zk0 zk0Var = this.kNAkVymC;
        defpackage.bl0 bl0Var = this.frpfPPIgqM9O;
        if (zk0Var != null) {
            defpackage.px0 px0Var = this.v5iciZok;
            if (px0Var != null) {
                zk0Var.oh6vYeIP(new defpackage.ox0(px0Var));
            }
            defpackage.px0 px0Var2 = this.p4kuH6PDtgom;
            if (px0Var2 != null) {
                zk0Var.oh6vYeIP(new defpackage.ox0(px0Var2));
            }
            defpackage.l40 l40Var = this.D2vUnMij;
            if (l40Var != null) {
                zk0Var.oh6vYeIP(new defpackage.m40(l40Var));
            }
            java.lang.Object[] objArr = bl0Var.r1MBDhnF;
            long[] jArr = bl0Var.IHQe1A4L2xu;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                zk0Var.oh6vYeIP(new defpackage.ox0((defpackage.px0) objArr[(i << 3) + i3]));
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
        }
        this.v5iciZok = null;
        this.p4kuH6PDtgom = null;
        this.D2vUnMij = null;
        bl0Var.IHQe1A4L2xu();
    }

    @Override // defpackage.d71
    public final void wKlPRKlRnfqr(defpackage.n71 n71Var) {
        defpackage.l21 l21Var = this.abhbClRa;
        if (l21Var != null) {
            defpackage.l71.IHQe1A4L2xu(n71Var, l21Var.IHQe1A4L2xu);
        }
        defpackage.oh6vYeIP oh6vyeip = new defpackage.oh6vYeIP(this, 1);
        defpackage.j90[] j90VarArr = defpackage.l71.IHQe1A4L2xu;
        n71Var.IHQe1A4L2xu(defpackage.a71.oh6vYeIP, new defpackage.TFRaUu83X3E(null, oh6vyeip));
        if (this.NHJTzaLwkd) {
            this.C0U8sNJm.wKlPRKlRnfqr(n71Var);
        } else {
            n71Var.IHQe1A4L2xu(defpackage.j71.SH1y5HwkJhh, defpackage.ok1.IHQe1A4L2xu);
        }
        WnQbjbWuMR(n71Var);
    }

    public final void xp7x2U2iUl(long j, boolean z) {
        defpackage.zk0 zk0Var = this.kNAkVymC;
        if (zk0Var != null) {
            defpackage.xb1 xb1Var = this.mAr5m2L7gYDP;
            if (xb1Var == null || !xb1Var.oh6vYeIP()) {
                defpackage.px0 px0Var = z ? this.p4kuH6PDtgom : this.v5iciZok;
                if (px0Var != null) {
                    defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.riuEU0zW4(px0Var, zk0Var, (defpackage.ej) null), 3);
                }
            } else {
                xb1Var.F7NU4MC0GW(null);
                defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.EXtogiMhuM(xb1Var, j, zk0Var, null, 0), 3);
            }
            if (z) {
                this.p4kuH6PDtgom = null;
            } else {
                this.v5iciZok = null;
            }
        }
    }

    @Override // defpackage.lj0
    public final void yUiIS9dG7NYk() {
        uLnPvzwk();
        if (this.yIx6ChFVk == null) {
            this.kNAkVymC = null;
        }
        defpackage.kn knVar = this.nBH8hAHy;
        if (knVar != null) {
            H6IrRhrpWoH(knVar);
        }
        this.nBH8hAHy = null;
    }

    public void WnQbjbWuMR(defpackage.n71 n71Var) {
    }
}
