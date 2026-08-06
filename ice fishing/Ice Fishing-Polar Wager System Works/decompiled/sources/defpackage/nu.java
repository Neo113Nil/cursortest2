package defpackage;

/* loaded from: classes.dex */
public final class nu {
    public final boolean F7NU4MC0GW;
    public final com.corsair.ledger.domain.model.Rarity IHQe1A4L2xu;
    public final com.corsair.ledger.domain.model.Rarity oh6vYeIP;
    public final int r1MBDhnF;

    public nu(com.corsair.ledger.domain.model.Rarity rarity, com.corsair.ledger.domain.model.Rarity rarity2, int i, boolean z) {
        rarity.getClass();
        rarity2.getClass();
        this.IHQe1A4L2xu = rarity;
        this.oh6vYeIP = rarity2;
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nu)) {
            return false;
        }
        defpackage.nu nuVar = (defpackage.nu) obj;
        return this.IHQe1A4L2xu == nuVar.IHQe1A4L2xu && this.oh6vYeIP == nuVar.oh6vYeIP && this.r1MBDhnF == nuVar.r1MBDhnF && this.F7NU4MC0GW == nuVar.F7NU4MC0GW;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.F7NU4MC0GW) + defpackage.fx0.oh6vYeIP(this.r1MBDhnF, defpackage.fx0.oh6vYeIP(5, (this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31)) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        return "ExchangeRowUi(from=" + this.IHQe1A4L2xu + ", to=" + this.oh6vYeIP + ", cost=5, held=" + this.r1MBDhnF + ", enabled=" + this.F7NU4MC0GW + ")";
    }
}
