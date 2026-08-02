package defpackage;

/* loaded from: classes3.dex */
public final class o98 {
    public final boolean a;

    public o98(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o98) && this.a == ((o98) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("DislikesState(hasData=", ")", this.a);
    }
}
