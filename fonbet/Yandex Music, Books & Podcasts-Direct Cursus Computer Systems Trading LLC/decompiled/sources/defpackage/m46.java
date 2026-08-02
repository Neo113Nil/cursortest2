package defpackage;

/* loaded from: classes3.dex */
public final class m46 implements n46 {
    public final long a;

    public m46(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m46) && nmq.a(this.a, ((m46) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return hrg.q("Square(size=", nmq.g(this.a), ")");
    }
}
