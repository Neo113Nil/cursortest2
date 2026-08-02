package defpackage;

/* loaded from: classes4.dex */
public final class mni extends q7g {
    public final boolean f;

    public mni(boolean z) {
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mni) && this.f == ((mni) obj).f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f);
    }

    public final String toString() {
        return vz1.q("Classifying(musicDetected=", ")", this.f);
    }
}
