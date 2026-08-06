package defpackage;

/* loaded from: classes.dex */
public final class xo implements defpackage.yo {
    public final com.corsair.ledger.domain.model.Rarity IHQe1A4L2xu;
    public final int oh6vYeIP;

    public xo(com.corsair.ledger.domain.model.Rarity rarity, int i) {
        rarity.getClass();
        this.IHQe1A4L2xu = rarity;
        this.oh6vYeIP = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xo)) {
            return false;
        }
        defpackage.xo xoVar = (defpackage.xo) obj;
        return this.IHQe1A4L2xu == xoVar.IHQe1A4L2xu && this.oh6vYeIP == xoVar.oh6vYeIP;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.oh6vYeIP) + (this.IHQe1A4L2xu.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "ShardFind(rarity=" + this.IHQe1A4L2xu + ", amount=" + this.oh6vYeIP + ")";
    }
}
