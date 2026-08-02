package defpackage;

/* loaded from: classes3.dex */
public final class sja implements uja {
    public final int a;

    public sja(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sja) && this.a == ((sja) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.c(this.a, "Loading(tracksCount=", ", filtersEnabled=true)");
    }
}
