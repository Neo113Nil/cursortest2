package defpackage;

/* loaded from: classes4.dex */
public final class a74 {
    public final boolean a;

    public a74(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a74) && this.a == ((a74) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("CastFeatureConfig(pickerButtonBigPlayerVisible=", ")", this.a);
    }
}
