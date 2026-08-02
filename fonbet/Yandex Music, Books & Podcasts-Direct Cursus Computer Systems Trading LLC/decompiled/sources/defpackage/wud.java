package defpackage;

/* loaded from: classes3.dex */
public final class wud {
    public final boolean a;

    public wud(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wud) && this.a == ((wud) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("AnimationParams(withAnimation=", ")", this.a);
    }
}
