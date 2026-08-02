package defpackage;

/* loaded from: classes3.dex */
public final class gw5 {
    public final int a;

    public gw5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gw5) && this.a == ((gw5) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "ConcertItemConfig(coverSize=", ")");
    }
}
