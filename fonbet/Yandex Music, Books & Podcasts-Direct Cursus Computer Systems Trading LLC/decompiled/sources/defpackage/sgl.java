package defpackage;

/* loaded from: classes4.dex */
public final class sgl {
    public final kme a;

    public sgl(kme kmeVar) {
        this.a = kmeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sgl) && this.a.equals(((sgl) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(500) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerOptimizations(allowPreheatWithoutCrossfade=" + this.a + ", bufferForPlaybackMs=500)";
    }
}
