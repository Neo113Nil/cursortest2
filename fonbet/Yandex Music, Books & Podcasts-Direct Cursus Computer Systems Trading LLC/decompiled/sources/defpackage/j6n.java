package defpackage;

/* loaded from: classes3.dex */
public final class j6n implements l6n {
    public final boolean a;

    public j6n(boolean z) {
        this.a = z;
    }

    @Override // defpackage.l6n
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j6n) && this.a == ((j6n) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("EmptySelection(isLosslessUnavailable=", ")", this.a);
    }
}
