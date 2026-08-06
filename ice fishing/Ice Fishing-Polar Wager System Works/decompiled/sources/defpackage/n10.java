package defpackage;

/* loaded from: classes.dex */
public final class n10 {
    public final java.util.Map AARZUJiTa;
    public final java.util.Map EXtogiMhuM;
    public final long F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final defpackage.op SH1y5HwkJhh;
    public final boolean adDC3e2L;
    public final int oh6vYeIP;
    public final long r1MBDhnF;
    public final java.util.Set riuEU0zW4;
    public final defpackage.nv0 xiZrDbcSW0;

    public n10(int i, int i2, long j, long j2, boolean z, defpackage.nv0 nv0Var, java.util.Map map, java.util.Map map2, java.util.Set set, defpackage.op opVar) {
        nv0Var.getClass();
        map.getClass();
        map2.getClass();
        set.getClass();
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        this.r1MBDhnF = j;
        this.F7NU4MC0GW = j2;
        this.adDC3e2L = z;
        this.xiZrDbcSW0 = nv0Var;
        this.AARZUJiTa = map;
        this.EXtogiMhuM = map2;
        this.riuEU0zW4 = set;
        this.SH1y5HwkJhh = opVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.util.Set] */
    public static defpackage.n10 IHQe1A4L2xu(defpackage.n10 n10Var, int i, int i2, long j, long j2, defpackage.nv0 nv0Var, java.util.Map map, java.util.Map map2, java.util.LinkedHashSet linkedHashSet, defpackage.op opVar, int i3) {
        if ((i3 & 1) != 0) {
            i = n10Var.IHQe1A4L2xu;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            i2 = n10Var.oh6vYeIP;
        }
        int i5 = i2;
        long j3 = (i3 & 4) != 0 ? n10Var.r1MBDhnF : j;
        long j4 = (i3 & 8) != 0 ? n10Var.F7NU4MC0GW : j2;
        boolean z = (i3 & 16) != 0 ? n10Var.adDC3e2L : true;
        defpackage.nv0 nv0Var2 = (i3 & 32) != 0 ? n10Var.xiZrDbcSW0 : nv0Var;
        java.util.Map map3 = (i3 & 64) != 0 ? n10Var.AARZUJiTa : map;
        java.util.Map map4 = (i3 & 128) != 0 ? n10Var.EXtogiMhuM : map2;
        java.util.LinkedHashSet linkedHashSet2 = (i3 & 256) != 0 ? n10Var.riuEU0zW4 : linkedHashSet;
        defpackage.op opVar2 = (i3 & 512) != 0 ? n10Var.SH1y5HwkJhh : opVar;
        n10Var.getClass();
        nv0Var2.getClass();
        map3.getClass();
        map4.getClass();
        linkedHashSet2.getClass();
        return new defpackage.n10(i4, i5, j3, j4, z, nv0Var2, map3, map4, linkedHashSet2, opVar2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.n10)) {
            return false;
        }
        defpackage.n10 n10Var = (defpackage.n10) obj;
        return this.IHQe1A4L2xu == n10Var.IHQe1A4L2xu && this.oh6vYeIP == n10Var.oh6vYeIP && this.r1MBDhnF == n10Var.r1MBDhnF && this.F7NU4MC0GW == n10Var.F7NU4MC0GW && this.adDC3e2L == n10Var.adDC3e2L && defpackage.x70.QoRHpC4k(this.xiZrDbcSW0, n10Var.xiZrDbcSW0) && defpackage.x70.QoRHpC4k(this.AARZUJiTa, n10Var.AARZUJiTa) && defpackage.x70.QoRHpC4k(this.EXtogiMhuM, n10Var.EXtogiMhuM) && defpackage.x70.QoRHpC4k(this.riuEU0zW4, n10Var.riuEU0zW4) && defpackage.x70.QoRHpC4k(this.SH1y5HwkJhh, n10Var.SH1y5HwkJhh);
    }

    public final int hashCode() {
        int hashCode = (this.riuEU0zW4.hashCode() + ((this.EXtogiMhuM.hashCode() + ((this.AARZUJiTa.hashCode() + ((this.xiZrDbcSW0.hashCode() + defpackage.fx0.adDC3e2L(defpackage.fx0.r1MBDhnF(defpackage.fx0.r1MBDhnF(defpackage.fx0.oh6vYeIP(this.oh6vYeIP, java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31, 31), 31, this.r1MBDhnF), 31, this.F7NU4MC0GW), 31, this.adDC3e2L)) * 31)) * 31)) * 31)) * 31;
        defpackage.op opVar = this.SH1y5HwkJhh;
        return hashCode + (opVar == null ? 0 : opVar.hashCode());
    }

    public final int oh6vYeIP(java.lang.String str) {
        str.getClass();
        java.lang.Integer num = (java.lang.Integer) this.EXtogiMhuM.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int r1MBDhnF(com.corsair.ledger.domain.model.Rarity rarity) {
        rarity.getClass();
        java.lang.Integer num = (java.lang.Integer) this.AARZUJiTa.get(rarity);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final java.lang.String toString() {
        return "GameState(doubloons=" + this.IHQe1A4L2xu + ", storedEnergy=" + this.oh6vYeIP + ", energyAnchorMs=" + this.r1MBDhnF + ", lastChestMs=" + this.F7NU4MC0GW + ", victorySeen=" + this.adDC3e2L + ", stats=" + this.xiZrDbcSW0 + ", shards=" + this.AARZUJiTa + ", owned=" + this.EXtogiMhuM + ", claimedSets=" + this.riuEU0zW4 + ", dig=" + this.SH1y5HwkJhh + ")";
    }
}
