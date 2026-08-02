package defpackage;

/* loaded from: classes.dex */
public final class nfg extends qu2 {
    public static final nfg b = new nfg(true);
    public static final nfg c = new nfg(false);

    public final boolean equals(Object obj) {
        return (obj instanceof nfg) && this.a == ((nfg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("NotLoading(endOfPaginationReached="), this.a, ')');
    }
}
