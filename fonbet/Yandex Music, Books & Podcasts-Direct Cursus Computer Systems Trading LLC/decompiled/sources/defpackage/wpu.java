package defpackage;

/* loaded from: classes4.dex */
public final class wpu implements bqu {
    public final boolean a;

    public wpu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wpu) && this.a == ((wpu) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Disabled(isLinkLoading=", ")", this.a);
    }
}
