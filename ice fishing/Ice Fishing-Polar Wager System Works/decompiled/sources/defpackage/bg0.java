package defpackage;

/* loaded from: classes.dex */
public abstract class bg0 extends defpackage.zf0 implements defpackage.di0 {
    public final defpackage.ip0 EgCjBq0SZwJ;
    public defpackage.ji0 PAEGRtP0bX;
    public final defpackage.fl0 abhbClRa;
    public java.util.LinkedHashMap kNAkVymC;
    public long fnWB2E7cs = 0;
    public final defpackage.cg0 V7bD7b8KA = new defpackage.cg0(this);

    public bg0(defpackage.ip0 ip0Var) {
        this.EgCjBq0SZwJ = ip0Var;
        defpackage.fl0 fl0Var = defpackage.up0.IHQe1A4L2xu;
        this.abhbClRa = new defpackage.fl0();
    }

    public static final void WnQbjbWuMR(defpackage.bg0 bg0Var, defpackage.ji0 ji0Var) {
        java.util.LinkedHashMap linkedHashMap;
        if (ji0Var != null) {
            bg0Var.JcqDrWrgMf((ji0Var.r1MBDhnF() & 4294967295L) | (ji0Var.adDC3e2L() << 32));
        } else {
            bg0Var.JcqDrWrgMf(0L);
        }
        if (!defpackage.x70.QoRHpC4k(bg0Var.PAEGRtP0bX, ji0Var) && ji0Var != null && ((((linkedHashMap = bg0Var.kNAkVymC) != null && !linkedHashMap.isEmpty()) || !ji0Var.IHQe1A4L2xu().isEmpty()) && !defpackage.x70.QoRHpC4k(ji0Var.IHQe1A4L2xu(), bg0Var.kNAkVymC))) {
            defpackage.fg0 fg0Var = bg0Var.EgCjBq0SZwJ.EgCjBq0SZwJ.wll2JLbTBC2.G3OKOH3wZRC;
            fg0Var.getClass();
            fg0Var.kNAkVymC.xiZrDbcSW0();
            java.util.LinkedHashMap linkedHashMap2 = bg0Var.kNAkVymC;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new java.util.LinkedHashMap();
                bg0Var.kNAkVymC = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(ji0Var.IHQe1A4L2xu());
        }
        bg0Var.PAEGRtP0bX = ji0Var;
    }

    @Override // defpackage.zf0
    public final defpackage.zf0 Ay906ovssqgN() {
        defpackage.ip0 ip0Var = this.EgCjBq0SZwJ.kNAkVymC;
        if (ip0Var != null) {
            return ip0Var.QuX7t5UZl9();
        }
        return null;
    }

    @Override // defpackage.qn
    public final float EXtogiMhuM() {
        return this.EgCjBq0SZwJ.EXtogiMhuM();
    }

    @Override // defpackage.zf0
    public final long FisHbM7NmV() {
        return this.fnWB2E7cs;
    }

    @Override // defpackage.zf0
    public final defpackage.zf0 JX5fKip1C6() {
        defpackage.ip0 ip0Var = this.EgCjBq0SZwJ.fnWB2E7cs;
        if (ip0Var != null) {
            return ip0Var.QuX7t5UZl9();
        }
        return null;
    }

    @Override // defpackage.zf0
    public final defpackage.ma0 boH8X4DXyc4() {
        return this.EgCjBq0SZwJ.EgCjBq0SZwJ;
    }

    @Override // defpackage.zf0, defpackage.t70
    public final boolean cnag84Bm() {
        return true;
    }

    @Override // defpackage.bv0, defpackage.di0
    public final java.lang.Object ez2rX8ReCYw() {
        return this.EgCjBq0SZwJ.ez2rX8ReCYw();
    }

    public final void fzubgBFo(long j) {
        if (!defpackage.z60.IHQe1A4L2xu(this.fnWB2E7cs, j)) {
            this.fnWB2E7cs = j;
            defpackage.ip0 ip0Var = this.EgCjBq0SZwJ;
            defpackage.fg0 fg0Var = ip0Var.EgCjBq0SZwJ.wll2JLbTBC2.G3OKOH3wZRC;
            if (fg0Var != null) {
                fg0Var.flIYPhR0();
            }
            defpackage.zf0.UVjEelCZ(ip0Var);
        }
        if (this.cnag84Bm) {
            return;
        }
        flIYPhR0(seT5W8IHOge());
    }

    @Override // defpackage.t70
    public final defpackage.w90 getLayoutDirection() {
        return this.EgCjBq0SZwJ.EgCjBq0SZwJ.nBH8hAHy;
    }

    @Override // defpackage.zf0
    public final boolean juTJww2r() {
        return this.PAEGRtP0bX != null;
    }

    @Override // defpackage.bv0
    public final void mL9sMlGfef(long j, float f, defpackage.g00 g00Var) {
        fzubgBFo(j);
        if (this.SyNS6RMn) {
            return;
        }
        uLnPvzwk();
    }

    @Override // defpackage.qn
    public final float oh6vYeIP() {
        return this.EgCjBq0SZwJ.oh6vYeIP();
    }

    @Override // defpackage.zf0
    public final void pm90rNzI5F() {
        mL9sMlGfef(this.fnWB2E7cs, 0.0f, null);
    }

    @Override // defpackage.zf0
    public final defpackage.ji0 seT5W8IHOge() {
        defpackage.ji0 ji0Var = this.PAEGRtP0bX;
        if (ji0Var != null) {
            return ji0Var;
        }
        throw defpackage.fx0.AARZUJiTa("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    public void uLnPvzwk() {
        seT5W8IHOge().oh6vYeIP();
    }

    public final long xp7x2U2iUl(defpackage.bg0 bg0Var, boolean z) {
        long j = 0;
        while (!this.equals(bg0Var)) {
            if (!this.DFo87pBq1E5 || !z) {
                j = defpackage.z60.r1MBDhnF(j, this.fnWB2E7cs);
            }
            defpackage.ip0 ip0Var = this.EgCjBq0SZwJ.kNAkVymC;
            ip0Var.getClass();
            this = ip0Var.QuX7t5UZl9();
            this.getClass();
        }
        return j;
    }

    @Override // defpackage.zf0
    public final defpackage.v90 yUiIS9dG7NYk() {
        return this.V7bD7b8KA;
    }
}
