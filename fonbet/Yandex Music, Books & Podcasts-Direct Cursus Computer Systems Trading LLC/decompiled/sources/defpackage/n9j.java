package defpackage;

/* loaded from: classes3.dex */
public final class n9j implements q9j {
    public final int a;

    public n9j(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9j) && this.a == ((n9j) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Empty(textRes=", ")");
    }
}
