package defpackage;

/* loaded from: classes3.dex */
public final class k0d implements l0d {
    public final jbu a;
    public final o0d b;

    public k0d(jbu jbuVar, o0d o0dVar) {
        this.a = jbuVar;
        this.b = o0dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0d)) {
            return false;
        }
        k0d k0dVar = (k0d) obj;
        return this.a.equals(k0dVar.a) && this.b.equals(k0dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.c.hashCode() * 31);
    }

    public final String toString() {
        return "Video(videoIdentifier=" + this.a + ", placeholder=" + this.b + ")";
    }
}
