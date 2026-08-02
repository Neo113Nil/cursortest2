package defpackage;

/* loaded from: classes6.dex */
public final class n6c {
    public final boolean a;

    public n6c(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6c) && this.a == ((n6c) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("PlaybackFeaturesInternal(lowLatency="), this.a, ')');
    }
}
