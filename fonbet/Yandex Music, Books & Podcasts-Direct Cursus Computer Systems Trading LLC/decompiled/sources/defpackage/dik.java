package defpackage;

/* loaded from: classes4.dex */
public final class dik {
    public final hv0 a;
    public final boolean b;
    public final String c;
    public final hpj d;

    public dik(hv0 hv0Var, boolean z, String str, hpj hpjVar) {
        this.a = hv0Var;
        this.b = z;
        this.c = str;
        this.d = hpjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dik)) {
            return false;
        }
        dik dikVar = (dik) obj;
        return this.a.equals(dikVar.a) && this.b == dikVar.b && this.c.equals(dikVar.c) && this.d.equals(dikVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.e((this.a.hashCode() + (1589078573 * 31)) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "PaywallConfig(page=music_paywall_screen, featureId=null, campaignId=" + this.a + ", isCloseDisabled=" + this.b + ", clientPlace=" + this.c + ", isSuccessfulPayment=" + this.d + ")";
    }
}
