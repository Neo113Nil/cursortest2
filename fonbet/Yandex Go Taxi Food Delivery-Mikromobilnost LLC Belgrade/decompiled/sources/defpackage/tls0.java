package defpackage;

/* loaded from: classes5.dex */
public final class tls0 extends n351 {
    public final String c;

    public tls0(int i) {
        super("delivery_dashboard_skeleton", false, 14);
        this.c = "SuperApp.Delivery.PultOrder";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tls0) && jl40.l(this.c, ((tls0) obj).c);
    }

    public final int hashCode() {
        String str = this.c;
        return (str == null ? 0 : str.hashCode()) * 31;
    }

    public final String toString() {
        return oyr.p("SkeletonModel(metricaLabel=", this.c, ", meta=null)");
    }

    public tls0() {
        this(0);
    }
}
