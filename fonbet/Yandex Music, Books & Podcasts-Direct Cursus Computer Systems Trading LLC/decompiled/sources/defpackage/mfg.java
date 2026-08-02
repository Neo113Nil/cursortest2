package defpackage;

/* loaded from: classes.dex */
public final class mfg extends qu2 {
    public static final mfg b = new mfg(false);

    public final boolean equals(Object obj) {
        return (obj instanceof mfg) && this.a == ((mfg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("Loading(endOfPaginationReached="), this.a, ')');
    }
}
