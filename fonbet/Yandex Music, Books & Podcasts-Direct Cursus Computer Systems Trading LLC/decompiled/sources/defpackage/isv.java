package defpackage;

/* loaded from: classes4.dex */
public final class isv implements jsv {
    public final boolean a;

    public isv(boolean z) {
        this.a = z;
    }

    @Override // defpackage.jsv
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isv) && this.a == ((isv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Secondary(isClickEnabled=", ")", this.a);
    }
}
