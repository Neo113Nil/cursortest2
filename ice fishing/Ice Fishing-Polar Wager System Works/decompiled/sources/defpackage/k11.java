package defpackage;

/* loaded from: classes.dex */
public final class k11 {
    public final boolean AARZUJiTa;
    public final long EXtogiMhuM;
    public final int F7NU4MC0GW;
    public final defpackage.n10 IHQe1A4L2xu;
    public final boolean SH1y5HwkJhh;
    public final long adDC3e2L;
    public final long oh6vYeIP;
    public final int r1MBDhnF;
    public final java.util.Set riuEU0zW4;
    public final java.util.Set xiZrDbcSW0;

    public k11(defpackage.n10 n10Var, long j, int i, int i2, long j2, java.util.Set set, boolean z, long j3, java.util.Set set2, boolean z2) {
        n10Var.getClass();
        this.IHQe1A4L2xu = n10Var;
        this.oh6vYeIP = j;
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = i2;
        this.adDC3e2L = j2;
        this.xiZrDbcSW0 = set;
        this.AARZUJiTa = z;
        this.EXtogiMhuM = j3;
        this.riuEU0zW4 = set2;
        this.SH1y5HwkJhh = z2;
    }

    public final int IHQe1A4L2xu() {
        java.util.Map map = this.IHQe1A4L2xu.EXtogiMhuM;
        int i = 0;
        if (map.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((java.lang.Number) ((java.util.Map.Entry) it.next()).getValue()).intValue() > 0) {
                i++;
            }
        }
        return i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.k11)) {
            return false;
        }
        defpackage.k11 k11Var = (defpackage.k11) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, k11Var.IHQe1A4L2xu) && this.oh6vYeIP == k11Var.oh6vYeIP && this.r1MBDhnF == k11Var.r1MBDhnF && this.F7NU4MC0GW == k11Var.F7NU4MC0GW && this.adDC3e2L == k11Var.adDC3e2L && this.xiZrDbcSW0.equals(k11Var.xiZrDbcSW0) && this.AARZUJiTa == k11Var.AARZUJiTa && this.EXtogiMhuM == k11Var.EXtogiMhuM && this.riuEU0zW4.equals(k11Var.riuEU0zW4) && this.SH1y5HwkJhh == k11Var.SH1y5HwkJhh;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.SH1y5HwkJhh) + ((this.riuEU0zW4.hashCode() + defpackage.fx0.r1MBDhnF(defpackage.fx0.adDC3e2L((this.xiZrDbcSW0.hashCode() + defpackage.fx0.r1MBDhnF(defpackage.fx0.oh6vYeIP(this.F7NU4MC0GW, defpackage.fx0.oh6vYeIP(this.r1MBDhnF, defpackage.fx0.r1MBDhnF(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP), 31), 31), 31, this.adDC3e2L)) * 31, 31, this.AARZUJiTa), 31, this.EXtogiMhuM)) * 31);
    }

    public final java.lang.String toString() {
        return "ResolvedGame(state=" + this.IHQe1A4L2xu + ", nowMs=" + this.oh6vYeIP + ", energy=" + this.r1MBDhnF + ", energyCap=" + this.F7NU4MC0GW + ", msToNextEnergy=" + this.adDC3e2L + ", unlockedIslandIds=" + this.xiZrDbcSW0 + ", chestReady=" + this.AARZUJiTa + ", msToChest=" + this.EXtogiMhuM + ", unlockedAchievements=" + this.riuEU0zW4 + ", victoryReached=" + this.SH1y5HwkJhh + ")";
    }
}
