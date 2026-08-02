package defpackage;

/* loaded from: classes4.dex */
public final class e06 {
    public final int a;

    public e06(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e06) && this.a == ((e06) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "ConcertSearchItemConfig(coverSize=", ")");
    }
}
