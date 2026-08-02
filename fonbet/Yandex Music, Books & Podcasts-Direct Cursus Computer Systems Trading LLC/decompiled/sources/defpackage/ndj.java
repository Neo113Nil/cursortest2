package defpackage;

/* loaded from: classes3.dex */
public final class ndj implements qdj {
    public final int a;

    public ndj(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndj) && this.a == ((ndj) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Empty(textRes=", ")");
    }
}
