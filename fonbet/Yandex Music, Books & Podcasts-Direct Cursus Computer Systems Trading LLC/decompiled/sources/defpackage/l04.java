package defpackage;

/* loaded from: classes3.dex */
public final class l04 extends n04 {
    public final int a;

    public l04(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l04) && this.a == ((l04) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.c(this.a, "Loading(size=", ", showShimmer=true)");
    }
}
