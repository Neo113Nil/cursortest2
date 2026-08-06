package defpackage;

/* loaded from: classes.dex */
public final class a01 {
    public final com.corsair.ledger.domain.model.Rarity F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final java.lang.String adDC3e2L;
    public final java.lang.String oh6vYeIP;
    public final defpackage.o01 r1MBDhnF;

    public a01(java.lang.String str, java.lang.String str2, defpackage.o01 o01Var, com.corsair.ledger.domain.model.Rarity rarity, java.lang.String str3) {
        rarity.getClass();
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = str2;
        this.r1MBDhnF = o01Var;
        this.F7NU4MC0GW = rarity;
        this.adDC3e2L = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.a01)) {
            return false;
        }
        defpackage.a01 a01Var = (defpackage.a01) obj;
        return this.IHQe1A4L2xu.equals(a01Var.IHQe1A4L2xu) && this.oh6vYeIP.equals(a01Var.oh6vYeIP) && this.r1MBDhnF == a01Var.r1MBDhnF && this.F7NU4MC0GW == a01Var.F7NU4MC0GW && this.adDC3e2L.equals(a01Var.adDC3e2L);
    }

    public final int hashCode() {
        return this.adDC3e2L.hashCode() + ((this.F7NU4MC0GW.hashCode() + ((this.r1MBDhnF.hashCode() + defpackage.fx0.F7NU4MC0GW(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Relic(id=" + this.IHQe1A4L2xu + ", name=" + this.oh6vYeIP + ", set=" + this.r1MBDhnF + ", rarity=" + this.F7NU4MC0GW + ", lore=" + this.adDC3e2L + ")";
    }
}
