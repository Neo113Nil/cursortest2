package defpackage;

/* loaded from: classes12.dex */
public final class zx00 {
    public final String a;

    public zx00(String str, int i) {
        this.a = (i & 1) != 0 ? null : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zx00) && jl40.l(this.a, ((zx00) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) * 31;
    }

    public final String toString() {
        return oyr.p("MarketplaceRouterPayload(marketplaceType=", this.a, ", delayedAction=null)");
    }

    public zx00() {
        this(null, 3);
    }
}
