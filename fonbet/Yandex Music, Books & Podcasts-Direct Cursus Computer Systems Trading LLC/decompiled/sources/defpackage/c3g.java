package defpackage;

/* loaded from: classes5.dex */
public final class c3g {
    public final b3g a;
    public final boolean b;

    public c3g(b3g b3gVar, boolean z) {
        this.a = b3gVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3g)) {
            return false;
        }
        c3g c3gVar = (c3g) obj;
        return this.a == c3gVar.a && this.b == c3gVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LikeChangedEvent(type=" + this.a + ", kids=" + this.b + ")";
    }
}
