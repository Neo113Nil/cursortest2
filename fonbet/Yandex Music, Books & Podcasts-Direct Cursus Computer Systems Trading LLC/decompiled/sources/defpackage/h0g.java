package defpackage;

/* loaded from: classes3.dex */
public final class h0g {
    public final boolean a;
    public final int b;

    public h0g(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0g)) {
            return false;
        }
        h0g h0gVar = (h0g) obj;
        return this.a == h0gVar.a && this.b == h0gVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "State(shown=" + this.a + ", likeCount=" + this.b + ")";
    }
}
