package defpackage;

/* loaded from: classes3.dex */
public final class edc extends men {
    public final boolean k;

    public edc(boolean z) {
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edc) && this.k == ((edc) obj).k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k);
    }

    public final String toString() {
        return vz1.q("Loading(show=", ")", this.k);
    }
}
